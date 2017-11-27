
import java.util.Scanner;
public class RPSGame implements Game
{
    Scanner scan = new Scanner(System.in);
    //Determine the constructor
    private int score;
    private int playerNum;
    /**
     * 1 is p1 win
     * -1 is p2 win
     * 0 is a tie
     */
    public int win(Player p1, Player p2) {
        return 0;
    }
    
    public boolean end() {
        return false;
    }
    
    public void updateScore(Player p) {
        score++;
    }
    
    public int howManyPlayers() {
        System.out.println("How many players? ");
        playerNum = scan.nextInt();
        
    }
    
}
