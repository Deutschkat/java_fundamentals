package labs_examples.multi_threading.labs;

public class ExerciseOne {
    public static void main(String[] args) {
        System.out.println("Starting up your threads in main...");

        // First way to use the runnable interface
        KatRunnable threadOne = new KatRunnable("Dave Threadington");
        //Second way to use the runnable interface
        Thread threadTwo = new Thread(new KatRunnable("Thready the Second"));

        System.out.println("Ending your threads in main...");

    }

    }

    class KatRunnable implements Runnable {
        Thread thread;

        public KatRunnable(String name){

            thread = new Thread(this, name);

            thread.start();

        }

        @Override
        public void run() {
            System.out.println(thread.getName() + " is starting up.");
            try{
                for(int count=0; count<=7; count++){
                    Thread.sleep(300);
                    System.out.println("The count of " + thread.getName() + " is " + count);

                }
            }catch(InterruptedException ex1){
                System.out.println("Thread Interrupted");

            }

        }


    }

