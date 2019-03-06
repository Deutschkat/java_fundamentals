package labs_examples.exception_handling.examples;

// This won't work!
class ExcTypeMismatch {
    public static void main(String args[]) {
        int nums[] = new int[4];
        int i = 0;
        int x = 2;
        int y = 0;

        try {
            System.out.println("Before exception is generated.");

            // generate an index out-of-bounds exception
            //nums[7] = 10;
            y = x/i;

            System.out.println("this won't be displayed");
        }

    /* Can't catch an array boundary error with an
       ArithmeticException. */
        catch (ArithmeticException exc) {
            // catch the exception
            System.out.println("Arithmentic exception " + exc.toString());
        }
        catch (IndexOutOfBoundsException exc1){
            System.out.println("Index out-of-bounds!");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("After catch statement.");
    }
}