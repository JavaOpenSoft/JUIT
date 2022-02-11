package juit.Components;
import javax.swing.JButton;
import java.awt.event.ActionListener;

@SuppressWarnings("ALL")
public class Button {
    JButton jButton = new JButton();
    String Text;
    private int PositionY = 50, PositionX = 100, SizeX = 100,SizeY = 50;
    private boolean isVisible;

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
    public void addActionListener(ActionListener actionListener)
    {
        jButton.addActionListener(actionListener);
    }

    public void setVisible(boolean isVisible) {
        jButton.setVisible(isVisible);
        this.isVisible = isVisible;
    }
    public boolean isVisible(){
        return isVisible();
    }

}
