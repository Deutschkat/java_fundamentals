package labs_examples.input_output.examples;

/* Display a text file.

   To use this program, specify the name
   of the file that you want to see.
   For example, to see a file called TEST.TXT,
   use the following command line.

   java ShowFile TEST.TXT
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class ShowFile {
    public static void main(String args[])
    {
        String filePath = "src/labs_examples/input_output/files/byte_data";

        int i;
        FileInputStream fin;

        try {
            fin = new FileInputStream(filePath);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return;
        }


        try {
            // read bytes until EOF is encountered
            do {
                i = fin.read();
                if(i != -1)
                    System.out.write((char) i);
            } while(i != -1);
        } catch(IOException exc) {
            System.out.println("Error reading file.");
        }

        try {
            fin.close();
        } catch(IOException exc) {
            System.out.println("Error closing file.");
        }

    }
}