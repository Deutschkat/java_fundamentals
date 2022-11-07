package labs_examples.repl;

public class Multi_Dimensional_Arrays {
    public static void main(String[] args) {

        // please demonstrate how to declare a Two-Dimensional Array
        // with a height of 4 and a width of 5 below

        // using a nested for loop, please populate every index in the 2-D Array

        // once populated, use a nested for loop to print each element in the 2-D array

        int[][] array = new int[4][5];

        for (int i = 0; i < array.length; i++) {
            for (int x = 0; x < array[i].length; x++) {
                array[i][x] = i * x;
                System.out.print(array[i][x] + " | ");


            }
            System.out.println();

        }
    }
}
