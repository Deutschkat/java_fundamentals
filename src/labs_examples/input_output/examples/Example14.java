package labs_examples.input_output.examples;

// A simple key-to-disk utility that demonstrates a FileWriter.

// This code requires JDK 7 or later.

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

class KtoD {
    public static void main(String args[])
    {

        String str;
        String filePath = "src/labs_examples/input_output/files/KtoD.txt";

        BufferedReader br =
                new BufferedReader(
                        new InputStreamReader(System.in));

        System.out.println("Enter text ('stop' to quit).");

        try (FileWriter fw = new FileWriter(filePath))
        {
            do {
                System.out.print(": ");
                str = br.readLine();

                if(str.compareTo("stop") == 0)
                    break;

                str = str + "\r\n"; // add newline
                fw.write(str);
            } while(str.compareTo("stop") != 0);
        } catch(IOException exc) {
            System.out.println("I/O Error: " + exc);
        }
    }
}
