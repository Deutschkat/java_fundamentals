package labs_examples.objects_classes_methods.labs.oop.C_blackjack.BlackjackPackage;

import java.util.ArrayList;
import java.util.Arrays;

public class Deck {

    // Holds Deck Data

    Card[] cards = new Card[52];
    ArrayList<Integer> usedCards;
    char[] suit = new char[]{'♠', '♦', '♥', '♣'};
    int[] values = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11};

    //Constructor

    public Deck(){
    }

    public Deck(Card[] cards, ArrayList<Integer> usedCards, char[] suit) {
        this.cards = cards;
        this.usedCards = usedCards;
        this.suit = suit;
    }

    // Method that will populate Card[] with 52 unique card objects.

    public void populate() {
            for(int j = 0; j < suit.length; j++){
                for(int v = 0; v < values.length; v++){
                    Card card1 = new Card(values[v], suit[j]);
                    System.out.println(card1);
                }
            }
        }

    public void deal(Player player){

        // Generating random number between 1 & 52
        // Get value from cards array
        // Take that card and add it to players.hand (in hand) *Finished*

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
