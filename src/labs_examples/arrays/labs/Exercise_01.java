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

        double[] calc = new double [10];

     /*    calc[0] = scanner.nextDouble();
        calc[1] = scanner.nextDouble();
        calc[2] = scanner.nextDouble();
        calc[3] = scanner.nextDouble();
        calc[4] = scanner.nextDouble();
        calc[5] = scanner.nextDouble();
        calc[6] = scanner.nextDouble();
        calc[7] = scanner.nextDouble();
        calc[8] = scanner.nextDouble();
        calc[9] = scanner.nextDouble();
        */
        // sum

        for(int i = 0; i < calc.length; i++){
            calc[i] = scanner.nextDouble();
        }

        double sum = 0;
        for(double indexValue : calc){
            sum += indexValue;
        }

        System.out.println("The sum of the numbers you have entered is: " + sum);

        System.out.println();
        System.out.println();

        //average

        double average = sum / calc.length;

        System.out.println("The average of the numbers you have entered is: " + average);


    }

}