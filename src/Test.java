import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Test {
    public static void main(String[] args) {

        Maker.make(new JFrame(),(frame -> {
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(600, 800);
            frame.setVisible(true);

            frame.setContentPane(Maker.make(new JPanel(),(panel)->{

                panel.add(Maker.make(new JLabel("메인메뉴"), (label)->{
                    label.setSize(240, 30); // 레이블 크기
                    label.setLocation(120, 50); // 레이블 위치
                    label.setHorizontalAlignment(JLabel.CENTER); // 레이블에 출력되는 수를 센터링
                    label.setOpaque(true); // 레이블에 배경색 설정이 가능하도록 한다.
                    label.setBackground(Color.MAGENTA); // 레이블의 배경색을 설정한다.
                    label.setForeground(Color.YELLOW); //레이블의 글자 색을 설정한다.
                    label.setFont(new Font("Nanum_Gothic",Font.PLAIN, 30)); // 레이블 글자의 폰트를 설정한다.
                }));

                panel.add(Maker.make(new JButton("버튼"),(button)->{
                    button.addMouseListener(new MouseAction((event) -> {
                        button.setText("선택");
                    }));
                    button.setSize(250, 20);
                    button.setLocation(30, 120);
                }));
                panel.add(Maker.make(new JButton("버튼"),(button)->{
                    button.addMouseListener(new MouseAction((event) -> {
                        button.setText("선택");
                    }));
                    button.setSize(250, 20);
                    button.setLocation(30, 120);
                }));
                panel.add(Maker.make(new JButton("버튼"),(button)->{
                    button.addMouseListener(new MouseAction((event) -> {
                        button.setText("선택");
                    }));
                    button.setSize(250, 20);
                    button.setLocation(30, 120);
                }));
            }));
        }));
    }
}

interface MakeAction<T>{
    void make(T t);
}

class Maker{
    public static <T> T make(T target , MakeAction<T> makeAction){
        makeAction.make(target);
        return target;
    }
}
