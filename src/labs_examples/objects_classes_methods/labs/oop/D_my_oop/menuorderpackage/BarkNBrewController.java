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

        System.out.println("How many humans are in the party?");
        int numParty = scanner.nextInt();

        System.out.println("Is everyone in the party over 21?");

        boolean yesOrNo = scanner.nextBoolean();

        CustomerParty party1 = new CustomerParty(partyInputName,numParty,yesOrNo );



    }

}
