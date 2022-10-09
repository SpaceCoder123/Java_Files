public class CWH_27_Method_Overloading {
    // this class particularly deals with method overloading
    // let us build a class which only returns a string and nothing else
    // what is method overloading?
    // two or more methods can have the same name but different functionality and these methods are called overloaded methods


    static void morning (){
        System.out.println("Good Morning");
    }

    // let us try changing an integer
    static void change(int a){
        a= 28;

    }
    static void change2(int [] arr){
        arr[0] = 22;
    }

    static void foo(){
        System.out.println("Good morning");

    }
    static void foo(String a){
        System.out.println("Good morning "+a+", this is an overloaded function with same name but different inputs ");
    }

    public static void main(String[] args) {
        morning(); // expected output good morning

        int a = 30;
        change(a);
        System.out.println("the value of a after changing is: "+a); // the value of a has not been changed


        // let us try to change an array
        int [] arr = {21,23,26};
        change2(arr);// here the reference the array object is sent into the method and therefore the value is changed because the method changed the reference of the first variable
        System.out.println("the value of first integer after changing the first value using a method is given by "+arr[0]); // the value got changed
        // the above case is useful for the objects also

        foo();
        foo("Mohan");

        // Note: a is an input argument which contain an actual value or an actual reference
        // Note: you cannot change a return type and overload a function
        // Note: the latest overloaded function is the main function and every time you call the function the latest function will respond
    }
}
