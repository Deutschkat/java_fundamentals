package labs_examples.multi_threading.labs;

public class Exercise4 {
    public static void main(String[] args) {

        Sender kat = new Sender();
        ThreadedMessage m1 = new ThreadedMessage("Oh hi there!", kat);
        ThreadedMessage m2 = new ThreadedMessage("How are you?", kat);

        m1.start();
        m2.start();

        try{
            m1.join();
            m2.join();
        }catch(Exception ex){
            System.out.println("Interrupted Message.");
        }

    }



}

class Sender{
    public void textMessage(String message){
        System.out.println("\n" + "Sending: " + message);
        try{
            Thread.sleep(700);
        }catch(Exception ex){
            System.out.println("Thread interrupted.");
        }
        System.out.println("\n" + "Delivered: " + message);

    }
}

class ThreadedMessage extends Thread {
    private String message;
    private Thread t;
    Sender sender;

    ThreadedMessage(String k, Sender object){

        message = k;
        sender = object;
    }

    public void run() {
        synchronized (sender){
            sender.textMessage(message);
        }

    }

}
