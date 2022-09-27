import javax.sound.midi.Soundbank;
import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class CWH_EX1 {
    // this class calculates the percentage marks for cbse exams

    public static void main(String args[]){

        System.out.println("Please enter the total marks to be awarded");
        Scanner Total = new Scanner(System.in);
        int Total_marks = Total.nextInt();
        Scanner Sankrit = new Scanner(System.in);
        System.out.println("Please enter your First language marks");
        float marks1 = Sankrit.nextFloat();
        Scanner English = new Scanner(System.in);
        System.out.println("Please enter your Second language marks");
        float marks2 = English.nextFloat();
        Scanner Kannada = new Scanner(System.in);
        System.out.println("Please enter your Third language marks");
        float marks3= Kannada.nextFloat();
        Scanner Mathematics = new Scanner(System.in);
        System.out.println("Please enter your Mathematics marks");
        float marks4 = Mathematics.nextFloat();
        Scanner Social = new Scanner(System.in);
        System.out.println("Please enter your Social marks");
        float marks5 = Social.nextFloat();
        Scanner Science = new Scanner(System.in);
        System.out.println("Please enter your Science marks");
        float marks6 = Science.nextFloat();


        System.out.println("------------------------------------------");

        System.out.println("Calculating the total percentage");

        float total_Sum = marks1+marks2+marks3+marks4+marks5+marks6;
        float percentage = total_Sum / Total_marks ;
        System.out.println("The total percentage marks obtained by the student is= "+percentage * 100+" %");
        //System.out.println(percentage);
        System.out.println("Congratulations!!! ");


        //Future works
        // Add if else cases for marks that are greater than 100 and string cases must be avoided
        // Add a ranking sheet and based on the marks the student gets
        // Create a class that creates the student class and store the data in a database or a dictionary
    }
}
