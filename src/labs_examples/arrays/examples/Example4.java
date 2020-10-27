package labs_examples.arrays.examples;

// Demonstrate an array overrun.
class ArrayErr {
    public static void main(String args[]) {
        int sample[] = new int[10];
        int i;

        // generate an array overrun - ArrayIndexOutOfBoundsException
        for(i = 0; i < 100; i = i+1)
            sample[i] = i;
            // the line above will generate an exception when "i" is > 9
            // this is because the underlying array has a length of 10
    }
}