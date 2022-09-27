public class CWH_05_Operators {
// this chapter leads with the operators operation in java

    // there are five types of operators in java
    // bitwise operator- which only works on bits
    // Arithmatic operators - which deals with arithmatic operations only
    // Assignment operators - which only assigns to some variables
    // Comparison Operators - which compares the two data with each other or for validation
    // Logical Operators - returns true or false based on the argument made, follows the logical system

    public static void main(String args[]){
        System.out.println(2&3); // example for bitwise operator

        // Arithmatic Operator
        System.out.println(2+3);
        System.out.println(2/3);
        System.out.println(2*3);
        System.out.println(2%3); // this is called the modulo operator  (%)

        // Assignment Operators
        int b = 4; // this is the assignment operators that assignes the value of 4 to the variable b
        System.out.println(b);
        System.out.println(3==4);// returns true if the condition is true, else false
        System.out.println(3>4);

        // Logical Operators
        System.out.println(3<4 && 3>5); // "and" operator needs both the conditions to be right to return true or else will return false
        System.out.println(4<5 || 3<5); // "or" operator returns true if either one of the conditions is true.

        // Note: Arithmatic operators cannot work with booleans or any other datatypes



    }

}
