package labs_examples.arrays.labs;

/**
 *  2D Array
 *
 *      Creat and populate a 5x5 2D array with multiples of 3, starting with 3. Once populated, print out the results.
 *
 *      The output should look something like this:
 *
 *      3 6 9 12 15
 *      18 21 24 27 30
 *      ...
 *      ...
 *      ...
 *
 */

public class Exercise_03 {

    public static void main(String[] args) {
        int[][] twoDArray = new int[5][5];
        // use 2 for loops to populate the 2d array
        // first for loop
        for (int innerLoop = 1; innerLoop < twoDArray.length; innerLoop++){
            for (int outerLoop = 0; outerLoop < twoDArray[innerLoop].length; outerLoop++){
                twoDArray[innerLoop][outerLoop] = innerLoop * 3;
                System.out.print(twoDArray[outerLoop][innerLoop]);
            }
            System.out.println();
        }
    }
}
