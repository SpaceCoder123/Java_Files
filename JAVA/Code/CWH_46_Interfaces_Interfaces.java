interface parentInt{
    void meth1();
    void meth2();
}

interface childInt extends parentInt{
    void meth3();
    void meth4();
}

class childClass implements childInt{
    public void meth1(){
        System.out.println("This is meth1");
    }
    public void meth2(){
        System.out.println("This is meth2");
    }
    public void meth3(){
        System.out.println("This is meth3");
    }
    public void meth4(){
        System.out.println("This is meth4");
    }
    // note childInt has no methods of meht1 and meth2  but since it has inherited ParentInt and since those two methods inside the interfaces has not been implemented the childclass will throw an error
}


public class CWH_46_Interfaces_Interfaces {

    public static void main(String[] args) {
        // this program deals with interfaces and inheritance with other interfaces
        childClass child = new childClass();
        child.meth1();
        child.meth2();
        child.meth3();
        child.meth4();
    }
}
