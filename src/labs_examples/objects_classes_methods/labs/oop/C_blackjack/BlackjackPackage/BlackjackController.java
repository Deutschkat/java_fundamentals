package labs_examples.objects_classes_methods.labs.oop.C_blackjack.BlackjackPackage;
import java.util.*;
import java.util.ArrayList;
import java.util.Random;

public class BlackjackController {
    public static void main(String[] args) {


        //Test Hand, Player, and Deck


      /*  testHand.returnScore();
        testHand.isOver21();

        testPlayer.computerAI();
        boolean computerTest = testPlayer.computerAI();
        if(computerTest == true){
            testDeck.deal(testPlayer, testDeck.generateRandomNum());
        }
*/

        BlackjackController blackjackController = new BlackjackController();
        blackjackController.playBlackJack();


    }

    public void playBlackJack(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter player name: ");

        String playerNameInput = scanner.nextLine();


        Hand testHand = new Hand(new ArrayList<>(),0);
        Hand hand2 = new Hand(new ArrayList<>(), 0);

        Player testPlayer = new Player("Dealer",testHand,100);
        Player player2 = new Player(playerNameInput,hand2, 100);

        Deck testDeck = new Deck(new ArrayList<Integer>()); // Populate Deck
        testDeck.populate();

        System.out.println("=======================");
        testDeck.deal(testPlayer, testDeck.generateRandomNum()); // Deal two cards to computer
        testDeck.deal(testPlayer, testDeck.generateRandomNum());
        System.out.println(testPlayer.getName() + "'s score is: "+ testHand.returnScore());
        System.out.println("=======================");

        testDeck.deal(player2, testDeck.generateRandomNum()); // Deal two cards to player
        testDeck.deal(player2, testDeck.generateRandomNum());

        System.out.println(playerNameInput + "'s score is: "+ hand2.returnScore());
        //Return player score

        System.out.println("=======================");


        System.out.println("Would you like another card?"); // Card Prompt
        String answerInput = scanner.nextLine();


            if (answerInput.equals("yes") | answerInput.equals("Yes")| answerInput.equals("y")) {
                System.out.println("*** " + playerNameInput + " hits ***");
                System.out.println("------------------------");
                testDeck.deal(player2, testDeck.generateRandomNum());
                hand2.returnScore(); // Return player score again.
                System.out.println("------------------------");
            }

            testPlayer.computerAI();
            if(true){
                testDeck.deal(testPlayer, testDeck.generateRandomNum());
                testHand.returnScore();
            }



    }


}
