package labs_examples.arrays.labs;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {

    public static void main(String[] args) {

        System.out.println("Please enter 10 numbers.");

        Scanner scanner = new Scanner(System.in);

        int[] calc = new int [10];

        calc[0] = scanner.nextInt();
        calc[1] = scanner.nextInt();
        calc[2] = scanner.nextInt();
        calc[3] = scanner.nextInt();
        calc[4] = scanner.nextInt();
        calc[5] = scanner.nextInt();
        calc[6] = scanner.nextInt();
        calc[7] = scanner.nextInt();
        calc[8] = scanner.nextInt();
        calc[9] = scanner.nextInt();

        // sum

        int sum = 0;
        for(int indexValue : calc){
            sum += indexValue;
        }

        System.out.println("The sum of the numbers you have entered is: " + sum);

        System.out.println();
        System.out.println();

        //average

        int average = sum / 10;

        System.out.println("The average of the numbers you have entered is: " + average);


    }

}