package juit.Components;

import javax.swing.*;

public class Slider {
    JSlider jSlider = new JSlider();
    private int percentage;
    private boolean isVisible;
    private int SizeX, SizeY, PositionX,PositionY,minValue,maxValue;

    public void setPercentage(int percentage){
        jSlider.setValue(percentage);
        this.percentage = percentage;
    }
    public void setVisible(boolean isVisible) {
        this.isVisible = isVisible;
        jSlider.setVisible(isVisible);
    }
    public void setSize(int SizeX, int SizeY){
        jSlider.setSize(SizeX, SizeY);
        this.SizeX = SizeX;
        this.SizeY = SizeY;
    }
    public void setPosition(int PositionX, int PositionY){
        jSlider.setBounds(PositionX,PositionY,SizeX,SizeY);
        this.PositionX = PositionX;
        this.PositionY = PositionY;
    }
    public void setPositionAndSize(int PositionX, int PositionY,int SizeX, int SizeY){
        setPosition(PositionX, PositionY);
        setSize(SizeX, SizeY);
        this.SizeX = SizeX;
        this.SizeY = SizeY;
        this.PositionX = PositionX;
        this.PositionY = PositionY;
    }


    public void setMaximum(int maxValue){
        jSlider.setMaximum(maxValue);
        this.maxValue = maxValue;
    }

    public int getMinValue() {
        return minValue;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public void setMinimum(int minValue){
        jSlider.setMinimum(minValue);
        this.minValue = minValue;
    }
    public int getPercentage() {
        return percentage;
    }

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


}
