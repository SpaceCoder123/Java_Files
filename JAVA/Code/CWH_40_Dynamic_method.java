class One{
    public void greet(){
        System.out.println("Good Morning");
    }
    public void name(){
        System.out.println("My name is Java");
    }
}

class Two extends One{
    public void swagat(){
        System.out.println("Aapka swagat hai");
    }

    public void music(){
        System.out.println("PLaying music");
    }

    public void name(){
        System.out.println("My name is Java in class Two");
    }
}



public class CWH_40_Dynamic_method {
    public static void main(String[] args) {
        // this method mainly deals with dynamic method dispatch
//        One obj = new One();
//        obj.name();
//        obj.greet();
//        Two obj2 = new Two();
//        obj2.name();
//        obj2.greet();
        // suppose i want to  create a object with only subclass components but inherit superclass elements

        One obj = new Two(); // superclass object = new Subclass of the superclass, note it has to be subclass of the main class
        obj.greet();
        obj.name();

        // this will run the method of the subclass name function rather than the superclass method
        // obj.music(); // the object cannot access the function or method in the class 2

        // you want to access the methods in obj 2, you have to create a reference of the new class and then create an object

        // this phenomenon is called as Dynamic method dispatch
        // this is very impactful in runtime polymorphism since a new object is created while the program is getting executed

    }
}
