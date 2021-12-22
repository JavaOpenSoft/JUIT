package juit.utils.Clock;

import java.time.LocalTime;

public class Time {
    public LocalTime getTime()
    {

        return java.time.LocalTime.now();
    }

    @Override
    public String toString() {
        return super.toString();
    }
    public void printTime()
    {
        System.out.println(java.time.LocalTime.now());
    }

}
