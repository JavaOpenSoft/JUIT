package jui.Components;
import jui.utils.AboutJUIT;
class test
{
    public static void main(String[] args)
    {
        AboutJUIT ajui;
        ajui = new AboutJUIT();
        ajui.ShowJUIDetails(200,200);
        Window win = new Window();
        Button button = new Button("Tell About Me", 100, 50);
        win.createWindow("What's Up Mate?", 400, 400);
        win.add(button);
    }
}