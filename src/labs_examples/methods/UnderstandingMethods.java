package labs_examples.methods;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UnderstandingMethods {

    public static void main(String[] args) {

        // the main method is where every application
        // begins by default
        System.out.println("First, we are here.");
        printCurrentTime();
        System.out.println("Now, we are finishing up.");
    }

    public static void printCurrentTime(){
        System.out.println("Now, we are here.");
        String time = new SimpleDateFormat("HH:mm:ss").format(new Date());
        System.out.println("The current time is: " + time);
    }
}