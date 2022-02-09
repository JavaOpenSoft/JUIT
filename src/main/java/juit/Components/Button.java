package juit.Components;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("ALL")
public class Button {
    JButton jButton = new JButton();
    String Text;
    private int PositionY = 50, PositionX = 100, SizeX = 100,SizeY = 50;
    public Button(String Text, int PositionX, int PositionY) {
        jButton.setText(Text);
        jButton.setSize(PositionX,PositionY);
        jButton.setVisible(true);
        this.Text = Text;
        this.PositionX = PositionX;
        this.PositionY = PositionY;
        this.SizeX = SizeX;
        this.SizeY = SizeY;
    }
    public Button(String Text){
        jButton.setText(Text);
        jButton.setVisible(true);
        this.Text = Text;
    }
    public Button(){
        jButton.setVisible(true);
    }
    public void createButton(String Text,int PositionX, int PositionY,int SizeX, int SizeY)
    {
        jButton = new JButton(Text);
        jButton.setBounds(PositionX,PositionY,SizeX,SizeY);
        jButton.setVisible(true);
        this.Text = Text;
        this.PositionX = PositionX;
        this.PositionY = PositionY;
        this.SizeX = SizeX;
        this.SizeY = SizeY;
    }
    public String getText()
    {return Text;}
    public int GetPositionX()
    {return PositionX;}
    public int GetPositionY()
    {return PositionY;}
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
        jButton.setSize(SizeX,SizeY);
        this.SizeX = SizeX;
        this.SizeY = SizeY;
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
