package labs_examples.arrays.examples;

// The for-each loop is essentially read-only.
class NoChange {
    public static void main(String args[]) {
        int nums[] = { 987,5675,9879879,7646546,678768 };

        for(int x : nums) {
            System.out.print(x + " ");
        }
    }
}