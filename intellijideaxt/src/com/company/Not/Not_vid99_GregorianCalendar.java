package Not;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.GregorianCalendar;
public class Not_vid99_GregorianCalendar {
    public static void main(String[] args) {
//Calendar c = Calendar.getInstance();
//        System.out.println(c.getCalendarType());
//        System.out.println(c.getTimeZone());


        Calendar c = Calendar.getInstance();

        System.out.println(c.getTime());
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.MINUTE));
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" +  c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));
GregorianCalendar cal = new GregorianCalendar();
        System.out.println(cal.isLeapYear(2021));
        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[1]);
        System.out.println(TimeZone.getAvailableIDs()[2]);
        System.out.println(TimeZone.getAvailableIDs()[3]);

    }
}
