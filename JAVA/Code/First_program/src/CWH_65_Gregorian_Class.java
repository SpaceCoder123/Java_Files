import java.util.Calendar;

public class CWH_65_Gregorian_Class {
    public static void main(String[] args) {
        // this class particularly deals with Gregorian calendar class
        Calendar C = Calendar.getInstance();
        System.out.println(C.get(Calendar.DATE));
        System.out.println(C.get(Calendar.SECOND));
        System.out.println(C.get(Calendar.HOUR));
    }
}
