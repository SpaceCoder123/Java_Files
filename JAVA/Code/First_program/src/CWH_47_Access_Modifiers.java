class Class1{
    public int x = 5; // there are  the different types of access modifiers
    private int y = 2; // you have to set getter and setter to access cross class
    protected int z = 4;
    int k = 3;

    public void meth2(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(k);
    }

    // let us test the access modifiers within the same class
}


public class CWH_47_Access_Modifiers {

    public void helloWorld(){
        System.out.println("Good Morning");
    }

    public static void main(String[] args) {
        Class1 newItem = new Class1();
        newItem.meth2();

        CWH_47_Access_Modifiers wish = new CWH_47_Access_Modifiers();
        wish.helloWorld();

        System.out.println(newItem.x);
//        System.out.println(newItem.y); // y cannot be accessed cross classes since it is a private modifier
        System.out.println(newItem.z);
        System.out.println(newItem.k);


        // only public protected can be protected cross class and therefore private cannot be accessed
        //  this is a condition in which all the access modifiers variables are in the same package

        // Modifier   Class     Package     Subclass(different Package)    World
        // Public     Y         Y           Y                               Y
        // Protected  Y         Y           Y                               N
        // Default    Y         Y           N                               N
        // Private    Y         N           N                               N

    }
}
