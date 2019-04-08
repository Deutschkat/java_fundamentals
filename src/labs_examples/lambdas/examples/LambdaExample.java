package labs_examples.lambdas.examples;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class LambdaExample {

    public static void main(String[] args) {

        // define lambda expression
        FunctionalInterfaceExample obj = (double x, double y) -> {
            if (x > y) {
                return x;
            } else {
                return y;
            }
        };

        double largerNumber = obj.calculate(567, 234);
        System.out.println(largerNumber);

        // redefine lambda expression
        obj = (double x, double y) -> {
            return x * y;
        };

        double value = obj.calculate(345, 678);
        System.out.println(value);

        // redefine lambda expression
        obj = (double x, double y) -> {
            return (x * x) * (y * y);
        };

        double num = obj.calculate(345, 678);
        System.out.println(num);

    }

}
