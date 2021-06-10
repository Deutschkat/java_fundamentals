package labs_examples.conditions_loops.examples;

/*
   Use nested loops to find factors of numbers
   between 2 and 100.
*/
class FindFac {
    public static void main(String args[]) {

        for(int i=2; i <= 100; i++) {
            System.out.print("Factors of " + i + ": ");
            for(int j = 2; j < i; j++)
                if((i%j) == 0) System.out.print(j + " ");
            System.out.println();
        }
    }
}