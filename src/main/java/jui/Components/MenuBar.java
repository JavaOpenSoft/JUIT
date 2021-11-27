package jui.Components;

import javax.swing.*;

public class MenuBar {
    JMenuBar menuBar = new JMenuBar();
    public void setDifferentMenuBar(MenuBar menuBar) {
        this.menuBar = menuBar.menuBar;
    }

    public JMenuBar getMenuBar() {
        return menuBar;
    }
    public void add(MenuItem menuItem)
    {
        menuBar.add(menuItem.menuItem);
    }
}
