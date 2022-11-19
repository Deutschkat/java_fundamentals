package labs_examples.objects_classes_methods.labs.methods;

import java.util.Scanner;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Exercise_01 {

    public static void main(String[] args) {

        // please create the methods as instructed below then
        // call each of those methods from here, within the main()
        System.out.println("Please enter a number of years.");
        Scanner scanner = new Scanner(System.in);
                                                // Ran this one first since it needed
                                                // input from user.
        int years = scanner.nextInt();

        System.out.println(convert(years));
        System.out.println();
        System.out.println(multiply(10, 10));
        System.out.println();
        System.out.println(divide(10, 10));
        System.out.println();
        joke();
        System.out.println();
        System.out.println(numArgs(10,11, 12, 13, 14));

        System.out.println();
        System.out.println("Done!");


    }


    // 1) Create a static multiply() method below that takes two int arguments (int a, int b) and
    //    returns the result of a * b

    public static int multiply(int a, int b){
        return a * b;
    }


    // 2) Create a static divide() method below that takes two int arguments (int a, int b) and
    //    returns the result of a / b

    public static int divide(int a, int b){
        return a / b;

    }


    // 3) Create a static void method that will print of joke of your choice to the console
    public static void joke(){
        System.out.println("Where does a general keep his armies?");
        System.out.println("In his sleevies!");
    }



    // 4) Create a static method that takes in a number in years (int years) as an argument
    //    and returns the number of seconds that number in years represents

    public static int convert(int years){
        int seconds = 31536000;

        return years * seconds;

    }

    // 5) Create a varargs method that will return the length of the varargs array passed in

    public static int numArgs(int arg, int... args){
        int num = 0;
        for(int s : args){
            num++;
        }

        return num;
    }




}
