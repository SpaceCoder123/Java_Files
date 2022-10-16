import java.util.Date; // note most of the methods has been removed or not in continuous use

public class CWH_63_Date_Class {
    public static void main(String[] args) {
//        System.out.println(Long.MAX_VALUE);
//        System.out.println(Double.MAX_VALUE);
//        System.out.println(Integer.MAX_VALUE);

        // solution to last quiz problem

        Date d = new Date();
        System.out.println(d); // prints current data and time
        System.out.println(d.getTime()); // returns the number of milliseconds starting from 1970
    }
}
