
class MyThread_Runnable1 implements  Runnable{
    public void run(){
        System.out.println("I am a thread1 not a threat");
        System.out.println("I am a thread1 not a threat");
        System.out.println("I am a thread1 not a threat");
        System.out.println("I am a thread1 not a threat");
        System.out.println("I am a thread1 not a threat");
        System.out.println("I am a thread1 not a threat");
        System.out.println("I am a thread1 not a threat");
        System.out.println("I am a thread1 not a threat");
        System.out.println("I am a thread1 not a threat");
        System.out.println("I am a thread1 not a threat");

    }
}
class MyThread_Runnable2 implements  Runnable{
    public void run(){
        System.out.println("I am a thread2 not a threat");
        System.out.println("I am a thread2 not a threat");
        System.out.println("I am a thread2 not a threat");
        System.out.println("I am a thread2 not a threat");
        System.out.println("I am a thread2 not a threat");
        System.out.println("I am a thread2 not a threat");
        System.out.println("I am a thread2 not a threat");
        System.out.println("I am a thread2 not a threat");
        System.out.println("I am a thread2 not a threat");
        System.out.println("I am a thread2 not a threat");
        System.out.println("I am a thread2 not a threat");

    }
}


public class CWH_49_Multithreading_Runnable_Interface {
    // this class particularly deals with multithreading with a runnable interface
    public static void main(String[] args) {
        MyThread_Runnable1 bullet1 = new  MyThread_Runnable1();
        Thread gun1 = new Thread(bullet1); // this gives an interface for the thread to run
        gun1.setName("Mohan_1");
        System.out.println(gun1.getName());



        MyThread_Runnable2 bullet2 = new  MyThread_Runnable2();
        Thread gun2 = new Thread(bullet2);
        gun2.setName("Mohan_2");
        System.out.println(gun2.getName());

        // gun is the interface which provides to the bullet and bullet is a thread

//        gun1.start();
//        gun2.start();

        //note the changes in the output since there is an oscillation in the output frequency and changes in thread 1 and thread 2

    }
}
