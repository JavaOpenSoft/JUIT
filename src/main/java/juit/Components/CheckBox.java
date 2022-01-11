package juit.Components;

import javax.swing.*;
import java.awt.event.ActionListener;

public class CheckBox {
    JCheckBox jCheckBox = new JCheckBox();
    boolean isChecked = false;
    private int SizeX;
    private int SizeY;
    private int PositionX;
    private int PositionY;
    private String Text, IconPath;
    public CheckBox(String Text, boolean isChecked)
    {
        setCheckedState(isChecked);
        setText(Text);
    }
    public void setVisible(boolean isVisible) {
        jCheckBox.setVisible(isVisible);
    }
    public String getText() {
        return Text;
    }

    public String getIconPath() {
        return IconPath;
    }


    public boolean getCheckedSate() {
        return isChecked;
    }

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



    public void addActionListener(ActionListener actionListener)
    {
        jCheckBox.addActionListener(actionListener);
    }
    public void setState(boolean isChecked){
        jCheckBox.setSelected(isChecked);
        this.isChecked = isChecked;
    }
    public void setCheckedIcon(String IconPath)
    {
        jCheckBox.setIcon(new ImageIcon(IconPath));
        this.IconPath = IconPath;
    }
    public void setSize(int SizeX, int SizeY){
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
        setSize(SizeX, SizeY);
        setPosition(PositionX,PositionY);

    }
    public void setClickable(boolean isClickable){

    }
    public void isVisible(boolean bool)
    {
        jCheckBox.setVisible(bool);
    }
    public void setText(String Text){
        jCheckBox.setText(Text);
        this.Text = Text;
    }
    public void setCheckedState(boolean isChecked){
        this.isChecked = isChecked;
        jCheckBox.setSelected(isChecked);
    }
}
