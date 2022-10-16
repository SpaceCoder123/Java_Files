// let us create a custom exception class


class NegativeRadiusExceptions extends Exception{
    @Override
    public String toString() {
        return "Radius cannot be negative";
    }
}
public class CWH_58_Throws_And_Throw_Java {
    public static int divide(int a, int b) throws ArithmeticException{
        // now this function is made by Mohan
        // now the function is saying the function will throw an Arithmetic Exception if the value gives zero
        // the main intention of throw is
        // 1 Documentation purposes and
        // 2 The programmer who will be using for other stuff will also get to know and will know how to handle the exception
        return a/b;
    }
    public static double area(double radius) throws NegativeRadiusExceptions{
        if (radius<0){
            throw new NegativeRadiusExceptions();
        }
        // now if the radius is negative then the solution is non physical
        double pi = Math.PI;
        return pi * radius* radius;
    }
    public static void main(String[] args) {
        // this program particularly deals with throw and throws in java
        // what is use and application of throw and throws

        // A throw is a method which is used by the programming to remove exceptions in the code

        // now assume the function divide which is present is used by others

        try {
            int ans = divide(2, 1); // this will throw an error saying that the  value cannot be divided by zero
            System.out.println(ans);
            double rad = area(5);
            System.out.println(rad);
        }
        catch (Exception e){
            System.out.println("Please the value the entered is not valid! ");
            System.out.println(e);
        }
    }
}
