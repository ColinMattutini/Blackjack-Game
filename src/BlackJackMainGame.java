import java.util.Scanner;

public class BlackJackMainGame {
    private Deck deck;
    Scanner scanner = new Scanner(System.in);

    public void start(){
        //Creates a new deck
        deck = new Deck();
        int i = 0;

        //Currently hardcoded player and dealer names
        //Implement a way to add in more players (up to six)
        System.out.println("Welcome to blackjack!");
        Player player = new Player("Colin");
        Dealer dealer = new Dealer("The Banker");

        //Shuffles deck to randomize order of cards
        deck.shuffleDeck();
        while(true) {
            //Starts player and dealer off with 2 cards. Calls get card twice.
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
            //Prints out the dealers first card to show the player what they have.
            System.out.println("The dealer shows: ");
            dealer.firstCard();

            System.out.println();

            //Prints out player hand
            System.out.println(player + " which is a total of: " + player.handTotal());
            System.out.println("Enter Hit or Stand");

            //Waits for player entry on what to do.
            String decision = scanner.nextLine();

            //Inputting "Hit" causes the player to get a card. If that is over 21, they lose and
            //the loop breaks
            if(decision.equals("Hit")) {
                player.hit(deck.getCard(i));
                i++;
                if(player.playerBust() == true){
                    System.out.println("Bust. Over 21.");
                    break;
                }
            }

            //Dealer calls boolean to see if they have to hit. 17 and higher they stay
            //Also shows the dealer's entire hand
            if(decision.equals("Stand")){
                while(dealer.hitOrStand() == true){
                    dealer.hit(deck.getCard(i));
                    System.out.println("The dealer has: " + dealer + "for a total of: " + dealer.handTotal());
                }
                break;
            }

            //Quit breaks the loop
            //Known bug... can hit and then quit out.
            if(decision.equals("Quit")) {
                break;
            }
        }

        //Logic to know if the player wins or not
        if((player.handTotal() > dealer.handTotal() && player.playerBust() == false) || dealer.dealerBust() == true){
            System.out.println("You win!");
        }
        else{System.out.println("You Lose!");}
        System.out.println(player);
        System.out.println(player.handTotal());
        System.out.println(i);
    }

}
