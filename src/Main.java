import java.util.*;

public class Main {
    public static void main(String[] args) {
       BlackJackMainGame play = new BlackJackMainGame();
       Player player = new Player("Player");
       play.startMessage();
       do {
           play.start(player);
       }while(play.playAgain(player) == true);
    }
}
