package common;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyReleasedActionMaker extends KeyAdapter {
    KeyAction keyAction;

    public KeyReleasedActionMaker(KeyAction keyAction){
        this.keyAction = keyAction;
    }

    @Override
    public void keyReleased(KeyEvent e){
        keyAction.action(e);
    }
}
