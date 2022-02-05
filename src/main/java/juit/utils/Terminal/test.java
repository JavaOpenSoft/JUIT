package juit.utils.Terminal;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class test implements KeyListener{
    public static void main(String[] args){

    }



    @Override
    public void keyTyped(KeyEvent e) {

    }

    public void keyPressed(KeyEvent e) {
        System.out.println("You Pressed:"+ e.getKeyChar());
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}