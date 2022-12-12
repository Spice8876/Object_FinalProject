package InGame;

import common.Constants;

import javax.swing.*;
import java.awt.*;

public class LongNodePanel extends Node {
    //Image image = new ImageIcon("Images/Tile.png").getImage();
    int Width = 120;
    int Height = 180;
    int ElementHeight = 10;
    int speed = 3;
    boolean isTouched = false;
    LongNodeElementPanel[] elements;

    public LongNodePanel(int line, int length){
        Height = 10 * length;
        setLayout(null);
        setBackground(Color.BLACK);
        setBounds(line * Width,-Height,Width,length * 10);
        this.line = line;
    }


    public void move(){
        setLocation(getX() , getY() + speed);
    }

    public boolean tryTouch(){
        if(!isTouched){
            if(Constants.InGame.InputAreaTopY - Height < getY() &&
                    getY() < Constants.InGame.InputAreaTopY + Height){
                isTouched = true;
                setBackground(new Color(255,215,0));
                return true;
            }

        }
        return false;
    }

    /**
     * isTouch = false 인 경우 : 0
     * isTouch = ture , Miss 인 경우 : 1
     * isTouch = false , Correct 인 경우 : 2
     * */
    public int onTouchOff(){
        if(isTouched){
            System.out.println("[LongNodePanel.onTouchOff()] y : " + getY() + ", InputAreaTopY :" + Constants.InGame.InputAreaTopY);
            if(getY() > Constants.InGame.InputAreaTopY){
                setBackground(Color.orange);
                System.out.println("[LongNodePanel.onTouchOff()] Code 2");
                return 2;
            }
            setBackground(Color.red);
            System.out.println("[LongNodePanel.onTouchOff()] Code 1");
            return 1;
        }
        System.out.println("[LongNodePanel.onTouchOff()] Code 0");
        return 0;
    }
}

class LongNodeElementPanel extends JPanel{
    boolean isTouched = false;
    int speed = 3;
    int Width = 120;
    int Height = 10;
    public int line;

    LongNodePanel longNodePanel;
    public LongNodeElementPanel(LongNodePanel longNodePanel,int line ,int y){
        this.longNodePanel = longNodePanel;
        setBackground(Color.BLACK);
        setBounds(0,y,Width,Height);
        this.line = line;
    }

    public void move(){
        setLocation(getX() , getY() + speed);
    }

    public boolean tryTouch(){
        if(Constants.InGame.InputAreaTopY - Height < getY() + longNodePanel.getY() &&
                getY() + longNodePanel.getY()< Constants.InGame.InputAreaTopY + Height ){
            isTouched = true;
            setBackground(new Color(255,215,0));
            return true;
        }
        return false;
    }

}
