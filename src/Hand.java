import java.util.ArrayList;
import java.util.List;

public class Hand {
    private List<Card> hand = new ArrayList<>();

    public void startHand(Card card){
        hand.add(card);
    }
    public void addCard(Card card){
        hand.add(card);
    }

    public ArrayList<String> getHand(){
        ArrayList<String> cardsInHand = new ArrayList<>();
        for(Card holder: this.hand){
            cardsInHand.add(holder.getSuit() + " " + holder.getValueName());
        }
        return cardsInHand;
    }

    public Card getFirstCard(int index){
        return hand.get(index);
    }

    public int handTotal(){
        int total = 0;
        for(Card holder: this.hand){
            total += holder.getValue();
        }
        return total;
    }
}
