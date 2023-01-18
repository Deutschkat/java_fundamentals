package labs_examples.objects_classes_methods.labs.oop.D_my_oop.menuorderpackage;

import java.util.Scanner;

public class BarkNBrewController {





    public static void main(String[] args) {

        BarkNBrewController barkNBrewController = new BarkNBrewController();
        barkNBrewController.welcomeInfo();

    }

    public void welcomeInfo(){
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



        CustomerParty party1 = new CustomerParty(partyInputName,numParty);
        System.out.println(party1.partyName);
        System.out.println(party1.numCustomers);




    }

}
