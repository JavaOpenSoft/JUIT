package juit.utils.Clock;


public class Clock {
    String type = "";
    public DigitalClock getDigitalClock()
    {
        type = "Digital";
        return new DigitalClock();

    }
    public AnalogClock getAnalogClock()
    {
        type = "Analog";
        return new AnalogClock();
    }
    public String getClockType()
    {
        return type;
    }
}

