package labs_examples.exception_handling.examples;

// Manually throw an exception.
class ThrowDemo {
    public static void main(String args[]) {
        try {
            System.out.println("Before throw.");
            throw new ArithmeticException();
        }
        catch (ArithmeticException exc) {
            // catch the exception
            System.out.println("Exception caught.");
        }

        try {
            int x = testThrow();
        } catch (ArithmeticException ae){
            throw ae;
        }

        System.out.println("After try/catch block.");
    }

    public static int testThrow() throws ArithmeticException{

        throw new ArithmeticException();

    }
}