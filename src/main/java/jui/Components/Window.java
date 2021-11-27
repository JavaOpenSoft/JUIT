package jui.Components;

import javax.swing.*;
import java.awt.event.KeyEvent;

@SuppressWarnings("ALL")
public class Window extends JComponent{
    final public int EXIT_ON_CLOSE = JFrame.EXIT_ON_CLOSE;
    final public int DO_NOTHING_ON_CLOSE = JFrame.DO_NOTHING_ON_CLOSE;
    final public int HIDE_ON_CLOSE = JFrame.HIDE_ON_CLOSE;
    final public int DISPOSE_ON_CLOSE = JFrame.DISPOSE_ON_CLOSE;
    int x,y;
    @SuppressWarnings("CanBeFinal")
    JFrame Window = new JFrame();

    public void createWindow(String Title, int SizeX, int SizeY)
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
        jButton.setSize(button.GetSizeX(),button.GetSizeY());
        Window.add(jButton);
    }
    public void add(Label label)
    {
        JLabel jLabel = new JLabel(label.getText());
        jLabel.setSize(label.GetPositionX(),label.GetPositionY());
        Window.add(jLabel);
    }

    public JFrame getWindow() {
        return Window;
    }
    public void setCloseOperation(int WindowNumber)
    {
        if(WindowNumber == 0) Window.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        if(WindowNumber == 1) Window.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        if(WindowNumber == 2) Window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        if(WindowNumber == 3) Window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public int GetX(){return x;}
    public int GetY() {return y;}
}