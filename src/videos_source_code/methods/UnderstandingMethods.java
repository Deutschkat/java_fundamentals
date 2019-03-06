package videos_source_code.methods;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class UnderstandingMethods {

    public static void main(String[] args) {
        // the main method is where every application
        // begins by default
        System.out.println("first we're here");
        String time = getCurrentTime();
        System.out.println("The current time is: " + time);
        System.out.println("now we're finishing up");

    }

    public static String getCurrentTime(){
        System.out.println("now we're here printing time");
        String time = new SimpleDateFormat("HH:mm:ss").format(new Date());
        return time;
    }

}
