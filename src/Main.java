import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main {
    public static void main(String[] args) {
        App app = new App();
    }
}

class App{
    public App(){
        new MainFrame();
    }
}

class MainFrame extends JFrame{
    public MainFrame(){
        super("리듬 게임");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new BackGroundPanel()); // GamePanel을 컨텐트팬으로 등록한다.
        setSize(1080, 720);
        setVisible(true);
    }
}

class BackGroundPanel extends JPanel{
    public BackGroundPanel(){
        setBackground(Color.blue);
    }
}

interface Action<T>{
    void OnPress(T event);
}

class MouseAction extends MouseAdapter {
    Action<MouseEvent> mousePressed;

    public MouseAction(Action<MouseEvent> action){
        mousePressed = action;
    }

    @Override
    public void mousePressed(MouseEvent e) {
        mousePressed.OnPress(e);
    }
}

class KeyAction extends KeyAdapter {
    Action<KeyEvent> keyPressed;

    public KeyAction(Action<KeyEvent> action){
        keyPressed = action;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        keyPressed.OnPress(e);
    }
}


