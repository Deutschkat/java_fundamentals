package videos_source_code.exceptions;

import java.util.Scanner;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class LiquorStore {

    public static void main(String[] args) {

        try {
            someMethod();
        } catch (UnderAgeException e) {
            System.out.println(e.toString());
        }

    }

    public static void someMethod() throws UnderAgeException {
       buyWine();
    }

    public static void buyWine() throws UnderAgeException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to CodingNomads Liquor Store");
        System.out.println("Are you over 21 years of age? (y/n)");
        String response = scanner.next();

        if(response.equalsIgnoreCase("n")) {
            throw new UnderAgeException();
        }

        System.out.println("Great, what can we get for you?");
        ///
    }

}
