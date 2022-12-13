package InGame.Music;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class MusicManager {
    MusicPlayer musicPlayer;

    public void play(MusicInfo music){
        musicPlayer = new MusicPlayer(music);
        musicPlayer.start();
    }

    public void stop(){
        musicPlayer.musicStop();
    }
}

class MusicPlayer extends Thread{

    MusicInfo musicInfo;
    Clip clip;
    public MusicPlayer(MusicInfo musicInfo){
        this.musicInfo = musicInfo;
    }

    @Override
    public void run() {
        super.run();
        try {
            Thread.sleep(musicInfo.waitingTime);
            AudioInputStream ais = AudioSystem.getAudioInputStream(new File(musicInfo.musicPath));
            clip = AudioSystem.getClip();
            clip.stop();
            clip.open(ais);
            clip.start();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void musicStop(){
        clip.stop();
    }
}

