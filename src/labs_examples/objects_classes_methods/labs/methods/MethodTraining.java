package labs_examples.objects_classes_methods.labs.methods;

import labs_examples.classes.Person;

public class MethodTraining {
    public static void main(String[] args) {

        System.out.println("Pass by Reference Test: ");
        Person kat = new Person(30, 66, "Kat");
        System.out.println(kat.toString());
        add2YearsToPerson(kat);             // Pass By Ref
        System.out.println(kat.toString());

        System.out.println(); //Space for clarity.
        System.out.println();

        float a = 0.12345f;
        float b = 6.78910f; //Pass by Val

        System.out.println("Pass by Val Test: ");
        System.out.println("A and B after PassByVal Test");
        passByValTest(a, b);
        System.out.println("A without method: " + a);
        System.out.println("B without method: " + b);

        System.out.println();
        System.out.println();

        highestNum(10, 4, 6, 3);
        System.out.println(highestNum(10, 4, 6, 3));

    }

    //Method Overloading
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

    public static int highestNum(int... args){


        }
    }

}
