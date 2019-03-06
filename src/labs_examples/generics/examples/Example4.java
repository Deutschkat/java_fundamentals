package labs_examples.generics.examples;

// In this version of NumericFns, the type argument
// for T must be either Number, or a class derived
// from Number.
class NumericFns2<T extends Number> {
    T num;

    // Pass the constructor a reference to
    // a numeric object.
    NumericFns2(T n) {
        num = n;
    }

    // Return the reciprocal.
    double reciprocal() {
        return 1 / num.doubleValue();
    }

    // Return the fractional component.
    double fraction() {
        return num.doubleValue() - num.intValue();
    }

    // ...
}

// Demonstrate NumericFns.
class BoundsDemo {
    public static void main(String args[]) {

        NumericFns2<Integer> iOb =
                new NumericFns2<Integer>(5);

        System.out.println("Reciprocal of iOb is " +
                iOb.reciprocal());
        System.out.println("Fractional component of iOb is " +
                iOb.fraction());

        System.out.println();

        NumericFns2<Double> dOb =
                new NumericFns2<Double>(5.25);

        System.out.println("Reciprocal of dOb is " +
                dOb.reciprocal());
        System.out.println("Fractional component of dOb is " +
                dOb.fraction());


        // This won't compile because String is not a
        // subclass of Number.
//    NumericFns<String> strOb = new NumericFns<String>("Error");
    }
}