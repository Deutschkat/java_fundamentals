package labs_examples.multi_threading.examples.common_problems;

import java.util.concurrent.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LiveLock {
    // Create two Locks
    // Lock functionality is a similar to synchronized block,
    // but it provides explicit lock/unlock methods
    private static Lock lock1 = new ReentrantLock(true);
    private static Lock lock2 = new ReentrantLock(true);

    public static void main(String[] args) {
        new Thread(new A(lock1, lock2), "A").start();
        new Thread(new B(lock1, lock2), "B").start();
    }
}

class A implements Runnable {

    // Keep references on resource
    private final Lock lock1;
    private final Lock lock2;

    public A(Lock lock1, Lock lock2) {
        this.lock1 = lock1;
        this.lock2 = lock2;
    }

    @Override
    public void run() {
        System.out.println("Instance of class A run()");

        while (true) {
            try {
//                System.out.println("Instance of class A acquiring lock1");

                // Attempt to acquire the lock with timeout of 50 milliseconds
                // the timeout ensures that the attempts will be stop in 50 milliseconds

                // Attention!!! It is the first part that demonstrates the Live lock behaviour
                lock1.tryLock(50, TimeUnit.MILLISECONDS);
                System.out.println("Instance of class A acquired lock1");

                // Sleep symbolises some work that the thread should be doing
                System.out.println("Instance of class A doing some work");
                Thread.sleep(50);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

//            System.out.println("Instance of class A acquiring lock2");
            if (lock2.tryLock()) {
                System.out.println("Instance of class A acquired lock2");
            } else {
                // Attention!!! It is the second part that demonstrates the Live lock behaviour
                System.out.println("Instance of class A cannot acquire lock2, releasing lock1.");
                lock1.unlock();

                // Continue to the next iteration of the loop
                continue;
            }
            // Never happens
            System.out.println("Instance of class A doing some work, with lock1 and lock2");
            // breaks the loop
            break;
        }

        // Never happens
        // Unlock both locks
        lock2.unlock();
        lock1.unlock();
    }
}

class B implements Runnable {

    // Keep references on resource
    private final Lock lock1;
    private final Lock lock2;

    public B(Lock lock1, Lock lock2) {
        this.lock1 = lock1;
        this.lock2 = lock2;
    }

    @Override
    public void run() {
        while (true) {
            try {
//                System.out.println("Instance of class B acquiring lock2");

                // Attempt to acquire the lock with timeout of 50 milliseconds
                // the timeout ensures that the attempts will be stop in 50 milliseconds

                // Attention!!! It is the first part that demonstrates the Live lock behaviour
                lock2.tryLock(50, TimeUnit.MILLISECONDS);
                System.out.println("Instance of class B acquired lock2 ");

                // Sleep symbolises some work that the thread should be doing
                System.out.println("Instance of class B doing some work");
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

//            System.out.println("Instance of class A acquiring lock1");
            if (lock1.tryLock()) {
                System.out.println("Instance of class B acquired lock1");
            } else {
                // Attention!!! It is the second part that demonstrates the Live lock behaviour
                System.out.println("Instance of class B cannot acquire lock1, releasing lock2.");
                lock2.unlock();

                // Continue to the next iteration of the loop
                continue;
            }
            // Never happens
            System.out.println("Instance of class B doing some work, with lock2 and lock1");
            // breaks the loop
            break;
        }
        // Never happens
        // Unlock both locks
        lock1.unlock();
        lock2.unlock();
    }
}
