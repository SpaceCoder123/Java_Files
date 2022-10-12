import java.util.Scanner;

public class CWH_53_Errors_Exceptions {
    public static void main(String[] args) {
        // this class particularly deals with how to handle errors in your java program
        // There are three types of errors
        // 1. Syntax Errors (Example: Missing Semicolon or Undefined Variable or Properly no defined code or breaking the code rules)
        // here is an example for syntax error

//       int a = 9;
//       b = 9; // not mentioning a variable data types


        // 2. Logical Errors (Example: The program has successfully run but there is a bug in the software, the software  is not writing the proper answer)
        // write a program that will print prime numbers from 1 to 10
        System.out.println(2);
        for(int i = 0; i < 10; i++){
            System.out.println(2*i+1);
        }

        // expected output is 2,3,5,7,9 - 9  is not a prime number but still the output is shown

        // 3. Runtime Errors (Example: The entire program crashes and therefore the code should be written in well fashioned in which even if th user fives a wrong input the program doesn't crash)
        int k;
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        System.out.println("The value of k after dividing by 1000 is "+1000/k);

        // now, in the above example if the value of k = 0 then the value doesn't exist goes to infinity and therefore the solution is not proper and therefore a runtime error expression is formed

        //
    }
}
