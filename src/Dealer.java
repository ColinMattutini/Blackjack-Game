public class Dealer {
    private String name;
    private Hand hand;
    private int cardCount;


    public Dealer(String name){
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

    public void firstCard(){
        System.out.println(hand.getFirstCard(0).getValueName() + " of " + hand.getFirstCard(0).getSuit());
    }

    public boolean hitOrStand(){
        if(this.handTotal() <= 16){
            return true;
        }
        return false;
    }

    public boolean dealerBust(){
        if(this.handTotal() > 21){
            return true;
        }
        return false;
    }

}