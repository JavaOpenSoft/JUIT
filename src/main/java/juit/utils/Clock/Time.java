package juit.utils.Clock;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;


public class Time {

    public void setTimeZone() throws ParseException {
        SimpleDateFormat isoFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        isoFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        Date date = isoFormat.parse("2010-05-23T09:01:02");
    }
    public String getTime()
    {
        return String.valueOf(java.time.LocalTime.now());
    }
    public void printTime()
    {
        System.out.println(java.time.LocalTime.now());
    }
}
