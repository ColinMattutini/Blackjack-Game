import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private Hand hand;
    private int cardCount;


    public Player(String name){
        this.name = name;
        this.hand = new Hand();
        this.cardCount = 0;
    }

    public void hit(Card card){
        this.hand.addCard(card);
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
        if(this.handTotal() > 22){
            return true;
        }
        return false;
    }

}
