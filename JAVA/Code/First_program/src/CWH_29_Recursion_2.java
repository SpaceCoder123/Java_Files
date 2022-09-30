public class CWH_29_Recursion_2 {
    // this program is execution of fibonacci series using java
    static int a = 0,b = 1,c = 0;

    static void fibonacci (int count){
        if (count>0){
            c = a+b;
            a = b;
            b = c;
            System.out.println(c);
            fibonacci(count-1);
        }

    }



    static void fibo(int x,int y,int iterations, int num){
        if (iterations == 0) {
            System.out.println(x);
            System.out.println(y);
        }
        if ( num < iterations) {
            int x2 = x + y;
            System.out.println(x2);
            num++;
            fibo(y,x2,iterations,num);
        }
    }

    public static void main(String[] args) {
//        int x1 = 0;
//        int x2 = 1;
//        int terms = 10;
//        fibo(x1,x2,terms,0);
        fibonacci(5);

    }
}
