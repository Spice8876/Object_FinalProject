package InGame;

import App.MainFrame;
import InGame.Music.MusicInfo;
import common.Constants;

import javax.swing.*;
import java.awt.*;

public class InGamePanel extends JPanel {
    InGameFrame inGameFrame;
    BackGroundPanel backGroundPanel;
    public GameManager gameManager;

    public InGamePanel(InGameFrame inGameFrame){
        setLayout(null);
        setPreferredSize(new Dimension(480 , 960));
        backGroundPanel = new BackGroundPanel();
        this.inGameFrame = inGameFrame;
        gameManager = new GameManager(this,backGroundPanel);

        backGroundPanel.setBounds(0,0, Constants.MaxWidth,Constants.MaxHeight);
        add(backGroundPanel);
    }

    public void start(MusicInfo musicInfo){
        gameManager.start(musicInfo);
        backGroundPanel.requestFocus();
    }

    public void gameOver(){
        inGameFrame.onGameOver();
    }
}
