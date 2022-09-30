public class CWH_29_Recursion {
    // in this class we will deal with how to deal with recursion
    // calling a function by itself is called recursion
    // factorial (n) = n * factorial(n-1)
    static int factorial(int n){
        if (n == 0 || n == 1){
            return 1;
        }
        else {
            System.out.println(n);
            return n* factorial(n-1);
        }

    }
    public static void main(String[] args) {
        System.out.println(factorial(7));


    }
}
