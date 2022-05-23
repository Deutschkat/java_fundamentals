package labs_examples.multi_threading.examples.common_problems;

import java.util.Random;

public class RaceCondition {

    public static void main(String[] args) throws InterruptedException {
        // The resource to be incremented
        // Should be an object, since we want it to be sharable as reference
        Integer counter = 0;
        // Create an instance that would be executed in parallel threads
        Incrementer incrementer = new Incrementer(counter);

        // # of Parallel thread that will update the counter
        int parallelThreads = 10;

        // An array to keep all the threads
        Thread[] threads = new Thread[parallelThreads];

        // Create all thread
        for (int i = 0; i < parallelThreads; i++) {
            threads[i] = new Thread(incrementer);
        }

        // Start all threads with some random delay
        for (Thread thread : threads) {
            try {
                Thread.sleep(100 + new Random().nextInt(100));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            thread.start();
        }

        // Ensure all threads finish
        for (Thread thread : threads) {
            thread.join();
        }

        System.out.println("Done. Final counter: " + counter);
    }
}

class Incrementer implements Runnable {
    // A reference to resource to Increment
    Integer counter;

    public Incrementer(Integer counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        // Read current value from the shared resource
        Integer counterValue = counter;

        try {
            // Sleep symbolises some work that the thread should be doing with some randomness
            Thread.sleep(100 + new Random().nextInt(100));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Increase counter
        counter = counterValue + 1;
        System.out.println(Thread.currentThread().getName() + " increments value: " + counterValue + " -> " + counter);
    }
}
