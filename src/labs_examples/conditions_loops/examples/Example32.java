package labs_examples.conditions_loops.examples;

// Use continue.
class ContDemo {
    public static void main(String args[]) {
        int i;

        // print even number between 0 and 100
        for(i = 0; i<=100; i++) {
                if((i%2) != 0) continue; // iterate
            System.out.println(i);
        }
    }
}
