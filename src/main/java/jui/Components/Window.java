package jui.Components;

import javax.swing.*;
import java.awt.*;

public class Window extends JComponent{
    final public int EXIT_ON_CLOSE = JFrame.EXIT_ON_CLOSE;
    final public int DO_NOTHING_ON_CLOSE = JFrame.DO_NOTHING_ON_CLOSE;
    final public int HIDE_ON_CLOSE = JFrame.HIDE_ON_CLOSE;
    final public int DISPOSE_ON_CLOSE = JFrame.DISPOSE_ON_CLOSE;
    int x,y;
    JFrame Window = new JFrame();;
    public void createWindow(String Title, int x, int y)
    {
        Window.setTitle(Title);
        Window.setVisible(true);
        Window.setSize(x,y);
        this.y = y;
        this.x = x;
    }
    public void add(Button button)
    {
        JButton jButton = new JButton(button.getText());
        jButton.setSize(button.GetX(),button.GetY());
        Window.add(jButton);
    }
}