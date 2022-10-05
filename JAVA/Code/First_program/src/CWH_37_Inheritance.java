import java.util.*;
//  this program particularly deals with the concept of inheritance in java

// the main the concept of inheritance is that adding features of a parent class to a sibling class and therefore inheriting the properties

class Base{
    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in base and setting "+x+" to x now");
        this.x = x;
    }

    int x;
    public void printMe(){
        System.out.println("Im a constructor");
    }
}

class Animal{
    String name;
    String species;
}
class Dog extends Animal{
    String dog_species;
}

// in order to inherit the characteristics of the base class we don't need to write the whole class again
// instead we write the derived class from the main class in this fashion

// In simple terms inheritance is used to borrow properties and methods from an existing class
// no need to create the same class again but just improve the derived class again and continue the research

// in order to declare inheritance in java, we use extends keyword
// now how much the base class can access, the access modifiers can only define

class Derived extends Base{
    public int getY() {
        System.out.println("I am in derived and setting "+x+" to x now");
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    int y;
}



public class CWH_37_Inheritance {
    public static void main(String[] args) {
        Base b = new Base();
        b.setX(4);
        System.out.println(b.getX());

        // instead of declaring b in base class if i derive the class in derived will i able to set and get?
        Derived c = new Derived();
        c.setX(4);
        System.out.println(c.getX()); // this redirected the code for setting and getting x and therefore the class was getting back the value of x now from base class
        c.setY(3);
        System.out.println(c.getY());

        // can we access y in base class now?
        // the answer is No, since it is the copy of the derived class and improvements are done on the base class, the properties which are not written in base class cannot be used or accessed in the derived class

//         b.setY(3); returns an error and therefore cannot be used or accessed from the base class


        // exercise 1: Create an animal class and derive the class animal from it


    }
}
