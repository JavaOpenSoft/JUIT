package jui.Components;
import javax.swing.JButton;
@SuppressWarnings("ALL")
public class Button {
    JButton button;
    String Text;
    private int y = 50, x = 100, SizeX = 100,SizeY = 50;
    public Button(String Text, int x, int y) {
        button = new JButton(Text);
        button.setSize(x,y);
        button.setVisible(true);
        this.Text = Text;
        this.x = x;
        this.y = y;
        this.SizeX = SizeX;
        this.SizeY = SizeY;
    }

    public void createButton(String Text,int x, int y,int SizeX, int SizeY)
    {
        button = new JButton(Text);
        button.setBounds(x,y,SizeX,SizeY);
        button.setVisible(true);
        this.Text = Text;
        this.x = x;
        this.y = y;
        this.SizeX = SizeX;
        this.SizeY = SizeY;
    }
    public String getText()
    {return Text;}
    public int GetX()
    {return x;}
    public int GetY()
    {return y;}
    public int GetSizeX()
    {return SizeX;}
    public int GetSizeY()
    {return SizeY;}

    public JButton getButton() {
        return button;
    }

    public void setText(String text) {
        button.setText(text);
    }
    public void setButtonSize(int SizeX,int SizeY)
    {
        button.setSize(x,y);
    }
}
