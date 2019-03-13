package labs_examples.input_output.examples;

/* This variation wraps the code that opens and
   accesses the file within a single try block.
   The file is closed by the finally block.
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class ShowFile2 {
    public static void main(String args[])
    {
        int i;

        String filePath = "src/labs_examples/input_output/files/byte_data";

        FileInputStream fin = null;

        // The following code opens a file, reads characters until EOF
        // is encountered, and then closes the file via a finally block.
        try {
            fin = new FileInputStream(filePath);

            do {
                i = fin.read();
                if(i != -1)
                    System.out.print((char) i);
            } while(i != -1);

        } catch(FileNotFoundException exc) {
            System.out.println("File Not Found.");
        } catch(IOException exc) {
            System.out.println("An I/O Error Occurred");
        } finally {
            // Close file in all cases.
            try {
                if(fin != null)
                    fin.close();
            } catch(IOException exc) {
                System.out.println("Error Closing File");
            }
        }
    }
}