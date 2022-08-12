import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private Hand hand;
    private int cardCount;
    private int chipsTotal;


    public Player(String name){
        this.name = name;
        this.cardCount = 0;
        this.chipsTotal = 500;
    }

    public void hit(Card card)
    {
        this.hand.addCard(card);
    }

    public void setHand()
    {
        this.hand = new Hand();
        this.cardCount = 0;
    }

    public Hand getHand()
    {
        return this.hand;
    }

    public void startHand(Card card){
        this.cardCount = 0;
        this.hand.startHand(card);
        this.cardCount = 2;
    }

    public String toString(){
        return hand.getHand().toString();
    }

    public int handTotal(){
        return hand.handTotal();
    }

    public int totalCards(){
        return this.cardCount;
    }

    public boolean playerBust(){
        if(this.handTotal() > 21){
            return true;
        }
        return false;
    }

    public int getChipsTotal(){
        return this.chipsTotal;
    }

    public void setChipsTotal(int chipsTotal){
        this.chipsTotal = chipsTotal;
    }

    public int playerBet(int bet){
        if(this.chipsTotal - bet < 0){
            throw new IllegalArgumentException("You don't have enough money!");
        }
        this.chipsTotal -= bet;
        return this.chipsTotal;

    }

    public int startBet(){
        return this.chipsTotal -= 25;
    }

    public void playerWin(int winnings){
        this.chipsTotal += (winnings * 2);
    }

    public void playerPush(int winnings)
    {
        this.chipsTotal += winnings;
    }



}
