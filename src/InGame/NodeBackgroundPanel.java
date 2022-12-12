package InGame;

import javax.swing.*;
import java.awt.*;
import common.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

/**
 *  노드가 움직이는 패널
 *
 */
class NodeBackgroundPanel extends JPanel {
    BackGroundPanel backGroundPanel;

    public NodeBackgroundPanel(BackGroundPanel backGroundPanel){
        this.backGroundPanel = backGroundPanel;
        setLayout(null);
        setBackground(new Color(123,192,230));
    }
}

