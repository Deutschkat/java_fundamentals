package labs_examples.multi_threading.labs;

//This one was complicated because I used one of Ryan's examples to change it up and learn from it.
// I definitely did NOT come up with this all by myself, but changed it to make it my own,
// because I liked the way he did it.

public class Exercise5 {
    public static void main(String[] args) {
        KatWaitNotifyThread threadOne = new KatWaitNotifyThread("Threaddy Roosevelt");

        try{
            Thread.sleep(2000);

            threadOne.pauseThread();
            System.out.println("Pausing thread...");

            Thread.sleep(2000);

            threadOne.startThreadBackUp();
            System.out.println("Resuming thread.");
            Thread.sleep(2000);

            threadOne.pauseThread();
            System.out.println("Stopping thread.");

            threadOne.stopThread();

        }catch (InterruptedException ex1){
            System.out.println("Interrupted.");
        }

    }



}

class KatWaitNotifyThread implements Runnable{

    Thread thread;

    boolean paused;

    boolean stopped;

    KatWaitNotifyThread(String name){
        thread = new Thread(this, name);
        paused = false;
        stopped = false;
        thread.start();
    }

    public void run(){
        System.out.println(thread.getName() + " is starting up...");
        try {
            for (int k = 0; k < 200; k++) {
                Thread.sleep(100);
                System.out.println(k + " ");

            synchronized (this) {
                while (paused) {
                    wait();
                }
                if (stopped) break;
            }

        }
        }catch(InterruptedException ex1) {
            System.out.println(thread.getName() + " was interrupted.");
        }
        System.out.println("Exiting program.");

    }

    synchronized void stopThread(){
        stopped = true;
        paused = false;
        notify();

    }

    synchronized void pauseThread(){
        paused = true;

    }

    synchronized  void startThreadBackUp(){
        paused = false;
        notify();
    }


}
