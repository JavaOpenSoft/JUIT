package jui.utils;

import jui.Components.ErrorNotification;

import javax.swing.*;
import java.util.Objects;

public class AboutJUIT {
    public void ShowJUIDetails(int x, int y)
    {
        if(x<200) {
            throw new IllegalArgumentException("The Value Of Integer X Is Less Than 200.");
        }
        if(y<200) {
            throw new IllegalArgumentException("The Value Of Integer Y Is Less Than 200.");
        }
        JFrame frame =  new JFrame("About JUIT");
        JLabel IconImage = new JLabel();
        IconImage.setIcon(new ImageIcon(Objects.requireNonNull(ErrorNotification.class.getResource("jui/img/JUIT.png"))));
    }
}
