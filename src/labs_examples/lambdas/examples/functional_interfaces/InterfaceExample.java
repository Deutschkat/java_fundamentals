package labs_examples.lambdas.examples.functional_interfaces;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public interface InterfaceExample {

    public default void printMessage(){
        System.out.println("Hey!");
    }

    public int findPrimes(int a, int b);

}
