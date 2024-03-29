package labs_examples.objects_classes_methods.labs.oop.C_blackjack.BlackjackPackage;
import java.util.*;
import java.util.ArrayList;

public class BlackjackController {
    Player testPlayer;
    Player player2;
    Deck testDeck;
    Hand testHand;
    Hand hand2;

    int numGamesPlayed;


    public static void main(String[] args) {


        BlackjackController blackjackController = new BlackjackController();
        blackjackController.blackJackSetUp();


        do {
            blackjackController.blackJackSetUpReplay();
            blackjackController.playBlackJack();
        } while (blackjackController.playAgain() == true);


    }

    public void blackJackSetUp() {
        System.out.println("" +
                "██╗    ██╗███████╗██╗      ██████╗ ██████╗ ███╗   ███╗███████╗    ████████╗ ██████╗                \n" +
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


        testHand = new Hand(new ArrayList<>(), 0);
        hand2 = new Hand(new ArrayList<>(), 0);

        testPlayer = new Player("Dealer", testHand, 100);
        player2 = new Player(playerNameInput, hand2, 100);

        testDeck = new Deck(new ArrayList<Integer>()); // Populate Deck
        testDeck.populate();
        System.out.println("Welcome, " + playerNameInput + "!");


    }

    // This method resets the hand values... trying to use it to carry over the potValues of each player as well...
    public void blackJackSetUpReplay() {
        testHand = new Hand(new ArrayList<>(), 0);
        hand2 = new Hand(new ArrayList<>(), 0);

        testPlayer = new Player("Dealer", testHand, testPlayer.potValue);
        player2 = new Player(player2.getName(), hand2, player2.potValue);

    }

    public void playBlackJack() {


        Scanner scanner = new Scanner(System.in);

        System.out.println("If you are ready to play, just say 'deal'");

        String startGame = scanner.nextLine();
        if (startGame.equals("deal") | startGame.equals("Deal")) {


            System.out.println("Dealing cards...");

            System.out.println("========================================================================================");
            System.out.println("                        " + testPlayer.getName() + "'s wallet contains: $" + testPlayer.getPotValue());
            testDeck.deal(testPlayer, testDeck.generateRandomNum()); // Deal two cards to computer
            testDeck.deal(testPlayer, testDeck.generateRandomNum());
            System.out.println(testPlayer.getName() + "'s score is: " + testHand.returnScore());

            System.out.println("========================================================================================");
            System.out.println("                        " + player2.getName() + "'s wallet contains: $" + player2.getPotValue());
            testDeck.deal(player2, testDeck.generateRandomNum()); // Deal two cards to player
            testDeck.deal(player2, testDeck.generateRandomNum());

            System.out.println(player2.getName() + "'s score is: " + hand2.returnScore());

            //Return player score

            System.out.println("========================================================================================");

        }

        //Creating game pot and increasing it.

        int gameLevelPot = 0;
        gameLevelPot += player2.placeABet();

        //There was no good place to pull this from, so I created the CPU bet here and set their potValue here too.
        int computerBet = (int) (Math.random() * testPlayer.potValue - 1);
        gameLevelPot += computerBet;
        System.out.println("Dealer bets: $" + computerBet);

        int cpuPotValue = (testPlayer.potValue - computerBet);
        testPlayer.setPotValue(cpuPotValue);

        do {

            System.out.println("Would you like another card?"); // Card Prompt
            String answerInput = scanner.nextLine();

            //Player turn
            if (answerInput.equals("yes") | answerInput.equals("Yes") | answerInput.equals("y")) {
                System.out.println("*** " + player2.getName() + " hits ***");
                System.out.println("------------------------");
                testDeck.deal(player2, testDeck.generateRandomNum());
                if (hand2.isOver21() == true) {
                    testPlayer.setPotValue(testPlayer.getPotValue() + gameLevelPot);
                    break;
                } else if (hand2.returnScore() == 21) {
                    player2.setPotValue(player2.getPotValue() + gameLevelPot);
                    System.out.println("21! YOU WIN!");
                    player2.increaseWonGames();
                    break;
                }

            }
            System.out.println("                        " + player2.getName() + "'s wallet contains: $" + player2.potValue);
            System.out.println(player2.getName() + "'s score is: " + hand2.returnScore());
            System.out.println("------------------------");
            //Computer turn
            if (testPlayer.computerAI() == true) {
                testDeck.deal(testPlayer, testDeck.generateRandomNum());
                if (testHand.isOver21() == true) {
                    player2.setPotValue(player2.getPotValue() + gameLevelPot);
                    break;
                } else if (testHand.returnScore() == 21) {
                    testPlayer.setPotValue(testPlayer.getPotValue() + gameLevelPot);
                    System.out.println("Dealer has 21!! You lose.");
                    testPlayer.increaseWonGames();
                    break;
                }
            }

            // So that when we both don't want a card, the higher value hand wins.
            if (answerInput.equals("no") | answerInput.equals("No") | answerInput.equals("n") && testPlayer.computerAI() == false) {
                if (hand2.handValue > testHand.handValue) {
                    player2.setPotValue(player2.getPotValue() + gameLevelPot);
                    System.out.println("You were closer to 21! You win!");
                    player2.increaseWonGames();
                    break;
                } else if (testHand.handValue > hand2.handValue) {
                    testPlayer.setPotValue(testPlayer.getPotValue() + gameLevelPot);
                    System.out.println("Dealer was closer to 21! Dealer wins!");
                    testPlayer.increaseWonGames();
                    break;
                } else if (testHand.handValue == hand2.handValue) {
                    System.out.println("It's a tie! Nobody wins.");
                    break;
                }
            }
            System.out.println("                        " + testPlayer.getName() + "'s wallet contains: $" + testPlayer.potValue);
            System.out.println(testPlayer.getName() + "'s score is: " + testHand.returnScore());
            System.out.println("------------------------");
        } while (hand2.isOver21() == false | testHand.isOver21() == false);
        increaseGamesPlayed();


        System.out.println("GAME OVER");
        System.out.println();
        System.out.println(testPlayer.getName() + "'s score is: " + testHand.returnScore());
        System.out.println(player2.getName() + "'s score is: " + hand2.returnScore());
        System.out.println("========================================================================================");
        System.out.println();
        System.out.println();
    }

    public void increaseGamesPlayed(){
        numGamesPlayed++;
        System.out.println("Number of total games played: " + numGamesPlayed);
    }

    public boolean playAgain() {
        System.out.println("Would you like to play again? (please enter 'yes' or 'no')");

        Scanner gameScanner = new Scanner(System.in);

        String playGame = gameScanner.nextLine();

        if (player2.potValue >= 1) {
            if (playGame.equals("Yes") | playGame.equals("yes") | playGame.equals("y")) {
                return true;
            }

        }
        System.out.println("Player out of funds or player has chosen to not play again. Have a good day! :)");
        return false;
    }
}

