// what is the need of implementing Abstract class?
// in a big project suppose you to give a standard implementation fo the classes then abstract classes will be prime importance
// note you cannot create objects in abstract classes but can implement objects from subclasses

abstract class Base2{
    public Base2(){
        System.out.println("I am the constructor of base2");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet(); // this method can be modified and implemented as you like and therefore creating a subclass
    // and implementing the code would be eminent since the output might be varying

    // due to the abstract keyword added in the method the entire class need to be renamed as abstract class
    // this class basically forms a template and can keep numerous implementation for many subclasses

}

class Derived2 extends Base2{
    @Override
    public void greet(){
        System.out.println("Good Morning");
    }
}




public class CWH_42_Abstract_Class {
    public static void main(String[] args) {
        // this class mainly deals with abstract classes in java

        // abstract is something which has non-physical existence but real meaning or a thought or an idea behind it.
        // abstract method is type of method which has no implementation
        // abstract class is a type of class which has abstract method implemented inside
        // even if one class is an abstract class then the entire class is declared as abstract class
        Derived2 obj = new Derived2();
        obj.greet();


    }
}
