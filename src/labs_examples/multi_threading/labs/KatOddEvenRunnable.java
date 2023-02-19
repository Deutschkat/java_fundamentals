package labs_examples.multi_threading.labs;

public class KatOddEvenRunnable implements Runnable {

    private NumberCreator numberCreator;
    private int result;

    public KatOddEvenRunnable(NumberCreator numberCreator, int result) {
        super();
        this.numberCreator = numberCreator;
        this.result = result;

    }

    @Override
    public void run() {
        numberCreator.printNums(result);
    }
}
