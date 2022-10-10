// this class mainly deals with java priorities and which thread has to be executed
class MyThread6 extends Thread{
    public MyThread6(String name){
        super(name);  // constructor obviously has no return type and therefore no return type can be mentioned for  the constructor
    }
    @Override // i am using the run command using override and therefore can be used to run the default class
    public void run(){
        System.out.println("I am thread "+this.getName()+" and I am not a threat");
    }

    // in this above class, the code inside the run command will run the code and the constructor sets the name of the constructor
}


public class CWH_51_Java_Thread_Priorities {
    public static void main(String[] args) {
        // I have created 5 threads and have assigned distinctive names to each of the threads
        MyThread6 Thr = new MyThread6("Mohan (Least important! priority 5)");
        MyThread6 Thr2 = new MyThread6("Ramesh (Not mandatory, priority 4)");
        MyThread6 Thr3 = new MyThread6("Mukesh (Mandatory, priority 2)");
        MyThread6 Thr4 = new MyThread6("Puneet (Mandatory, priority 3)");
        MyThread6 Thr5 = new MyThread6("Raghav (Most important! priority 1)"); // suppose i want to run in this order

        // in order to give priority to particular threads we have to use the priorities in Java and that can be given by

        Thr.setPriority(Thr.MIN_PRIORITY);
        Thr2.setPriority(Thr2.NORM_PRIORITY);
        Thr3.setPriority(Thr3.MAX_PRIORITY);
        Thr4.setPriority(Thr4.MAX_PRIORITY);
        Thr5.setPriority(Thr5.MAX_PRIORITY);


        Thr.start(); //  this will execute the code inside run of the particular class and therefore will exit the output
        Thr2.start();
        Thr3.start();
        Thr4.start();
        Thr5.start();

        // if executed without setting the priorities then note the output is in random fashion
        // else the output fashion will be according to the priorities set as per the number

    }
}
