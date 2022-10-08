package codeWithMohan;
public class Mohan{
    public static void main(String[] args){
        System.out.println("Hello this code is executed using VS code");

        int var = 1000;

        boolean output = ( var < 10000) ? true : false ; // short hand for if else in java
        // datatype variable = (condition) ? output (if condition is true) : output (if condition is false);
        System.out.println(output);

    }
}

// javac -d *.java will create a seperate package or a folder and put the .class files in the main source code folder