package labs_examples.conditions_loops.examples;

// Read input until a q is received.
class Break2 {
    public static void main(String args[])
            throws java.io.IOException {

        char ch;

        for( ; ; ) {
            ch = (char) System.in.read(); // get a char
            if(ch == 'q') break;
        }
        System.out.println("You pressed q!");
    }
}