package InGame;

import InGame.Schema.NodeInfo;
import common.Constants;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.time.LocalDate;
import java.util.*;

public class NodeManager {

    NodeBackgroundPanel backGround;
    NodeController nodeController;
    NodeGenerator nodeGenerator;
    List<Node> nodes = new LinkedList<>();
    public NodeManager(NodeBackgroundPanel nodeBackgroundPanel){
        this.backGround = nodeBackgroundPanel;
        long startTime = System.currentTimeMillis();
        nodeController = new NodeController(this , startTime);
        nodeGenerator = new NodeGenerator(this);
    }

    public void start(int speed){
        nodeController.start();
        nodeGenerator.setSpeed(speed);
        nodeGenerator.start();
    }

    //노드 생성
    public void generate(int line , long startTime,int speed){
        NodeImagePanel node = new NodeImagePanel(line,startTime,speed);
        //LongNodePanel longNodePanel = new LongNodePanel(line,30);
        nodes.add(node);
        backGround.add(node);
    }
    
    //노드 삭제
    public void removeNode(Node target){
        nodes.remove(target);
        backGround.remove(target);
    }

    public void onKeyBoardInput(int line){
        for(int i = 0; i< nodes.size(); i++){
            Node node = nodes.get(i);
            if(node.line == line){
                if(node.tryTouch()) break;
            }
        }
    }

    public void onKeyUp(int line){
        for(int i = 0; i< nodes.size(); i++){
            Node node = nodes.get(i);
            if(node instanceof LongNodePanel && node.line == line){
                ((LongNodePanel) node).onTouchOff();
            }
        }
    }
}

/**
 * 노드 이동 및 삭제
 * */
class NodeController extends Thread{

    NodeManager nodeManager;
    long startTime;

    public NodeController(NodeManager nodeManager ,long startTime){
        this.nodeManager = nodeManager;
        this.startTime = startTime;
    }

    public void run() {  // Thread 를 상속하면 run 메서드를 구현해야 한다.
        while (true){
            try {
                Thread.sleep(10);

                //노드 이동 및 삭제
                for(int i = nodeManager.nodes.size() - 1; i >= 0; i--){
                    Node node = nodeManager.nodes.get(i);
                    if(node.getY() > Constants.MaxHeight + 180)
                        nodeManager.removeNode(node);
                    else
                        node.move();
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

/**
 * 노드 생성
 * */
class NodeGenerator extends Thread{

    NodeManager nodeManager;
    Queue<NodeInfo> nodeInfos = new LinkedList<>();
    long startTime;
    int speed;

    public NodeGenerator(NodeManager nodeManager){
        this.nodeManager = nodeManager;
        SheetReader sheetReader = new SheetReader();
        try {
            nodeInfos = sheetReader.read();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }

    public void run() {
        this.startTime = System.currentTimeMillis();
        nodeInfos.forEach(nodeInfo -> {
            nodeInfo.setTime(startTime);
        });
        while (true){
            try {
                while (!nodeInfos.isEmpty()){
                    NodeInfo node = nodeInfos.peek();
                    //System.out.println("[NodeGenerator.run()] " + (node.settingTime - Constants.InGame.NodeReadyTime) +" : " + System.currentTimeMillis());
                    if(nodeInfos.peek().settingTime<= System.currentTimeMillis()){
                        //System.out.println("[NodeGenerator.run()] ");
                        NodeInfo target = nodeInfos.remove();
                        nodeManager.generate(target.line , startTime,speed);
                    }
                    else{
                        break;
                    }
                }
                Thread.sleep(10);
                //System.out.println("[NodeGenerator] 노드 갯수  : " + nodeManager.nodes.size());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void generateTask(){

    }
}