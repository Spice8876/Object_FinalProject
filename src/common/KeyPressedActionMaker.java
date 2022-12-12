package common;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyPressedActionMaker extends KeyAdapter{
    KeyAction keyAction;

    public KeyPressedActionMaker(KeyAction keyAction){
        this.keyAction = keyAction;
    }

    @Override
    public void keyPressed(KeyEvent e){
        keyAction.action(e);
    }

}
