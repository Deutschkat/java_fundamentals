package labs_examples.arrays.labs;

/**
 *  Traversing Arrays Backwards
 *
 *      Please create and populate an array of your choosing. Then, please demonstrate how to print out every other
 *      element in the array in reverse order.
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {

        int [][] reverse = new int[7][7];

        int count = 48;

        for(int i = 0; i < reverse.length; i++){   // switched the greater than to a less than and initialized at 48
            for(int x = 0; x < reverse[i].length; x++){  // did same here to reverse order

                reverse[i][x] = count;
                count = count - 1;

            }
        }

        for(int i = 0; i < reverse.length; i++){
            for(int x = 0; x < reverse[i].length; x++){

                System.out.print(reverse[i][x] + " | ");
            }
            System.out.println();
        }

    }

}
