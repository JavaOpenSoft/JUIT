package juit.Components.Graphics;

import java.awt.*;
import java.awt.image.ImageObserver;
public class Canvas {
    java.awt.Canvas canvas = new java.awt.Canvas();
    Graphics g = canvas.getGraphics();
    Color color = new Color(255,255,255);

    public Canvas(Color color) {
        setBackgroundColor(color);
    }

    public void PaintImage(Image image,int x,int y,int width,int height,ImageObserver imageObserver)
    {
        g.drawImage(image, x, y, width, height, imageObserver);
    }
    public void paintArch(int x,int y,int width,int height,int startAngle,int ArchAngle)
    {
        g.drawArc(x, y, width, height, startAngle, ArchAngle);

    }
    public void setColor(Color color)
    {
        g.setColor(color);
    }
    public void setFont(Font font)
    {
        g.setFont(font.getFont());
    }

    public java.awt.Canvas getCanvas() {
        return canvas;
    }
    public void drawRect(int x,int y,int height,int width)
    {
        g.drawRect(x,y,width,height);
    }
    public Graphics getGraphics() {
        return g;
    }
    public void drawRoundedRectangle(int x,int y,int width,int height,int ArchWidth,int ArchHeight)
    {
        g.drawRoundRect(x,y,width, height,ArchWidth,ArchHeight);
    }
    public void setBackgroundColor(Color color)
    {
        int rgb = color.getRGB();
        canvas.setBackground(color);
        this.color = new Color(rgb);
    }
    public Color getBackgroundColor()
    {
        return color;
    }

}
