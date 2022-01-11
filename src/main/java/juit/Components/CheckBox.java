package juit.Components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CheckBox {
    JCheckBox jCheckBox = new JCheckBox();
    private String FontType;
    private String FontName;
    private short size;
    private int SizeX;
    private int SizeY;



    private int PositionX;
    private int PositionY;
    public int getSizeX() {
        return SizeX;
    }

    public int getSizeY() {
        return SizeY;
    }

    public int getPositionX() {
        return PositionX;
    }

    public int getPositionY() {
        return PositionY;
    }
    public String getText() {
        return Text;
    }

    public void setText(String Text) {
        jCheckBox.setText(Text);
    }

    String Text;
    public void addActionListener(ActionListener actionListener)
    {
        jCheckBox.addActionListener(actionListener);
    }

    public String getFontType() {
        return FontType;
    }

    public String getFontName() {
        return FontName;
    }

    public short getFontSize() {
        return size;
    }
    public void setSize(int SizeX, int SizeY)
    {
        jCheckBox.setSize(SizeX, SizeY);
        this.SizeX = SizeX;
        this.SizeY = SizeY;
    }
    public void setPosition(int PositionX, int PositionY){
        jCheckBox.setBounds(PositionX, PositionY, SizeX, SizeY);
        this.PositionX = PositionX;
        this.PositionY = PositionY;
    }
    public void setBounds(int PositionX, int PositionY,int SizeX, int SizeY){
        jCheckBox.setBounds(PositionX,PositionY,SizeX,SizeY);
        this.PositionX = PositionX;
        this.PositionY = PositionY;
        this.SizeX = SizeX;
        this.SizeY = SizeY;
    }

    public void setFont(String FontName, String FontType, short size)
    {
        if(FontType.equals("Plain"))jCheckBox.setFont(new Font(FontName, Font.PLAIN, size));
        if(FontType.equals("Bold"))jCheckBox.setFont(new Font(FontName, Font.BOLD, size));
        if(FontType.equals("Italic"))jCheckBox.setFont(new Font(FontName, Font.ITALIC, size));
        this.FontType = FontType;
        this.FontName = FontName;
        this.size = size;
    }

}
