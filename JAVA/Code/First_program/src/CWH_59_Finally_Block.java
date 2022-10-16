public class CWH_59_Finally_Block {
    public static void main(String[] args) {
        try {

            int a = 4;
            int b = 0;
            int c = a / b;
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("This is the end of program");
            // basically this will be executed if the program lands in try and catch, the value is given out
        }
    }
}
