package labs_examples.lambdas.examples.traditional_interface_implementation;

import labs_examples.lambdas.examples.functional_interfaces.FunctionalInterfaceExample;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class ImplementsInterface implements FunctionalInterfaceExample {

    @Override
    public double calculate(double a, double b) {
        if (a > b){
            return a;
        } else {
            return b;
        }
    }
}
