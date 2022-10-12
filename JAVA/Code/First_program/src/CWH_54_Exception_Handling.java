public class CWH_54_Exception_Handling {
    // this class deals with exception handling in java and how it is carried out in java
    public static void main(String[] args) {
        // An exception is an event that occurs when a program is executed disrupting the normal
        // flow of instruction.

        // There are two types of exceptions that are present in java
        // Check Exception - This occurs when there is an issue in the compilation itself
        // Unchecked Exception - This occurs when there is an issue in the interpretation of the code or during runtime

        // Commonly occurring exceptions
        // 1. Null pointer exception
        // 2. Arithmetic Exception
        // 3. ArrayIndexOutOfBound exception when the iteration or the index demanded by the user is more than the available length
        // 4. IllegalArgumentException is when the argument that is given inside the method and the argument that is passed inside are not the same
        // 5. NumberFormatException - these kind of exceptions are found when the number conversion is wrong, suppose if you want to convert from one datatype to another but the format is not right then there is an exception

        int a = 1000;
        int b = 0;
        //int c = a/b;
        // System.out.println(c); // Note since the c is int datatype the value is rounded to the nearest integer and therefore the value is returned

        try{
            int c = a/b;
            System.out.println(c); // note this patch of code will be executed and if there is any error while executing the code then catch will be executed

            // if you the try the above code without try then the program would crash and the thread execution will be abruptly stopped which is not recommended in any software development
        }
        catch (Exception e){
            System.out.println("We failed to divide, Reason: ");
            System.out.println(e);
            // returns exception 2 that is Arithmetic Exception
        }

    }
}
