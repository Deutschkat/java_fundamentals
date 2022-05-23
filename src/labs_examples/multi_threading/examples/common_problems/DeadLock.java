package labs_examples.multi_threading.examples.common_problems;

public class DeadLock {

    public static void main(String[] args) {
        // Create two resources
        // The example uses Integer, but it could be any Object (not a primitive)
        // Values in this example are irrelevant
        Integer resourceA = 0;
        Integer resourceB = 1;

        // Create two threads that will perform deadlock
        // Study the implementation bellow
        // Although they are similar pay attention to the order of the resources they synchronize on

        System.out.println("You are about to experience deadlock. To exit press 'Control+C'");

        // Start the threads, pay attention to the output sequence
        new Thread(new A1(resourceA, resourceB)).start();
        new Thread(new B1(resourceA, resourceB)).start();
    }
}

class A1 implements Runnable {

    // Keep references on resource
    private final Integer resourceA;
    private final Integer resourceB;

    public A1(Integer resourceA, Integer resourceB) {
        this.resourceA = resourceA;
        this.resourceB = resourceB;
    }

    @Override
    public void run() {
        System.out.println("Instance of class A run()");

        System.out.println("Instance of class A synchronizing on resourceA");
        // Attention!!! Locking the resourceA so that no other thread could change it
        synchronized (resourceA) {
            System.out.println("Instance of class A synchronized on resourceA");
            try {
                // Sleep symbolises some work that the thread should be doing
                System.out.println("Instance of class A doing some work");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Instance of class A synchronizing on resourceB");
            // Attention!!! Locking the resourceB so that no other thread could change it
            synchronized (resourceB) {
                // Never happens
                System.out.println("Instance of class A synchronized on resourceA and resourceB");
            }
        }
    }
}

class B1 implements Runnable {

    // Keep references on resource
    private final Integer resourceA;
    private final Integer resourceB;

    public B1(Integer resourceA, Integer resourceB) {
        this.resourceA = resourceA;
        this.resourceB = resourceB;
    }

    @Override
    public void run() {
        System.out.println("Instance of class B run()");

        System.out.println("Instance of class B synchronizing on resourceB");
        // Attention!!! Locking the resourceB so that no other thread could change it
        synchronized (resourceB) {
            System.out.println("Instance of class B synchronized on resourceB");
            try {
                // Sleep symbolises some work that the thread should be doing
                System.out.println("Instance of class B doing some work");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Instance of class B synchronizing on resourceA");
            // Attention!!! Locking the resourceA so that no other thread could change it
            synchronized (resourceA) {
                // Never happens
                System.out.println("Instance of class A synchronized on resourceB and resourceA");
            }
        }
    }
}
