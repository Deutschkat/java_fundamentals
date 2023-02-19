package labs_examples.input_output.labs;

import java.io.*;

public class Exercise02 {
    public static void main(String[] args) {

        BufferedReader inputStream = null;
        PrintWriter outputStream = null;

        try {
            inputStream = new BufferedReader(new FileReader("C:\\Users\\deuts\\Documents\\CodingNomads\\labs\\online-java-fundamentals\\src\\labs_examples\\input_output\\labs\\CharacterText.txt"));
            outputStream = new PrintWriter(new FileWriter("C:\\Users\\deuts\\Documents\\CodingNomads\\labs\\online-java-fundamentals\\src\\labs_examples\\input_output\\labs\\CharacterTextEncrypted.txt"));

            int x;

            while ((x = inputStream.read()) != -1) {

                if (x == (char)97) {
                    outputStream.print('-');
                }else if (x == (char)101) {
                    outputStream.print('~');
                } else {
                    outputStream.print((char)x);
                }
            }

        } catch (IOException exc) {
            System.out.println("An error occurred.");
        } finally {
            try {
                inputStream.close();
            } catch (IOException ex2) {
                ex2.printStackTrace();
            }
            try {
                outputStream.close();
            } catch (Exception ex2) {
                ex2.printStackTrace();
            }
        }
    }
}
