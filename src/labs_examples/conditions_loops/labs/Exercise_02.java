package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 2: Days of the week
 *
 *      Take in a number from the user and print "Monday", "Tuesday", ... "Sunday", or "Other"
 *      if the number from the user is 1, 2,... 7, or other respectively. Use an if-else statement
 *      to accomplish this task.
 * 
 *      Bonus Tricky Challenge: Use a "nested-if" statement.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number that coordinates with that specific day of the week: ");

        int day = scanner.nextInt();

        if(day == 1){
            System.out.println("Sunday");
        }else if(day == 2){
            System.out.println("Monday");
        }else if(day == 3){
            System.out.println("Tuesday");
        }else if(day == 4){
            System.out.println("Wednesday");
        }else if(day == 5){
            System.out.println("Thursday");
        }else if(day == 6){
            System.out.println("Friday");
        }else if(day ==7){
            System.out.println("Saturday");
        }else{
            System.out.println("Please enter a number from 1 - 7");
        }

    }
}
