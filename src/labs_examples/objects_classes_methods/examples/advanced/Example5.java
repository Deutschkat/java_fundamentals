package labs_examples.objects_classes_methods.examples.advanced;

// Simple types are passed by value.
class Test {
    /* This method causes no change to the arguments
       used in the call. */
    void noChange(int i, int j) {
        i = i + j;
        j = -j;
        System.out.println("in other method: " +
                i + " " + j);
    }
}

class CallByValue {
    public static void main(String args[]) {
        Test ob = new Test();

        int a = 15, b = 20;

        System.out.println("a and b before call: " +
                a + " " + b);

        ob.noChange(a, b);

        System.out.println("a and b after call: " +
                a + " " + b);
    }
}
