package labs_examples.input_output.labs;

/**
 * Input/Output Exercise 1: File input/output
 *
 *      Using the BufferedInputStream, read a text file 5 bytes at a time and write each byte to a new file.
 *      Make sure you close the connections to both files.
 *
 *
 */

class Example {
    public static void main(String[] args) {

        int[] vals = {1,2,3,4,5};

        for(int i = 0; i < vals.length/2; ++i){
            int temp = vals[i];
            vals[i] = vals[vals.length - 1 -i];
            vals[vals.length - 1 -i] = temp;
        }

        for(int i : vals){
            System.out.println(i);
        }

    }
}