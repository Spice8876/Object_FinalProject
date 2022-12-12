package SelectMenu;

import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.awt.event.*;
import javax.sound.sampled.*;

import java.awt.event.*;

import java.awt.*;
//import java.awt.Container;
//import java.awt.Dimension;
//import java.awt.Graphics;
//import java.awt.Image;
//import java.awt.Toolkit;

import javax.swing.*;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JPanel;
//import javax.swing.SwingConstants;


public class Select_Main {

    public static void main(String[] args) {

    }

}

class Dinae extends JFrame {
    static File file1 = new File("audio/애국가1절.wav");
    static File file2 = new File("audio/ZICO.wav");
    static Clip clip;
    public Dinae() {

        super("리듬게임"); //타이틀
        JPanel jPanel = new JPanel();
        JButton btn1 = new JButton("곡 A");
        JButton btn2 = new JButton("곡 B");
        setPreferredSize(new Dimension(960,480)); //창 크기 설정
        jPanel.add(btn1);
        jPanel.add(btn2);
        MyMouseListener listener1 = new MyMouseListener();
        MyMouseListener2 listener2 = new MyMouseListener2();
        btn1.addMouseListener(listener1);
        btn2.addMouseListener(listener2);
        add(jPanel,"South");
        JLabel Select_Title = new JLabel("RhyThm Game!",SwingConstants.CENTER);
        Select_Title.setFont(new Font("Ravie", Font.ITALIC, 50));
        Select_Title.setLocation(50,240);
        add(Select_Title);






        Dimension frameSize = getSize();

        Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((windowSize.width - frameSize.width) / 2,
                (windowSize.height - frameSize.height) / 2); //화면 중앙에 띄우기
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
        setVisible(true);

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Part1(); //다음창으로 이동
                setVisible(false); // 창 안보이게 하기
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Part2(); //다음창으로 이동
                setVisible(false); // 창 안보이게 하기
            }
        });
    }



    class MyMouseListener implements MouseListener{

        @Override
        public void mouseClicked(MouseEvent e) {
        }

        @Override
        public void mousePressed(MouseEvent e) {
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override//마우스가 버튼 안으로 들어오면 회색으로 바뀜
        public void mouseEntered(MouseEvent e) {
            audio_A();
            JButton b = (JButton)e.getSource();
            b.setBackground(Color.GRAY);

        }

        @Override//마우스가 버튼 밖으로 나가면 흰색으로 바뀜
        public void mouseExited(MouseEvent e) {
            //audio_B();
            clip.stop();
            JButton b = (JButton)e.getSource();
            b.setBackground(Color.WHITE);
        }

    }

    class MyMouseListener2 implements MouseListener{

        @Override
        public void mouseClicked(MouseEvent e) {
        }

        @Override
        public void mousePressed(MouseEvent e) {
        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override//마우스가 버튼 안으로 들어오면 회색으로 바뀜
        public void mouseEntered(MouseEvent e) {
            audio_B();
            JButton b = (JButton)e.getSource();
            b.setBackground(Color.GRAY);

        }

        @Override//마우스가 버튼 밖으로 나가면 흰색으로 바뀜
        public void mouseExited(MouseEvent e) {
            clip.stop();
            JButton b = (JButton)e.getSource();
            b.setBackground(Color.WHITE);

        }

    }

    public static void audio_A() {
        try {
            clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(file1));
            //clip.loop(3);
            clip.start();
        } catch (Exception e) {
            System.err.println("Put the music.wav file in the sound folder if you want to play background music, only optional!");
        }
    }

    public static void audio_B() {
        try {
            clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(file2));
            //clip.loop(3);
            clip.start();
        } catch (Exception e) {
            System.err.println("Put the music.wav file in the sound folder if you want to play background music, only optional!");
        }
    }



    public static void main(String[] args) {
        new Dinae();
    }
}

class Part1 extends  JFrame{ //이동한 프레임 예시
    Part1(){
        super("창2"); //타이틀
        JPanel jPanel = new JPanel();

        setSize(300, 200);

        add(jPanel);

        Dimension frameSize = getSize();
        Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((windowSize.width - frameSize.width) / 2,
                (windowSize.height - frameSize.height) / 2); //화면 중앙에 띄우기
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
}

class Part2 extends  JFrame{ //이동한 프레임 예시
    Part2(){
        super("창2"); //타이틀
        JPanel jPanel = new JPanel();

        setSize(300, 200);

        add(jPanel);

        Dimension frameSize = getSize();
        Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((windowSize.width - frameSize.width) / 2,
                (windowSize.height - frameSize.height) / 2); //화면 중앙에 띄우기
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
}

class MyMouseListener implements MouseListener{

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override//마우스가 버튼 안으로 들어오면 빨간색으로 바뀜
    public void mouseEntered(MouseEvent e) {
        JButton b = (JButton)e.getSource();
        b.setBackground(Color.RED);
    }

    @Override//마우스가 버튼 밖으로 나가면 노란색으로 바뀜
    public void mouseExited(MouseEvent e) {
        JButton b = (JButton)e.getSource();
        b.setBackground(Color.YELLOW);
    }

}


