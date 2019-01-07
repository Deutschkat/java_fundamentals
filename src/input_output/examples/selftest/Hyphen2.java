package input_output.examples.selftest;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/* Copy a text file, substituting hyphens for spaces.

   This version uses character streams.

   To use this program, specify the name
   of the source file and the destination file.
   For example,

   java Hyphen2 source target

   This code requires JDK 7 or later.
*/

class Hyphen2 {
    public static void main(String args[])
            throws IOException {
        int i;

        // First make sure that both files have been specified.
        if (args.length != 2) {
            System.out.println("Usage: CopyFile From To");
            return;
        }

        // Copy file and substitute hyphens.
        // Use the try-with-resources statement.
        try (FileReader fin = new FileReader(args[0]);
             FileWriter fout = new FileWriter(args[1])) {

            do {
                i = fin.read();

                if ((char) i == ' ')
                    i = '-';
                if (i != -1)
                    fout.write(i);

            } while (i != -1);

        } catch (IOException exc) {
            System.out.println("I/O Error: " + exc);
        }
    }
}