package labs_examples.repl;

public class TryCatch {
    public static void main(String[] args) {


        int[] nums = {67, 43, 65, 0};

            try {
                int x = nums[1] / nums[3];
            } catch (ArithmeticException exc){
                System.out.println("Error Detected. Sorry bout that!");
            }

        System.out.println("Program complete.");

    }
}


// 1. No. Program complete did not print.
// 2. Yes, program complete did print.
// 3. Okay. Tried an arithmetic exception catch.