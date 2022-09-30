public class CWH_28_VarArgs {

    static int sum( int ...arr){
        // the entire input argument will be converted to array datatype and how much ever arguments u pass will be added to the particular array
        //by default the value will be 0 if the function is called just like that
        int result = 0;
        for (int i: arr){
            result+=i;
        }
        return result;
    }
    static int sum2( int b,int ...arr){ // this will compulsorily take an input variable

        int result = b;
        for (int i: arr){
            result+=i;
        }
        return result;
    }

    public static void main(String[] args) {
        // main purpose of varargs is passing multiple arguments inside a particular function
        System.out.println("The sum of nothing is "+sum());
        System.out.println("The sum of 2 and 3 is "+sum(2,3));
        System.out.println("The sum of 2 4 and 3 is "+sum(2,4,3));
        System.out.println("The sum of 2 5 6 and 3 is "+sum(2,5,6,3));
        System.out.println("The sum of 2 5 8 9 and 3 is "+sum(2,5,8,8,3));
        System.out.println("The sum of 2 is "+sum(2));


    }
}
