package juit.test;

import juit.Constants.WindowConstants;
import juit.Core.Window;
import juit.Layouts.AbsoluteLayout;

import java.awt.*;

public class Test {
    static Window window = new Window();
    public static void main(String[] args){
        window.setPosition(100,100);
        window.setSize(500,500);
        window.setLayout(new AbsoluteLayout());
        window.setVisible(true);
        window.setCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }
}
