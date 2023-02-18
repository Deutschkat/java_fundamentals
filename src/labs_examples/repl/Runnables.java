package labs_examples.repl;

public class Runnables {

    public static void main(String[] args) {

    // Step 1: demonstrate creating a new thread using the MyRunnable class below
        MyRunnable threadOne = new MyRunnable("ThreadOneRunnable");



    // Step 2: demonstrate create a new thread using the MyOtherRunnable class below
        MyOtherRunnable threadTwo = new MyOtherRunnable();

}
}

class MyRunnable implements Runnable {

    Thread thread;

    public MyRunnable(String name){
        thread = new Thread(this, name);
        thread.start();
    }

    @Override
    public void run(){
        System.out.println("I'm in a thread name " + thread.getName() + "!");
    }

}

class MyOtherRunnable implements Runnable {
    @Override
    public void run(){
        System.out.println("I'm in a thread name " + Thread.currentThread().getName() + "!");
    }
}
