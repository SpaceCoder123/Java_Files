import java.util.Scanner;

public class CWH_CHP1_PS {
    // this program contains the practice set for chapter 1 in java
    // 1 write a program that prints three  numbers in java
    // 2 write a program that takes user input to write the username
    // 3 write a program to convert from meters to kilometers


    public static void main(String args[]){
         // solution to q1

        System.out.println("Enter the first number ");
        Scanner first_num = new Scanner(System.in);
        int num1 =  first_num.nextInt();
        System.out.println("Enter the second number ");
        Scanner second_num = new Scanner(System.in);
        int num2 =  second_num.nextInt();
        System.out.println("Enter the third number ");
        Scanner third_num = new Scanner(System.in);
        int num3 =  third_num.nextInt();



        int total = num1 + num2 + num3;
        System.out.print("The total of three numbers are ");
        System.out.println(total);
        System.out.println(total);


        // solution of q2
        System.out.println("Please enter your name");
        Scanner name = new Scanner(System.in);
        String name1 = name.nextLine();
        System.out.println("Hello "+name1+ "! Nice to meet you! ");

         // solution to q3
        System.out.println("Enter the distance in meters ");
        Scanner dist = new Scanner(System.in);
        float meters = dist.nextFloat();
        float kilometers = meters/1000;
        System.out.println("The total distance is "+ kilometers +" km");





    }
}
