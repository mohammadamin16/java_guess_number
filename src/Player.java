import java.util.ArrayList;

public class Player {
    private String playerID;
    private int numberOfplayedGames;
    private int bestScore;
    private ArrayList<Game> gameHistory = new ArrayList<>();
    private static int numberOfplayers;


    public String getID() {
        return playerID;
    }

    public Player (String playerID){
        this.playerID = playerID;
    }

    public int getBestScore(){
        return bestScore;
    }

    public ArrayList<Game> getGameHistory(){
        return gameHistory;
    }


    public void setGameHistory(Game a)
    {
        this.gameHistory.add(a);
    }






}