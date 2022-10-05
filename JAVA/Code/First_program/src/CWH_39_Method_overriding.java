import java.util.Scanner;

class A{
    public int hello(){
        System.out.println("Hello world");
        return 4;
    }
    public void meth2(){
        System.out.println("I am method 2 in class A");
    }
}

class B extends A{
    public void meth3(){
        System.out.println("I am method 3 in class B which is an extension of class A");
    }
    @Override // this is just for documentation purposes and it will just point out whether the function has been overriden or not, it is recommended
    public void meth2(){ // this is overrided method
        System.out.println("I am method 2 in class B");
    }
}

public class CWH_39_Method_overriding {
    public static void main(String[] args) {
        // this class deals with method overriding
        A a = new A();
//        a.meth2();
        B b = new B(); // this can access the method in class a since it is an extension of class a
//        b.meth2();
//        b.meth3();
        b.meth2(); // this will print out method two in class b

        // suppose i want to override meth2 in class b and therefore modify some of the code of meth2 in class 3 then it can be done

        // the difference between method overloading and method overriding is that
        // method overriding is rewriting the old method and getting the output and method overloading is the adding of new arguments and increasing the functionality of the first when compared to older method
    }
}
