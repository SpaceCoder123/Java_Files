import java.util.Scanner;

public class CWH_55_Handling_Particular_Exceptions {
    public static void main(String[] args) {
        // this class particularly deals with handing particular exceptions
        int [] marks1= new int[3];
        marks1[0] = 0;
        marks1[1] = 24;
        marks1[2] = 21;




        try {
            Scanner Sc = new Scanner(System.in);
            System.out.println("Enter an array index ");
            int index = Sc.nextInt();

            Scanner Div = new Scanner(System.in);
            System.out.println("Enter the index you want to divide the number with ");
            int Div2 = Div.nextInt();

            System.out.println("The value of the number is "+ marks1[index]/marks1[Div2]);
        }
        //note in the current program, there are two type of errors which are captured, one is index out of bounds and arithmetic error
        // assume i want to deal with single type of errors at the same time but different exceptions then follow the below code

        // Like everytime it cannot return a random output or random error, we need to return each individual error at a particular instance

        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bounds error! ");
            System.out.println(e);
        }
        catch (ArithmeticException e){
            System.out.println(" Arithmetic Exception occurred! ");
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println("Some error occurred! ");
            System.out.println(e);
        }
    }
}
