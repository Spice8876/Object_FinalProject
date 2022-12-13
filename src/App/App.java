package App;

import InGame.InGameFrame;
import InGame.Music.MusicInfo;
import SelectMenu.MusicSelectFrame;

public class App {

    InGameFrame inGameFrame;
    MusicSelectFrame musicSelectFrame;
    public App(){
        inGameFrame = new InGameFrame(this);
        musicSelectFrame = new MusicSelectFrame(this);
        run();
    }

    public void run(){
        musicSelectFrame.run();
    }

    public void onClickMusicButton(MusicInfo musicInfo){
        musicSelectFrame.dispose();
        inGameFrame.run(musicInfo);
    }

    public void onGameOver(){
        inGameFrame.dispose();
        musicSelectFrame.run();
    }
}