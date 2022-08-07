import java.util.*;
import java.util.random.*;

public class Deck {


    //Card[] deck = new Card[52];

    List<Card> deck;



    public Deck(){
        //deck = new ArrayList<>();
        int deckCreator = 0;
        this.deck = new ArrayList<>();

        for(int i = 1; i <= 13; i ++){
            deck.add(new Card('H', i));
        }
        for(int i = 1; i <= 13; i++){
            deck.add(new Card('C', i));
        }
        for(int i = 1; i <= 13; i++){
            deck.add(new Card('S', i));
        }
        for(int i = 1; i <= 13; i++){
            deck.add(new Card('D', i));
        }
    }

    public void printDeck(){
        for(Card cards: deck){
            System.out.println(cards.getSuit() + " " + cards.getValueName());
        }
    }

    public void shuffleDeck(){
        Collections.shuffle(deck);
    }

    public Card getCard(int cardIndex){
        return deck.get(cardIndex);
    }



}


