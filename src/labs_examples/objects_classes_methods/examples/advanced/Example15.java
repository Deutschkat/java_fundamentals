package labs_examples.objects_classes_methods.examples.advanced;

// A simple example of recursion.
class Factorial {

    // This is a recursive function.
    int factR(int n) {
        System.out.println("in factR");
        int result;

        if(n==1)
            return 1;

        result = factR(n-1) * n;

        return result;
    }

    // This is an iterative equivalent.
    int factI(int n) {
        int t, result;

        result = 1;
        for(t=1; t <= n; t++)
            result *= t;
        return result;
    }

    void count(int i){
        if (i > 0){
            System.out.println(i);
            count(i-1);
            System.out.println(i + " on the way up");
        }
        else{
            System.out.println("done");
        }
    }
}

class Recursion {
    public static void main(String args[]) {
        Factorial f = new Factorial();

        f.factR(5);
        //f.count(5);


        System.out.println("Factorials using recursive method.");
        System.out.println("Factorial of 3 is " + f.factR(3));
        System.out.println("Factorial of 4 is " + f.factR(4));
        System.out.println("Factorial of 5 is " + f.factR(5));
        System.out.println();

        System.out.println("Factorials using iterative method.");
        System.out.println("Factorial of 3 is " + f.factI(3));
        System.out.println("Factorial of 4 is " + f.factI(4));
        System.out.println("Factorial of 5 is " + f.factI(5));
    }
}