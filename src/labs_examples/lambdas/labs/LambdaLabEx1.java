package labs_examples.lambdas.labs;

import java.util.Scanner;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaLabEx1 {
    public static void main(String[] args) {

        //Anonymous Inner Class Example

        FunctionalInterface1 example = new FunctionalInterface1() {
            @Override
            public void methodOne() {

            }
        };

        // Implement using Anon Inner Class
        example.methodOne();


        //Lambda expression example

        FunctionalInterface1 obj = () -> {
            System.out.println("Lambda expression used.");
        };




        // Implement using Lambda
        obj.methodOne();

        // 1 parameter lambda implementation

        FunctionalInterface2 obj2 = (int x) -> {
            System.out.println(x);
            return x;
        };


        obj2.printInt(15);
        obj2.printInt(25);

        // 1 parameter anon inner class use

        FunctionalInterface2 newExample = new FunctionalInterface2() {
            @Override
            public int printInt(int x) {
                System.out.println(x);
                return x;
            }
        };

        newExample.printInt(200);


        //2 parameter using lambda

        FunctionalInterface3 test = (int a, int b) -> {
            int sum = a + b;
            System.out.println(sum + " returned using a lambda.");
            return sum;
        };

        test.add(10,20);

        // 2 parameter anon inner class use

        FunctionalInterface3 testAnon = new FunctionalInterface3() {
            @Override
            public int add(int a, int b) {
                int sum = a + b;
                System.out.println(sum + " returned, but using an anonymous inner class.");
                return sum;
            }
        };

        testAnon.add(20,50);


        // Two built in java functional interfaces

        // Predicate for boolean response

        Predicate<Integer> greaterThan = k -> (k > 20);

        System.out.println(greaterThan.test(7));
        System.out.println(greaterThan.test(50));


        //Supplier

        Scanner scanner = new Scanner(System.in);
        System.out.println("Tell me what you want the supplier to repeat back to you:");

        // I dunno why I chose to have it mirror user input, I just kinda felt like it.

        Supplier<String> myWords = () -> scanner.nextLine();

        System.out.println(myWords.get());


    }
}
