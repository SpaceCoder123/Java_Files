interface Bicycle{
    int a =45;
    public void applyBrake(int decrement);
    public void speedUp(int increment);
}

interface HornBicycle{
    int x= 45;
    void blowHornK3g();
    void blowHornmhn();
}

class AvonCycle implements Bicycle,HornBicycle{
    void blowHorn(){
        System.out.println("Pee Pee Poo Poo");
    }

    public void applyBrake(int decrement){
        System.out.println("Applying brake");
    }
    public void speedUp(int increment){
        System.out.println("Applying speedup");
    }
    public void blowHornK3g(){
        System.out.println("Kabhi khushi kabhi gum pee pee pee pee");
    }
    public void blowHornmhn(){ // note all the methods should be public as access modifier
        System.out.println("Main hoon naa po po po po");
    }

    // not you can modify the variables and method implemented in the interface (if they are public) that are implemented
    // the methods declared inside the parent class must be declared
    // you cannot create objects using interfaces but can use the reference to create objects
    // interface methods are public by default

}

public class CHW_43_iNTERFACES {
    public static void main(String[] args) {
        // this class mainly deals with interfaces and their importance and implementation

        // interfaces are a group related methods with empty bodies
        // interfaces can be referenced but cannot be made into objects

        // An interface in Java is a blueprint of a class. It has static constants and abstract methods.
        // The interface in Java is a mechanism to achieve abstraction.

        AvonCycle cycleMohan = new AvonCycle();
        cycleMohan.applyBrake(1);
        cycleMohan.blowHorn();
        System.out.println(cycleMohan.a); // you can access the methods that are declared inside interfaces but cannot modify and the values are final
        System.out.println(cycleMohan.x);
        cycleMohan.blowHornK3g();
        cycleMohan.blowHornmhn();
        cycleMohan.speedUp(1);


    }
}
