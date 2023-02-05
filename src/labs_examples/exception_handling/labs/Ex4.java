package labs_examples.exception_handling.labs;

public class Ex4 {

    public static void main(String[] args) {

        int[] nums = {6, 7, 8, 3, 0};

        try {
            int x = nums[0] / nums[4];
        } catch (ArithmeticException aex) {
            System.out.println("That number not divisible by zero.");
            try {
                int y = nums[0] / nums[3];
            } catch (ArithmeticException aex2) {
                System.out.println("This wont print.");
            }

        }

    }
}
