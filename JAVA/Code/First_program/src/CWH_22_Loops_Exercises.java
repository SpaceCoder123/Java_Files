import java.util.Scanner;


public class CWH_22_Loops_Exercises {
    public static void main(String[] args) {
//        // factorial of a number
//        int num;
//        System.out.println("Please enter a number to find the factorial ");
//        Scanner Fact = new Scanner(System.in);
//        num = Fact.nextInt();
//
//        int total = 1;
//        if (num==0 || num == 1){
//            total = 1;
//        }
//        else {
//            for (int i = 1; i <= num;i++){
//                total = total*i;
//                // System.out.println(total);
//            }
//        }
//
//        System.out.println(total);

        // 2. Write a program to sum first n even numbers using a while loop.
//        int num;
//        System.out.println("Please enter a number to find the sum of n natural numbers ");
//        Scanner Fact = new Scanner(System.in);
//        num = Fact.nextInt();
//
//        int total = 0;
//        int i = 0;
//        while(i < num){
//            total = total + i;
//            // System.out.println(total);
//            i++;
//        }
//        System.out.println(total);

        // 3 Write a program to print the multiplication table of a given number n.

//        int num;
//        System.out.println("Please enter a number to print a multiplication table ");
//        Scanner Fact = new Scanner(System.in);
//        num = Fact.nextInt();
//        int total_table_length = 10;
//        for (int i = 1; i <= 10;i++){
//            System.out.println(""+num+" x "+i+" = "+i*num);
//        }



     // 4  Write a program to sum first n even numbers using a while loop
//        int num;
//        System.out.println("Please enter a number to print a sum first n even numbers ");
//        Scanner Fact = new Scanner(System.in);
//        num = Fact.nextInt();
//
//        int total = 0;
//        int i = 2;
//        while (i<=num) {
//            if (i % 2 == 0) {
//                total = total + i;
//                // System.out.println(total);
//            }
//            i++;
//        }
//        System.out.println(total);

        // 5 Write a program to print the following pattern
        int num;
        System.out.println("Please enter a number to print a sum first n even numbers ");
        Scanner Fact = new Scanner(System.in);
        num = Fact.nextInt();

        for (int i = num; i > 0; i--){
            for ( int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }


}
