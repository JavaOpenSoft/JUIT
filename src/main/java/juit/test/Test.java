package juit.test;

import juit.Core.Window;
import juit.Layouts.AbsoluteLayout;

public class Test {
    static Window window = new Window();
    public static void main(String[] args){
        window.setSize(500,500);
        window.setLayout(new AbsoluteLayout());
    }
}
