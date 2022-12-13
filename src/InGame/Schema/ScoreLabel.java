package InGame.Schema;

import javax.swing.*;
import java.awt.*;

public class ScoreLabel extends JLabel {

    public ScoreLabel(String str){
        setLayout(new BorderLayout());
        setHorizontalAlignment(JLabel.CENTER);
        setFont(new Font("Serif", Font.BOLD, 60));
        setForeground(Color.red);
        setBackground(new Color(0,0,0,0));
        setText(str);
    }

    public void onScoreUpdated(int score){
        setText(String.valueOf(score));
    }
}
