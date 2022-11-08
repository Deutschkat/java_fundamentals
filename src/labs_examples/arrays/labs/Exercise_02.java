package labs_examples.arrays.labs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *  More labs_examples.arrays
 *
 *      Using the array below, take in a number from 1-10 from the user and print out the index of that
 *      element.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        int[] array = new int[10];

        for(int i = 0; i < array.length; i++){
            array[i] = i + 1;
        }

        System.out.println("Please select a number 1 - 10 to be given the index of: ");

        Scanner scanner = new Scanner(System.in);

        int userChoice = scanner.nextInt();

        for(int i = 0; i < array.length; i++){

            int element = array[i]; // array at i

            if(element == userChoice)
                System.out.println("The index of " + userChoice + " is " + i);
        }












    }
}