package labs_examples.multi_threading.examples.runnable;

class ExampleController{
    public static void main(String[] args) {
        System.out.println("** Main Thread Start **");
        MyFirstRunnable threadTest = new MyFirstRunnable("MyFirstRunnable");
        MyFirstRunnable threadTest2 = new MyFirstRunnable("MySecondRunnable");
        MyFirstRunnable threadTest3 = new MyFirstRunnable("MyThirdRunnable");
        System.out.println("** Main Thread End **");
    }
}

public class MyFirstRunnable implements Runnable {

    // the Thread class is still required as it is what spawns the thread
    Thread thread;

    // constructor that takes in a name for the thread
    public MyFirstRunnable(String name) {
        // create the Thread object - pass "this" object and the name given - the Thread class has many constructors you
        // can choose from
        thread = new Thread(this, name);
        // start the thread automatically when the MyFirstRunnable object is created
        thread.start();
    }

    // the run() method will be called automatically after thread.start()
    @Override
    public void run() {
        System.out.println(thread.getName() + " starting.");
        try {
            for(int count=0; count<10; count++) {
                // put this thread to sleep for 400 milliseconds
                Thread.sleep(400);
                System.out.println("In " + thread.getName() +
                        ", count is " + count);
            }
        }
        // catch the potential exception
        catch(InterruptedException exc) {
            System.out.println(thread.getName() + " interrupted.");
        }
        System.out.println(thread.getName() + " terminating.");
    }
}


