import java.util.Scanner;

class MyExceptionClass extends Exception{
    // we can write our own exception class
    @Override
    public String toString(){
        return "I am toString() method";
    }
    @Override
    public String getMessage(){
        return "I am getMessage() method";
    }

}

public class CWH_57_Exception_Class {
    public static void main(String[] args) {
        // this class deal with the exception class
        int num;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if(a<9){
            try {
                //throw new MyExceptionClass();
                throw new ArithmeticException("This is an exception");
            }
            catch(Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
                e.printStackTrace(); // this method can be used to check at which line the error has been occurred
                System.out.println("Finished");
            }
        }

    }
}
