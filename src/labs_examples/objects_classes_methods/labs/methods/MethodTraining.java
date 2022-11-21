package labs_examples.objects_classes_methods.labs.methods;

import labs_examples.classes.Person;

import java.util.Scanner;

public class MethodTraining {
    public static void main(String[] args) {

        //Pass By Ref (2)
        System.out.println("Pass by Reference Test: ");
        Person kat = new Person(30, 66, "Kat");
        System.out.println(kat.toString());
        add2YearsToPerson(kat);
        System.out.println(kat.toString());

        //Space for Clarity
        System.out.println();
        System.out.println();

        //Pass By Val (2)
        float a = 0.12345f;
        float b = 6.78910f;

        System.out.println("Pass by Val Test: ");
        System.out.println("A and B after PassByVal Test");
        passByValTest(a, b);
        System.out.println("A without method: " + a);
        System.out.println("B without method: " + b);

        //Space for Clarity
        System.out.println();
        System.out.println();


        // Largest Num (3)
        System.out.println("Please enter 4 numbers to find largest: ");
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();

        highestNum(num1, num2, num3, num4);

        //Space for Clarity
        System.out.println();
        System.out.println();

        // Method to Count All Consonants (4)

        consonantCount();

        System.out.println();
        System.out.println();

        //Prime or Not? (5)

        System.out.println("Please enter a number to find out if it is prime or not: ");
        Scanner primeScanner = new Scanner(System.in);
        int num = primeScanner.nextInt();
        if (primeOrNot(num))
            System.out.println(num + " is a prime number!");
        else
            System.out.println(num + " is not a prime number!");


        //Space
        System.out.println();
        System.out.println();
    }

    //Method Overloading (1)
    public static int multiply(int a, int b){
        return a * b;
    }

    public static int multiply(int a, int b, int c){
        return a * b * c;
    }

    public static int multiply(double a, double b, double c){
        return ((int)(a * b * c));
    }

    //Pass by Ref Add Years Method
    public static void add2YearsToPerson(Person person){person.age = person.age + 2; }

    //Pass by Val

    public static void passByValTest(float a, float b){
        a = a * 10;
        System.out.println(a);
        b = b * 10;
        System.out.println(b);
    }


    //Was the way I did highestNum okay? I made it void as you can see.
    public static void highestNum(int num1, int num2, int num3, int num4){
        if(num1 >= num2)
            if(num1 >= num3)
                if(num1 >= num4)
                    System.out.println(num1 + " is the largest number entered.");
        if(num2 >= num1)
            if(num2 >= num3)
                if(num2 >= num4)
                    System.out.println(num2 + " is the largest number entered.");
        if(num3 >= num1)
            if(num3 >= num2)
                if(num3 >= num4)
                    System.out.println(num3 + " is the largest number entered.");
        if(num4 >= num1)
            if(num4 >= num2)
                if(num4 >= num3)
                    System.out.println(num4 + " is the largest number entered.");

        }

        public static void consonantCount(){

        int count = 0;
            System.out.println("Please enter a word or sentence to count its consonants: ");
            Scanner consonantScanner = new Scanner(System.in);
            String userInput = consonantScanner.nextLine();

            for(int i = 0; i < userInput.length(); i++) {
                char ch = userInput.charAt(i);
                if (ch == 'a') {
                    System.out.println("");
                } else if (ch == 'e') {
                    System.out.println("");
                } else if (ch == 'i') {
                    System.out.println("");
                } else if (ch == 'o') {
                    System.out.println("");
                } else if (ch == 'u') {
                    System.out.println("");
                } else if(ch != ' ') {
                    count++;
                }
            }
            System.out.println("The number of consonants is: " + count);

        }

        public static boolean primeOrNot(int num){

        if(num <= 1)
            return false;

        for(int i = 2; i < num; i++)
            if(num % i ==0)
                return false;

        return true;

        }

}

