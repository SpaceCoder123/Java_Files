import java.util.Scanner;

public class CWH_13_Strings {

    //  Note this is a new chapter
    public static void main(String[] args){
        // this class particularly deals with string methods and methodology and the functions that can be used in manipulating strings
        String name = new String("Mohan"); // this is how you declare or instantiate a string to a particular variable
        // basically you are trying to create a new object string

        // String are immutable and cannot be changed, you can create a copy and change the value by cannot modify the original value
        System.out.print("The name of the user is "+name); // this does not give a line space after execution
        System.out.println(name);

        int a = 6;
        float b = 3.45f;
        System.out.printf("The value of a is %d and b is %f",a,b);
        // this is the classical c language placeholder for adding of string and decimals for the following print statement and here are the few types of adding strings
        System.out.format("The value of a is %d and b is %f \n",a,b);
        // .format also uses the same function and prints out the value in the classical c language type output


        // How to read the string from user input
        System.out.println("Please enter a random sentence");
        Scanner sentence = new Scanner(System.in);
        String sen = sentence.next(); // this pulls out the first string or first set characters until it finds a space in the string
        System.out.println(sen);
        String sen_Full = sentence.nextLine();
        System.out.println(sen_Full);

        // concatenation in strings

        String first = "First";
        String second = " Second";
        System.out.println("The first and second variables are attached together "+ first+second );





    }
}
