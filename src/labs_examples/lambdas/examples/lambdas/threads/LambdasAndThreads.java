package labs_examples.lambdas.examples.lambdas.threads;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class LambdasAndThreads {

    public static void main(String[] args) {

        demonstrateRunnable();
        demonstrateThread();
        demonstrateThreadWithoutReferenceVariable();

    }

    private static void demonstrateRunnable() {
        Runnable runnable = () -> {
            for (int i = 0; i < 5; i++){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("I'm in the Runnable!" + i);
            }

        };
        Thread t = new Thread(runnable);
        t.start();
    }

    private static void demonstrateThread() {
        Thread t = new Thread(() -> {
            for (int i = 0; i < 5; i++){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("I'm in the Thread! " + i);
            }
        });
        t.start();
    }


    private static void demonstrateThreadWithoutReferenceVariable() {
        new Thread(() -> System.out.println("no ref varaible thread!")).start();
    }

}
