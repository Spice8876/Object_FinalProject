package InGame;
import common.KeyPressedActionMaker;
import common.KeyReleasedActionMaker;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class BackGroundPanel extends JLayeredPane {
    final int MAX_WIDTH = 480;
    final int MAX_HEIGHT = 960;
    final Integer NodeBackgroundDepth = 100;
    final Integer KeyBoardTableDepth = 200;
    final Integer InputHighLightDepth = 200;

    final Integer TileLineDepth = 300;

    NodeBackgroundPanel nodeBackgroundPanel;
    KeyBoardTablePanel keyBoardTablePanel;
    InputHighLightPanel inputHighLightPanel;
    TileLinePanel tileLinePanel;

    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    public BackGroundPanel(){
        setBackground(Color.GRAY);
        setPreferredSize(new Dimension(480 , 960));
        setLayout(null);
        setFocusable(true);
        requestFocus();

        nodeBackgroundPanel = new NodeBackgroundPanel(this);
        keyBoardTablePanel = new KeyBoardTablePanel(this);
        inputHighLightPanel  = new InputHighLightPanel();
        tileLinePanel = new TileLinePanel();

        GameManager gameManager = new GameManager(this);

        nodeBackgroundPanel.setBounds(0,0,MAX_WIDTH,960);
        keyBoardTablePanel.setBounds(0,900,MAX_WIDTH,60);
        inputHighLightPanel.setBounds(0,800,MAX_WIDTH,20);
        tileLinePanel.setBounds(0,0,MAX_WIDTH,960);

        add(nodeBackgroundPanel , NodeBackgroundDepth);
        add(keyBoardTablePanel , KeyBoardTableDepth);
        add(inputHighLightPanel , InputHighLightDepth);
        add(tileLinePanel , TileLineDepth);

        gameManager.start();
    }
}
