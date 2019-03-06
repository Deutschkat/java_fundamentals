package labs_examples.fundamentals.examples;

/*
  Demonstrate the if.

  Call this file IfDemo.java.
*/
class IfDemo {
    public static void main(String args[]) {
        int a, b, c;

        a = 2;
        b = 3;

        //check if a is less that b
        if(a < b) System.out.println("a is less than b");

        //check if they are equal
        //they are not so
        // this won't display anything
        if(a == b) System.out.println("you won't see this");

        //new line break
        System.out.println();

        c = a - b; // c contains -1

        System.out.println("c contains -1");// not conditional
        if(c >= 0) System.out.println("c is non-negative"); //is c 0 or positive
        if(c < 0) System.out.println("c is negative");//is c negative

        System.out.println();

        //now setting c to positive number
        // goes through same process of checking
        c = b - a; // c now contains 1
        System.out.println("c contains 1");
        if(c >= 0) System.out.println("c is non-negative");
        if(c < 0) System.out.println("c is negative");

    }
}
