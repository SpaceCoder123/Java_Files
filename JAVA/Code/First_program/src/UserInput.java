import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        System.out.println("It works");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1 ");
        boolean k = sc.hasNextInt();

        System.out.println(k);
        //      Check if the user has entered a number into the compiler
        int a = sc.nextInt();
        System.out.println("Enter number 2 ");
        float b= sc.nextFloat();
        float sum = a + b;
        System.out.print("The sum of the these numbers are ");
        System.out.println(sum);
//      Check if the user has entered a number into the compiler
        // If you have to read a word then use the below code
//        String str2 = sc.next();
//        System.out.println("Enter a word ");
//        System.out.println(str2);
        // if you want to read multiple words then
        System.out.println("Enter a sentence");
        String str3 = sc.nextLine();
        System.out.println(str3);

    }
}
