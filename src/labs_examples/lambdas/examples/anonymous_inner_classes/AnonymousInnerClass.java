package labs_examples.lambdas.examples.anonymous_inner_classes;

import labs_examples.lambdas.examples.traditional_interface_implementation.SimpleClass;
import labs_examples.lambdas.examples.functional_interfaces.SimpleInterface;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class AnonymousInnerClass {

    public static void main(String[] args) {

        SimpleInterface obj = new SimpleInterface() {
            @Override
            public void methodOne() {
                System.out.println("in methodOne - in anon");
            }
        };

        SimpleClass obj2 = new SimpleClass();

        obj.methodOne();
        obj2.methodOne();

        Runnable myRunnable = new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("inside run method");
            }
        };

        Thread myThread = new Thread(myRunnable);
        myThread.start();

        System.out.println("done with main thread");

    }
}
