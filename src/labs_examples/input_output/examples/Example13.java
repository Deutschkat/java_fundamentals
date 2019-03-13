package labs_examples.input_output.examples;

// Demonstrate PrintWriter.

import java.io.PrintWriter;

class PrintWriterDemo {
    public static void main(String args[]) {

        PrintWriter pw = new PrintWriter(System.out, true);
        int i = 10;
        double d = 123.65;

        pw.println("Using a PrintWriter.");
        pw.println(i);
        pw.println(d);

        pw.println(i + " + " + d + " is " + (i+d));
    }
}