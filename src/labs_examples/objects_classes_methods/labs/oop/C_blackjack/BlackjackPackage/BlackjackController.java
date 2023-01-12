package labs_examples.objects_classes_methods.labs.oop.C_blackjack.BlackjackPackage;

import java.util.ArrayList;
import java.util.Random;

public class BlackjackController {
    public static void main(String[] args) {

        //Filled Deck
        Deck testDeck = new Deck(new ArrayList<Integer>());
        testDeck.populate();


        //Test Hand, Player, and Deck
        Hand testHand = new Hand(new ArrayList<>(),0);
        Player testPlayer = new Player("Player 1",testHand,100);
        testDeck.deal(testPlayer, testDeck.generateRandomNum());

        testHand.returnScore();
        testHand.isOver21();








    }
}
