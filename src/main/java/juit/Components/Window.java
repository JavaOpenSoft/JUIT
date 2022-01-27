package juit.Components;

import juit.Layouts.*;
import juit.utils.Clock.Clock;

import javax.swing.*;
import java.awt.*;
import java.security.InvalidParameterException;

public class Window extends JComponent{
    static final public byte EXIT_ON_CLOSE = JFrame.EXIT_ON_CLOSE;
    static final public byte DO_NOTHING_ON_CLOSE = JFrame.DO_NOTHING_ON_CLOSE;
    static final public byte HIDE_ON_CLOSE = JFrame.HIDE_ON_CLOSE;
    static final public byte DISPOSE_ON_CLOSE = JFrame.DISPOSE_ON_CLOSE;
    static final public String CENTRE = "CENTRE";
    static final public String LEFT_CENTRE = "LEFT_CENTRE";
    static final public String RIGHT_CENTRE = "RIGHT_CENTRE";
    static final public String DOWN_CENTRE = "DOWN_CENTRE";
    static final public String UP_CENTRE = "UP_CENTRE";
    static final public String RIGHT_DOWN_CORNER = "RIGHT_DOWN_CORNER";
    static final public String RIGHT_UP_CORNER = "RIGHT_UP_CORNER";
    static final public String LEFT_UP_CORNER = "LEFT_UP_CORNER";
    static final public String LEFT_DOWN_CORNER = "LEFT_DOWN_CORNER";


    Dimension size = Toolkit.getDefaultToolkit ().getScreenSize ();
    private final int posx = size.width;
    private final int posy = size.height;
    int SizeX,SizeY,PositionX,PositionY;

    public int getPositionX() {
        return PositionX;
    }

    public int getPositionY() {
        return PositionY;
    }

    JFrame window = new JFrame();

    public void createWindow(String Title, int SizeX, int SizeY)
    {
        window.setTitle(Title);
        window.setVisible(true);
        window.setSize(SizeX,SizeY);
        this.SizeX = SizeX;
        this.SizeY = SizeY;
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

    public int GetSizeX(){return SizeX;}
    public int GetSizeY() {return SizeY;}
    public void add(Button button)
    {
        window.add(button.jButton);
    }
    public void add(Label label)
    {
        window.add(label.label);
    }
    public void add(Clock clock)
    {
        if(clock.getClockType().equals("Digital"))window.add(clock.getDigitalClock());
        if(clock.getClockType().equals("Analog"))window.add(clock.getAnalogClock());
    }
    public void add(Spinner spinner)
    {
        window.add(spinner.jSpinner);
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
    public void add(Panel panel)
    {
        window.add(panel.jPanel);
    }
    public void setLayout(FlowLayouts flowLayouts)
    {
        window.setLayout(flowLayouts.flowLayout);
    }
    public void setLayout(AbsoluteLayout absoluteLayout)
    {
        window.setLayout((LayoutManager) absoluteLayout.getLayout());
    }
    public void setLayout(BoxLayouts boxLayouts,Container pane,int AXIS)
    {
        window.setLayout(boxLayouts.getBoxLayout(pane,AXIS));
        if(AXIS != BoxLayouts.X_AXIS &&AXIS != BoxLayouts.Y_AXIS) throw new InvalidParameterException("setLayout()" +
                " Function AXIS Parameter Which is Invalid. Try To use'BoxLayouts.Y_AXIS' or 'BoxLayouts.X_AXIS'");
    }
    public void setLayout(CardLayouts cardLayouts)
    {
        window.setLayout(cardLayouts.cardLayout);
    }
    public void setLayout(GridBagLayouts gridBagLayouts)
    {
        window.setLayout(gridBagLayouts.gridBagLayout);
    }
    public void setLayout(GridLayouts gridLayouts)
    {
        window.setLayout(gridLayouts.gridLayout);
    }
    public void setLayout(SpringLayouts springLayouts)
    {
        window.setLayout(springLayouts.springLayout);
    }
    public void setLocationOnScreen(Component component)
    {
        window.setLocationRelativeTo(component);
    }
    public void setLocationOnScreen(String Location)
    {
        JLabel temp = new JLabel();
        if(Location.equals("CENTRE"))window.setLocationRelativeTo(null);
        if(Location.equals("LEFT_CENTRE")){
            temp.setBounds(0,posy/2,0,0);
            window.setLocationRelativeTo(temp);
        }
        if(Location.equals("RIGHT_CENTRE")){
            temp.setBounds(posx,posy/2,0,0);
            window.setLocationRelativeTo(temp);
        }
        if(Location.equals("DOWN_CENTRE")){
            temp.setBounds(posx/2,posy,0,0);
            window.setLocationRelativeTo(temp);
        }
        if(Location.equals("UP_CENTRE")){
            temp.setBounds(posx,0,0,0);
            window.setLocationRelativeTo(temp);
        }
        if(Location.equals("RIGHT_DOWN_CORNER")){
            temp.setBounds(0,posy,0,0);
            window.setLocationRelativeTo(temp);
        }
        if(Location.equals("RIGHT_UP_CORNER")){
            temp.setBounds(0,0,0,0);
            window.setLocationRelativeTo(temp);
        }
        if(Location.equals("LEFT_UP_CORNER")){
            temp.setBounds(posx,posy/2,0,0);
            window.setLocationRelativeTo(temp);
        }
        if(Location.equals("LEFT_DOWN_CORNER")){
            temp.setBounds(posx,posy,0,0);
            window.setLocationRelativeTo(temp);
        }
    }
}