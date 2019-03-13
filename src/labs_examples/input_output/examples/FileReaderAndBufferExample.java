package labs_examples.input_output.examples;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
import java.io.*;
public class FileReaderAndBufferExample
{
    public static void main(String[] args)
    {
        String filePath = "src/labs_examples/input_output/files/char_data.txt";

        try {
            readCharacterByCharacter(filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            readLineByLine(filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readCharacterByCharacter(String filePath) throws IOException {

        // pass the path to the file as a parameter
        FileReader fr =
                new FileReader(filePath);

        int i;


        while ((i=fr.read()) != -1)
            System.out.print((char) i);

    }

    public static void readLineByLine(String filePath) throws IOException {

        File file = new File(filePath);

        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;

        while ((st = br.readLine()) != null)
            System.out.println(st);
    }
}