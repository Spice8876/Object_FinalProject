package InGame;

import InGame.Music.MusicInfo;
import InGame.Music.MusicManager;
import common.KeyPressedActionMaker;
import common.KeyReleasedActionMaker;

import java.awt.event.KeyEvent;

public class GameManager {
    public int score = 0;
    public NodeManager nodeManager;
    public MusicManager musicManager = new MusicManager();
    public BackGroundPanel backGroundPanel;

    public InGamePanel inGamePanel;

    public MusicInfo musicInfo;

    public GameManager(InGamePanel inGamePanel , BackGroundPanel backGroundPanel){
        nodeManager = new NodeManager(backGroundPanel.nodeBackgroundPanel,this);
        this.inGamePanel = inGamePanel;
        this.backGroundPanel = backGroundPanel;
        backGroundPanel.addKeyListener(new KeyPressedActionMaker(keyEvent->{
            switch (keyEvent.getKeyCode()){

                case KeyEvent.VK_F:
                    nodeManager.onKeyBoardInput(0);
                    break;

                case KeyEvent.VK_G:
                    nodeManager.onKeyBoardInput(1);
                    break;

                case KeyEvent.VK_H:
                    nodeManager.onKeyBoardInput(2);
                    break;

                case KeyEvent.VK_J:
                    nodeManager.onKeyBoardInput(3);
                    break;
            }
        }));

        backGroundPanel.addKeyListener(new KeyReleasedActionMaker(keyEvent ->{
            switch (keyEvent.getKeyCode()){
                case KeyEvent.VK_F:
                    nodeManager.onKeyUp(0);
                    break;

                case KeyEvent.VK_G:
                    nodeManager.onKeyUp(1);
                    break;

                case KeyEvent.VK_H:
                    nodeManager.onKeyUp(2);
                    break;

                case KeyEvent.VK_J:
                    nodeManager.onKeyUp(3);
                    break;
            }
        }));
    }

    public void upScore(){
        score++;
        backGroundPanel.scoreLabel.onScoreUpdated(score);
    }

    public void start(MusicInfo musicInfo){
        this.musicInfo = musicInfo;
        nodeManager.start(musicInfo,musicInfo.speed);
        musicManager.play(musicInfo);
    }

    public void gameOver(){
        inGamePanel.gameOver();
        nodeManager.off();
        musicManager.stop();
    }
}
