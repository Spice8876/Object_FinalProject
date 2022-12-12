package InGame;
import javax.swing.*;

class MainFrame extends JFrame {
    public MainFrame(){
        super("리듬 게임");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new BackGroundPanel()); // GamePanel을 컨텐트팬으로 등록한다.
        setSize(480, 960);
        setVisible(true);
    }
}