package labs_examples.lambdas.labs;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Supplier;

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

        // 4)


    }
}
