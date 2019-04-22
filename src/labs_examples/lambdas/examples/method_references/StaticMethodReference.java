package labs_examples.lambdas.examples.method_references;
import java.util.function.BiFunction;

/**
 * https://beginnersbook.com/2017/10/method-references-in-java-8/
 */



class StaticMethodReference {
    public static void main(String[] args) {

        // here's a lambda calling a static methdo
        BiFunction<Integer, Integer, Integer> lambdaResult = (a, b) -> StaticMethodReference.multiply(a, b);
        int x = lambdaResult.apply(11, 5);
        System.out.println("Lambda product of given number is: " + x);


        // here's a method reference to the same static method
        BiFunction<Integer, Integer, Integer> referenceResult = StaticMethodReference :: multiply;
        int y = referenceResult.apply(11, 5);
        System.out.println("Method Reference product of given number is: " + y);
    }

    public static int multiply(int a, int b){
        return a * b;
    }

}