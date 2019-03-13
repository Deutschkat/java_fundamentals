package labs_examples.input_output.examples;

/*
   Compare two files.

   To use this program, specify the names
   of the files to be compared on the command line.

   java CompFile FIRST.TXT SECOND.TXT

   This code requires JDK 7 or later.
*/

import java.io.FileInputStream;
import java.io.IOException;

class CompFiles {
    public static void main(String args[])
    {
        int i=0, j=0;

        String filePath1 = "src/labs_examples/input_output/files/char_data.txt";
        String filePath2 = "src/labs_examples/input_output/files/char_data_2.txt";


        // Compare the files.
        try (FileInputStream f1 = new FileInputStream(filePath1);
             FileInputStream f2 = new FileInputStream(filePath2))
        {
            // Check the contents of each file.
            do {
                i = f1.read();
                j = f2.read();
                if(i != j)
                    break;
            } while(i != -1 && j != -1);

            if(i != j)
                System.out.println("Files differ.");
            else
                System.out.println("Files are the same.");
        } catch(IOException exc) {
            System.out.println("I/O Error: " + exc);
        }
    }
}