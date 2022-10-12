// 1. Write a program to print "Good morning" and "Welcome" continuously on the screen in Java using thread

class Thread_GM extends Thread{
    public void run(){
        int i = 0;
        while(i<100) {
            System.out.println("Good Morning,Priority 4");
            i++;
        }
    }
}
class Thread_WC extends Thread{
    public void run(){
        int i = 0;
        while(i<100) {
            System.out.println("Welcome, Priority 3");
            i++;
        }
    }
}
// 2. Add a step method in the welcome thread of question 1 to delay its execution for 200ms.
class Thread_GMD extends Thread{
    public void run(){
        int i = 0;
        while(i<100) {
            System.out.println("Welcome_Delayed, Priority 1");
//            try {
//                Thread_GMD.sleep(300);
//            } catch (Exception e) {
//                System.out.println(e);
//                e.printStackTrace();
//            }
            i++;
        }
    }
}

// 3. Demonstrate gerPriority() and setPriority() methods in Java threads.




public class CWH_53_Practice_Questions {
    public static void main(String[] args) {
        Thread_GM mythread = new Thread_GM();
        Thread_GMD mythread2 = new Thread_GMD();

        Thread_WC mythread1 = new Thread_WC();
//        mythread.start();
//        mythread1.start();
//        mythread2.start();
//        System.out.println(mythread.getState());
        mythread.setPriority(1);
        mythread1.setPriority(3);
        mythread2.setPriority(4);
        System.out.println(Thread.currentThread().getState());




        // get state is a method in which we can get the state of a thread
        // you print out the value of getstate()     without running then it returns new
        // if you print out the value of getstate() after  starting it gives out runnable
        // if you want to get the reference of current thread in java then use this command

//
//        System.out.println(mythread.getPriority());
//        System.out.println(mythread1.getPriority());
//        System.out.println(mythread2.getPriority());




    }
}
