package jui.Components;

import jui.utils.AboutJUIT;

import javax.swing.*;

class test
{
    public static void main(String[] args)
    {

        AboutJUIT aboutJUIT = new AboutJUIT();
        aboutJUIT.ShowJUIDetails();
        Window win = new Window();
        Button button = new Button("Tell About Me", 100, 50);
        win.createWindow("What's Up Mate?", 400, 400);
        win.add(button);
    }
}