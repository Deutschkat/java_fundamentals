package labs_examples.lambdas.examples.traditional_interface_implementation;

import labs_examples.lambdas.examples.functional_interfaces.SimpleInterface;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class SimpleClass implements SimpleInterface {
    @Override
    public void methodOne() {
        System.out.println("in methodOne - in simple class");
    }

}
