package videos_source_code.arrays;

import java.util.ArrayList;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class ArrayLists {

    public static void main(String[] args) {

        // initialize an empty ArrayList of type String
        ArrayList<String> words = new ArrayList();

        // populate the arraylist
        words.add("elephant");
        words.add("tiger");
        words.add("giraffe");
        words.add("whale");

        // print out the size of the arraylist
        System.out.println(words.size());

        // print out the first value in the arraylist
        System.out.println(words.get(0));

        // print out the second value in the arraylist
        System.out.println(words.get(1));

        // print out the third value in the arraylist
        System.out.println(words.get(2));

        // print out if the arraylist is empty
        System.out.println(words.isEmpty());

        // many other methods you can play with - just type "words." below
        // and you'll see a list pop up


    }

}
