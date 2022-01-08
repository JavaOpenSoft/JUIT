package juit.Components;

import javax.swing.*;
import java.awt.event.ActionListener;

public class CheckboxMenuItem {
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

    public String getText() {
        return Text;
    }
    public void setState(boolean isChecked){
        jCheckBoxMenuItem.setState(isChecked);
        this.isChecked = isChecked;
    }
}
