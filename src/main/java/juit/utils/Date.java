package juit.utils;

import java.text.SimpleDateFormat;

public class Date {
    public String getDate()
    {
        java.util.Date date = new java.util.Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy");
        String str = formatter.format(date);
        return str;
    }
    public void printDate()
    {
        System.out.println(getDate());
    }
}
