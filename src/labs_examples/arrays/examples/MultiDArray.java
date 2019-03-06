package labs_examples.arrays.examples;

//for more 2D array examples see: labs_examples.datatypes_operators/examples/labs_examples.arrays

class MultiDArray {
    public static void main(String args[]) {
        int t, i;
        // declare and initialize array
        int[][] table = new int[3][4];

        // populate 2D array
        for(t=0; t < 3; t++) {

            for(i=0; i < 4; i++) {
                table[t][i] = (t*4)+i+1;
            }
        }

        // print out each element in 2D array
        for(t=0; t < 3; t++) {
            for(i=0; i < 4; i++) {
                System.out.print(table[t][i] + " ");
            }
            System.out.println();
        }

    }
}
