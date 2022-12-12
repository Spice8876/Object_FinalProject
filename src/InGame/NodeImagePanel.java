package InGame;

import common.Constants;

import javax.swing.*;
import java.awt.*;

public class NodeImagePanel extends Node{
    //Image image = new ImageIcon("Images/Tile.png").getImage();
    int Width = 120;
    int Height = 180;
    int speed = 3;
    boolean isTouched = false;
    long startTime;

    public NodeImagePanel(int line , long startTime , int speed){
        setBackground(Color.BLACK);
        setBounds(line * Width,-Height,Width,Height);
        this.line = line;
        this.startTime = startTime;
        this.speed = speed;
    }


    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        //g.drawImage(image, 0, 0, 120, 180, this);
    }

    public void move(){
        setLocation(getX() , getY() + speed);
    }

    public boolean tryTouch(){
        if(Constants.InGame.InputAreaTopY - Height < getY() &&
                getY() < Constants.InGame.InputAreaTopY + Height){
            isTouched = true;
            setBackground(new Color(255,215,0));
            return true;
        }
        return false;
    }
}
