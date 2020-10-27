package labs_examples.arrays.examples;

// Use a for-each style for loop.
class ForEach {
    public static void main(String args[]) {
        int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int sum = 0;
        int count = 0;
        // Use for-each style for to display and sum the values.
        for(int x : nums) {
            System.out.print("Index is: " + count);
            System.out.println(" - Value is: " + x);

            count++;
        }

        System.out.println("Summation: " + sum);
    }
}
