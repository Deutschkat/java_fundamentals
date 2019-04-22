package labs_examples.lambdas.examples.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class BuiltInFunctionalInterfaces {

    public static void main(String[] args) {

        demonstratePredicate();
        demonstrateFunction();
        demonstarteBiFunction();
        demonstrateSupplier();
        demonstrateConsumer();
    }

    // a predicate receives a value and returns a boolean value
    private static void demonstratePredicate() {

        // Creating predicate
        Predicate<Integer> lessThan = i -> (i < 10);

        Predicate<String> length = t -> (t.length() < 10);

        // Calling Predicate method test()
        System.out.println(lessThan.test(9));
        System.out.println(length.test("programming is so cool!"));

        BiPredicate<Integer, String> longerThan = (i, s) -> {
            if (s.length() > i){
                return true;
            } else {
                return false;
            }
        };

        System.out.println(longerThan.test(5, "hello world"));


    }

    // Represents a function that accepts one argument and produces a result.
    private static void demonstrateFunction() {

        // Function which accepts a number and divides it by two
        Function<Long, Double> half = (a) -> a / 2.0;

        // call the apply() method on the Function interface
        System.out.println(half.apply(46545167416754l));
    }

    // Represents a function that accepts two arguments and produces a result.
    private static void demonstarteBiFunction() {

        // BiFunction has three generic types
        // the first is the type of the first parameter
        // the second is the type of the second parameter
        // the third is the type of the return value
        BiFunction<String, String, String> function = (url, postfix) -> {
            String fullUrl = url + postfix;
            return fullUrl;
        };

        System.out.println(function.apply("codingnomads", ".co"));

        // here's another example
        BiFunction<Integer, Integer, String> function2 = (val1, val2) -> {
            if (val1 > val2){
                return val1 + " is greater than " + val2;
            } else{
                return val2 + " is greater than " + val1;
            }
        };

        System.out.println(function2.apply(345, 543));
    }

    private static void demonstrateSupplier() {

        // This function returns a random value.
        Supplier<Double> randomVal = () -> Math.random();

        // Print the random value using the get() method on the Supplier
        System.out.println(randomVal.get());

    }

    private static void demonstrateConsumer() {

        List<String> names = Arrays.asList("Kim", "Martin", "Caden", "Sadie", "Gilad",
                "Mario", "Andreas", "Ras");

        names.forEach((name) -> System.out.println(name + " is the best mentor ever!"));

    }

}
