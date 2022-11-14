package labs_examples.repl;

import java.util.Scanner;

public class Methods_Parameters {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a phrase followed by any number. The application will determine if the number is odd or even");
        String inputWords = scanner.next();
        int inputNum = scanner.nextInt();
        isOdd(inputNum);

    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static boolean isOdd(int inputNum) {
        if (inputNum % 2 != 0) {
            return true;
        } else {
            return false;
        }

    }
}
/// HELP WITH REPL METHOD PARAMETERS

