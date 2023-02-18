package labs_examples.repl;

public class MultiThreadingRepl {
    public static void main(String[] args) {

        // Step 1) demonstrate creating a new Thread using the MyThread class below
        MyThread threadOne = new MyThread("First Thread");

        // Step 2) demonstrate creating (and starting) a new Thread using the MyOtherThread class below
        MyOtherThread threadTwo = new MyOtherThread();
        threadTwo.setName("Dave");
        threadTwo.start();
    }
}

class MyThread extends Thread {

    public MyThread(String name){
        super(name);
        start();
    }

    @Override
    public void run(){
        System.out.println("I'm in a thread named " + getName() + "!");
    }
}

class MyOtherThread extends Thread {

    @Override
    public void run(){
        System.out.println("I'm in a thread named " + getName() + "!");
    }
}

