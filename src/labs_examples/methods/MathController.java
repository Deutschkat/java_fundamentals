package labs_examples.methods;

public class MathController {
    public static void main(String[] args) {

        int a = 2;
        int b = 3;
        double x = 12.34;
        double y = 45.67;

        int c = CustomMath.multiply(a, b);
        double z = CustomMath.multiply(x, y);

        System.out.println(z);
        System.out.println(c);

    }
}

// VIDEO FOR METHOD PARAMETERS SUPER HELPFUL IF STUCK.
//Ctrl click will take you to the multiply method.