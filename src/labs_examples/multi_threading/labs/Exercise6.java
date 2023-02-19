package labs_examples.multi_threading.labs;

public class Exercise6 {

    static final int TOTAL_NUMS = 100;
    static final int TOTAL_THREADS = 2;

    public static void main(String[] args) {

        NumberCreator numbersForThread = new NumberCreator(TOTAL_THREADS, TOTAL_NUMS);



        Thread threadOne = new Thread(new KatOddEvenRunnable(numbersForThread, 1), "Thread #1: ");
        Thread threadTwo = new Thread(new KatOddEvenRunnable(numbersForThread, 0), "Thread #2: ");


        System.out.println("Alternating numbers between Thread #1, and Thread #2...");
        System.out.println();

        threadOne.start();
        threadTwo.start();




    }



}

class NumberCreator {

    private int num = 1;
    private int numThreads;
    private int totalNums;

    public NumberCreator(int numThreads, int totalNums) {

        super();
        this.numThreads = numThreads;
        this.totalNums = totalNums;
    }

    public void printNums(int result) {
        synchronized (this) {
            while (num <= totalNums - 1) {
                while (num % numThreads != result) {
                    try {
                        wait();
                    } catch (InterruptedException ex) {
                        System.out.println("Interrupted.");
                    }
                }
                System.out.println(Thread.currentThread().getName() + " " + num++);
                notifyAll();
            }
        }
    }

}




