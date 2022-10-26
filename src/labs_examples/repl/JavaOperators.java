package labs_examples.repl;

import java.sql.SQLOutput;

public class JavaOperators {

    public static void main(String[] args) {

    // please demonstrate the use of all 5 arithmetic operators below (+, -, *, /, %)

        int addition = 3+5;
        System.out.println(addition);

        int subtraction = 12 - 4;
        System.out.println(subtraction);

        int division = 36 / 6;
        System.out.println(division);

        int multiply = 15 * 10;
        System.out.println(multiply);

        int mod = 28 % 3;
        System.out.println(mod);


    // please demonstrate the use of 5 relational operators below - we'll cover "if-statements" shortly so I'll give you a hint here
    int a = 10;
    int b = 11;
    if (a < b){
        System.out.println("a is less than b");
    }
    // now your turn :)

    if (a > b){
        System.out.println("a is greater than b");
    }

    if (a == b){
        System.out.println("a equals b");
    }

    if (a != b){
        System.out.println("a does not equal b");
    }

    if ((a + b) > b){
            System.out.println(a + b + " is greater than b");
        }

    if ((a+b) < b){
            System.out.println(a + b + "is less than b");
        }



    // please demonstrate the use of all 4 logical operators below (AND, short-circuit AND, OR, short-circuit OR, XOR (exclusive or), and NOT )
    if (a < 20 & b < 20){
        System.out.println("both a & b are less than 20");
    }
    // now your turn :)

    if (a > 10 & b == 11){
        System.out.println("a > 10 and b = 11");
    }

    if (a > 20 && b > 20){
        System.out.println("a and b are greater than 20");
    }

    if (a < 20 | b ==25){
        System.out.println("one of these statements is true.");
    }

    if (a > 95 || b < 30){
        System.out.println("B is less than 30, or a is greater than 95");
    }

    if (a != b){
        System.out.println("a does not equal b");
    }

    if (a == 10 ^ b == 10 ){
        System.out.println("one of these numbers equals 10");
    }

}
}
