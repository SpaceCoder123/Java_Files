import java.util.Scanner;

public class CWH_17_Switch_Case {
    public static void main(String[] args) {
        // this tutorial leads with the switch case control of the code
        // this gives a number of alternative choice for the variable to make and execute the exit statement
        int age;
        System.out.println("Please enter the age ");
        Scanner age_num = new Scanner(System.in);
        age = age_num.nextInt();

        switch (age){
            case 18:
                System.out.println("You are eligible to vote");
                break;
            case 24:
                System.out.println("You are eligible for job");
                break;
            case 60:
                System.out.println("You are eligible for retirement");
                break;
            default:
                System.out.println("Enjoy your life");
        }
        System.out.println("Thank you for using Java code");

    }
}
