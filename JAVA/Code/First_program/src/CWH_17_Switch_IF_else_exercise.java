import java.util.Scanner;

public class CWH_17_Switch_IF_else_exercise {

    public static void main(String[] args) {
//        // this class primarily deals with exercises for if and else statements
//        // Write a program to find out whether a student is pass or fail; if it requires a total of 40% and at least 33% in each subject to pass.
//        // Assume 3 subjects and take marks as input from the user.
//
//
//        System.out.println("Please enter the total marks to be awarded");
//        Scanner Total = new Scanner(System.in);
//        int Total_marks = Total.nextInt();
//        Scanner Sankrit = new Scanner(System.in);
//        System.out.println("Please enter your First language marks");
//        float marks1 = Sankrit.nextFloat();
//        Scanner English = new Scanner(System.in);
//        System.out.println("Please enter your Second language marks");
//        float marks2 = English.nextFloat();
//        Scanner Kannada = new Scanner(System.in);
//        System.out.println("Please enter your Third language marks");
//        float marks3= Kannada.nextFloat();
//        Scanner Mathematics = new Scanner(System.in);
//        System.out.println("Please enter your Mathematics marks");
//        float marks4 = Mathematics.nextFloat();
//        Scanner Social = new Scanner(System.in);
//        System.out.println("Please enter your Social marks");
//        float marks5 = Social.nextFloat();
//        Scanner Science = new Scanner(System.in);
//        System.out.println("Please enter your Science marks");
//        float marks6 = Science.nextFloat();
//
//
//        float total_gained_marks = marks1+marks2+marks3+marks4+marks5+marks6;
//        float percentage = ( total_gained_marks / Total_marks ) * 100 ;
//
//        if (percentage < 40){
//            System.out.println("Oh gosh! You have failed the exam entirely ");
//        } else if (percentage >= 90 ) {
//            System.out.println("You gave entered a distinction grade of "+percentage+" %, Congratulations and all the best for your future");
//        }
//        else if (percentage >= 75 && percentage < 90 ) {
//        System.out.println("You gave entered a First class grade of "+percentage+" %, Congratulations and all the best for your future");
//        }
//        else if (percentage >= 60 && percentage < 75 ) {
//            System.out.println("You gave entered a Second class grade of "+percentage+" %, Congratulations and all the best for your future");
//        }
//        else if (percentage >= 40 && percentage < 60 ) {
//            System.out.println("You gave entered a Third class grade of "+percentage+" %, Congratulations and all the best for your future");
//        }

        // Calculate income tax paid by an employee to the government as per the slabs mentioned below:


//        System.out.println("Please enter your entire financial year income in INR");
//        float total_money;
//        Scanner money = new Scanner(System.in);
//        total_money = money.nextInt();
//        float tax_slab;
//        float taxable_money;
//        int money_limit3 = 1000000;
//        int money_limit2 = 500000;
//        int money_limit1 = 250000;
//
//        if (total_money >= money_limit3){
//            tax_slab = 0.3f;
//            taxable_money = (total_money * tax_slab) ;
//            System.out.println("The total money you earned in the financial year tends to be more than "+ money_limit3 +" and hence the tax slab is "+tax_slab+" % and the total money you are allowed to pay is "+taxable_money +" INR");
//        }
//        else if (total_money >= money_limit2 && total_money < money_limit3 ){
//            tax_slab = 0.2f;
//            taxable_money =  (total_money * tax_slab);
//            System.out.println("The total money you earned in the financial year tends to be more than "+ money_limit2 +" and hence the tax slab is "+tax_slab+" % and the total money you are allowed to pay is "+taxable_money +" INR");
//        }
//        else if (total_money >= money_limit1 && total_money < money_limit2 ){
//            tax_slab = 0.05f;
//            taxable_money =  (total_money * tax_slab);
//            System.out.println("The total money you earned in the financial year tends to be more than "+ money_limit1 +" and hence the tax slab is "+tax_slab+" % and the total money you are allowed to pay is "+taxable_money +" INR");
//        }
//        else {
//            System.out.println("The total money you earned in the financial year tends to be less than general income bracket of "+money_limit1+" INR, Hence no taxes are added to your account");
//        }

       // Write a Java program to find out the day of the week given the number [1 for Monday, 2 for Tuesday … and so on!]

//        int day;
//        System.out.println("Enter number to get a particular day");
//        Scanner num = new Scanner(System.in);
//        day = num.nextInt();
//
//        switch (day){
//            case(1):
//                System.out.println("Monday");
//                break;
//            case(2):
//                System.out.println("Tuesday");
//                break;
//            case(3):
//                System.out.println("Wednesday");
//                break;
//            case(4):
//                System.out.println("Thursday");
//                break;
//            case(5):
//                System.out.println("Friday");
//                break;
//            case(6):
//                System.out.println("Saturday");
//                break;
//            case(7):
//                System.out.println("Sunday");
//                break;
//            default:
//                System.out.println("Wrong number, enter a range from (1-7)");
//                break;
//        }

//         Write a Java program to find whether a year entered by the user is a leap year or not.
        System.out.println("Enter a year ");
        int year;
        Scanner year1 = new Scanner(System.in);
        year = year1.nextInt();
        if (year % 4 == 0){
            System.out.println("The year "+year+" is a leap year");
        }
        else {
            System.out.println("The year "+year+" is not a leap year");
        }




    }
}
