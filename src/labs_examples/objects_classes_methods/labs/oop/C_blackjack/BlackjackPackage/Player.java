package labs_examples.objects_classes_methods.labs.oop.C_blackjack.BlackjackPackage;

import java.util.Scanner;

public class Player {

    // Player Info

    String name;
    Hand hand;
    int potValue;

    private int numGamesWon;

    //Constructor

    public Player(String name, Hand hand, int potValue) {
        this.name = name;
        this.hand = hand;
        this.potValue = potValue;
    }

    public boolean computerAI(){
        while(hand.getHandValue() < 16){
            System.out.println("*** Dealer hits ***");
            return true;
        }
        System.out.println("***Dealer stands ***");
        return false;
    }

    public void increaseWonGames(){
        numGamesWon++;
        System.out.println("Num games won: " + numGamesWon);
    }

   //BET - Work in progress

    public int placeABet(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("How much would you like to bet?");
        int betAmount = scanner.nextInt();

        System.out.println("$"+betAmount+ " bet placed! Good luck!");
        int playerBet = potValue - betAmount;
        setPotValue(playerBet);

        System.out.println(getName()+"'s wallet contains: $" + playerBet);


         return betAmount;
     }

     //Cpu Bet



    // Getter and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public int getPotValue() {
        return potValue;
    }

    public void setPotValue(int potValue) {
        this.potValue = potValue;
    }

    public int getNumGamesWon() {
        return numGamesWon;
    }

    public void setNumGamesWon(int numGamesWon) {
        this.numGamesWon = numGamesWon;
    }

    // To string (if needed)


    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hand=" + hand +
                ", potValue=" + potValue +
                '}';
    }
}
