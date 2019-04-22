package labs_examples.lambdas.examples.lambdas;

import labs_examples.lambdas.examples.functional_interfaces.MyInterface;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class LambdaExample_1 {

    public static void main(String[] args) {

        MyInterface obj = () -> {
            System.out.println("I'm in a Lambda!");
        };

        obj.someMethod();

    }

}
