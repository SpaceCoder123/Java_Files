import java.util.*;


// 1. Create a class Employee with the following properties and methods:
// a. Salary (property) (int)
// b .getSalary (method returning int)
// c .name (property) (String)
// d .getName (method returning String)
// e .setName (method changing name)

class Employee2{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String name(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}

// 2. Create a class cellphone with methods to print “ringing…”, “vibrating…”, etc.
class Cellphone{
    double number;
    String name;

    public String incoming_Call(){
        return "Ringing";
    }
    public String incoming_Call_silent(){
        return "Vibrating";
    }
    public String endCall(){
        return "Call has been ended";
    }
    public void get_Name(){
        System.out.println(this.name);
    }
}

// 3. Create a class Square with a method to initialize its side, calculating area, perimeter etc.

class Square{
    float side;
    public float Area(){
        return  this.side*this.side;
    }
    public float perimeter(){
        return 4*this.side;
    }
}
// 4. Create a class Rectangle & problem 3.
class Rectangle{
    float long_side;
    float short_side;
    public float Area(){
        return  this.long_side*this.short_side;
    }
    public float perimeter(){
        return 2*(this.long_side*this.short_side);
    }
}

// 5. Create a class TommyVecetti for Rockstar Games capable of hitting (print hitting…), running, firing, etc.

class TommyVecetti {
    static void hit(){
        System.out.println("Tommy hitting");
    }
    static void run(){
        System.out.println("Tommy running");
    }
    static void fire(){
        System.out.println("Tommy firing");
    }
}



// 6. Repeat problem 4 for a circle.
class Circle{
    float radius;
    float pi = 3.1412f;
    public float Area(){
        return this.pi*this.radius*this.radius;
    }
    public float perimeter(){
        return 2*this.pi*this.radius;
    }
}


public class CWH_32_OOPS_Practice {
    public static void main(String[] args) {
        // System.out.println("This class deals with the practice problem set in OOPs");
//        Employee2 mohan = new Employee2();
//        mohan.salary = 54000;
//        mohan.setName("Mohan");
//        System.out.println(mohan.getSalary());
//        System.out.println(mohan.name);

//        Cellphone oppo = new Cellphone();
//        oppo.name = "Oppo Vivo 16";
//        oppo.number = 9591989701.0d;
//
//        System.out.println(oppo.incoming_Call());
//        System.out.println(oppo.incoming_Call_silent());
//        System.out.println(oppo.endCall());
//        oppo.get_Name();
//        System.out.println(oppo.number)


//        Square bob = new Square();
//        bob.side = 3.3f;
//        System.out.println(bob.Area());
//        System.out.println(bob.perimeter());

//          Rectangle bob = new Rectangle();
//          bob.short_side = 3.3f;
//          bob.long_side = 4.3f;
//          System.out.println(bob.Area());
//          System.out.println(bob.perimeter());

//        Circle thomas = new Circle();
//        thomas.radius = 10;
//        System.out.println(thomas.Area());
//        System.out.println(thomas.perimeter());

//        TommyVecetti mohan = new TommyVecetti();
//        TommyVecetti.hit();
//        TommyVecetti.run();
//        TommyVecetti.fire();
    }
}
