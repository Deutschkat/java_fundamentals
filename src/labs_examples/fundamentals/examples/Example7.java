package labs_examples.fundamentals.examples;

/*
  Demonstrate a block of code.

  Call this file BlockDemo.java.
*/
class BlockDemo {
    public static void main(String args[]) {
        double i = 5, j = 10, d;

//        i = 0; // will cause block to not execute
//        j = 10;


        // the target of this if is a block
        // code block used for two or more statements
        if(i != 0) {
            System.out.println("i does not equal zero");
            d = j / i;
            System.out.println("j / i is " + d);
        }
    }
}