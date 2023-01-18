package labs_examples.objects_classes_methods.labs.oop.D_my_oop.menuorderpackage;

import java.util.ArrayList;
import java.util.Scanner;

public class BarkNBrewController {





    public static void main(String[] args) {

        BarkNBrewController barkNBrewController = new BarkNBrewController();
        barkNBrewController.welcomeInfo();

    }

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


        System.out.println("How many pups did you bring this evening?");

        int numDoggos = scanner.nextInt();

        System.out.println(numDoggos + " pup(s)!");

        System.out.println("Are they all vaccinated? (true/false)");

        boolean yesOrNo = scanner.nextBoolean();

            if(yesOrNo==true){
                System.out.println("Fantastic! Let's get your order!");
            }else{
                System.out.println("I'm sorry, the pups have to have proof of vaccination.");
            }

        DogCustomer party1 = new DogCustomer(partyInputName, numParty, numDoggos, yesOrNo);

    }









    }

