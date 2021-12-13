package juit.Components;

import juit.Layouts.*;
import juit.utils.Clock.Clock;

import javax.swing.*;
import java.awt.*;
import java.security.InvalidParameterException;

public class Panel {
    JPanel jPanel = new JPanel();
    public void add(Button button)
    {
        jPanel.add(button.jButton);
    }
    public void add(Label label)
    {
        jPanel.add(label.label);
    }
    public void add(Clock clock)
    {
        if(clock.getClockType().equals("Digital"))jPanel.add(clock.getDigitalClock());
        if(clock.getClockType().equals("Analog"))jPanel.add(clock.getAnalogClock());
    }
    public void add(Spinner spinner)
    {
        jPanel.add(spinner.jSpinner);
    }
    public void add(CheckBox checkBox)
    {
        jPanel.add(checkBox.jCheckBox);
    }
    public void add(MenuBar menuBar)
    {
        jPanel.add(menuBar.menuBar);
    }
    public void add(PasswordField passwordField)
    {
        jPanel.add(passwordField.jPasswordField);
    }
    public void add(Slider slider)
    {
        jPanel.add(slider.jSlider);
    }
    public void add(TextField textField)
    {
        jPanel.add(textField.jTextField);
    }
    public void add(ToggleSwitch toggleSwitch)
    {
        jPanel.add(toggleSwitch.jToggleButton);
    }
    public void add(Panel panel)
    {
        jPanel.add(panel.jPanel);
    }
    public void setLayout(FlowLayouts flowLayouts)
    {
        jPanel.setLayout(flowLayouts.flowLayout);
    }
    public void setLayout(AbsoluteLayout absoluteLayout)
    {
        jPanel.setLayout((LayoutManager) absoluteLayout.getLayout());
    }
    public void setLayout(BoxLayouts boxLayouts, Container pane, int AXIS)
    {
        jPanel.setLayout(boxLayouts.getBoxLayout(pane,AXIS));
        if(AXIS != BoxLayouts.X_AXIS &&AXIS != BoxLayouts.Y_AXIS) throw new InvalidParameterException("setLayout()" +
                " Function AXIS Parameter Which is Invalid. Try To use'BoxLayouts.Y_AXIS' or 'BoxLayouts.X_AXIS'");
    }
    public void setLayout(CardLayouts cardLayouts)
    {
        jPanel.setLayout(cardLayouts.cardLayout);
    }
    public void setLayout(GridBagLayouts gridBagLayouts)
    {
        jPanel.setLayout(gridBagLayouts.gridBagLayout);
    }
    public void setLayout(GridLayouts gridLayouts)
    {
        jPanel.setLayout(gridLayouts.gridLayout);
    }
    public void setLayout(SpringLayouts springLayouts)
    {
        jPanel.setLayout(springLayouts.springLayout);
    }
}
