package labs_examples.objects_classes_methods.labs.oop.C_blackjack.BlackjackPackage;

import java.util.ArrayList;

public class Hand {

    // Holds Hand Data

    ArrayList<Card> cards;
    int handValue;

    //Constructor

    public Hand(ArrayList<Card> cards, int handValue) {
        this.cards = cards;
        this.handValue = handValue;
    }

    //add card to hand
    public void addCardToHand(Card dealtCard){
        cards.add(dealtCard);
    }

    public int returnScore(){
        int score = 0;

        for(int x = 0; x < cards.size(); x++){
            Card card = cards.get(x); //Get card at index of x
            score += card.getCardValue();
        }

        System.out.println();

        handValue = score;
        return score;
    }

    //THINGS IVE ADDED SINCE LAST MEETING #4
    public boolean isOver21(){
        if(returnScore() > 21){
            System.out.println("Hand is over 21.");
            return true;
        }
        return false;
    }

    //Getter and Setters
    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public int getHandValue() {
        return handValue;
    }

    public void setHandValue(int handValue) {
        this.handValue = handValue;
    }



    //To String (if needed)

    @Override
    public String toString() {
        return "Hand{" +
                "cards=" + cards +
                ", handValue=" + handValue +
                '}';
    }
}
