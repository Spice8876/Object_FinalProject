package InGame;
import java.io.IOException;
import java.awt.event.*;
import java.awt.event.KeyEvent;
import java.awt.event.*;

import java.awt.*;
import javax.swing.*;

/*class TempSelectMenu extends JPanel
{
    public TempSelectMenu(){
        setLayout(null);
        setPreferredSize(new Dimension(480,960));

        TopBarPanel topBarPanel = new TopBarPanel();
        Point_Panel PointViewPanel = new Point_Panel("Hey Jude", 200);

        topBarPanel.setBounds(0,0, Constants.MaxWidth,80);
        PointViewPanel.setBounds(0,80, Constants.MaxWidth,880);

        add(topBarPanel);
        add(PointViewPanel);
    }
}

class TopBarPanel extends JPanel{
    public TopBarPanel(){
        setBackground(Color.black);
    }
}*/



public class Point_Panel extends JFrame{
	Point_Panel(String name, int point){
		setTitle("점수판");
		Color back = new Color(180,180,180);
		getContentPane().setBackground(back);
		setBackground(back);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setPreferredSize(new Dimension(480,960));
		pack();
		setLayout(null);
		setResizable(false);
		
		JLabel clear = new JLabel("Clear!");
		clear.setLocation(130,50);
		clear.setSize(400,300);
		//clear.setOpaque(true); 
		//clear.setBackground(Color.white);
		clear.setFont(new Font("Ravie", Font.BOLD, 50));
		add(clear);
		
		if(name == "Hey Jude")
		{
			JLabel Music_Name = new JLabel("Music: "+name); //곡이름
			Music_Name.setLocation(150,300); //곡에 따라 바뀌는 값
			Music_Name.setSize(200,100); //곡에 따라 바뀌는 값
			Music_Name.setFont(new Font("맑은 고딕", Font.BOLD, 20));
			add(Music_Name);
		}
		
		else if(name == "Canon in D major") 
		{
			JLabel Music_Name = new JLabel("Music: "+name); //곡이름
			Music_Name.setLocation(110,300); 
			Music_Name.setSize(300,100); 
			Music_Name.setFont(new Font("맑은 고딕", Font.BOLD, 20));
			add(Music_Name);
		}
		
		else if(name == "Gymnopédie No. 1")
		{
			JLabel Music_Name = new JLabel("Music: "+name); //곡이름
			Music_Name.setLocation(110,300); 
			Music_Name.setSize(300,100); 
			Music_Name.setFont(new Font("맑은 고딕", Font.BOLD, 20));
			add(Music_Name);
		}
		
		JLabel GamePoint = new JLabel("Point: "+point);
		GamePoint.setLocation(110,370); 
		GamePoint.setSize(200,100); 
		GamePoint.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		add(GamePoint);
		
		JLabel pressany = new JLabel("Press any key exit"); 
		pressany.setLocation(95,600); 
		pressany.setSize(300,100); 
		pressany.setFont(new Font("Ravie", Font.BOLD, 20));
		add(pressany);
		
		this.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				//다음으로 이동
				setVisible(false);
			}
		});
		
		
		setVisible(true);
	}
	
	
	
	
	public static void main(String[] args) {
		new Point_Panel("Gymnopédie No. 1", 200);
	}

}
