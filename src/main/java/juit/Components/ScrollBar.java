package juit.Components;
import javax.swing.*;
import java.security.InvalidParameterException;

public class ScrollBar {
    JScrollPane scrollPane;
    JScrollBar jScrollBar= new JScrollBar();
    JScrollBar BottomScrollBar = new JScrollBar();
    int PositionX = 0, PositionY =0,SizeX = 0,SizeY = 0;
    public void setPosition(String Position)
    {
        this.jScrollBar = scrollPane.getVerticalScrollBar();
        this.BottomScrollBar = scrollPane.getHorizontalScrollBar();
        this.jScrollBar.setValue(jScrollBar.getMinimum());
        this.BottomScrollBar.setValue(BottomScrollBar.getMinimum());
        if (Position.equals("VERTICAL")) jScrollBar.setVisible(true);
        if(Position.equals("HORIZONTAL"))BottomScrollBar.setVisible(true);
        if (Position.equals("VERTICAL AND HORIZONTAL"))
        {
            this.jScrollBar.setVisible(true);
            this.BottomScrollBar.setVisible(true);
        }
        else throw new InvalidParameterException("The setPosition() function parameter must give either " +
                "'HORIZONTAL' OR 'VERTICAL' or 'VERTICAL AND HORIZONTAL'" );
    }
    public void setSize(int SizeX, int SizeY,String Type)
    {
        if (Type.equals("VERTICAL")) jScrollBar.setSize(SizeX,SizeY);
        else  if(Type.equals("HORIZONTAL"))BottomScrollBar.setSize(SizeX,SizeY);
        else throw new InvalidParameterException("The setSize() function 'Type' parameter must give either " +
                    "'HORIZONTAL' OR 'VERTICAL");
    }
}
