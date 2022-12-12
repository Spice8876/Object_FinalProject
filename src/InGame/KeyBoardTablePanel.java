package InGame;

import common.Constants;
import common.KeyPressedActionMaker;
import common.KeyReleasedActionMaker;

import java.util.Timer;
import java.util.TimerTask;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

class KeyBoardTablePanel extends JPanel {

    int Height = Constants.InGame.KeyBoardTable.Height;
    public KeyBoardTablePanel(BackGroundPanel backGroundPanel){
        setBackground(new Color(100,23,224));
        setLayout(null);
        KeyBoardPanel line0 = new KeyBoardPanel();
        KeyBoardPanel line1 = new KeyBoardPanel();
        KeyBoardPanel line2 = new KeyBoardPanel();
        KeyBoardPanel line3 = new KeyBoardPanel();

        line0.setBounds(0,0,Constants.MaxWidth / 4 ,Height );
        line1.setBounds(Constants.MaxWidth / 4,0,Constants.MaxWidth / 4 ,Height );
        line2.setBounds(Constants.MaxWidth / 4 * 2,0,Constants.MaxWidth / 4 ,Height );
        line3.setBounds(Constants.MaxWidth / 4 * 3,0,Constants.MaxWidth / 4 ,Height );

        add(line0);
        add(line1);
        add(line2);
        add(line3);

        backGroundPanel.addKeyListener(new KeyPressedActionMaker(keyEvent->{
            switch (keyEvent.getKeyCode()){

                case KeyEvent.VK_F:
                    line0.onPressed();
                    break;

                case KeyEvent.VK_G:
                    line1.onPressed();
                    break;

                case KeyEvent.VK_H:
                    line2.onPressed();
                    break;

                case KeyEvent.VK_J:
                    line3.onPressed();
                    break;
            }
        }));

        backGroundPanel.addKeyListener(new KeyReleasedActionMaker(keyEvent->{
            switch (keyEvent.getKeyCode()){

                case KeyEvent.VK_F:
                    line0.onReleased();
                    break;

                case KeyEvent.VK_G:
                    line1.onReleased();
                    break;

                case KeyEvent.VK_H:
                    line2.onReleased();
                    break;

                case KeyEvent.VK_J:
                    line3.onReleased();
                    break;
            }
        }));
    }

}

class KeyBoardPanel extends JPanel{

    Timer scheduler = new Timer();

    int keyDelay = 200;
    boolean isPressed = false;
    Color defaultColor = new Color(100,23,224);
    Color pressColor = Color.BLUE;

    public KeyBoardPanel(){
        setBackground(defaultColor);
    }

    public void onPressed(){
        setBackground(pressColor);
    }

    public void onReleased(){
        setBackground(defaultColor);
    }


}