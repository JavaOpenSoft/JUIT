package juit.Components.Graphics;

public class Color {
    java.awt.Color color;
    public final int[] Black = {0,0,0};
    public final int[] White = {256,256,256};
    public final int[] Red = {256,0,0};
    public final int[] Lime = {0,256,0};
    public final int[] Blue = {0,0,256};
    public final int[] Yellow = {256,256,0};
    public final int[] Cyan = {0,256,256};
    public final int[] Magenta = {256,0,256};
    public final int[] Silver = {192,192,192};
    public final int[] Gray = {128,128,128};
    public final int[] Maroon = {128,0,0};
    public final int[] Olive = {128,128,0};
    public final int[] Green = {0,128,0};
    public final int[] Purple = {128,0,128};
    public final int[] Teal = {0,128,128};
    public final int[] Navy = {0,0,128};
    public final int[] Gold = {255,215,0};
    public final int[] Deep_pink = {255,215,0};
    public final int[] Pink = {255,105,180};
    public final int[] Orange = {255,165,0};
    public final int[] HotPink = {255,0, 100};
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
    public void getRGB(){
        return ;
    }
}
