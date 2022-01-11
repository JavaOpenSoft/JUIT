package juit.Components;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("ALL")
public class Button {
    JButton jButton = new JButton();
    String Text;
    private int y = 50, x = 100, SizeX = 100,SizeY = 50;
    public Button(String Text, int x, int y) {
        jButton.setText(Text);
        jButton.setSize(x,y);
        jButton.setVisible(true);
        this.Text = Text;
        this.x = x;
        this.y = y;
        this.SizeX = SizeX;
        this.SizeY = SizeY;
    }

    public void setVisible(boolean isVisible) {
        jButton.setVisible(isVisible);
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
        return jButton;
    }

    public void setText(String text) {jButton.setText(text);}
    public void setButtonSize(int SizeX,int SizeY)
    {
        jButton.setSize(x,y);
    }
    public void addFileChooserToButton(FileChooser fileChooser,String path)
    {
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser j = new JFileChooser(path);
                j.showDialog(null,"ok");
            }
        });
    }
    public void addActionListener(ActionListener actionListener)
    {
        jButton.addActionListener(actionListener);
    }
}
