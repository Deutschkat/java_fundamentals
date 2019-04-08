package labs_examples.lambdas.examples;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class AnonymousInnerClass {

    public static void main(String[] args) {

        // this is an example of an anonymous inner class
        // we are creating an
        FunctionalInterfaceExample obj = new FunctionalInterfaceExample() {
            @Override
            public double calculate(double a, double b) {
                if (a > b ){
                    return a;
                } else {
                    return b;
                }
            }
        };


    }
}
