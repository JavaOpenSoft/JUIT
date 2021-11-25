package jui.Components;
import javax.swing.JButton;
@SuppressWarnings("ALL")
public class Button {
    JButton button;
    String Text;
    @SuppressWarnings("FieldMayBeFinal")
    private int y = 50, x = 100, SizeX = 100,SizeY = 50;
    public Button(String Text, int x, int y) {
        button = new JButton(Text);
        button.setSize(x,y);
        button.setVisible(true);
        this.Text = Text;
        this.x = x;
        this.y = y;
    }

    public void createButton(String Text,int x, int y,int SizeX, int SizeY)
    {
        button = new JButton(Text);
        button.setBounds(x,y,SizeX,SizeY);
        button.setVisible(true);
        this.Text = Text;
        this.x = x;
        this.y = y;
    }
    public String getText()
    {return Text;}
    public int GetX()
    {return x;}
    public int GetY()
    {return y;}
}
