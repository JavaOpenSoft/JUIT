package jui.Components;

import javax.swing.*;
import java.awt.*;

public class MenuItem {
    JMenuItem menuItem = new JMenuItem();
    public void setFont(String FontName,String FontType,short size)
    {
        if(FontType.equals("Plain"))menuItem.setFont(new Font(FontName, Font.PLAIN, size));
        if(FontType.equals("Bold"))menuItem.setFont(new Font(FontName, Font.BOLD, size));
        if(FontType.equals("Italic"))menuItem.setFont(new Font(FontName, Font.ITALIC, size));
    }
}
