import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


class MyDepricated{
    @Deprecated
    void meth1(){
        System.out.println("Hello this is meth1");
    };
}

interface sampleInterface{
    void display();
}

public class CWH_71_Exercises {
    public static void main(String[] args) {
        // 1. Create a class and a method with deprecated annotation. What is its effect on program execution?
        MyDepricated myClass = new MyDepricated();
        myClass.meth1(); // there is no effect on the program execution

        // 2 Create an interface and generate an instance from it.

        sampleInterface mySample = new sampleInterface() {
            @Override
            public void display() {
                System.out.println("Hello world, this is an anonymous class ");
            }
        };

        sampleInterface I = ()-> System.out.println("THIS IS DISPLAY INSTANCE ");
        mySample.display();
        I.display();


//      3.  Write a Java program to generate a multiplication table of a given number and write it to a file


        String file_name;
        System.out.println("Enter the number you want a table of: ");
        Scanner table = new Scanner(System.in);
        int table_num = table.nextInt();


        file_name = "table"+table_num+".txt";
        String fileWriteLine;
        try{
            FileWriter newFile = new FileWriter(file_name);
            for (int i = 1; i <= 10; i++) {
                fileWriteLine = table_num + " x " + i + " = " + (i * table_num)+"\n";
                newFile.write(fileWriteLine);
            }
            newFile.close();
        }
        catch (IOException x){
            x.printStackTrace();
        }
    }
}
