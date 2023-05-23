import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Game {
    private int gameID;
    private String playerID;
    private int targetNumber;
    private ArrayList<Integer> playerGuesses = new ArrayList<Integer>();
    private int attempt;
    static int numberOfGames = 1 ;



    public Game(){
        this.gameID = numberOfGames;
        numberOfGames++; }

    public int startGame(String playerID) {
        this.playerID = playerID;
        System.out.println("Welcome");
        Random random = new Random();
        targetNumber = random.nextInt(1000);
        int guess;


        while(true){
            System.out.println("Enter your guess between 0 and 999:");
            Scanner input = new Scanner(System.in);
            guess = input.nextInt();
            attempt++;
            playerGuesses.add(guess);
            if (guess == targetNumber) {
                System.out.println("you wooon!");
                return attempt;
            }
            else if (guess > targetNumber){
                System.out.println("Smaller!");
            }
            else {
                System.out.println("Bigger!");
            }
        }
    }

}