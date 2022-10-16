import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CWH_67_Date_Time_Formatter {
    public static void main(String[] args) {
        LocalDateTime time_1 = LocalDateTime.now();
        System.out.println(time_1);
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(df);
        String my_Date = time_1.format(df);
        DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE;
        String my_Date2 = time_1.format(df2);
        System.out.println(df2);
        System.out.println(my_Date);
        System.out.println(my_Date2);
    }
}
