import java.util.ArrayList;
import java.util.List;

public class Hand {
    private List<Card> hand;

    public Hand()
    {
        this.hand = new ArrayList<>();
    }

    public void startHand(Card card)
    {
        this.hand.add(card);
    }
    public void addCard(Card card)
    {
        this.hand.add(card);
    }

    public void clearHand()
    {
        this.hand.clear();
    }

    public ArrayList<String> getHand(){
        ArrayList<String> cardsInHand = new ArrayList<>();
        for(Card holder: this.hand)
        {
            cardsInHand.add(holder.getSuit() + " " + holder.getValueName());
        }
        return cardsInHand;
    }

    public Card getFirstCard(int index)
    {
        return this.hand.get(index);
    }

    public int handTotal(){
        int total = 0;
        for(Card holder: this.hand)
        {
            if(holder.getValueName().equals("Ace"))
            {
                total += 10;
            }

            total += holder.getValue();
        }
        for(Card holder: this.hand)
        {
            if(total > 21 && holder.getValueName().equals("Ace"))
            {
                total -= 10;
            }
        }


        return total;
    }
}
