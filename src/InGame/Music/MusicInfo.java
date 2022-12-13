package InGame.Music;

public class MusicInfo{
    public String name;
    public int length;
    public int waitingTime;
    public String musicPath;

    public String nodePath;
    public int speed;

    public MusicInfo(String name, int length, int waitingTime, String musicPath , String nodePath , int speed){
        this.name = name;
        this.length = length;
        this.waitingTime = waitingTime;
        this.musicPath = musicPath;
        this.nodePath = nodePath;
        this.speed = speed;
    }

    public static MusicInfo Gymnopedies = new MusicInfo(
            "Gymnopedies",
            237000,
            3700,
            "Music/Gymnopédie No 1.wav",
            "Music/Gymnopédie No 1.txt",
            3
    );

    public static MusicInfo Canon = new MusicInfo(
            "Canon in D major",
            59980,
            3700,
            "Music/Canon.wav",
            "Sheets/Canon.txt",
            10
    );

    public static MusicInfo HeyJude = new MusicInfo(
            "Hey Jude",
            59560,
            3700,
            "Music/Hey Jude.wav",
            "Sheets/Hey Jude.txt",
            10
    );
}