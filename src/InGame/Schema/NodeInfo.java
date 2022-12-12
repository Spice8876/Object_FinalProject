package InGame.Schema;

public class NodeInfo{
    public int time;
    public int line;
    public int length;

    public long settingTime;

    public NodeInfo(int time, int line, int length){
        this.time = time;
        this.line = line;
        this.length = length;
    }

    public void setTime(long localTime){
        settingTime = time + localTime;
    }
}