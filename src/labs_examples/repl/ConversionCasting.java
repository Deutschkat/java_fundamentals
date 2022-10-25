package labs_examples.repl;

public class ConversionCasting {
    public static void main(String[] args) {

        // please demonstrate converting an int to a double below  - example - why don't we need to cast the int to a double?

        int x = 7;
        double d = x;

        System.out.println(d);
        System.out.println(x);

        // please demonstrate casting a double to an int below

        double f = 20.12;

        int k = (int) f;

        System.out.println(f);
        System.out.println(k);

        // please demonstrate casting a double to a float below

        double t = 400.67589947;

        float r = (float) t;

        System.out.println(t);
        System.out.println(r);

        // please demonstrate casting a double with decimal values to an short

        double y = 365.7854;
        short e = (short) y;

        System.out.println(y);
        System.out.println(e);

        // now print out the short value - what happened to the decimals?

    }
}