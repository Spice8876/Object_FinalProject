package InGame.Music;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class MusicManager {
    public void play(MusicInfo music){
        MusicPlayer musicPlayer = new MusicPlayer(music);
        musicPlayer.start();
    }
}

class MusicPlayer extends Thread{

    MusicInfo musicInfo;

    public MusicPlayer(MusicInfo musicInfo){
        this.musicInfo = musicInfo;
    }

    @Override
    public void run() {
        super.run();
        try {
            Thread.sleep(musicInfo.waitingTime);
            AudioInputStream ais = AudioSystem.getAudioInputStream(new File(musicInfo.filePath));
            Clip clip = AudioSystem.getClip();
            clip.stop();
            clip.open(ais);
            clip.start();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

