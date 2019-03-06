package labs_examples.conditions_loops.examples;

// Parts of the for can be empty.
class Empty {
    public static void main(String args[]) {
        int i;

        for(i = 0; i < 10; ) {
            System.out.println("Pass #" + i);
            i++; // increment loop control var
        }
    }
}