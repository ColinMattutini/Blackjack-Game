public class Card {
    private char suit;
    private int value;

    //Creates a new card that iterates through 1-13 for each suit to create
    //a 52-card deck
    public Card(char newSuit, int newValue){
        if(newSuit != 'H' && newSuit != 'C' && newSuit != 'S' && newSuit != 'D')
        {
            System.out.println("Incorrect suit type.");
        }
        else
        {
            this.suit = newSuit;
        }
        if(newValue < 1 || newValue > 13)
        {
            System.out.println("Incorrect value");
        }else
        {
            this.value = newValue;
        }
    }

    //Method to return what the suit for the card is

    public String getSuit() {
        String suit = "";

        if(this.suit == 'H')
        {
            suit = "Hearts";
        }
        if(this.suit == 'C')
        {
            suit = "Clubs";
        }
        if(this.suit == 'D')
        {
            suit = "Diamonds";
        }
        if(this.suit == 'S')
        {
            suit = "Spades";
        }
        return suit;
    }

    //Returns the card value
    //If the value is >10 (Jack, Queen, King) the value becomes 10
    public int getValue() {
        if (this.value > 10) {
            return 10;
        }
        return this.value;
    }

    //Returns the value name
    public String getValueName() {
        String name = "";
        if (this.value == 1) {
            name = "Ace";
        }
            if (this.value == 2) {
                name = "Two";
            }
            if (this.value == 3) {
                name = "Three";
            }
            if (this.value == 4) {
                name = "Four";
            }
            if (this.value == 5) {
                name = "Five";
            }
            if (this.value == 6) {
                name = "Six";
            }
            if (this.value == 7) {
                name = "Seven";
            }
            if (this.value == 8) {
                name = "Eight";
            }
            if (this.value == 9) {
                name = "Nine";
            }
            if (this.value == 10) {
                name = "Ten";
            }
            if (this.value == 11) {
                name = "Jack";
            }
            if (this.value == 12) {
                name = "Queen";
            }
            if (this.value == 13) {
                name = "King";
            }
        return name;
        }



}
