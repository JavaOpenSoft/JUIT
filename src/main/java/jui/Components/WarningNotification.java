package jui.Components;
import javax.swing.*;
import java.awt.*;

import static java.util.Objects.*;

public class WarningNotification {


    private short x = 600;
    private short y = 175;
    final public int IMAGE_SIZEY =  92;
    final public int IMAGE_SIZEX =  84;

    JLabel IconImage = new JLabel("");
    JFrame frame = new JFrame("Warning!");
    JButton ok = new JButton("Ok");
    String temp = ok.getText();
    JButton cancel = new JButton();
    JLabel WarningText;
    public void SetWarningText(String displayText)
    {
        var WarningText = new JLabel(displayText);
        WarningText.setBounds(102, 17, 492, 113);
        frame.getContentPane().add(WarningText);
    }
    public void SetIcon(String filePathWithName) {
        IconImage.setIcon(new ImageIcon(requireNonNull(WarningNotification.class.getResource(filePathWithName))));
    }
    public void setSizeOfText(short x,short y) {
        WarningText.setSize(y, x);
    }
    public void setTitle(String Title)
    {
        WarningText.setName(Title);
    }
    public void setDefaults()
    {
        frame.setBounds(100, 100, 600, 175);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String pathOfFile = "jui/img/warning.png";
        Image icon = Toolkit.getDefaultToolkit().getImage(pathOfFile);
        frame.setIconImage(icon);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setLayout(null);
        IconImage.setIcon(new ImageIcon(requireNonNull(WarningNotification.class.getResource(pathOfFile))));
        IconImage.setBounds(6, 23, 84, 92);
        frame.getContentPane().add(IconImage);
        ok.setBounds(0,0,580,165);
        frame.getContentPane().add(ok);
    }
    public void setBackgroundColor(Color color)
    {
        frame.setBackground(color);
    }
    public void setFont(String FontName,String FontType,short size)
    {
        if(FontType == "Plain")WarningText.setFont(new Font(FontName, Font.PLAIN, size));
        if(FontType == "Bold")WarningText.setFont(new Font(FontName, Font.BOLD, size));
        if(FontType == "Italic")WarningText.setFont(new Font(FontName, Font.ITALIC, size));

    }
    public void setTitleIcon(String pathOfFile)
    {
        Image icon = Toolkit.getDefaultToolkit().getImage(pathOfFile);
        frame.setIconImage(icon);
    }
    public void setButtonMessage(String buttonMessage)
    {
        ok.setText(buttonMessage);
    }
    public void setButtonSize(Dimension dim)
    {
        ok.setPreferredSize(dim);
    }
    public void setPositionOfOkButton(short x,short y)
    {
        ok.setLocation(x,y);
    }
    public void setPositionOfCancelButton(short x,short y)
    {
        cancel.setLocation(x,y);
    }
    public void setSizeOfWindow(short x, short y)
    {
        this.x = x;
        this.y = y;
        frame.setSize(this.x,this.y);
    }
    public short getXOfWindow()
    {
        return x;
    }
    public short getYOfWindow()
    {
        return y;
    }
    public short getYOfOkButton()
    {
        return (short) 175;
    }
    public short getXOfOkButton()
    {
        return (short) 600;
    }
    public short getYOfCancelkButton()
    {
        return (short) 175;
    }
    public short getXOfCancelButton()
    {
        return (short) 600;
    }
    public void AddCancelButton()
    {
        cancel.setBounds(100, 100, 590, 175);
        frame.add(cancel);

    }
    public void setButtonOkFont(String FontName,String FontType,short size)
    {
        if(FontType.equals("Plain"))ok.setFont(new Font(FontName, Font.PLAIN, size));
        if(FontType.equals("Bold"))ok.setFont(new Font(FontName, Font.BOLD, size));
        if(FontType.equals("Italic"))ok.setFont(new Font(FontName, Font.ITALIC, size));
    }
    public void setButtonCancelFont(String FontName,String FontType,short size)
    {
        if(FontType.equals("Plain"))cancel.setFont(new Font(FontName, Font.PLAIN, size));
        if(FontType.equals("Bold"))cancel.setFont(new Font(FontName, Font.BOLD, size));
        if(FontType.equals("Italic"))cancel.setFont(new Font(FontName, Font.ITALIC, size));
    }

    public void trimTextOfCancelButton()
    {
        String temp =cancel.getText().trim();
        cancel.setText(temp);
    }
    public void trimTextOfOkButton()
    {
        String temp =ok.getText().trim();
        ok.setText(temp);
    }
}
