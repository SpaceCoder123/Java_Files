

interface DemoAnno{
    void meth1();
    void meth2();

}

@FunctionalInterface
interface DemoAnno2{
    void meth3();
}

//class AnnonyDemo implements DemoAnno{
//    public void display(){
//        System.out.println("Hello");
//    }
//
//    @Override
//    public void meth1() {
//        System.out.println("I am meth1");
//
//    }
//
//    @Override
//    public void meth2() {
//        System.out.println("I am meth1");
//    }



public class CWH_68_Anonymous_Classes {

    public static void main(String[] args) {
        // this class particularly deals with anonymous classes and their functionality

        // the below code is the representation of Anonymous class which is implemented from an interface without a proper class
         DemoAnno obj = new DemoAnno() {
            @Override
            public void meth1() {
                System.out.println("I am meth1");

            }

            @Override
            public void meth2() {
                System.out.println("I am meth2");
            }
        };
//        obj.meth1();

        // instead of implementing and writing all the code for function we can define a lambda function
        DemoAnno2 obj2 = ()->{
            System.out.println("This is demo3");
        };
        obj2.meth3();
    }
}
