package labs_examples.arrays.labs;

import java.util.ArrayList;

/**
 *  ArrayLists
 *
 *      Please demonstrate how to create an ArrayList, populate an array list, access elements within an ArrayList.
 *      Also take a moment to explore the many methods that are available to you when you use an ArrayList. By simply
 *      typing the dot operator (".") after the ArrayList object that you create. You should see a menu pop up that
 *      shows a list of methods.
 *
 */
public class Exercise_07 {
    public static void main(String[] args) {

        ArrayList<String> dogNames = new ArrayList<>();

        dogNames.add("Indiana");
        dogNames.add("Rasmus");
        dogNames.add("Sammy Davis Jr. Jr.");
        dogNames.add("Bandi");
        dogNames.add("Kahlua");
        dogNames.add("Lucky");
        dogNames.add("Pumpkin");
        dogNames.add("Sugar");
        dogNames.add("Shady");
        dogNames.add("Mia");
        dogNames.add("Einstein");
        dogNames.add("Tobi");

        dogNames.remove("Pumpkin"); //Removed cat name from list of dog names.

        for(String s : dogNames){ //Printed the list of dog names.
            System.out.println(s);
        }

        System.out.println();

        System.out.println("Is Einstein one of my dog's names?");

        boolean check = dogNames.contains("Einstein");  //Check the list for a specific item.
        System.out.println("Yes! Einstein is one of the names.");

        System.out.println();
        System.out.println("What index do we find Sugar at on the list? ");

        int lastIndexOfSugar = dogNames.lastIndexOf("Sugar");
        System.out.println("Sugar is found at the index of: " + lastIndexOfSugar);


    }
}
