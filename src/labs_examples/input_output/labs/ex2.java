package labs_examples.input_output.labs;

import java.io.*;

public class ex2 {
    public static void main(String[] args) {

        String filePath = "C:\\Users\\deuts\\Documents\\CodingNomads\\labs\\online-java-fundamentals\\src\\labs_examples\\input_output\\labs\\CharacterText.txt";

        //Read char by char and printed out the chars.

        try {
            readInputCharacterByCharacter(filePath);
            System.out.println();
            System.out.print("The above line has been written as an encrypted file successfully!");
        } catch (IOException ex) {
            ex.printStackTrace();
        }


    }


    public static void readInputCharacterByCharacter(String filePath) throws IOException{

        FileReader fr = new FileReader(filePath);

        int x;

        while((x = fr.read()) != -1)
            System.out.print((char)x);

    }

    public static void writeInputCharacterByCharacter(String outputFilePath) throws IOException{
        // Stopped here because I realized I was doing character streams....
        // Not byte streams -_-

    }

}


