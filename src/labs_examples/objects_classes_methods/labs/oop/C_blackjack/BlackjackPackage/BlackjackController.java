package labs_examples.objects_classes_methods.labs.oop.C_blackjack.BlackjackPackage;
import java.util.*;
import java.util.ArrayList;
import java.util.Random;

public class BlackjackController {
    public static void main(String[] args) {



        BlackjackController blackjackController = new BlackjackController();
        blackjackController.playBlackJack();


    }

    public void playBlackJack(){

        System.out.println("" +
                "██╗    ██╗███████╗██╗      ██████╗ ██████╗ ███╗   ███╗███████╗    ████████╗ ██████╗      \n" +
                "██║    ██║██╔════╝██║     ██╔════╝██╔═══██╗████╗ ████║██╔════╝    ╚══██╔══╝██╔═══██╗               \n" +
                "██║ █╗ ██║█████╗  ██║     ██║     ██║   ██║██╔████╔██║█████╗         ██║   ██║   ██║               \n" +
                "██║███╗██║██╔══╝  ██║     ██║     ██║   ██║██║╚██╔╝██║██╔══╝         ██║   ██║   ██║               \n" +
                "╚███╔███╔╝███████╗███████╗╚██████╗╚██████╔╝██║ ╚═╝ ██║███████╗       ██║   ╚██████╔╝               \n" +
                " ╚══╝╚══╝ ╚══════╝╚══════╝ ╚═════╝ ╚═════╝ ╚═╝     ╚═╝╚══════╝       ╚═╝    ╚═════╝                \n" +
                "                                                                                                   \n" +
                "    ██████╗ ██╗      █████╗  ██████╗██╗  ██╗     ██╗ █████╗  ██████╗██╗  ██╗██╗\n" +
                "    ██╔══██╗██║     ██╔══██╗██╔════╝██║ ██╔╝     ██║██╔══██╗██╔════╝██║ ██╔╝██║\n" +
                "    ██████╔╝██║     ███████║██║     █████╔╝      ██║███████║██║     █████╔╝ ██║\n" +
                "    ██╔══██╗██║     ██╔══██║██║     ██╔═██╗ ██   ██║██╔══██║██║     ██╔═██╗ ╚═╝\n" +
                "    ██████╔╝███████╗██║  ██║╚██████╗██║  ██╗╚█████╔╝██║  ██║╚██████╗██║  ██╗██╗\n" +
                "    ╚═════╝ ╚══════╝╚═╝  ╚═╝ ╚═════╝╚═╝  ╚═╝ ╚════╝ ╚═╝  ╚═╝ ╚═════╝╚═╝  ╚═╝╚═╝");

        System.out.println();
        System.out.println();
        System.out.println("========================================================================================");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter player name: ");

        String playerNameInput = scanner.nextLine();


        Hand testHand = new Hand(new ArrayList<>(),0);
        Hand hand2 = new Hand(new ArrayList<>(), 0);

        Player testPlayer = new Player("Dealer",testHand,100);
        Player player2 = new Player(playerNameInput,hand2, 100);

        Deck testDeck = new Deck(new ArrayList<Integer>()); // Populate Deck
        testDeck.populate();
        System.out.println("Welcome, " + playerNameInput + "!");

        System.out.println("If you are ready to play, just say 'deal'");

        String startGame = scanner.nextLine();
            if(startGame.equals("deal")| startGame.equals("Deal")) {


                System.out.println("Dealing cards...");

                System.out.println("========================================================================================");
                testDeck.deal(testPlayer, testDeck.generateRandomNum()); // Deal two cards to computer
                testDeck.deal(testPlayer, testDeck.generateRandomNum());
                System.out.println(testPlayer.getName() + "'s score is: " + testHand.returnScore());
                System.out.println("========================================================================================");

                testDeck.deal(player2, testDeck.generateRandomNum()); // Deal two cards to player
                testDeck.deal(player2, testDeck.generateRandomNum());

                System.out.println(playerNameInput + "'s score is: " + hand2.returnScore());
                //Return player score

                System.out.println("========================================================================================");

            }

            //Working on this Might Delete ************
         //   player2.placeABet(100);


        do {
            System.out.println("Would you like another card?"); // Card Prompt
            String answerInput = scanner.nextLine();

            //Player turn
            if (answerInput.equals("yes") | answerInput.equals("Yes") | answerInput.equals("y")) {
                System.out.println("*** " + playerNameInput + " hits ***");
                System.out.println("------------------------");
                testDeck.deal(player2, testDeck.generateRandomNum());
                    if(hand2.isOver21() == true){
                        break;
                    }else if(hand2.returnScore() == 21){
                        System.out.println("21! YOU WIN!");
                        break;
                    }

            }

            System.out.println(playerNameInput + "'s score is: " + hand2.returnScore());
            System.out.println("------------------------");
                //Computer turn
            if (testPlayer.computerAI() == true) {
                testDeck.deal(testPlayer, testDeck.generateRandomNum());
                if(testHand.isOver21() == true){
                    break;
                }else if(testHand.returnScore() == 21){
                    System.out.println("Dealer has 21!! You lose.");
                    break;
                }
            }

            // So that when we both dont want a card, the higher value hand wins.
            if(answerInput.equals("no")|answerInput.equals("No")|answerInput.equals("n")&& testPlayer.computerAI() == false){
                if(hand2.handValue > testHand.handValue){
                    System.out.println("You were closer to 21! You win!");
                    break;
                } else if (testHand.handValue > hand2.handValue) {
                    System.out.println("Dealer was closer to 21! Dealer wins!");
                    break;
                }
            }

            System.out.println(testPlayer.getName() + "'s score is: " + testHand.returnScore());
            System.out.println("------------------------");
        }while(hand2.isOver21() == false | testHand.isOver21() == false);



        System.out.println("GAME OVER");
        System.out.println();
        System.out.println(testPlayer.getName() + "'s score is: " + testHand.returnScore());
        System.out.println();
        System.out.println(playerNameInput + "'s score is: " + hand2.returnScore());
        System.out.println("========================================================================================");
        System.out.println();
        System.out.println();
        System.out.println("Would you like to play again?");

        Scanner gameScanner = new Scanner(System.in);
        String playGame = gameScanner.nextLine();

        //Use of recursion for replay-ability
        if(playGame.equals("Yes")| playGame.equals("yes")| playGame.equals("y")){
            playBlackJack();
        }else{
            System.exit(0);



        }

    }



}
