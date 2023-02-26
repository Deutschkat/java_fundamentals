package labs_examples.repl;

public class LambdaREPL2 {  public static void main(String[] args) {

    // Step 1) Create a lambda expression using the interface below

    LambdaExample example = (a, b) -> {
        int sum = a + b;
        return sum;
    };

    System.out.println(example.apply(10,12));

    LambdaExample example2 = (a, b) -> {
        int x = a * b;
        return x;
    };

    System.out.println(example2.apply(10,12));

    // Step 2) call the apply() method on the lambda object

    // Step 3) redefine the lambda

    // Step 4) call the apply() method again

}
}

interface LambdaExample {
    public int apply(int a, int b);
}

