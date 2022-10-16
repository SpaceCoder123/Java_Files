import java.util.ArrayList;
import java.util.Calendar;

public class CWH_64_CalendarClass {
    public static void main(String[] args) {

//        Calendar right_now = Calendar.getInstance(); // note the calendar library is an interface or an abstract class
//        System.out.println(right_now.getCalendarType()); // returns a gregorian calendar type
//        System.out.println(right_now.getTimeZone().getClass());
//        // Gregorian calendar is the regular calendar that has been continued from 1500s
//
//
//
       Calendar TimeZone = Calendar.getInstance();
//        String s = TimeZone.getTimeZone().getID(); // if you want to get the access of the time zone
//        System.out.println(s);



        String time = String.valueOf(TimeZone.getTime());

        String[] arr = null;
        arr = time.split(" ");

        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }






    }
}
