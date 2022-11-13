package labs_examples.arrays.labs;

/**
 *  Irregular Arrays
 *
 *      Create and populate a 2 dimensional irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {


        int[][] doggos = {
                {7, 14, 21},
                {28, 35, 42},
                {49, 56, 63, 70},
        };

        for(int i = 0; i < doggos.length; i++){
            for(int x = 0; x < doggos[i].length; x++){       //This for statement prints out your 2D array.
                System.out.print(doggos[i][x] + " | ");
            }
            System.out.println();
        }

    }

}
