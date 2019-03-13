package labs_examples.input_output.examples;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class BufferedByteStream {

    public static void main(String[] args) {

        // we need to declare these streams outside the try block since we need to
        // access them and close in the finally block at the bottom
        FileInputStream inputStream = null;
        BufferedInputStream bufferedInputStream = null;

        String filePath = "src/labs_examples/input_output/files/char_data.txt";

        try {

            bufferedInputStream = new BufferedInputStream(new FileInputStream(filePath));

            // this will hold the collection of bytes that we read at once
            byte[] buffer = new byte[8];
            int bytesRead = 0;

            // this while loop will read the file 5 bytes at a time
            while ((bytesRead = bufferedInputStream.read(buffer)) != -1){
                // print out bytes read to console
                System.out.print(new String(buffer, 0, bytesRead));
            }
        } catch (IOException exc) {
            exc.printStackTrace();
        } finally {
            // there's a possibility that closing these streams can throw an exception
            // we be using the Try-With-Resources shortly to avoid the need for this
            try {
                inputStream.close();
                bufferedInputStream.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }


}
