package labs_examples.multi_threading.examples;

// Create multiple threads.

class MyThread4 implements Runnable {
    Thread thrd;

    // Construct a new thread.
    MyThread4(String name) {
        thrd = new Thread(this, name);

        thrd.start(); // start the thread
    }

    // Begin execution of new thread.
    public void run() {
        System.out.println(thrd.getName() + " starting.");
        try {
            for(int count=0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("In " + thrd.getName() +
                        ", count is " + count);
            }
        }
        catch(InterruptedException exc) {
            System.out.println(thrd.getName() + " interrupted.");
        }
        System.out.println(thrd.getName() + " terminating.");
    }
}

class MoreThreads {
    public static void main(String args[]) {
        System.out.println("Main thread starting.");

        MyThread4 mt1 = new MyThread4("Child #1");
        MyThread4 mt2 = new MyThread4("Child #2");
        MyThread4 mt3 = new MyThread4("Child #3");

        for(int i=0; i < 50; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            }
            catch(InterruptedException exc) {
                System.out.println("Main thread interrupted.");
            }
        }

        System.out.println("Main thread ending.");
    }
}