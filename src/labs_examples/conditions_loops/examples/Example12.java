package labs_examples.conditions_loops.examples;

// A negatively running for loop.
class DecrFor {
    public static void main(String args[]) {
        int x;

        for(x = 100; x > -100; x -= 5)
            System.out.println(x);
    }
}

/*
for(count=10; count < 5; count++)
  x += count; // this statement will not execute
 */