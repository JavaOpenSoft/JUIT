package juit.Components;

import javax.swing.*;
import java.awt.event.ActionListener;

public class CheckboxMenuItem {
    public CheckboxMenuItem(String Text, boolean isChecked)
    {
        setCheckedState(isChecked);
        setText(Text);
    }
    String Text = "";
    ActionListener actionListener;
    boolean isChecked = false;
    JCheckBoxMenuItem jCheckBoxMenuItem = new JCheckBoxMenuItem();
    public void addActionListener(ActionListener actionListener)
    {
        jCheckBoxMenuItem.addActionListener(actionListener);
        this.actionListener = actionListener;
    }

    public JCheckBoxMenuItem getjCheckBoxMenuItem() {
        return jCheckBoxMenuItem;
    }

    public ActionListener getActionListener() {
        return actionListener;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setText(String Text)
    {
        jCheckBoxMenuItem.setText(Text);
        this.Text = Text;
    }
    public void setCheckedIcon(String iconPath){
        jCheckBoxMenuItem.setIcon(new ImageIcon(iconPath));
    }
    public void setUncheckedIcon(String iconPath){
        jCheckBoxMenuItem.setDisabledIcon(new ImageIcon(iconPath));
    }
    public String getText() {
        return Text;
    }
    public void setCheckedState(boolean isChecked){
        jCheckBoxMenuItem.setState(isChecked);
        this.isChecked = isChecked;
    }
}
