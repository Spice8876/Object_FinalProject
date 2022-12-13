package MusicSelect;
import App.MainFrame;
import InGame.Music.MusicInfo;
import SelectMenu.MusicSelectFrame;

import java.io.IOException;
import java.awt.event.*;

import java.awt.event.*;

import java.awt.*;
import javax.swing.*;

class TopBarPanel extends JPanel{
    public TopBarPanel(){
        setBackground(Color.black);
    }
}

public class MusicSelect extends JPanel {

    MusicSelectFrame musicSelectFrame;

    public MusicSelect(MusicSelectFrame musicSelectFrame) {
        this.musicSelectFrame = musicSelectFrame;
        Color back = new Color(153, 204, 255);
        setPreferredSize(new Dimension(480, 960));
        //setResizable(false);
        setLayout(null);
        setBackground(back);

        JButton music1_btn = new JButton("플레이");
        music1_btn.setLocation(350, 130);
        music1_btn.setSize(80, 40);
        music1_btn.setOpaque(true); //Opaque값을 true로 미리 설정해 주어야 배경색이 적용된다.
        music1_btn.setBackground(back);
        music1_btn.setFont(new Font("맑은 고딕", Font.BOLD, 15));
        music1_btn.setForeground(Color.black);
        add(music1_btn);

        music1_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                musicSelectFrame.onClickPlayButton(MusicInfo.Gymnopedies);
            }
        });

        JButton music2_btn = new JButton("플레이");
        music2_btn.setLocation(350, 310);
        music2_btn.setSize(80, 40);
        music2_btn.setOpaque(true); //Opaque값을 true로 미리 설정해 주어야 배경색이 적용된다.
        music2_btn.setBackground(back);
        music2_btn.setFont(new Font("맑은 고딕", Font.BOLD, 15));
        music2_btn.setForeground(Color.black);
        add(music2_btn);

        music2_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                musicSelectFrame.onClickPlayButton(MusicInfo.HeyJude);
            }
        });

        JButton music3_btn = new JButton("플레이");
        music3_btn.setLocation(350, 490);
        music3_btn.setSize(80, 40);
        music3_btn.setOpaque(true); //Opaque값을 true로 미리 설정해 주어야 배경색이 적용된다.
        music3_btn.setBackground(back);
        music3_btn.setFont(new Font("맑은 고딕", Font.BOLD, 15));
        music3_btn.setForeground(Color.black);
        add(music3_btn);

        music3_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                musicSelectFrame.onClickPlayButton(MusicInfo.Canon);
            }
        });

        JLabel music1 = new JLabel("Nocturne Op.9, No.2 in E flat");
        music1.setLocation(20, 50);
        music1.setSize(420, 50);
        music1.setOpaque(true); //Opaque값을 true로 미리 설정해 주어야 배경색이 적용된다.
        music1.setBackground(Color.white);
        music1.setFont(new Font("맑은 고딕", Font.BOLD, 20));
        add(music1);

        JLabel music1_Shadow = new JLabel("");
        music1_Shadow.setLocation(20, 100);
        music1_Shadow.setSize(420, 80);
        music1_Shadow.setOpaque(true); //Opaque값을 true로 미리 설정해 주어야 배경색이 적용된다.
        music1_Shadow.setBackground(Color.white);
        add(music1_Shadow);

        JLabel music2 = new JLabel("Hey Jude - The Beatles");
        music2.setLocation(20, 230);
        music2.setSize(420, 50);
        music2.setOpaque(true); //Opaque값을 true로 미리 설정해 주어야 배경색이 적용된다.
        music2.setBackground(Color.white);
        music2.setFont(new Font("맑은 고딕", Font.BOLD, 20));
        add(music2);

        JLabel music2_Shadow = new JLabel("");
        music2_Shadow.setLocation(20, 280);
        music2_Shadow.setSize(420, 80);
        music2_Shadow.setOpaque(true); //Opaque값을 true로 미리 설정해 주어야 배경색이 적용된다.
        music2_Shadow.setBackground(Color.white);
        add(music2_Shadow);

        JLabel music3 = new JLabel("Canon in D major");
        music3.setLocation(20, 410);
        music3.setSize(420, 50);
        music3.setOpaque(true); //Opaque값을 true로 미리 설정해 주어야 배경색이 적용된다.
        music3.setBackground(Color.white);
        music3.setFont(new Font("맑은 고딕", Font.BOLD, 20));
        add(music3);

        JLabel music3_Shadow = new JLabel("");
        music3_Shadow.setLocation(20, 460);
        music3_Shadow.setSize(420, 80);
        music3_Shadow.setOpaque(true); //Opaque값을 true로 미리 설정해 주어야 배경색이 적용된다.
        music3_Shadow.setBackground(Color.white);
        add(music3_Shadow);


        setVisible(true);

    }
}



