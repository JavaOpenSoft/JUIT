package juit.Components.Graphics;

public class Color implements juit.Components.Constants.ColorConstants {
    java.awt.Color color;

    private short r;
    private short g;
    private short b;

    public Color(int r, int g, int b)
    {
        this.color = new java.awt.Color(r,g,b);
    }
    public int getR(int[] colorIndex)
    {
        return colorIndex[0];
    }

    public int getG(int[] colorIndex)
    {
        return colorIndex[1];
    }
    public int getB(int[] colorIndex)
    {
        return colorIndex[2];
    }
    public void setTransparency(int alpha){
        this.color = new java.awt.Color(r,g,b,alpha);
    }
    public String getRGB(int[] colorIndex){
        StringBuilder temp = new StringBuilder();
        for(int i = 0; i < colorIndex.length-1; i++)
        {
            temp.append(colorIndex[i]);
        }
        return temp.toString();
    }
    public void changeR(short r)
    {
        this.r = r;
        this.color = new java.awt.Color(r,g,b);
    }
    public void changeG(short g)
    {
        this.g = g;
        this.color = new java.awt.Color(r,g,b);
    }
    public void changeB(short b)
    {
        this.b = b;
        this.color = new java.awt.Color(r,g,b);
    }
    public void changeRGB(short r,short g, short b)
    {
        this.color = new java.awt.Color(r,g,b);
        this.r = r;
        this.g = g;
        this.b = b;
    }
    public void changeRGB(int[] colorIndex)
    {
      this.color = new java.awt.Color(colorIndex[0],colorIndex[1],colorIndex[2]);
      colorIndex[0] = this.r;
      colorIndex[1] = this.g;
      colorIndex[2] = this.b;
    }

}
