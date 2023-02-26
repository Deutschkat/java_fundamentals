package labs_examples.lambdas.labs;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.*;

import static java.lang.Math.PI;


public class LambdaLabEx2 {
    public static void main(String[] args) {

        // 1) Supplier - Gets what you want it to while using its parameter and get()

        System.out.println("What do you want the supplier functional interface to say back to you?");
        Scanner drScannington = new Scanner(System.in);

        Supplier<String> whatDidYouSay = () -> drScannington.nextLine();
        System.out.println(whatDidYouSay.get());

        // 2) Consumer - Performs action for all elements.

        List<String> pups = Arrays.asList("Indiana", "Rasmus", "Lucky", "Davis");

        pups.forEach(pup -> System.out.println(pup + " is a good pup!"));

        // 3) Function - Accepts argument, produces result.

        Function<Integer, Float> divide = (k) -> k / 5.08976f;

        System.out.println(divide.apply(77));

        // 4) Predicate - Returns a boolean.

        Predicate<Integer> lessThan = j -> (j < 7);

        System.out.println(lessThan.test(2));
        System.out.println(lessThan.test(15));

        // 5) Binary Operator
        BinaryOperator <Integer> testBinary = (a,  b) -> {
            int sum = a + b;
            return sum;
        };
        System.out.println(testBinary.apply(5,5));

        // 6) IntToDouble - Dealing with Ints in argument, result becomes a double.

        IntToDoubleFunction piDividedByS = (s) -> PI / s ;
        System.out.println(piDividedByS.applyAsDouble(5));


        // 7) ObjIntConsumer

        ObjIntConsumer<String> test2 = (d, c) -> System.out.println(d + c);
        test2.accept("Ninja Turtles ", 4);

        // 8) UnaryOperator
        System.out.println("Yell something in all upper case to have it quieted down to lower case!");

        UnaryOperator<String> words = (x) -> x.toLowerCase();
        System.out.println(words.apply(drScannington.nextLine()));

        // 9) Bi Function
        BiFunction<String, String, String> testBiFunction = (x, y) -> {
            return x + y;
        };

        System.out.println(testBiFunction.apply("Kate ", "Nix"));

        // 10) IntUnaryOperator
        IntUnaryOperator meep = (c) -> c * c;

        System.out.println(meep.applyAsInt(15));

    }
}
