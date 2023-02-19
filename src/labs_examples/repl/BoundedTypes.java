package labs_examples.repl;

public class BoundedTypes {
    public static void main(String[] args) {

        // Step 1) create the generic method as instructed in the NumericExample class

        // Step 2) call that method and pass two doubles
        int a = NumericExample.add(10.753234, 2.236356);
        System.out.println(a);

        // Step 3) call that method and pass two ints
        int b = NumericExample.add(7, 10);
        System.out.println(b);

        // Step 4) call that method and pass two floats
        int c = NumericExample.add(35f, 23f);
        System.out.println(c);

        // Step 5) call that method and pass one int and one double
        int d = NumericExample.add(7, 25.7);
        System.out.println(d);

    }
}

class NumericExample {
    public static <K extends Number, T extends Number> int add(K a, T b){
       return a.intValue() + b.intValue();
    }

    // write a generic method below that will return the sum of ANY two numeric values (no matter what their specific data type is) (but remember the values must be Numeric)

}
