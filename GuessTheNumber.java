import java.util.Random;
import java.util.Scanner;

class Game{
    int r ;
    int userInput;
    int guess = 0;
    int numberOfGuess = 1;

    public Game(){
        Random random = new Random();
        r = random.nextInt(100);
        System.out.println(r);
    }
    public void takeUserInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        userInput = sc.nextInt();
    }
    public void isCorrectNumber(){
        while (guess < 5){
            takeUserInput();
            if (r == userInput){
                System.out.println("Your guess is correct");
                System.out.println("You guessed the number in " + numberOfGuess + " attempts.");
                return;
            } else if (r < userInput) {
                System.out.println("You selected a bigger number think again and enter a smaller number");
                System.out.println( numberOfGuess + " attempt failed.");
            } else {
                System.out.println("You selected a smaller number think again and enter a bigger number");
                System.out.println( numberOfGuess + " attempt failed.");
            }
            guess++;
            numberOfGuess++;
        }
        System.out.println("You have reached to maximum limit of guessing the number");
    }
}
public class GuessTheNumber {
    public static void main(String[] args) {
//        Create a class Game, which allows a user to play "Guess the Number" game once.
//        Game should have the following methods:
//        Constructor to generate the random number
//        takeUserInput() to take a user input of number
//        isCorrectNumber() to detect whether the number entered by the user is true
//        getter and setter for noOfGuesses
//        Use properties such as noOfGuesses(int), etc to get this task done!
        Game game = new Game();
        game.isCorrectNumber();
    }
}