package juit.Components;

import javax.swing.*;
import java.awt.event.ActionListener;

public class CheckBox {
    JCheckBox jCheckBox = new JCheckBox();
    boolean isChecked = false;

    public void addActionListener(ActionListener actionListener)
    {
        jCheckBox.addActionListener(actionListener);
    }
    public void setState(boolean isChecked){
        jCheckBox.setSelected(isChecked);
        this.isChecked = isChecked;
    }
    public void setCheckedIcon(String iconPath)
    {

        jCheckBox.setIcon(new ImageIcon(iconPath));
    }
    public void setSize(int SizeX, int SizeY){}
    public void setClickable(boolean isClickable){}
    public void isVisible(boolean bool)
    {
        jCheckBox.setVisible(true);
    }
    public void setText(String Text){}
}
