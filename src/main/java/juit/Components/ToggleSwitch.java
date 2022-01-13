package juit.Components;

import javax.swing.*;

public class ToggleSwitch {
    JToggleButton jToggleButton = new JToggleButton();
    int SizeX,SizeY,PositionX,PositionY;
    boolean isVisible, isSwitchActive;

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

        this.isVisible = isVisible;
    }

    public boolean isSwitchActive() {
        return isSwitchActive;
    }

    public void setSwitchActive(boolean isSwitchActive) {
        this.isSwitchActive = isSwitchActive;
    }
}
