package videos_source_code.input_output.byte_streams;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class BufferedInputStreamExample {

    public static void main(String[] args) {

        FileInputStream inputStream = null;

        BufferedInputStream bufferedInputStream = null;

        try {

            inputStream = new FileInputStream("/Users/ryandesmond/Desktop/input_output/file.txt");

            bufferedInputStream = new BufferedInputStream(inputStream);

            // this will hold the collection of bytes (5 bytes) that we read at once
            byte[] buffer = new byte[5];
            int bytesRead = 0;

            while ((bytesRead = bufferedInputStream.read(buffer)) != -1){
                // print out bytes read to console
                // if you set a breakpoint here you'll see how 5 bytes at a time are printing
                System.out.print(new String(buffer, 0, bytesRead));
            }
        } catch (IOException exc) {
            exc.printStackTrace();
        } finally {

            // there's a possibility that closing these streams can throw an exception
            try {
                inputStream.close();
                bufferedInputStream.close();

            } catch (IOException ex) {
                ex.printStackTrace();

            }
        }
    }
}