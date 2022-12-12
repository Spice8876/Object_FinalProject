package InGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class InGameFrame extends JFrame{
    public InGameFrame(){
        super("리듬 게임");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new BackGroundPanel()); // GamePanel을 컨텐트팬으로 등록한다.
        pack(); //하위 컨탠트에 맞추는 설정
        setVisible(true);
    }
}
