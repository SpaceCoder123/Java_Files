import java.util.Scanner;
import java.util.Random;

class GuessTheNumber{
    private int num;
    int Guesses = 1;
    private int target_number = 0;
    int total_chances =3;

    public void setNumber(){
        System.out.println("Please guess a number ");
        Scanner number = new Scanner(System.in);
        int number1 = number.nextInt();
        num = number1;
    }

    public GuessTheNumber(){
        Random target = new Random();
        int target_num = target.nextInt(0,4);
        this.target_number = target_num;
    }

    public int getNumber(){
        return this.num;
    }

    public int getGuesses(){
        return Guesses;
    }

    public boolean ifCorrect() {
        if (this.num == this.target_number) {
            return true;
        } else { // main logic
            return false;
        }
    }
    public int getTarget_number(){
        return this.target_number;
    }
    public boolean game_Status(){
        if (this.Guesses < this.total_chances){
            if (this.ifCorrect()){
                System.out.println("You still had "+(this.total_chances-this.getGuesses())+" chances and you won the game");
                return true;
            }
            System.out.println("You still have "+(this.total_chances-this.getGuesses())+" chances ");
            this.Guesses += 1;
            return true;
        }
        else {
            System.out.println("No. of chances have expired since you have tried multiple attempts ");
            System.out.println("The target number was "+this.target_number);
            return false;
        }

    }
    public int getTarget(){
        return this.target_number;
    }

}


public class CWH_35_Guess_The_Number {
//    Create a class Game, which allows a user to play "Guess the Number" game once.
//
//    Game should have the following methods:
//    Constructor to generate the random number
//    takeUserInput() to take a user input of number
//    isCorrectNumber() to detect whether the number entered by the user is true
//    getter and setter for noOfGuesses
//    Use properties such as noOfGuesses(int), etc to get this task done!



    public static void main(String[] args) {

        System.out.println("Hello! Dear user, ");
        System.out.println("-------------------------------------------------");
        System.out.println("Welcome to number guesser ");



        GuessTheNumber Game1 = new GuessTheNumber(); // this session is captured and the value should not be changed
        boolean output =false;

        while (!output) {
            Game1.setNumber();
            output = Game1.ifCorrect();
            if (!Game1.game_Status()){
                break;
            }
        }
    }
}
