package juit.Components;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class ImageFrame {
    JLabel imageFrame = new JLabel();
    JFrame frame = new JFrame();
    private int SizeX,SizeY,PositionX,PositionY;
    public void setLocation(int x,int y) {

    }
    public void setPositionAndSize(int PositionX, int PositionY,int SizeX,int SizeY) {
        imageFrame.setBounds(PositionX,PositionY,SizeX,SizeY);
        this.PositionX = PositionX;
        this.PositionY = PositionY;
        this.SizeX = SizeX;
        this.SizeY = SizeY;
    }
    public void setImage(String filePathWithName)
    {
        imageFrame.setIcon(new ImageIcon(Objects.requireNonNull(SuccessNotification.class.getResource(filePathWithName))));
        imageFrame.setVisible(true);
    }
    public void setImage(Image image)
    {
        imageFrame.setIcon(new ImageIcon(image));
        imageFrame.setVisible(true);
    }
    public void setSize(int SizeX, int SizeY){
        imageFrame.setSize(SizeX,SizeY);
        this.SizeX = SizeX;
        this.SizeY = SizeY;
    }
    public void setPosition(int PositionX, int PositionY){
        imageFrame.setBounds(PositionX,PositionY,getSizeX(),getSizeY());
        this.PositionX = PositionX;
        this.PositionY = PositionY;
    }
    public ImageFrame(Image image)
    {
        setImage(image);
    }
    public ImageFrame(String filePathWithName, int SizeX, int SizeY,int PositionX,int PositionY)
    {
        setImage(filePathWithName);
        setPosition(PositionX,PositionY);
        setSize(SizeX,SizeY);
    }
    public ImageFrame(String filePathWithName)
    {
        setImage(filePathWithName);
    }
    public ImageFrame(String filePathWithName, int SizeX, int SizeY)
    {
        setImage(filePathWithName);
        setSize(SizeX,SizeY);
    }
    public ImageFrame(String filePathWithName,short PositionX,short PositionY)
    {
        setImage(filePathWithName);
        setPosition(PositionX,PositionY);
    }
    public JLabel getImageFrame() {
        return imageFrame;
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
