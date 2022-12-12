package InGame.Music;

public class MusicInfo{
    String name;
    int length;
    int waitingTime;
    String filePath;

    public MusicInfo(String name, int length, int waitingTime, String filePath){
        this.name = name;
        this.length = length;
        this.waitingTime = waitingTime;
        this.filePath = filePath;
    }

    public static MusicInfo Gymnopedies = new MusicInfo(
            "Gymnopedies",
            237000,
            3600,
            "Music/Gymnopédie No 1.wav"
    );
}