package InGame;

import common.Constants;

import javax.swing.*;
import java.awt.*;

public class TileLinePanel extends JPanel {

    public TileLinePanel(){
        setOpaque(false);
    }

    @Override
    public void paint(Graphics g){
        super.paint(g);
        g.setColor(Color.WHITE);
        g.drawLine(120, 0, 120, Constants.MaxHeight);
        g.drawLine(240, 0, 240, Constants.MaxHeight);
        g.drawLine(360, 0, 360, Constants.MaxHeight);
    }
}
