package labs_examples.exception_handling.examples;

// Demonstrate the queue exceptions.
class QExcDemo{

    public static void main(String args[]) {
        QueueThread thread1 = new QueueThread("thread 1");
        QueueThread thread2 = new QueueThread("thread 2");
    }
}

class QueueThread implements Runnable{
    Thread thrd;

    QueueThread(String name) {
        thrd = new Thread(this, name);
        thrd.start();
    }

    @Override
    public void run() {
        FixedQueue q = new FixedQueue(10);

        char ch, ch2;
        int i;

        try {
            // overrun the queue
            for (i = 0; i < 11; i++) {
                System.out.println("ThreadName = " + thrd.getName());
                System.out.println("Attempting to store : " +
                        (char) ('A' + i));
                q.put((char) ('A' + i));
                System.out.println(" -- OK");
            }
            System.out.println();
        } catch (QueueFullException exc) {
            System.out.println(exc);
        }
        System.out.println();

        try {
            // over-empty the queue
            for (i = 0; i < 11; i++) {
                System.out.print("Getting next char: ");
                ch = q.get();
                System.out.println(ch);
            }
        } catch (QueueEmptyException exc) {
            System.out.println(exc);
        }
    }
}