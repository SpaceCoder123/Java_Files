public class CWH_24_For_Each_Loop {
    public static void main(String[] args) {
        // this class deals with array operation and array features
        int [] marks2 = {1,2,3,4,5};
        // System.out.println(marks2.length);
        // this returns the length of the array

        float [] marks = new float[6];
        marks[0] = 0.01f;
        marks[1] = 0.03f;
        marks[2] = 0.02f;
        marks[3] = 0.04f;
        marks[4] = 0.05f;
        marks[5] = 0.08f;
        float [] marks_2 = {1.1f,2.2f,3.2f,4.4f,5.4f};
        // creating of floating point array

        // System.out.println(marks_2[2]);


        // Displaying the array using a loop
//        for (int i = 0; i < marks.length; i++){
//            System.out.println(marks[i]);
//        }
        // print the array in reverse
//        for (int i = marks2.length-1; i > 0 ;i--){
//            // System.out.println(marks_2[i]);
//        }
        //
        for (int element : marks2){
            System.out.println(element);
        }




    }
}
