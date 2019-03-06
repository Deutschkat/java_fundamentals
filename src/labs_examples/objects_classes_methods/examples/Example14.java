package labs_examples.objects_classes_methods.examples;

class Pwr_4_14 {
    double base;
    int exp;
    double val;

    Pwr_4_14(double base, int exp) {
        this.base = base;
        this.exp = exp;

        val = 1;

        if(exp == 0)
            return;

        for( ; exp > 0; exp--)
            val = val * base;
    }

    double get_val() {
        return val;
    }
}

class DemoPwr {
    public static void main(String args[]) {
        Pwr_4_14 x = new Pwr_4_14(4.0, 2);
        Pwr_4_14 y = new Pwr_4_14(2.5, 1);
        Pwr_4_14 z = new Pwr_4_14(5.7, 0);

        System.out.println(x.base + " raised to the " + x.exp +
                " power is " + x.get_val());
        System.out.println(y.base + " raised to the " + y.exp +
                " power is " + y.get_val());
        System.out.println(z.base + " raised to the " + z.exp +
                " power is " + z.get_val());
    }
}