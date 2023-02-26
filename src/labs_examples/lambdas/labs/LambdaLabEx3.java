package labs_examples.lambdas.labs;

import java.util.function.BiFunction;

public class LambdaLabEx3 {
    public static void main(String[] args) {

        // Calling a static method reference
        BiFunction<Integer, Integer, Integer> referenceStatic = LambdaLabEx3::add;
        int x = referenceStatic.apply(20, 5);
        System.out.println("Static method reference product is: " + x);

        // Instance method reference




    }

    public static int add(int a, int b){
        return a + b;
    }
}