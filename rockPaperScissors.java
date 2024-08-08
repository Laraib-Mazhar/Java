import java.util.Random;
import java.util.Scanner;

public class rockPaperScissors {
    public static void main(String[] args) {
        Random r = new Random();
        int number = r.nextInt(3);
        String computer = "";
        switch (number){
            case 0 -> {
                System.out.println("Computer selected rock");
                computer = "rock";
            }
            case 1 -> {
                System.out.println("Computer selected paper");
                computer = "paper";
            }
            case 2 -> {
                System.out.println("Computer selected scissors");
                computer = "scissors";
            }
        }

        System.out.println("Enter 0 for rock " +
                "1 for paper " +
                "2 for scissors");

        Scanner sc = new Scanner(System.in);
        int player = sc.nextInt();
        String playerChoice;
        if(player == 0){
            playerChoice = "rock";
        }
        else if(player == 1){
            playerChoice = "paper";
        }
        else{
            playerChoice = "scissors";
        }
//        System.out.println(playerChoice);

        if(computer == playerChoice){
            System.out.println("it is a tie");
        }
        else if (computer.equals("paper") && playerChoice.equals("rock")){
            System.out.println("Computer wins");
        }
        else if (computer.equals("rock") && playerChoice.equals("paper")){
            System.out.println("You wins");
        }
        else if (computer.equals("scissors") && playerChoice.equals("paper")){
            System.out.println("Computer wins");
        }
        else if (computer.equals("paper") && playerChoice.equals("scissors")){
            System.out.println("You wins");
        }
        else if (computer.equals("rock") && playerChoice.equals("scissors")){
            System.out.println("Computer wins");
        }
        else if (computer.equals("scissors") && playerChoice.equals("rock")){
            System.out.println("You wins");
        }
    }
}
