public class CWH_30_Functions_Exercises {
    // 1. Write a Java method to print the multiplication table of a number n.
    static void table (int n, int factor){
        System.out.println(n +" x "+ factor + " = "+n*factor);
    }

    // 2. Write a program using functions to print the following pattern:

    static void pattern1(int level){
        for (int i = 0; i<level; i++){
            for (int j = 0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    // 3. Write a recursive function to calculate the sum of first n natural numbers.
    static int summer2(int limit){
        int sum = 0;
        if(limit > 0){
            sum = limit + summer2(limit-1);
        }
        return sum;
    }



    // 4 Write a program using functions to print the following pattern:
    static void pattern2(int level){
        for (int i = 0; i<level; i++){
            for (int j = level-1; j>=i ; j--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }


    // 5 Write a function to print the nth term of the Fibonacci series using recursion
    static int a = 0,b = 1,c= 0;
    static void fibo(int level){
        if (level == 0) {
            System.out.println(c);
        }
        if (level>0){
            c = a+b;
            a = b;
            b = c;
            // System.out.println(c);
            fibo(level-1);
        }
    }



    // 6. Write a function to find the average of a set of numbers passed as arguments
    static float averaged(int ...arr){
        if (arr.length == 0){
            System.out.println("Array length cannot be zero");
            return 0.0f;
        }

        else{
            float sum = 0;
            for (int element: arr) {
                sum += element;
            }
            return (sum/arr.length);
        }
    }

    // 7. Write a program using functions to print the following pattern using Recursion:
    static void pattern2_recursive(int val){
        if (val>0){
            for (int i=0; i < val; i++) {
                System.out.print("*");
            }
            System.out.println("");
            pattern2_recursive(val - 1);
        }
    }

    // 8. Write a program using functions to print the following pattern using Recursion:

    static void pattern1_recursive(int val) {
        if (val > 0){
            for (int i = 0; i < val; i++){
                System.out.print("*");

            }

            System.out.println("");
            pattern2_recursive(val - 1);
        }
    }


    // 10  Write a function to calculate the sum of first n natural numbers using iterative approach.
    static int summer(int ...arr){
        int total = 0;
        for (int element: arr){
            total +=element;
        }
        return  total;

    }





    public static void main(String[] args) {
//        System.out.println("Please enter a number to print the table ");
//        Scanner num = new Scanner(System.in);
//        int number = num.nextInt();
//        for (int i = 1; i <= 10; i++){
//            table(number,i);
        // pattern2_recursive(5);
        pattern1_recursive(5);
        // pattern1(5);
        //pattern2(5);
        // int val = summer(1,2,34,2,7,87,5);
        // System.out.println(val);
        // System.out.println(averaged());
        // fibo(4);
        // System.out.println(summer2(12));
    }
}
