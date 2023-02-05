package labs_examples.exception_handling.labs;

import java.util.Scanner;

public class Ex7 {

    public static void main(String[] args) {

        try {
            welcome();
        }catch(PupVaccinationException exc){
            System.out.println(exc.toString());

        }

    }

    public static void welcome() throws PupVaccinationException{

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the dog park!");
        System.out.println("Is your pup vaccinated? (y/n)");

        String response = scanner.next();

        if(response.equalsIgnoreCase("n")) {
            throw new PupVaccinationException();

        }

        System.out.println("Awesome! Have a great time!");
    }



}
