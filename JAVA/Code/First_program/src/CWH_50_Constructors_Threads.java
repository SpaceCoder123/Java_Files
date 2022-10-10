class MyThread4 extends Thread{
    public MyThread4(String name){
        // this constructor is mainly used to name the constructor for documentation and segregation purposes
        super(name);
    }
    public void run(){
        int i = 0;
        while (i<10){
            System.out.println("I am a thread");
            i++;
        }
    }

}


public class CWH_50_Constructors_Threads {
    public static void main(String[] args) {
        MyThread4 th4 = new MyThread4("Mohan");
        MyThread4 th5 = new MyThread4("Pavan");
        th4.start();
        th5.start();

        System.out.println("The Name of the thread is t is "+th4.getName());
        System.out.println("The ID of the thread is t is "+th4.getId());
        System.out.println("The Name of the thread is t is "+th5.getName());
        System.out.println("The ID of the thread is t is "+th5.getId());

    }
}
