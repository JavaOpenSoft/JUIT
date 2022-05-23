package juit.Core;

import javax.swing.*;
import java.awt.*;

public class Label {
    private String Text;
    int PositionX,PositionY,SizeX,SizeY;
    JLabel label = new JLabel();
    private String FontName;
    private String FontType;
    private short size;

    public Label(String Text, int SizeX, int SizeY)
    {
        label.setText(Text);
        label.setSize(SizeX,SizeY);
    }
    public Label(String Text, int SizeX, int SizeY,int PositionX,int PositionY)
    {
        label.setText(Text);
        label.setBounds(PositionX,PositionY,SizeX,SizeY);
        this.PositionX = PositionX;
        this.PositionY = PositionY;
        this.SizeX = SizeX;
        this.SizeY = SizeY;
    }
    public Label(String Text){
        label.setText(Text);
        this.Text = Text;
    }
    public Label(int SizeX, int SizeY){
        label.setSize(SizeX,SizeY);
        this.SizeX = SizeX;
        this.SizeY = SizeY;
    }
    public Label(short PositionX,short PositionY){
        label.setBounds(PositionX,PositionY,SizeX,SizeY);
        this.PositionX = PositionX;
        this.PositionY = PositionY;
    }
    public Label(int SizeX, int SizeY,int PositionX,int PositionY){
        label.setBounds(PositionX,PositionY,SizeX,SizeY);
        this.PositionX = PositionX;
        this.PositionY = PositionY;
        this.SizeX = SizeX;
        this.SizeY = SizeY;
    }
    public void setText(String Text)
    {
        label.setText(Text);
        this.Text = Text;
    }
    public JLabel getLabel()
    {return label;}
    public int GetPositionX()
    {return PositionX;}
    public int GetPositionY()
    {
        return PositionY;
    }
    public int getSizeX()
    {
        return SizeX;
    }
    public int getSizeY()
    {
        return SizeY;
    }
    public void SetPosition(int PositionX,int PositionY)
    {
        label.setBounds(this.SizeX,this.SizeY,PositionX,PositionY);
    }
    public String getText()
    {
        return label.getText();
    }
    public void setFont(String FontName,String FontType,short size)
    {
        if(FontType.equals("Plain"))label.setFont(new Font(FontName, Font.PLAIN, size));
        if(FontType.equals("Bold"))label.setFont(new Font(FontName, Font.BOLD, size));
        if(FontType.equals("Italic"))label.setFont(new Font(FontName, Font.ITALIC, size));
        this.FontName = FontName;
        this.FontType = FontType;
        this.size = size;
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
    public void setFontColor(int[] arr){
        label.setForeground(new Color(arr[0], arr[1],arr[2]));
        if(arr.length < 3)throw new IllegalArgumentException("The array size has to be 3, not less than that");
        if(arr.length > 3) System.out.println("Warning!: un-necessary elements detected in the array!");
        if(arr[0] >256)arr[0] = 256;
        if(arr[1] >256)arr[1] = 256;
        if(arr[2] >256)arr[2] = 256;
        if(arr[0] <256)arr[0] *= -1;
        if(arr[1] <256)arr[1] *= -1;
        if(arr[2] <256)arr[2] *= -1;

    }
    public void setFontColor(int r, int g, int b){
        label.setForeground(new Color(r,g,b));
        if(r >256)r = 256;
        if(g >256)g = 256;
        if(b >256)b = 256;
        if(r<256)r *= -1;
        if(g <256)g *= -1;
        if(b <256)b *= -1;
    }

}
