import java.util.Scanner;

public class CWH_56_Nested_Try_Catch {
    public static void main(String[] args) {
        // this class particularly deals with Nested Try catch and its particular applications

        int [] marks2= new int[3];
        marks2[0] = 0;
        marks2[1] = 24;
        marks2[2] = 21;
        try{
            System.out.println("Welcome ");
            Scanner Sc = new Scanner(System.in);
            System.out.println("Enter an array index ");
            int index = Sc.nextInt();
            try{
                System.out.println(marks2[index]);
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("This array index does not exist");
                System.out.println(e);
            }
        }
        catch(Exception e){
            System.out.println("Exception Level 1");
        }
    }
}
