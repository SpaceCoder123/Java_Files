package Calculator.Basic_Arithmatic;

public class Basic_Arithmatic_Calc{
    public Double Addition(Double num1, Double num2){
        return num1+num2;
    }


    public Double Subtract(Double num1, Double num2){
        return num1-num2;
    }

    public Double Multiply(Double num1, Double num2){
        return num1*num2;
    }

    public Double Divide(Double num1, Double num2){
        return num1/num2;
    }

    public Double Squared(Double num){
        return num*num;
    }

    public Double Percentage(double total, double actual){
        return ((actual/total)*100);
    }

}
