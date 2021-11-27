package juit.utils;

import javax.swing.*;
import java.awt.*;

public class AboutApp {
    int versionNumber;
    private String Author;
    private String Copyright;
    private JLabel IconImage = new JLabel();
    JLabel AuthorLabel = new JLabel();
    JLabel CopyrightLabel = new JLabel();
    private String FontName;
    private String FontType;
    private short size;

    public void setAuthorText(String Text)
    {
        AuthorLabel.setText(Text);
    }
    public void setCopyrightLabel(String Text)
    {
        CopyrightLabel.setText(Text);
    }
    public void setIconImage(String pathOfFile)
    {

    }
    public void setCopyrightFont(String FontName,String FontType,short size)
    {

    }
    public String getFontName()
    {
        return this.FontName;
    }
    public String getFontType()
    {
        return this.FontType;
    }
    public short getFontSize()
    {
        return this.size;
    }
}
