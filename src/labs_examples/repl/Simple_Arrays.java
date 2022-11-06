package labs_examples.repl;

public class Simple_Arrays {

    public static void main(String[] args) {

        // please demonstrate how to declare and initialize a
        // String array of size five below

        // once initialized, please populate each index of the array

        // once populated, please print out each element in the array
        // using a For Loop

        int[] array = new int[5];

        array[0] = 27;
        array[1] = 47;
        array[2] = 57;
        array[3] = 67;
        array[4] = 77;

        for (int i = 0; i < array.length; i++) {
            System.out.println(i + " = " + array[i]);

        }
    }
}
