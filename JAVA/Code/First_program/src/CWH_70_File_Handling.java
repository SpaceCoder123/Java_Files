import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;

public class CWH_70_File_Handling {
    public static void main(String[] args) {
        // this class in particular deals with reading and writing files in Java which is very important in any programming language

        // Generating a new file

//        File myFile = new File("created_file.txt"); // this just creates an object of a file
////        myFile.createNewFile(); // this method creates an object of the file
//        try{
//            myFile.createNewFile();
//        }
//        catch (IOException e){
//            System.out.println("Unable to create this file");
//            e.printStackTrace();
//        }
//
//        // code to write to a file
//
//
//        try{
//            FileWriter fileWriter = new FileWriter("created_file.txt");
//            fileWriter.write("this is the first file from this java course\n Okay now bye");
//            fileWriter.close(); // always close the file after executing all the commands
//        }
//        catch (IOException e){
//            System.out.println("Was not able to write a file");
//            e.printStackTrace();
//        }
//
//
//
//        // code to read a file
//
//
//
//        File myFile = new File("created_file.txt");
//
//        try {
//            Scanner sc = new Scanner(myFile); // this will read the file
//            while (sc.hasNextLine()){ // this will check if the file has some lines
//                String line = sc.nextLine(); // this will collect or the store the string in the form of lines
//                System.out.println(line); // print out the line string
//            }
//            sc.close(); // this will close the file
//        }
//        catch (FileNotFoundException x){
//            x.printStackTrace();
//        }
//
//
//        // code to delete a file
//
//
//
//        File myFile = new File("created_file.txt");
//        if (myFile.delete()){
//            System.out.println("I have deleted" + myFile.getName());
//        }
//        else{
//            System.out.println("Some error occurred while deleting the file");
//        }

    }
}
