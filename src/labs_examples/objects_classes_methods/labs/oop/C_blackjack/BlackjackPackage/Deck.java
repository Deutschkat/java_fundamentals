package labs_examples.objects_classes_methods.labs.oop.C_blackjack.BlackjackPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Deck {

    // Holds Deck Data

    Card[] deckOfCards = new Card[52]; //Changed this to deckOfCards because it is a deck.. is that ok?
    ArrayList<Integer> usedCards;
    char[] suit = new char[]{'♠', '♦', '♥', '♣'};
    int[] values = new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11};


    //Constructor

    public Deck(){
    }

    public Deck(Card[] deckOfCards, ArrayList<Integer> usedCards, char[] suit, int[] values) {
        this.deckOfCards = deckOfCards;
        this.usedCards = usedCards;
        this.suit = suit;
        this.values = values;
    }

    // Method that will populate Card[] with 52 unique card objects.

    public void populate() {
        int counter = 0;

            for(int j = 0; j < suit.length; j++){
                for(int v = 0; v < values.length; v++){
                    Card card1 = new Card(values[v], suit[j]);

                    deckOfCards[counter++] = card1;
                    System.out.println(card1);
                }
            }
        }

        //
    public int generateRandomNum(){
        return (int)(Math.random()*deckOfCards.length-1);
        //check randomNum in arraylist used cards
        //if yes, generate different number
        //if else loop
    }


    public void deal(Player myPlayer, int randomNum){
        System.out.println(randomNum);

        Card randomCard = deckOfCards[randomNum];
        Hand playerHand = myPlayer.getHand();

        playerHand.addCardToHand(randomCard);

        System.out.println(randomCard);
    }

    //Getter and Setters

    public Card[] getDeckOfCards() {
        return deckOfCards;
    }

    public void setDeckOfCards(Card[] deckOfCards) {
        this.deckOfCards = deckOfCards;
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

    public int[] getValues() {
        return values;
    }

    public void setValues(int[] values) {
        this.values = values;
    }


    //To String (if needed)

    @Override
    public String toString() {
        return "Deck{" +
                "cards=" + Arrays.toString(deckOfCards) +
                ", usedCards=" + usedCards +
                ", suit=" + Arrays.toString(suit) +
                ", values=" + Arrays.toString(values) +
                '}';
    }
}
