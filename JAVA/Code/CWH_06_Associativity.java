public class CWH_06_Associativity {
    public static void main(String args[]){
        // lets talk about increment and decrement of operators
        int i = 56;
        System.out.println("og = "+ i);
        //System.out.println(i++);
        //System.out.println("after incrementing i = ");

        int b = i++;
        System.out.println("b = "+b); // b value remains the same, but i value will be incremented

        System.out.println("i = "+i);
        //int d = b;
        //System.out.println(b); // here the value of i will be stored in b
        // System.out.println(b);
        //System.out.println(d);
        //System.out.println(i);
        //System.out.println(++i);
        //System.out.println(i);
        int c = ++i; // both c and i will be incremented
        System.out.println("c = "+c);
        System.out.println("i = "+i);
    }
}
