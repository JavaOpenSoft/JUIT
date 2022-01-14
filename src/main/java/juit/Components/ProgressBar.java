package juit.Components;

import javax.swing.*;
import java.awt.*;

public class ProgressBar extends JFrame {
    JProgressBar progressBar;
    int SizeX,SizeY,PositionX,PositionY;
    private int progress;

    public ProgressBar() {
        progressBar = new JProgressBar(0, 2000);
        progressBar.setBounds(40, 40, 160, 30);
        progressBar.setValue(0);
        progressBar.setStringPainted(true);
        setLayout(null);
    }

    public int getProgress() {
        return progress;
    }

    public void setProgressBarProgress(int progress) {
        progressBar.setValue(progress);
        this.progress = progress;
    }
    public void setSize(int SizeX, int SizeY)
    {
        progressBar.setSize(SizeX,SizeY);
        this.SizeX = SizeX;
        this.SizeY = SizeY;
    }
    public void setPosition(int PositionX, int PositionY)
    {
        progressBar.setBounds(PositionX,PositionY,SizeX,SizeY);
        this.PositionX = PositionX;
        this.PositionY = PositionY;
    }
    public void changeColor(Color color)
    {
        progressBar.setForeground(color);
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

    public void setPositionAndSize(int PositionX, int PositionY, int SizeX, int SizeY)
    {
        setPosition(PositionX,PositionY);
        setSize(SizeX,SizeY);
    }


}