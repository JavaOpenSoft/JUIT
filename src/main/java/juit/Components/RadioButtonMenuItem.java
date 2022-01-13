package juit.Components;

import javax.swing.*;

public class RadioButtonMenuItem {
    JRadioButtonMenuItem jRadioButtonMenuItem = new JRadioButtonMenuItem();
    boolean isVisible;
    String Text;
    public RadioButtonMenuItem(String Text)
    {
        setText(Text);
    }

    public boolean isVisible() {
        return isVisible;
    }

    public void setText(String Text)
    {
        jRadioButtonMenuItem.setText(Text);
        this.Text = Text;
    }
    public String getText() {
        return Text;
    }
    public void setHighlighted(boolean isVisible){
        jRadioButtonMenuItem.setSelected(isVisible);
        this.isVisible = isVisible;
    }
}
