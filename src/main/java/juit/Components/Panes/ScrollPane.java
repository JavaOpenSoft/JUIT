package juit.Components.Panes;

import javax.swing.*;
import java.security.InvalidParameterException;

public class ScrollPane {
    JScrollPane jScrollPane = new JScrollPane();
    public void add(juit.Components.ScrollBar scrollBar,String Position)
    {
        switch (Position) {
            case "VERTICAL" -> jScrollPane.add(scrollBar.jScrollBar);
            case "HORIZONTAL" -> jScrollPane.add(scrollBar.BottomScrollBar);
            case "HORIZONTAL AND VERTICAL" -> {
                jScrollPane.add(scrollBar.BottomScrollBar);
                jScrollPane.add(scrollBar.jScrollBar);
            }
            default -> throw new InvalidParameterException("The add() function Position parameter must give either " +
                    "'HORIZONTAL' OR 'VERTICAL' or 'VERTICAL AND HORIZONTAL'");
        }
    }

}
