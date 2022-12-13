package SelectMenu;

import App.App;
import InGame.InGamePanel;
import InGame.Music.MusicInfo;
import MusicSelect.MusicSelect;

import javax.swing.*;

public class MusicSelectFrame extends JFrame{
    MusicSelect musicSelect;
    App app;

    public MusicSelectFrame(App app){
        super("리듬 게임");
        this.app = app;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void onClickPlayButton(MusicInfo musicInfo){
        app.onClickMusicButton(musicInfo);
    }

    public void run(){
        musicSelect = new MusicSelect(this);
        setContentPane(musicSelect); // GamePanel을 컨텐트팬으로 등록한다.
        pack(); //하위 컨탠트에 맞추는 설정
        setVisible(true);
    }
}
