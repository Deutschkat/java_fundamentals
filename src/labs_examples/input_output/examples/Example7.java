package labs_examples.input_output.examples;

/* A version of CopyFile that uses try-with-resources.
   It demonstrates two resources (in this case files) being
   managed by a single try statement.

   Note: This code requires JDK 7 or later.
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class CopyFile2 {
    public static void main(String args[]) throws IOException
    {
        int i;

        String fileReadPath = "src/labs_examples/input_output/files/char_data.txt";
        String fileWritePath = "src/labs_examples/input_output/files/char_data_copy_2.txt";

        // Open and manage two files via the try statement.
        try (FileInputStream fin = new FileInputStream(fileReadPath);
             FileOutputStream fout = new FileOutputStream(fileWritePath))
        {

            do {
                i = fin.read();
                if(i != -1)
                    fout.write(i);
            } while(i != -1);

        } catch(IOException exc) {
            System.out.println("I/O Error: " + exc);
        }
    }
}