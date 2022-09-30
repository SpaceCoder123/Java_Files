public class CWH_25_Multidimensional_Array {
    public static void main(String[] args) {
        // this class particularly deals with multidimensional arrays

        // lets create a multidimensional array

        int [][] flats = new int[2][3]; // 2 rows and 3 columns
        // adding the elements
        flats[0][1] = 1;
        flats[0][2] = 3;
        flats[0][0] = 0;
        flats[1][1] = 1;
        flats[1][2] = 3;
        flats[1][0] = 0;

        for(int i = 0; i<flats.length; i++){
            for(int j = 0; j <flats[i].length; j++){
                System.out.println(flats[i][j]);
            }
        }
    }
}
