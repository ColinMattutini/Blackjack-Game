import java.util.Scanner;

public class BlackJackMainGame {
    private Deck deck;
    Scanner scanner = new Scanner(System.in);

    public void start(){
        deck = new Deck();
        int i = 0;

        System.out.println("Welcome to blackjack!");
        Player player = new Player("Colin");
        Dealer dealer = new Dealer("The Banker");
        deck.shuffleDeck();
        while(true) {
            if(player.totalCards() < 2) {
                player.startHand(deck.getCard(i));
                i++;
                player.startHand(deck.getCard(i));
                i++;
            }
            if(dealer.totalCards() < 2){
                dealer.startHand(deck.getCard(i));
                i++;
                dealer.startHand(deck.getCard(i));
                i++;
            }
            System.out.println("The dealer shows: ");
            dealer.firstCard();
            System.out.println();
            System.out.println(player + " which is a total of: " + player.handTotal());
            System.out.println("Enter Hit or Stand");
            String decision = scanner.nextLine();
            if(decision.equals("Hit")) {
                player.hit(deck.getCard(i));
                i++;
                if(player.playerBust() == true){
                    System.out.println("Bust. Over 21.");
                    break;
                }
            }
            if(decision.equals("Stand")){
                while(dealer.hitOrStand() == true){
                    dealer.hit(deck.getCard(i));
                    System.out.println("The dealer has: " + dealer + "for a total of: " + dealer.handTotal());
                }
                break;
            }
            if(decision.equals("Quit")) {
                break;
            }
        }

        if((player.handTotal() > dealer.handTotal() && player.playerBust() == false) || dealer.dealerBust() == true){
            System.out.println("You win!");
        }
        else{System.out.println("You Lose!");}
        System.out.println(player);
        System.out.println(player.handTotal());
        System.out.println(i);
    }

}
