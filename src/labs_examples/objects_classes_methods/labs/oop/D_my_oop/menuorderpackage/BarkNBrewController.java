package labs_examples.objects_classes_methods.labs.oop.D_my_oop.menuorderpackage;

import java.util.ArrayList;
import java.util.Scanner;

public class BarkNBrewController {

    Scanner scanner = new Scanner(System.in);

    FoodItem classicPupCup = new FoodItem("Classic Pup Cup", 1.50, "Food", 1, "for dogs");
    FoodItem pupPizzaBites = new FoodItem("Pup Pizza Bites", 2.50, "Food", 1, "for dogs");
    FoodItem rowdyRawhideRinds = new FoodItem("Rowdy Rawhide Rinds", 2.00, "Food", 1, "for dogs");
    FoodItem pumpkinPupcake = new FoodItem("Pumpkin Pupcake", 2.25, "Food", 1, "for dogs");
    FoodItem poochCreamery = new FoodItem("Pooch Creamery Ice Cream", 3.50, "Food", 1, "for dogs");
    FoodItem pretzel = new FoodItem("Pretzel", 1.75, "Food", 1, "for humans");
    FoodItem nachos = new FoodItem("Nachos", 1.50, "Food", 1, "for humans");
    FoodItem pizzaSlice = new FoodItem("Pizza Slice", 1.00, "Food", 1, "for humans");
    FoodItem chickenWings = new FoodItem("Chicken Wings", 4.50, "Food", 1, "for humans");
    FoodItem mozzSticks = new FoodItem("Mozzarella Sticks", 2.25, "Food", 1, "for humans");

    DrinkItem saltyDog = new DrinkItem("Salty Dog", 11.00, "Drink", 1, true);
    DrinkItem greyHound = new DrinkItem("Greyhound", 10.00, "Drink", 1, true);
    DrinkItem pitBull = new DrinkItem("The Pit Bull", 11.00, "Drink", 1, true);
    DrinkItem mastiffMartini = new DrinkItem("Mastiff Martini", 12, "Drink", 1, true);
    DrinkItem dobermanDrink = new DrinkItem("The Doberman", 10.75, "Drink", 1, true);
    DrinkItem huskyColada = new DrinkItem("Husky Colada", 13.75, "Drink", 1, true);
    DrinkItem moscowMutt = new DrinkItem("Moscow Mutt", 9.75, "Drink", 1, true);
    DrinkItem puppersLager = new DrinkItem("Puppers Lager", 4.00, "Drink", 1, true);
    DrinkItem dirtyDog = new DrinkItem("Dirty Dog IPA", 4.75, "Drink", 1, true);
    DrinkItem tailWagger = new DrinkItem("Tailwagger Hefeweizen", 5.75, "Drink", 1, true);
    DrinkItem blueSeaDog = new DrinkItem("Sea Dog - Blue Paw", 5.00, "Drink", 1, true);
    DrinkItem water = new DrinkItem("Water", 0.00, "Drink", 1, false);
    DrinkItem fountainDrink = new DrinkItem("Fountain Drink", 2.00, "Drink", 1, false);
    DrinkItem tea = new DrinkItem("Tea", 2.00, "Drink", 1, false);
   DrinkItem pupShake = new DrinkItem("Pup-Shake", 3.50, "Drink", 1, false);



    public static void main(String[] args) {


        BarkNBrewController barkNBrewController = new BarkNBrewController();

        barkNBrewController.welcomeInfo();
       // barkNBrewController.printMenu();

        //Creating menu items and assigning them attributes




        // Testing how it prints out to call the items individually, so I may completely get rid of the printMenu() prompt
        // and just print individual items in that method.

//        System.out.println(barkNBrewController.saltyDog); //fix
//        System.out.println();
//        System.out.println(nachos);
//        System.out.println();
//        System.out.println(pretzel);
//        System.out.println(water);


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


        System.out.println("What is the last name of your party?");

        String partyInputName = scanner.nextLine();

        System.out.println("Excellent! Your party will be known as the " + partyInputName + " party.");

        System.out.println("How many humans are in the party?");
        int numParty = scanner.nextInt();
        System.out.println("Okay. So you have " + numParty + " humans altogether.");

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

        DogCustomer party1 = new DogCustomer(partyInputName, numParty,ofAgeYesOrNo,new ArrayList<MenuItem>(),numDoggos, yesOrNo);
        party1.toString();


        System.out.println("What would you like to order? (Please use all lowercase letters)");

        //A do while for this section would work well...
        Scanner orderScanner = new Scanner(System.in);
        String customerOrderInput = orderScanner.nextLine();

        if(customerOrderInput.equals("nachos")){
            System.out.println(nachos);
            party1.addItemToOrder(nachos);
        } else if (customerOrderInput.contains("slice")) {
            System.out.println(pizzaSlice);
            party1.addItemToOrder(pizzaSlice);
        } else if (customerOrderInput.contains("pup cup")) {
            System.out.println(classicPupCup);
            party1.addItemToOrder(classicPupCup);
        }else if (customerOrderInput.contains("pizza bites")) {
            System.out.println(pupPizzaBites);
            party1.addItemToOrder(pupPizzaBites);
        }else if (customerOrderInput.contains("rawhide")) {
            System.out.println(rowdyRawhideRinds);
            party1.addItemToOrder(rowdyRawhideRinds);
        }else if (customerOrderInput.contains("pumpkin")) {
            System.out.println(pumpkinPupcake);
            party1.addItemToOrder(pumpkinPupcake);
        }else if (customerOrderInput.contains("creamery")) {
            System.out.println(poochCreamery);
            party1.addItemToOrder(poochCreamery);
        }else if (customerOrderInput.equals("pretzel")) {
            System.out.println(pretzel);
            party1.addItemToOrder(pretzel);
        }else if (customerOrderInput.contains("chicken")) {
            System.out.println(chickenWings);
            party1.addItemToOrder(chickenWings);
        }else if (customerOrderInput.contains("sticks")) {
            System.out.println(mozzSticks);
            party1.addItemToOrder(mozzSticks);
        }else if (customerOrderInput.contains("salty")) {
            System.out.println(saltyDog);
            party1.addItemToOrder(saltyDog);
        }else if (customerOrderInput.equals("greyhound")) {
            System.out.println(greyHound);
            party1.addItemToOrder(greyHound);
        }else if (customerOrderInput.contains("pit")) {
            System.out.println(pitBull);
            party1.addItemToOrder(pitBull);
        }else if (customerOrderInput.contains("mastiff")) {
            System.out.println(mastiffMartini);
            party1.addItemToOrder(mastiffMartini);
        }else if (customerOrderInput.contains("doberman")) {
            System.out.println(dobermanDrink);
            party1.addItemToOrder(dobermanDrink);
        }else if (customerOrderInput.contains("husky")) {
            System.out.println(huskyColada);
            party1.addItemToOrder(huskyColada);
        }else if (customerOrderInput.contains("moscow")) {
            System.out.println(moscowMutt);
            party1.addItemToOrder(moscowMutt);
        }else if (customerOrderInput.contains("puppers")) {
            System.out.println(puppersLager);
            party1.addItemToOrder(puppersLager);
        }else if (customerOrderInput.contains("dirty")) {
            System.out.println(dirtyDog);
            party1.addItemToOrder(dirtyDog);
        }else if (customerOrderInput.contains("tailwagger")) {
            System.out.println(tailWagger);
            party1.addItemToOrder(tailWagger);
        }else if (customerOrderInput.contains("sea dog")) {
            System.out.println(blueSeaDog);
            party1.addItemToOrder(blueSeaDog);
        }else if (customerOrderInput.equals("water")) {
            System.out.println(water);
            party1.addItemToOrder(water);
        }else if (customerOrderInput.contains("fountain")) {
            System.out.println(fountainDrink);
            party1.addItemToOrder(fountainDrink);
        }else if (customerOrderInput.equals("tea")) {
            System.out.println(tea);
            party1.addItemToOrder(tea);
        }else if (customerOrderInput.contains("shake")) {
            System.out.println(pupShake);
            party1.addItemToOrder(pupShake);
        }


        System.out.println(party1.customerOrder);
    }


    //Strictly for "customer" viewing purposes. Does not store any data or anything... may replace with print methods of objects.
    public void printMenu(){
        System.out.println("BARK N' BREW MENU");
        System.out.println("----------------------------------");
        System.out.println("DRINK MENU");
        System.out.println("----------------------------------");
        System.out.println("  Item" + "              " + "Cost" + "              " + "Type Of Drink");
        System.out.println("Salty Dog" + "          " + "  $" + 11 + "            " + "   Cocktail");
        System.out.println("Greyhound" + "          " + "  $" + 10 + "            " + "   Cocktail");
        System.out.println("The Pit Bull" + "       " + "  $" + 11 + "            " + "   Cocktail");
        System.out.println("Mastiff Martini" + "    " + "  $" + 12 + "            " + "   Cocktail");
        System.out.println("The Doberman" + "       " + "  $" + 10.75 + "         " + "   Cocktail");
        System.out.println("Husky Colada" + "       " + "  $" + 13.75 + "         " + "   Cocktail");
        System.out.println("Moscow Mutt" + "         " + "  $" + 9.75 + "         " + "   Cocktail");
        System.out.println("Puppers Lager" + "       " + "  $" + 4 + "            " + "   Beer/Cider/IPA");
        System.out.println("Dirty Dog IPA" + "       " + "  $" + 4.75 + "         " + "   Beer/Cider/IPA");
        System.out.println("Tailwagger Hefeweizen" + " " + "  $" + 5.75 +"       " + "   Beer/Cider/IPA");
        System.out.println("Sea Dog - Blue Paw" + "  " + "  $" + 5.00 + "         " + "   Beer/Cider/IPA");
        System.out.println("Water" + "               " + "  $" + 0.00 + "         " + "   Non-Alcoholic");
        System.out.println("Fountain Drink" + "      " + "  $" + 2.00 + "         " + "   Non-Alcoholic");
        System.out.println("Tea" + "                 " + "  $" + 2.00 + "         " + "   Non-Alcoholic");
        System.out.println("Pup-Shake" + "           " + "  $" + 3.50 + "         " + "   Non-Alcoholic");

        System.out.println();
        System.out.println("----------------------------------");
        System.out.println("PUP TREAT MENU");
        System.out.println("  Item" + "              " + "Cost");
        System.out.println("Classic Pup Cup" + "          " + "  $" + 1.50);
        System.out.println("Pup Pizza Bites" + "          " + "  $" + 2.50);
        System.out.println("Rowdy Rawhide Rinds" + "      " + "  $" + 2.00);
        System.out.println("Pumpkin Pupcake" + "          " + "  $" + 2.25);
        System.out.println("Pooch Creamery Ice Cream" + " " + "  $" + 3.50);

        System.out.println();
        System.out.println("----------------------------------");
        System.out.println("HUMAN SNACK MENU");
        System.out.println("  Item" + "              " + "Cost");
        System.out.println("Pretzel" + "         " + "  $" + 1.75);
        System.out.println("Nachos" + "          " + "  $" + 1.50);
        System.out.println("Pizza Slice" + "     " + "  $" + 1.00);
        System.out.println("Chicken Wings" + "   " + "  $" + 4.50);
        System.out.println("Mozzarella Sticks" + " " + "  $" + 2.25);

    }

    //Hopefully, where whatever the person orders will be added to the group order using an arraylist?
    // Added using a scanner, a (contains)?, and the pre-made objects.



    public boolean orderMore(){
        System.out.println("Would you like to order something (else)?");

        Scanner yesNoScanner = new Scanner(System.in);
        String customerAnswer = yesNoScanner.nextLine();

        if(customerAnswer.equals("yes") | customerAnswer.equals("Yes")){
            return true;
        }
        return false;

    }








    }

