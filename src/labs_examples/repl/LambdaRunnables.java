package labs_examples.repl;

public class LambdaRunnables {
    public static void main(String[] args) {

        // Step 1) declare a Lambda expression using the Runnable interface
        Runnable newRunnable = () -> {
            for (int x=0; x < 3; x++){
                try{
                    Thread.sleep(1500);
                }catch(InterruptedException ex){
                    System.out.println("Error");
                    ex.printStackTrace();
                }
                System.out.println(x + " We are the champions!");
            }
        };


        // Step 2) declare a new Thread object and pass in the Runnable Lambda

        Thread threaddyMercury = new Thread(newRunnable);


        // Step 3) start the thread
        threaddyMercury.start();

    }
}
