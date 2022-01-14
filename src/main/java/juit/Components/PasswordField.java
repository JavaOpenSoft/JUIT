package juit.Components;

import javax.swing.*;
import java.awt.*;

public class PasswordField {
    JPasswordField jPasswordField = new JPasswordField();
    private int PositionX,PositionY,SizeX,SizeY;
    String Text;
    private String BGText;

    public boolean isVisible() {
        return isVisible;
    }

    private boolean isVisible;

    public int getPositionX() {
        return PositionX;
    }

    public int getPositionY() {
        return PositionY;
    }

    public int getSizeX() {
        return SizeX;
    }

    public int getSizeY() {
        return SizeY;
    }
    public void setSize(int SizeX, int SizeY)
    {
        jPasswordField.setSize(SizeX,SizeY);
        this.SizeX = SizeX;
        this.SizeY = SizeY;
    }
    public void setPosition(int PositionX, int PositionY)
    {
        jPasswordField.setBounds(PositionX,PositionY,SizeX,SizeY);
    }
    public void setText(String Text)
    {
        jPasswordField.setText(Text);
        this.Text = Text;
    }
    public String getText()
    {
        return this.Text;
    }
    public void setPositionAndSize(int PositionX, int PositionY,int SizeX, int SizeY) {
        setPosition(PositionX,PositionY);
        setSize(SizeX,SizeY);
    }
    public void setBackgroundText(String BGText){
        jPasswordField.setText(BGText);
        this.BGText = BGText;
    }

    public String getBGText() {
        return BGText;
    }
    public void setDisabledTextColor(int[] Color) {
        jPasswordField.setDisabledTextColor(new java.awt.Color(Color[0], Color[1], Color[2]));
    }
    public void setVisible(boolean isVisible)
    {
        jPasswordField.setVisible(isVisible);
        this.isVisible = isVisible;
    }
}
