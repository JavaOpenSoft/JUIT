package juit.Components;

import javax.swing.*;

public class ToggleSwitch {
    JToggleButton jToggleButton = new JToggleButton();
    int SizeX,SizeY,PositionX,PositionY;
    boolean isVisible, isSwitchActive;
    private String Text;

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


    public boolean isVisible() {
        return isVisible;
    }

    public void setVisible(boolean isVisible) {
        jToggleButton.setVisible(isVisible);
        this.isVisible = isVisible;
    }

    public boolean isSwitchActive() {
        return isSwitchActive;
    }

    public void setSwitchActive(boolean isSwitchActive) {
        this.isSwitchActive = isSwitchActive;
    }
    public void setSize(int SizeX, int SizeY){
        jToggleButton.setSize(SizeX, SizeY);
        this.SizeX = SizeX;
        this.SizeY = SizeY;
    }
    public void setPosition(int PositionX, int PositionY)
    {
        jToggleButton.setBounds(PositionX,PositionY,SizeX,SizeY);
        this.PositionX = PositionX;
        this.PositionY = PositionY;
    }
    public void setPositionAndSize(int PositionX, int PositionY,int SizeX, int SizeY){
        setPosition(PositionX, PositionY);
        setSize(SizeX,SizeY);
    }
    public void setText(String Text){
        jToggleButton.setText(Text);
        this.Text = Text;
    }

    public String getText() {
        return Text;
    }

}
