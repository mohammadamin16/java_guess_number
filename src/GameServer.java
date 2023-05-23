import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class GameServer {
    static ArrayList<Player> players = new ArrayList<>();
    static ArrayList<Game> games = new ArrayList<>();


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            printmenu();
            String answer = input.next();
            switch (answer) {
                case "A":
                    System.out.println("1) new player");
                    System.out.println("2) old player");
                    int javab = input.nextInt();
                    switch (javab) {
                        case 1:
                            String playerID = createId();
                                System.out.println("Player's id is:");
                                System.out.println(playerID);
                            Player p = new Player(playerID);
                            Game g = new Game();
                            int attempt = g.startGame(playerID);
                            p.setGameHistory(g);

                        case 2:

                            String oldPlayerID = input.nextLine();
                            Player oldPlayer = null;
                            while (!Objects.isNull(oldPlayer)) {
                                System.out.println("Insert the player id: ");
                                for (Player player : players) {
                                    if (Objects.equals(player.getID(), oldPlayerID)) {
                                        oldPlayer = player;
                                    }
                                }
                            }
                            Game newGame = new Game();
                            int attempts = newGame.startGame(oldPlayerID);
                            oldPlayer.setGameHistory(newGame);
                    }


            }

        }
    }


    public static void printmenu() {
        System.out.println("please enter your desired option:");
        System.out.println("A)Start game");
        System.out.println("B)View all games");
        System.out.println("C)View all games of a player");
        System.out.println("D)View the best player");
        System.out.println("E)View the longest game");

    }

    public static String createId() {
        while (true) {
            Random random = new Random();
            int b = 0;
            String playerID = Integer.toString(random.nextInt(5000));


            return playerID;
        }
    }
}