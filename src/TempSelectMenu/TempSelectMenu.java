package TempSelectMenu;

import common.Constants;

import javax.swing.*;
import java.awt.*;

public class TempSelectMenu extends JPanel
{
    public TempSelectMenu(){
        setLayout(null);
        setPreferredSize(new Dimension(480,960));

        TopBarPanel topBarPanel = new TopBarPanel();
        ListViewPanel listViewPanel = new ListViewPanel();

        topBarPanel.setBounds(0,0, Constants.MaxWidth,80);
        listViewPanel.setBounds(0,80, Constants.MaxWidth,880);

        add(topBarPanel);
        add(listViewPanel);
    }
}

class TopBarPanel extends JPanel{
    public TopBarPanel(){
        setBackground(Color.BLUE);
    }
}

class ListViewPanel extends JPanel{
    public ListViewPanel(){
        setBackground(Color.RED);
    }
}

