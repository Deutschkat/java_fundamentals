package labs_examples.multi_threading.labs;

// I combined exercise 2 and 3 here.
public class ExerciseTwo {
    public static void main(String[] args) {

        System.out.println("Main start...");
        KatThread threadOne = new KatThread("Thread Theodore Logan");
        threadOne.setPriority(10);
        threadOne.start();

        KatThread threadTwo = new KatThread("Thread Danson");
        threadTwo.setPriority(1);
        threadTwo.start();

        KatThread threadThree = new KatThread("Thread Nugent");
        threadThree.setPriority(5);
        threadThree.start();

        System.out.println("Main ending...");

    }
}


    class KatThread extends Thread {

        KatThread(String name){

            super(name);

        }


        @Override
        public void run(){

            System.out.println(getName() + " is starting up..");
            try{
                for(int count=0; count<=20; count++){
                    Thread.sleep(500);
                    System.out.println(getName() + "'s count is currently: " + count);

                }

            }catch(InterruptedException ex1){
                System.out.println(getName() + " has been interrupted");
            }
            System.out.println("Stopping " + getName());

        }

    }

