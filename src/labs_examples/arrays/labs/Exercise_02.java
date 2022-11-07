package labs_examples.arrays.labs;

import java.util.ArrayList;
import java.util.Arrays;
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

        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        System.out.println("Please select a number 1 - 10 to be given the index of: ");

        Scanner scanner = new Scanner(System.in);

        int userChoice = scanner.nextInt();

        int indexOfNum = Arrays.asList(array).indexOf(userChoice);

        System.out.println("The index of " + userChoice + " is " + indexOfNum);









    }
}