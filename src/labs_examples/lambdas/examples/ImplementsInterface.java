package labs_examples.lambdas.examples;

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
