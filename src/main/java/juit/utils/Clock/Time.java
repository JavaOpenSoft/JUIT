package juit.utils.Clock;

public class Time {
    public String getTime()
    {
        String temp = String.valueOf(java.time.LocalTime.now());
        return temp;
    }
    public void printTime()
    {
        System.out.println(java.time.LocalTime.now());
    }
}
