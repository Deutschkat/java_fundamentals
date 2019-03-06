package labs_examples.generics.examples;
// Use a wildcard.

class NumericFns3<T extends Number> {
    T num;

    // Pass the constructor a reference to
    // a numeric object.
    NumericFns3(T n) {
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

    // Determine if the absolute values of two
    // objects are the same.
    boolean absEqual(NumericFns3<?> ob) {
        if(Math.abs(num.doubleValue()) ==
                Math.abs(ob.num.doubleValue())) return true;

        return false;
    }

    // ...
}

// Demonstrate a wildcard.
class WildcardDemo {
    public static void main(String args[]) {

        NumericFns3<Integer> iOb =
                new NumericFns3<Integer>(6);

        NumericFns3<Double> dOb =
                new NumericFns3<Double>(-6.0);

        NumericFns3<Long> lOb =
                new NumericFns3<Long>(5L);

        System.out.println("Testing iOb and dOb.");
        if(iOb.absEqual(dOb))
            System.out.println("Absolute values are equal.");
        else
            System.out.println("Absolute values differ.");

        System.out.println();

        System.out.println("Testing iOb and lOb.");
        if(iOb.absEqual(lOb))
            System.out.println("Absolute values are equal.");
        else
            System.out.println("Absolute values differ.");

    }
}