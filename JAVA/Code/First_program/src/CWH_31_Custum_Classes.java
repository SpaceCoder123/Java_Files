import java.util.*;

class Employee{
    int id; // these are called attributes in a class
    String name;
    double salary;
    public void print_details(){
        System.out.println("This is the particular id for this object is "+this.id);
        System.out.println("The name of this particular object is "+this.name);
    }
    public void getSalary(){
        System.out.println("The salary of "+this.name+" is = "+this.salary);
    }
}

public class CWH_31_Custum_Classes {

    public static void main(String[] args) {
        // this class deals with creation of custom class
        Employee mohan = new Employee(); // instantiating a new employee object
        Employee john = new Employee();

        // setting attributes or properties
        mohan.id = 3245;
        mohan.salary = 54999;
        mohan.name = "Mohan";
        john.id = 3222;
        john.name = "John";
        john.salary = 99833;

//        System.out.println(mohan.id);
//        System.out.println(mohan.name);
        mohan.print_details();
        mohan.getSalary();
        john.print_details();

        john.getSalary();


    }

}
