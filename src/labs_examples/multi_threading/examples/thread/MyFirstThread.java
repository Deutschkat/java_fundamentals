package labs_examples.multi_threading.examples.thread;

class ExampleController {
    public static void main(String args[]) {
        System.out.println("** Main Thread Start **");

        MyFirstThread thread1 = new MyFirstThread("First Thread");
        MyFirstThread thread2 = new MyFirstThread("Second Thread");
        MyFirstThread thread3 = new MyFirstThread("Third Thread");

        // notice when the next line prints
        System.out.println("** Main Thread End **");
    }
}

class MyFirstThread extends Thread {

    // Constructor for MyFirstThread
    MyFirstThread(String name) {
        // pass the name of the thread to the super constructor
        super(name);
        // start the thread
        start();
    }

    // run() is called automatically after start()
    // the code in the run() method is what will be run as an independent thread
    public void run() {
        System.out.println(getName() + " starting.");
        try {
            for(int count=0; count < 5; count++) {
                Thread.sleep(400);
                System.out.println("In " + getName() +
                        ", count is " + count);
            }
        }
        catch(InterruptedException exc) {
            System.out.println(getName() + " interrupted.");
        }

        System.out.println(getName() + " terminating.");
    }
}

