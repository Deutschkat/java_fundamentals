package labs_examples.conditions_loops.examples;

// The body of a loop can be empty.
class Empty3 {
    public static void main(String args[]) {
        int i;
        int sum = 0;

        // sum the numbers through 5
        for(i = 1; i <= 10000; sum += i++) ;

        System.out.println("Sum is " + sum);
    }
}