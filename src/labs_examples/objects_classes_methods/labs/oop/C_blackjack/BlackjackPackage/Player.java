package labs_examples.objects_classes_methods.labs.oop.C_blackjack.BlackjackPackage;

import java.util.Scanner;

public class Player {

    // Player Info

    String name;
    Hand hand;
    int potValue;

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
        return false;
    }

//    **MIGHT DELETE THIS***

  //  public int placeABet(int potValue){
    //    Scanner scanner = new Scanner(System.in);

      //  System.out.println("How much would you like to bet?");
      //  int betAmount = scanner.nextInt();

//        System.out.println("$"+betAmount+ " bet placed! Good luck!");
//        int playerBet = potValue - betAmount;

//        System.out.println(getName()+"'s wallet contains: $" + playerBet);


//        return betAmount;
//    }

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
