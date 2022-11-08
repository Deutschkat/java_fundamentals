package labs_examples.arrays;

public class Multidimensional_Array_Video {
    public static void main(String[] args) {

        int[][] vals = new int[5][5];

        int count = 0;

        for(int i = 0; i < vals.length; i++) {

            System.out.println("i = " + i);

            for (int x = 0; x < vals[i].length; x++) {

                System.out.println("x = " + x);

                vals[i][x] = count;

                System.out.println("Vals at [i][x]: " + vals[i][x]);

                count++;
            }
        }

        for (int i = 0; i < vals.length; i++){
            for(int x = 0; x < vals[i].length; x++){
                System.out.print(vals[i][x] + " | ");
            }
            System.out.println();
        }

    }
}
