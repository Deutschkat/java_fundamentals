package labs_examples.objects_classes_methods.labs.oop.C_blackjack.BlackjackPackage;

import java.util.ArrayList;
import java.util.Arrays;

public class Deck {

    // Holds Deck Data

    Card[] cards;
    ArrayList<Integer> usedCards;
    char[] suit = new char[]{'♠', '♦', '♥', '♣'};

    //Constructor

    public Deck(Card[] cards, ArrayList<Integer> usedCards, char[] suit) {
        this.cards = cards;
        this.usedCards = usedCards;
        this.suit = suit;
    }

    //Getter and Setters


    public Card[] getCards() {
        return cards;
    }

    public void setCards(Card[] cards) {
        this.cards = cards;
    }

    public ArrayList<Integer> getUsedCards() {
        return usedCards;
    }

    public void setUsedCards(ArrayList<Integer> usedCards) {
        this.usedCards = usedCards;
    }

    public char[] getSuit() {
        return suit;
    }

    public void setSuit(char[] suit) {
        this.suit = suit;
    }

    //To String (if needed)
    @Override
    public String toString() {
        return "Deck{" +
                "cards=" + Arrays.toString(cards) +
                ", usedCards=" + usedCards +
                ", suit=" + Arrays.toString(suit) +
                '}';
    }
}
