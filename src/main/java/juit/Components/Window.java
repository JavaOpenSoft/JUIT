package juit.Components;

import javax.swing.*;

@SuppressWarnings("ALL")
public class Window extends JComponent{
    static final public byte EXIT_ON_CLOSE = JFrame.EXIT_ON_CLOSE;
    static final public byte DO_NOTHING_ON_CLOSE = JFrame.DO_NOTHING_ON_CLOSE;
    static final public byte HIDE_ON_CLOSE = JFrame.HIDE_ON_CLOSE;
    static final public byte DISPOSE_ON_CLOSE = JFrame.DISPOSE_ON_CLOSE;
    int x,y;
    @SuppressWarnings("CanBeFinal")
    JFrame window = new JFrame();

    public void createWindow(String Title, int SizeX, int SizeY)
    {
        window.setTitle(Title);
        window.setVisible(true);
        window.setSize(x,y);
        this.y = y;
        this.x = x;
    }

    public void add(Button button)
    {
        window.add(button.jButton);
    }
    public void add(Label label)
    {
        window.add(label.label);
    }

    public JFrame getWindow() {
        return window;
    }
    public void setCloseOperation(int WindowNumber)
    {
        if(WindowNumber == Window.DO_NOTHING_ON_CLOSE) window.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        if(WindowNumber == Window.HIDE_ON_CLOSE) window.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        if(WindowNumber == Window.DISPOSE_ON_CLOSE) window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        if(WindowNumber == Window.EXIT_ON_CLOSE) window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public int GetX(){return x;}
    public int GetY() {return y;}
    public void add(ScrollBar scrollBar)
    {
        window.add(scrollBar.jScrollBar);
    }
    public void add(CheckBox checkBox)
    {
        window.add(checkBox.jCheckBox);
    }
    public void add(MenuBar menuBar)
    {
        window.add(menuBar.menuBar);
    }
    public void add(PasswordField passwordField)
    {
        window.add(passwordField.jPasswordField);
    }
    public void add(Slider slider)
    {
        window.add(slider.jSlider);
    }
    public void add(TextField textField)
    {
        window.add(textField.jTextField);
    }
    public void add(ToggleSwitch toggleSwitch)
    {
        window.add(toggleSwitch.jToggleButton);
    }
}