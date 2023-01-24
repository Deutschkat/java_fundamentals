package labs_examples.objects_classes_methods.labs.oop.D_my_oop.menuorderpackage;

import java.util.Scanner;

public class BarkNBrewController {





    public static void main(String[] args) {

        BarkNBrewController barkNBrewController = new BarkNBrewController();

        //Creating menu items and assigning them attributes

        FoodItem classicPupCup = new FoodItem("Classic Pup Cup", 1.50, "Food", "for dogs", 1);
        FoodItem pupPizzaBites = new FoodItem("Pup Pizza Bites", 2.50, "Food", "for dogs", 1);
        FoodItem rowdyRawhideRinds = new FoodItem("Rowdy Rawhide Rinds", 2.00, "Food", "for dogs", 1);
        FoodItem pumpkinPupcake = new FoodItem("Pumpkin Pupcake", 2.25, "Food", "for dogs", 1);
        FoodItem poochCreamery = new FoodItem("Pooch Creamery Ice Cream", 3.50, "Food", "for dogs", 1);
        FoodItem pretzel = new FoodItem("Pretzel", 1.75, "Food", "for humans", 1);
        FoodItem nachos = new FoodItem("Nachos", 1.50, "Food", "for humans", 1);
        FoodItem pizzaSlice = new FoodItem("Pizza Slice", 1.00, "Food", "for humans", 1);
        FoodItem chickenWings = new FoodItem("Chicken Wings", 4.50, "Food", "for humans", 1);
        FoodItem mozzSticks = new FoodItem("Mozzarella Sticks", 2.25, "Food", "for humans", 1);

        DrinkItem saltyDog = new DrinkItem("Salty Dog", 11.00, "Drink", true, 1);
        DrinkItem greyHound = new DrinkItem("Greyhound", 10.00, "Drink", true, 1);
        DrinkItem pitBull = new DrinkItem("The Pit Bull", 11.00, "Drink", true, 1);
        DrinkItem mastiffMartini = new DrinkItem("Mastiff Martini", 12, "Drink", true, 1);
        DrinkItem dobermanDrink = new DrinkItem("The Doberman", 10.75, "Drink", true, 1);
        DrinkItem huskyColada = new DrinkItem("Husky Colada", 13.75, "Drink", true, 1);
        DrinkItem moscowMutt = new DrinkItem("Moscow Mutt", 9.75, "Drink", true, 1);
        DrinkItem puppersLager = new DrinkItem("Puppers Lager", 4.00, "Drink", true, 1);
        DrinkItem dirtyDog = new DrinkItem("Dirty Dog IPA", 4.75, "Drink", true, 1);
        DrinkItem tailWagger = new DrinkItem("Tailwagger Hefeweizen", 5.75, "Drink", true, 1);
        DrinkItem blueSeaDog = new DrinkItem("Sea Dog - Blue Paw", 5.00, "Drink", true, 1);
        DrinkItem water = new DrinkItem("Water", 0.00, "Drink", false, 1);
        DrinkItem fountainDrink = new DrinkItem("Fountain Drink", 2.00, "Drink", false, 1);
        DrinkItem tea = new DrinkItem("Tea", 2.00, "Drink", false, 1);
        DrinkItem pupShake = new DrinkItem("Pup-Shake", 3.50, "Drink", false, 1);


        // Testing how it prints out to call the items individually, so I may completely get rid of the printMenu() prompt
        // and just print individual items in that method.

        System.out.println(saltyDog);
        System.out.println();
        System.out.println(nachos);
        System.out.println();
        System.out.println(pretzel);
        System.out.println(water);

        barkNBrewController.welcomeInfo();
        barkNBrewController.printMenu();
    }

    // welcomeInfo() establishes how many people are in the party
    // orders will be stuck together for ONE party, not per guest
    // also determines if alcohol can be served
    // most of this was just to add for practice with booleans and creating the dog customer class

    public void welcomeInfo() {
        System.out.println("Welcome To Bark N' Brew!");
        System.out.println();
        System.out.println("------------------------");

        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the last name of your party?");

        String partyInputName = scanner.nextLine();

        System.out.println("Excellent! Your party will be known as the " + partyInputName + " party.");

        System.out.println("How many humans are in the party?");
        int numParty = scanner.nextInt();
        System.out.println("Okay. So you have " + numParty + " humans altogether.");
        //

        System.out.println("Is everyone 21? (true/false)");
        boolean ofAgeYesOrNo = scanner.nextBoolean();
            if(ofAgeYesOrNo==true){
                System.out.println("Great! You have access to the full bar.");
            }else{
                System.out.println("That's alright. We have plenty of non-alcoholic options.");
            }

        System.out.println("How many pups did you bring this evening?");

        int numDoggos = scanner.nextInt();

        System.out.println(numDoggos + " pup(s)!");

        System.out.println("Are they all vaccinated? (true/false)");

        boolean yesOrNo = scanner.nextBoolean();

            if(yesOrNo==true){
                System.out.println("Fantastic! Let's get your order! Here's a glance at our menu.");
                printMenu();
            }else{
                System.out.println("I'm sorry, the pups have to have proof of vaccination.");
            }

        DogCustomer party1 = new DogCustomer(partyInputName, numParty,ofAgeYesOrNo, numDoggos, yesOrNo);
        party1.toString();


    }

    public void printMenu(){
        System.out.println("BARK N' BREW MENU");
        System.out.println("----------------------------------");
        System.out.println("DRINK MENU");
        System.out.println("----------------------------------");
        System.out.println("  Item" + "              " + "Cost" + "              " + "Type Of Drink");
        System.out.println("Salty Dog" + "          " + "  $" + 11 + "            " + "   Cocktail");
        System.out.println("Greyhound" + "          " + "  $" + 10 + "            " + "   Cocktail");
        System.out.println("The Pit Bull" + "          " + "  $" + 11 + "            " + "   Cocktail");
        System.out.println("Mastiff Martini" + "          " + "  $" + 12 + "            " + "   Cocktail");
        System.out.println("The Doberman" + "          " + "  $" + 10.75 + "            " + "   Cocktail");
        System.out.println("Husky Colada" + "          " + "  $" + 13.75 + "            " + "   Cocktail");
        System.out.println("Moscow Mutt" + "          " + "  $" + 9.75 + "            " + "   Cocktail");
        System.out.println("Puppers Lager" + "          " + "  $" + 4 + "            " + "   Beer/Cider/IPA");
        System.out.println("Dirty Dog IPA" + "          " + "  $" + 4.75 + "            " + "   Beer/Cider/IPA");
        System.out.println("Tailwagger Hefeweizen" + "          " + "  $" + 5.75 + "            " + "   Beer/Cider/IPA");
        System.out.println("Sea Dog - Blue Paw" + "          " + "  $" + 5 + "            " + "   Beer/Cider/IPA");
        System.out.println("Water" + "          " + "  $" + 0 + "            " + "   Non-Alcoholic");
        System.out.println("Fountain Drink" + "          " + "  $" + 2 + "            " + "   Non-Alcoholic");
        System.out.println("Tea" + "          " + "  $" + 2 + "            " + "   Non-Alcoholic");
        System.out.println("Pup-Shake" + "          " + "  $" + 3.50 + "            " + "   Non-Alcoholic");

        System.out.println();
        System.out.println("----------------------------------");
        System.out.println("PUP TREAT MENU");
        System.out.println("  Item" + "              " + "Cost");
        System.out.println("Classic Pup Cup" + "          " + "  $" + 1.50);
        System.out.println("Pup Pizza Bites" + "          " + "  $" + 2.50);
        System.out.println("Rowdy Rawhide Rinds" + "          " + "  $" + 2);
        System.out.println("Pumpkin Pupcake" + "          " + "  $" + 2.25);
        System.out.println("Pooch Creamery Ice Cream" + "          " + "  $" + 3.50);

        System.out.println();
        System.out.println("----------------------------------");
        System.out.println("HUMAN SNACK MENU");
        System.out.println("  Item" + "              " + "Cost");
        System.out.println("Pretzel" + "          " + "  $" + 1.75);
        System.out.println("Nachos" + "          " + "  $" + 1.50);
        System.out.println("Pizza Slice" + "          " + "  $" + 1);
        System.out.println("Chicken Wings" + "          " + "  $" + 4.50);
        System.out.println("Mozzarella Sticks" + "          " + "  $" + 2.25);

    }









    }

