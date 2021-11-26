package jui.Components;
import jui.utils.AboutJUIT;
class test
{
    public static void main(String[] args)
    {
        AboutJUIT aboutJUIT;
        aboutJUIT = new AboutJUIT();
        aboutJUIT.ShowJUIDetails();
        Window win = new Window();
        Button button = new Button("Tell About Me", 100, 50);
        win.createWindow("What's Up Mate?", 400, 400);
        win.add(button);
    }
}