package videos_source_code.methods.pass_by_value;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class PassByVal {

    public static void main(String[] args) {
        double a = 12;
        double b = 14;

        System.out.println("before a:" + a);
        System.out.println("before b:" + b);

        someOtherMethod(a, b);

        System.out.println("before a:" + a);
        System.out.println("before b:" + b);
    }

    public static void someOtherMethod(double a, double b){
        a = a * 10;
        System.out.println(a);
        b = b * 20;
        System.out.println(b);
    }
}
