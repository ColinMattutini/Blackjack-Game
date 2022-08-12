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

//Check the "start hand" class. On second round, hand is being created, but not filled. Still able to
//hit which means the hand should be working fine