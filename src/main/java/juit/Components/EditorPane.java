package juit.Components;

import javax.swing.*;

public class EditorPane {
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

    JEditorPane jEditorPane = new JEditorPane();
    private int SizeX;
    private int SizeY;
    private int PositionX;
    private int PositionY;

    public void copy()
    {
        jEditorPane.copy();
    }
    public String getText()
    {
        return jEditorPane.getText();
    }
    public void setText(String Text){
        jEditorPane.setText(Text);
    }
    public void setSize(int SizeX, int SizeY){
        jEditorPane.setSize(SizeX, SizeY);
        this.SizeX = SizeX;
        this.SizeY = SizeY;
    }
    public void setPosition(int PositionX, int PositionY){
        jEditorPane.setBounds(PositionX, PositionY,SizeX,SizeY);
        this.PositionX = PositionX;
        this.PositionY = PositionY;
    }
    public void setPositionAndSize(int PositionX, int PositionY, int SizeX, int SizeY)
    {
        setPosition(PositionX,PositionY);
        setSize(SizeX,SizeY);
    }

}
