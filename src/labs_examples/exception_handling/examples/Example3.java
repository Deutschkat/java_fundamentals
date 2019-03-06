package labs_examples.exception_handling.examples;

// Let JVM handle the error.
class NotHandled {
    public static void main(String args[]) {
        int nums[] = new int[4];

        System.out.println("Before exception is generated.");

        // generate an index out-of-bounds exception
        nums[7] = 10;
    }
}
