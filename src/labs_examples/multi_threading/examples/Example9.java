package labs_examples.multi_threading.examples;

// Use a synchronized block to control access to SumArray.
class SumArray2 {
    private int sum;

    int sumArray2(int nums[]) {
        sum = 0; // reset sum

        for(int i=0; i<nums.length; i++) {
            sum += nums[i];
            System.out.println("Running total for " +
                    Thread.currentThread().getName() +
                    " is " + sum);
            try {
                Thread.sleep(10); // allow task-switch
            }
            catch(InterruptedException exc) {
                System.out.println("Thread interrupted.");
            }
        }
        return sum;
    }
}

class MyThread7 implements Runnable {
    Thread thrd;
    static SumArray2 sa = new SumArray2();
    int a[];
    int answer;

    // Construct a new thread.
    MyThread7(String name, int nums[]) {
        thrd = new Thread(this, name);
        a = nums;
        thrd.start(); // start the thread
    }

    // Begin execution of new thread.
    public void run() {
        int sum;

        System.out.println(thrd.getName() + " starting.");

        // synchronize calls to sumArray()
        synchronized(sa) {
            answer = sa.sumArray2(a);
        }
        System.out.println("Sum for " + thrd.getName() +
                " is " + answer);

        System.out.println(thrd.getName() + " terminating.");
    }
}

// may have to rename to "Sync"
class Sync2 {
    public static void main(String args[]) {
        int a[] = {1, 2, 3, 4, 5};

        MyThread7 mt1 = new MyThread7("Child #1", a);
        MyThread7 mt2 = new MyThread7("Child #2", a);

        try {
            mt1.thrd.join();
            mt2.thrd.join();
        } catch(InterruptedException exc) {
            System.out.println("Main thread interrupted.");
        }
    }
}
