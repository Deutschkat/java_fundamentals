package labs_examples.objects_classes_methods.labs.methods;

import java.util.Scanner;

/**
 * Create a recursive method named factorial that will return the factorial of any number passed to it.
 *
 * For instance, after creatin the factorial method, uncomment the two lines in the main() method. When you run
 * it, it should print 120. It should also work for any ther number you pass it.
 *
 */
public class Exercise_03 {

    public static void main(String[] args) {

        System.out.println("What number do you want to find the factorial of?");
        Scanner factorScanner = new Scanner(System.in);

        int x = factorial(factorScanner.nextInt());
        System.out.println(x);
    }

    public static int factorial(int x) {
        int total;

        if (x == 1)
            return 1;

        total = x * factorial(x - 1);

        return total;
    }

    }




