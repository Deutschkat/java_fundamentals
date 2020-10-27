package labs_examples.arrays.examples;

// Use the length array member.
class LengthDemo {
    public static void main(String args[]) {

        int table[][] = { // a variable-length table
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9}
        };


        for (int i = 0; i < table.length; i++ ){
            for (int x = 0; x < table[i].length; x++){
                System.out.println(table[i][x]);
            }
        }
    }
}
