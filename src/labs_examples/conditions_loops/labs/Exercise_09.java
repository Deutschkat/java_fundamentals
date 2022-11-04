package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 9: break
 *
 *      Demonstrate the use of the "break" statement to exit a loop.
 *
 */

public class Exercise_09 {
    public static void main(String[] args) {

        int y = 20;

        while(y <= 35){
            y++;
            if(y == 27){
                break;
            }
            System.out.println(y);
        }

    }
}
