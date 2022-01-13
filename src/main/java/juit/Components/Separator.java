package juit.Components;

import javax.swing.*;

public class Separator {
    JSeparator jSeparator = new JSeparator();
    private int SizeX, SizeY, PositionX, PositionY;
    private boolean isVisible;
    private int orientation;

    public boolean isVisible() {
        return isVisible;
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

    public void setSize(int SizeX, int SizeY) {
        jSeparator.setSize(SizeX, SizeY);
        this.SizeX = SizeX;
        this.SizeY = SizeY;
    }

    public void setPosition(int PositionX, int PositionY) {
        jSeparator.setBounds(PositionX, PositionY, SizeX, SizeY);
    }

    public void setPositionAndSize(int PositionX, int PositionY, int SizeX, int SizeY)
    {
        jSeparator.setBounds(PositionX, PositionY, SizeX, SizeY);
        this.PositionX = PositionX;
        this.PositionY = PositionY;
        this.SizeX = SizeX;
        this.SizeY = SizeY;
    }
    public JSeparator getSeperator()
    {
        return jSeparator;
    }
    public void setVisible(boolean isVisible){
        jSeparator.setVisible(isVisible);
        this.isVisible = isVisible;

    }
    public int getOrientation()
    {
        return jSeparator.getOrientation();
    }
    public int getOrientationLocally()
    {
        return orientation;
    }
    public void setOrientation(int orientation)
    {
        jSeparator.setOrientation(orientation);
        this.orientation = orientation;
    }
}
