import java.util.Scanner;

public class CWH_16_IF_ELSE {
    public static void main(String[] args) {
        // This class deals with if-else statements or decision-making statements in java
        // switch case is also available to make such statements


//        int a = 6;
//        if (a>18){
//            System.out.println("Yes you cannot drive yet");
//        }
//        else {
//            System.out.println("No you cannot drive yet");



//        System.out.println("Please enter a string");
//        Scanner string_item = new Scanner(System.in);
//        String item = string_item.nextLine();
//
//
//        // check if the string has any space
//        if (item.contains(" ")) {
//            System.out.println("The above string has empty spaces");
//        } else {
//            System.out.println("The string has no empty spaces");
//
//         check if the user is eligible to vote or not
        System.out.println("Please enter your age");
        Scanner age_num = new Scanner(System.in);
        int age = age_num.nextInt();

        if (age == 18){
            System.out.println("Eligible to vote but wait for one more year");

        } else if (age < 18) {
            System.out.println("You are not eligible to vote");
        }
        else {
            System.out.println("You are eligible to vote");
        }
    }
}

