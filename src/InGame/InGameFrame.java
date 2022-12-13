package InGame;

import App.App;
import InGame.Music.MusicInfo;
import MusicSelect.MusicSelect;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class InGameFrame extends JFrame{
    InGamePanel inGamePanel;
    App app;

    public InGameFrame(App app){
        super("리듬 게임");
        this.app = app;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void onGameOver(){
        app.onGameOver();
    }

    public void run(MusicInfo musicInfo){
        inGamePanel = new InGamePanel(this);
        setContentPane(inGamePanel); // GamePanel을 컨텐트팬으로 등록한다.
        setVisible(true);
        pack(); //하위 컨탠트에 맞추는 설정
        inGamePanel.start(musicInfo);
    }
}
