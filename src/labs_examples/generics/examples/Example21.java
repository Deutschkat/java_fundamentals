package labs_examples.generics.examples;

// Generics and labs_examples.arrays.
class Gen5<T extends Number> {
    T ob;

    T vals[]; // OK

    Gen5(T o, T[] nums) {
        ob = o;

        // This statement is illegal.
//  vals = new T[10]; // can't create an array of T

        // But, this statement is OK.
        vals = nums; // OK to assign reference to existent array
    }
}

class GenArrays {
    public static void main(String args[]) {
        Integer n[] = { 1, 2, 3, 4, 5 };

        Gen5<Integer> iOb = new Gen5<Integer>(50, n);

        // Can't create an array of type-specific generic references.
        // Gen<Integer> gens[] = new Gen<Integer>[10]; // Wrong!

        // This is OK.
        Gen5<?> gens[] = new Gen5<?>[10]; // OK
    }
}