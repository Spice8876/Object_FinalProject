package InGame;

import javax.swing.*;

public abstract class Node extends JPanel {

    int line;

    public abstract void move();

    public abstract boolean tryTouch();
}
