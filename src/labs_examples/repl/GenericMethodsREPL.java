package labs_examples.repl;

public class GenericMethodsREPL {
    public static void main(String[] args) {
        // Step 1) create an array of 5 strings then call the printArray() method and pass the String array
        String[] names = {"Osbourne", "Dio", "McCartney", "Grohl", "Harrison" };
        printArray(names);

        // Step 1) create an array of 5 ints then call the printArray() method and pass the int array
        Integer[] nums = {5, 7, 8, 9, 200};
        printArray(nums);

        // Step 1) create an array of 5 doubles then call the printArray() method and pass the double array
        Double[] doubleList = {25.50, 26.75, 50.1, 52.5, 55.7};
        printArray(doubleList);

    }

    public static < E > void printArray( E[] inputArray ) {
        // Display array elements
        for(E element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }
}
