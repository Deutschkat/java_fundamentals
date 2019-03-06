package videos_source_code.input_output.byte_streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by ryandesmond - https://codingnomads.co
 */

// example class demonstrating simple Byte Stream IO to copy a file from one location to another
public class CopyByteByByte {

    public static void main(String[] args) throws IOException {

        // declare Input and Output Streams outside of Try statment so they're
        // accessible in the Finally statement
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            // initialize them within the Try in case the files do not exist or cannot be accessed
            in = new FileInputStream("/path/to/some/inputFile.txt");
            out = new FileOutputStream("/path/to/some/outputFile.txt");
            int c;

            // while there is more data to read in the InputStream "in"
            // InputStream's read() method returns -1 when the end of the file is reached
            while ((c = in.read()) != -1) {
                // write the data (byte by byte) to the OutputStream "out"
                out.write(c);
            }
        } catch (IOException exc){
            System.out.println("An error occurred: " + exc.getMessage());
        } finally {
            // close connections to files
            if (null != in) {
                in.close();
            }
            if (null != out) {
                out.close();
            }
        }
    }
}