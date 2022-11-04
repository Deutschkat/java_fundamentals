package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 10: continue
 *
 *      Demonstrate the use of the "continue" statement to skip to the next iteration of a loop.
 *
 */

public class Exercise_10 {
    public static void main(String[] args) {

        for(int j = 10; j < 20; j++){
            if (j == 14){
                continue;
            }
            System.out.println("j = " +j);
        }
    }
}
