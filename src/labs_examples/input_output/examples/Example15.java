package labs_examples.input_output.examples;

// A simple disk-to-screen utilitiy that demonstrates a FileReader.

// This code requires JDK 7 or later.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class DtoS {
    public static void main(String args[]) {
        String s;

        String filePath = "src/labs_examples/input_output/files/KtoD.txt";


        // Create and use a FileReader wrapped in a BufferedReader.
        try (BufferedReader br = new BufferedReader(new FileReader(filePath)))
        {
            while((s = br.readLine()) != null) {
                System.out.println(s);
            }
        } catch(IOException exc) {
            System.out.println("I/O Error: " + exc);
        }
    }
}
