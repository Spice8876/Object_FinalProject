package InGame;

import javax.swing.*;
import java.awt.*;

public class ScorePanel extends JPanel {
    JLabel scoreLabel;
    public ScorePanel(){
        setLayout(new BorderLayout());
        scoreLabel = new JLabel("0");
        scoreLabel.setHorizontalAlignment(JLabel.CENTER);
        scoreLabel.setFont(new Font("Serif", Font.BOLD, 60));
        scoreLabel.setForeground(Color.red);
        setBackground(new Color(0,0,0,0));
        add(scoreLabel,BorderLayout.CENTER);
    }

    public void onScoreUpdated(int score){
        scoreLabel.setText(String.valueOf(score));
    }
}
