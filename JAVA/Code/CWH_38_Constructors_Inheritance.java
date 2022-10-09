class Base1{
    Base1(){
        System.out.println("I am a base1 constructor");
    }
    Base1(int a){
        System.out.println("I am an overloaded base 1 constructor taking input value of "+ a);
    }
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int x;

}

class Derived1 extends Base1{

    public Derived1(){
        // super(2);
        System.out.println("I am derived1 constructor");
    }
    public Derived1(int x){
        super(2);
        System.out.println("I am derived1 constructor taking a value of "+x);
    }
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    int y;

}

class childOfDerived extends Derived1{
    childOfDerived(){
        System.out.println("I am the derived class constructor");
    }
    childOfDerived(int x, int y, int z){
        super(4);
        System.out.println("I am the derived class constructor taking  the value of x = "+x+", y = "+y+" and  z = " +z);
    }
}


public class CWH_38_Constructors_Inheritance {
    public static void main(String[] args) {
        // Base1 b = new Base1();
        // Derived1 d = new Derived1(); // this will print out the constructor of the parent and the itself
        childOfDerived e = new childOfDerived(2,3,45);



    }
}
