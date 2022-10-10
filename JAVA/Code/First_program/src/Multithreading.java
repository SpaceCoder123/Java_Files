class MyThread1 extends Thread{
    @Override
    public void run(){
        int iter = 0;
        while(iter < 4000){
            System.out.println("My cooking thread 1 is running");
            System.out.println(" I am happy");
            iter+=1;
        }
    }
}

class MyThread2 extends Thread{
    @Override
    public void run(){
        int iter = 0;
        while(iter<40000){
            System.out.println("My chatting thread 2 is running");
            System.out.println(" I am sad");
            iter+=1;
        }
    }
}



public class Multithreading {
    public static void main(String[] args) {
        // this class and program deals with multithreading and multiprocessing using java
        // the above both are used to achieve multitasking

        // there are two ways to create a thread in java
        // 1 By extending the thread class
        // 2 By implementing the runnable interface

        // Concurrency vs Parallelism
        // Concurrency is the illusion of running things in parallel, a cpu cannot run things in parallel or 2 things at a time
        // so it solves one thing upto certain percent and attends the other thing for some time and finishes it completely together
        // therefore giving an illusion of running things together

        // Parallelism is one of the method which uses multiple threads at a particular time and therefore using multiple threads to
        // complete multiple tasks

        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start(); // this is a method to run the thread
        t2.start();

        // Note in the output the value keeps on changing after some iterations and therefore the value keeps on printing alternatively
        // it is giving certain amount of time to run the first command after some time the thread changes and runs for some and finishes executing

        // both the runs are executed using the same thread and therefore the execution time is higher when compared to a single thread running system
    }
}
