package labs_examples.inheritance.examples;

/**
 * Created by ryandesmond on 3/27/17.
 */
public class Controller {
    public static void main(String[] args) {

        Whale willy = new Whale(true, false, 3, false);
        willy.setNumLegs(0);
        willy.setAge(15);
        willy.setColor("Black/White");
        willy.setHasFur(false);
        willy.setLiveBorn(true);
        willy.setGeography("North Pacific");
        willy.setSound("click click click");


        System.out.println(willy.toString());

    }
}
