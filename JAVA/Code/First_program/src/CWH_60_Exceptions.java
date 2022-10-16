import java.util.Scanner;

class MaxTryException extends Exception{
    @Override
    public String toString() {
        return "Maximum attempts has been reached";
    }
}



public class CWH_60_Exceptions {
    public static String Greet(String name,int num1,int num2){
        return "Good Morning "+name + " and the sum of two numbers are "+(num1/num2);
    }

    public static void main(String[] args) throws MaxTryException {

        //Write a java program that prints "HaHa" during Arithmetic exception and "HeHe" during an Illegal argument exception.
        // ---------------------------------------- Code ----------------------------------------------------------//


//        try{
//            String name= "1";
//            int num1 = 2;
//            int num2 = 0;
//            System.out.println(Greet(name,num1,num2));
//        }
//        catch (ArithmeticException e){
//            System.out.println(e);
//            System.out.println("Haha");
//        }
//        catch (IllegalArgumentException e){
//            System.out.println(e);
//            System.out.println("Hehe");
//        }

        // ---------------------------------------- Code ----------------------------------------------------------//

        // Write a program that allows you to keep accessing an array until a valid argument is given. If max tries are reached then print error (5 in this case)

        // ---------------------------------------- Code ----------------------------------------------------------//
//        int [] marks = new int[3];
//        marks[1] = 24;
//        marks[2] = 23;
//        marks[0] = 25;
//
//        int counter = 0;
//        while(counter < 5) {
//            try {
//                System.out.println("Enter the index value for the value to be extracted ");
//                Scanner ind = new Scanner(System.in);
//                int index = ind.nextInt();
//                System.out.println(marks[index]);
//                break;
//            } catch (IndexOutOfBoundsException e) {
//                System.out.println("The array index is out of bounds ");
//                counter++;
//                if(counter == 5){
//                    System.out.println("Your attempts have been exhausted ");
//                    break;
//                }
//                System.out.println("Try again ");
//            }
//        }
        // ---------------------------------------- Code ----------------------------------------------------------//


        // Modify program in Q3 to throw a custom Exception if max retries are reached

//        int [] marks = new int[3];
//        marks[1] = 24;w
//        marks[2] = 23;
//        marks[0] = 25;
//
//        int counter = 0;
//        while(counter < 5) {
//            try {
//                System.out.println("Enter the index value for the value to be extracted ");
//                Scanner ind = new Scanner(System.in);
//                int index = ind.nextInt();
//                System.out.println(marks[index]);
//                break;
//            } catch (ArrayIndexOutOfBoundsException e) {
//                System.out.println("The array index is out of bounds ");
//                counter++;
//                if(counter == 5){
//                    throw new MaxTryException(); // if you want to use an exception then you have to do a try catch block or write the main method
//                    // might throw an output or custom exception
//                }
//                System.out.println("Try again ");
//            }
//        }
        // ---------------------------------------- Code ---------------------------------------------------------
    }
}
