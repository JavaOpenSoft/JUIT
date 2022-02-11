package juit.Components.test;

import juit.Components.Button;
import juit.Components.Window;

import javax.swing.*;

public class test {
    public static void main(String[] args){
        Window window = new Window();
        Button button = new Button();
        JPanel panel = new JPanel();
        window.setSize(1000,1000);
        button.setVisible(true);
        window.add(button);
        window.setVisible(true);

    }
}
