

public class CWH_63_Date_Time {
    public static void main(String[] args) {
        // this class deals with how to get data and time in java class and its implementation
        // java.time is a package which deals with the data and time of the package;
        // these packages was implemented in a different package till java8 before that time packages was merged java.util package itself

        // How Java stores a Date?
        // the date is java is stored in a long number, it holds the value of data from 1 Jan 1970;
        // Java assumes that 1900 is start year, which means that it calculates the value of years from 1900 whenever it is retrieved;


        System.out.println(System.currentTimeMillis());  // note this value should be stored in long format
        System.out.println(System.currentTimeMillis()/1000/3600/24/365);         // output is 52, which means 52 years has been passed from 1 Jan 1970

        // 1000 converts milliseconds to seconds
        // 3600 converts seconds to hours
        // 24 converts hours to days
        // 365 converts days to years

        System.out.println("Number of hours "+System.currentTimeMillis()/1000/3600/24);
        System.out.println("Number of seconds "+System.currentTimeMillis()/1000);
        System.out.println("Number of minutes "+System.currentTimeMillis()/1000/3600);

        // is it safe to store the value of ms in long format in java?
        // yes




    }
}
