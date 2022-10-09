import java.util.Scanner;

class MyEmployee{
    private int id;
    private String name;

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

public class CWH_33_Access_modifiers {
    public static void main(String[] args) {
        // this program particularly deals with access modifiers and how classes can be accessed in java
        // there are four types of access modifiers in java
        // 1 protected
        // 2 public
        // 3 private
        // 4 default

        // Access modifiers specifies where a method/property is accessible

        // Getters and setters :- These methods only return or set a particular value or a variable
        // let us create a new employee object

        MyEmployee Employee3 = new MyEmployee();


//        Employee3.id = 45;
//        Employee3.name = "Mohan";

//        System.out.println(Employee3.id);
//        System.out.println(Employee3.name);

        // the following lines cannot be implemented because the main methods in the employee class cannot be directly accessed


        // Here is the direct use of getters and setters
        Employee3.set_Id(1123);
        Employee3.set_name("Mohan");
        System.out.println(Employee3.get_Id());
        System.out.println(Employee3.getName()); // this is how we access an attribute value if they are under private mode and no longer publicly available

        // The reason why we implement getters and setters are because to keep the validation in the name and proper checking of the name can be done and then applied to the main branch



    }

}
