package labs_examples.methods;

public class RecursiveFactorial {
    public static void main(String[] args) {

        int x = factorial(5);
        System.out.println(x);
    }

    // factorial 5 = 1 * 2 * 3 * 4 * 5 = 120

    static int factorial(int x){
        int total;

        if(x == 1) // base case. in all recursives.
            return 1; // used to end recursive call.

        total = x * factorial(x - 1);

        return total;
    }
}

/*
                 1! = 1
    2 * 1! -> 2 * 1 = 2
    3 * 2! -> 3 * 2 = 6
    4 * 3! -> 4 * 6 = 24
    5 * 4! -> 5 * 24 = 120
    5!       = 120

 */
