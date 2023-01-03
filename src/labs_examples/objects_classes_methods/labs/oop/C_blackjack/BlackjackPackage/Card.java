package labs_examples.objects_classes_methods.labs.oop.C_blackjack.BlackjackPackage;

public class Card {

    // Holds Card Data

    int cardValue;
    char suit;

    //Constructor
    public Card(int cardValue, char suit) {
        this.cardValue = cardValue;
        this.suit = suit;
    }

    //Getter and Setter
    public int getCardValue() {
        return cardValue;
    }

    public void setCardValue(int cardValue) {
        this.cardValue = cardValue;
    }

    public char getSuit() {
        return suit;
    }

    public void setSuit(char suit) {
        this.suit = suit;
    }

    // Right or wrong?




    @Override
    public String toString() {
        return "Card{" +
                "cardValue=" + cardValue +
                ", suit=" + suit +
                '}';
    }
}
