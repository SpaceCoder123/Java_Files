package codeWithMohan.gym; // i have changed the package name and i want to javac environment into particular packages

// the current command will add a subfolder in the currrent folder


public class MohanGym {
    public int x = 5; // there are  the different types of access modifiers
    private int y = 2; 
    protected int z = 4;
    int k = 3;

    public void meth2(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(k);
    }
    public static void main(String[] args){
        System.out.println("This is a class for mohan's gym ");
    }
}

