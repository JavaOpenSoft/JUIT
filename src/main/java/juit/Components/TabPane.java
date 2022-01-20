package juit.Components;

import javax.swing.*;

public class TabPane {
    javax.swing.JTabbedPane jTabbedPane = new JTabbedPane();
    private int SizeX;

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

    private int SizeY;
    private int PositionX;
    private int PositionY;

    public void setSize(int SizeX, int SizeY){
        jTabbedPane.setSize(SizeX, SizeY);
        this.SizeX = SizeX;
        this.SizeY = SizeY;
    }
    public void setPosition(int PositionX, int PositionY){
        jTabbedPane.setBounds(PositionX, PositionY,SizeX,SizeY);
        this.PositionX = PositionX;
        this.PositionY = PositionY;
    }
    public void setPositionAndSize(int PositionX, int PositionY,int SizeX, int SizeY){
        setPosition(PositionX,PositionY);
        setSize(SizeX, SizeY);
    }
}
