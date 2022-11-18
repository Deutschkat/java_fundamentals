package labs_examples.methods.pass_by_value;

public class PassByVal {
    public static void main(String[] args) {

        double a = 12;
        double b = 14;
        System.out.println("a before: " + a);
        System.out.println("b before: " + b);
        someOtherMethod(a, b);
                                // some method has its OWN copy of the
                                // primitive variables. It will not
                                // change them for the rest of the class.
                                // PASS BY VALUE

        System.out.println("a before: " + a);
        System.out.println("b before: " + b);

    }

    public static void someOtherMethod(double a, double b){
        a = a * 10;
        System.out.println(a);
        b = b * 20;
        System.out.println(b);
    }

}
