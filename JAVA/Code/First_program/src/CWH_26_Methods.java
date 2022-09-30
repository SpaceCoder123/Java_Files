public class CWH_26_Methods {
    // this class particularly deals with methods and functions and deals with static and non-static methods
    static int sum(int a,int b){
        return a+b; // whatever variables which are hardcoded inside the code cannot be changed externally even in the main or the main method
    }
    int subtract(int a, int b){
        return a - b;
    }

    public static void main(String[] args) {
        System.out.println(sum(1,2)); // expected output 3

        // methods are created only to avoid multiple implementation of a same particular patch of code
        // any variable can be added and removed but can be done using a string

        // creates a new object related to the particular class
        CWH_26_Methods obj = new CWH_26_Methods();
        System.out.println(obj.subtract(3,2)); // expected output 1

        // public is an access modifier

        // static methods can be called in the main function and for non static functions the objects cannot be called directly but a separate object has to be created


    }
}
