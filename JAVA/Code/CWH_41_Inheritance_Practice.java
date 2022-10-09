import java.util.*;


// 1. Create a class circle and use inheritance to create another class cylinder from it
class Circle3{
    private double Radius;
    Circle3(double radius){
        System.out.println("this is the constructor of the Circle class");
        this.Radius = radius;
    }


    private double getArea(double radius){
        return 3.14125d * radius * radius;
    }
}

class Cylinder3  extends Circle3{
    private double Height;

    Cylinder3(double radius, double height){
        super(radius); // the constructor is copied to the subclass using the super keyword
        System.out.println("this is the constructor of  the Cylinder class");
        this.Height = height;
    }

    public double volume(double radius, double height){
        return Math.PI * radius * radius * height;
    }
}




public class CWH_41_Inheritance_Practice {
    public static void main(String[] args) {
        // this class mainly deals with Inheritance and its related practice questions
        Cylinder3 obj = new Cylinder3(3,4);
        System.out.println(obj.volume(3,4));


    }
}
