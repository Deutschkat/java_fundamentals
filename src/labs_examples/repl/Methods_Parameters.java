package labs_examples.repl;

import java.util.Scanner;

public class Methods_Parameters {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a phrase.");
        String inputWords = scanner.nextLine();
        System.out.println("Please enter a number.");
        int inputNum = scanner.nextInt();


        System.out.println(isOdd(inputNum));
        String returnString = reverse(inputWords); //setting a method return result as a variable
        System.out.println("After reverse is called: " + returnString);
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static boolean isOdd(int inputNum) {
        if(inputNum % 2 != 0){
            return true;
        }else{
            return false;
        }
    }

    public static String reverse(String inputWords){
        String reversedString = "";
        char character;

        for(int i =0; i < inputWords.length(); i++){
            character = inputWords.charAt(i);
            reversedString = character + reversedString;
        }

        System.out.println("Before the return statement: " + reversedString);

        return reversedString;
    }

}


