package juit.Components;

import javax.swing.*;
import java.awt.event.ActionListener;

public class CheckboxMenuItem {
    String Text = "";
    boolean isSelected = false;
    JCheckBoxMenuItem jCheckBoxMenuItem = new JCheckBoxMenuItem();
    public void addActionListener(ActionListener actionListener)
    {
        jCheckBoxMenuItem.addActionListener(actionListener);
    }

    public JCheckBoxMenuItem getjCheckBoxMenuItem() {
        return jCheckBoxMenuItem;
    }
    public void setText(String Text)
    {
        jCheckBoxMenuItem.setText(Text);
    }

    public String getText() {
        return Text;
    }
    public void isHighlighted(boolean bool)
    {
        jCheckBoxMenuItem.setState(bool);
    }
    public void setSelected(boolean isSelected)
    {
        jCheckBoxMenuItem.setState(isSelected);
        this.isSelected = isSelected;
    }
    public boolean isSelected()
    {
        return isSelected;
    }

}
