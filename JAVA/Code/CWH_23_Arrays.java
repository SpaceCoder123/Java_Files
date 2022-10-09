public class CWH_23_Arrays {
    public static void main(String[] args) {
        // this class particularly deals with arrays and their functionality

        // this is the general description of an array
        // datatype array name = creating_of_object datatype[length_of_array];

        // There are three types of array creation in java

        // 1 Initialization
        // 2 Memory Allocation
        // 3 Declaration


        int [] marks = new int[5];
        marks[0] = 100;
        marks[1] = 2;
        marks[2] = 3;
        marks[4] = 84;

        // if no value is assigned the value then the value is taken to be 0
        System.out.println(marks[3]);

        // let us declare an array with all the three steps included in the above
        int [] marks2 = {1,2,3,4,5};
        System.out.println(marks2[2]);

        // Array indices starts from 0 to n-1 where n is the size of the array


    }
}
