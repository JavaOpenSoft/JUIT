package juit.utils;

import java.text.SimpleDateFormat;

public class Date {
    public String getDate()
    {
        java.util.Date date = new java.util.Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy");
        return formatter.format(date);
    }
    public void printDate()
    {
        System.out.println(getDate());
    }
}
