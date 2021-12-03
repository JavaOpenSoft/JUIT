package juit.Components;

import javax.swing.*;
import java.awt.*;

public class MenuItem {
    JMenuItem menuItem = new JMenuItem();
    private String FontName;
    private String FontType;
    private short size;
    public void add(RadioButtonMenuItem radioButtonMenuItem){
        menuItem.add(radioButtonMenuItem.jRadioButtonMenuItem);
    }
    public void add(CheckboxMenuItem checkboxMenuItem)
    {
        menuItem.add(checkboxMenuItem.jCheckBoxMenuItem);
    }
    public void setFont(String FontName,String FontType,short size)
    {
        if(FontType.equals("Plain"))menuItem.setFont(new Font(FontName, Font.PLAIN, size));
        if(FontType.equals("Bold"))menuItem.setFont(new Font(FontName, Font.BOLD, size));
        if(FontType.equals("Italic"))menuItem.setFont(new Font(FontName, Font.ITALIC, size));
        this.FontName = FontName;
        this.FontType = FontType;
        this.size = size;
    }
    public void setText(String Text)
    {
        menuItem.setText(Text);
    }
    public String getFontName()
    {
        return this.FontName;
    }
    public String getFontType()
    {
        return this.FontType;
    }
    public short getFontSize()
    {
        return this.size;
    }
}
