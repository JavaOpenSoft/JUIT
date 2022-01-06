package juit.Components;

import javax.swing.*;
import java.awt.event.ActionListener;

public class CheckBox {
    JCheckBox jCheckBox = new JCheckBox();
    public void addActionListener(ActionListener actionListener)
    {
        jCheckBox.addActionListener(actionListener);
    }
    public void setState(boolean state){
    }
    public void setSize(int SizeX, int SizeY){}
}
