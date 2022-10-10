
class MyThread7 extends Thread {
    public MyThread7(String name) {
        super(name);  // constructor obviously has no return type and therefore no return type can be mentioned for  the constructor
    }

    @Override // i am using the run command using override and therefore can be used to run the default class
    public void run() {
        int i = 0;
        while(i<100){
            System.out.println("Thank you! ");
            try{
                Thread.sleep(3000); // this will make the thread sleep for the defined  time given as an input argument
            }
            catch (Exception e){
                System.out.println(e);
                e.printStackTrace();
            }
            //System.out.println("I am thread " + this.getName() + " and I am not a threat"+i);
            i++;
        }
    }
}


class MyThread8 extends Thread {
    public MyThread8(String name) {
        super(name);  // constructor obviously has no return type and therefore no return type can be mentioned for  the constructor
    }

    @Override // i am using the run command using override and therefore can be used to run the default class
    public void run() {
        int i = 0;
        while (i < 100) {
            System.out.println("I am thread " + this.getName() + " and I am not a threat" + i);
            i++;
        }
    }
}





public class CWH_52_Java_Thread_Methods {
    public static void main(String[] args) {
        MyThread7 mth1 = new MyThread7("Mohan");
        MyThread8 mth2 = new MyThread8("Mohan_2");

        ;
        //        ------------------------------------------------Code--------------------------------------------------
//        mth1.start();
////        try{
////            mth1.join(); // this might throw some error or exception and therefore can be run using this command
////        }
////        catch(Exception e){
////            System.out.println(e);
////        }
//        mth2.start();
        //        ------------------------------------------------Code--------------------------------------------------



        //  this might throw an exception and therefore we can use a try except block

        // suppose you want to run one method completely then run the other method then use the join keyword
        //  note until mth1 has not been completed mth2 has not been started

        // note we can also make a thread to go to sleep mode and therefore make the other code run in the background



    }
}
