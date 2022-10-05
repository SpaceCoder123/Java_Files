import java.util.Scanner;


class My_Employee{
    private int id;
    private String name;

    public My_Employee(){
        // this block of code particularly is a constructor // note it does not need to invoked, no return value and has the same name as the class
        // this runs automatically since it is a constructor and contains class default values
        id = 34;
        name = "Name here";
    }
    // let us pass some input arguments into the constructor

    public My_Employee(String Myname, int My_Id){
        // this block of code particularly is a constructor // note it does not need to invoked, no return value and has the same name as the class
        // this runs automatically since it is a constructor and contains class default values
        id = My_Id;
        name = Myname;
    }
    public void set_Id(int ID){
        this.id = ID;
    }
    public void set_name(String name){
        this.name =name;
    }

    public int get_Id(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
}
public class CWH_34_Constructors {
    public static void main(String[] args) {
        // this class particularly deals with constructors and use of constructors in OOPS concepts
        // constructors are used to initialize the object while creating it

        My_Employee mohan = new My_Employee("Arun",314); // this code has a class and some input arguments
        System.out.println(mohan.get_Id());
        System.out.println(mohan.getName());
        My_Employee arun = new My_Employee(); // no arguments has been passed and therefore the default constructor will run
        System.out.println(arun.get_Id());
        System.out.println(arun.getName()); // gives out default constructor values set as before ( in line 8 )

        // Note: Constructor can be overloaded amd there can be more than two overloaded constructors just like other methods in java
        // Constructor can be overloaded without taking any input arguments

    }
}
