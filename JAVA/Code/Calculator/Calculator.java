//package Calculator.Simple;
import Calculator.Basic_Arithmatic.Basic_Arithmatic_Calc;
import java.util.Scanner;

public class Calculator{
    public static void main(String[] args){
        System.out.println("You are in simple calculator class");

        Basic_Arithmatic_Calc Base_Calc = new Basic_Arithmatic_Calc();


        System.out.println("Dear User, Please enter your name");
        Scanner firstname = new Scanner(System.in);
        String name = firstname.nextLine();        

        System.out.println("Please enter two numbers ");

        System.out.println("Please enter first number ");
        Scanner firstnum= new Scanner(System.in);
        double first = firstnum.nextDouble();        

        System.out.println("Please enter second number ");
        Scanner secondnum= new Scanner(System.in);
        double second = secondnum.nextDouble();  
        
        System.out.println("Please enter calc --help, if you want to know the documentation of the command");

        System.out.println("Please enter the operation you want to perform");
        Scanner Oper  = new Scanner(System.in);
        String Operation = Oper.nextLine();
        
        switch (Operation) {
            case "+":
                System.out.println("You have chosen addition operation and therefore the sum of "+first+" and "+second +" is =  "+Base_Calc.Addition(first, second));
                break;
            case "-":
                System.out.println("You have chosen addition operation and therefore the sum of "+first+" and "+second +" is =  "+Base_Calc.Subtract(first, second));
                break;
            case "*":
                System.out.println("You have chosen addition operation and therefore the sum of "+first+" and "+second +" is =  "+Base_Calc.Multiply(first, second));
                break;
            case "/":
                System.out.println("You have chosen addition operation and therefore the sum of "+first+" and "+second +" is =  "+Base_Calc.Divide(first, second));
                break;
            default:
                System.out.println("Operation not found!");
                break;
        }
    }
}


