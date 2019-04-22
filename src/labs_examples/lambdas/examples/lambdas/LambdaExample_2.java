package labs_examples.lambdas.examples.lambdas;

import labs_examples.lambdas.examples.functional_interfaces.FunctionalInterfaceExample;
import labs_examples.lambdas.examples.traditional_interface_implementation.ImplementExample;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class LambdaExample_2 {

    public static void main(String[] args) {

        // define lambda expression
        FunctionalInterfaceExample obj = (double x, double y) -> {
            if (x > y) {
                return x;
            } else {
                return y;
            }
        };

        double largerNumber = obj.calculate(456, 987);
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

        ImplementExample obj2 = new ImplementExample();
        double t = obj2.calculate(456, 789);
    }

}
