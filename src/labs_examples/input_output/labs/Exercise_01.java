package labs_examples.input_output.labs;

import java.io.*;

/**
 * Input/Output Exercise 1: File input/output
 *
 *      Using the BufferedInputStream, read a text file 5 bytes at a time and write each byte to a new file.
 *      Make sure you close the connections to both files.
 *
 *
 */

class Example {
    public static void main(String[] args) {
            BufferedInputStream inputStream = null;
            BufferedOutputStream outputStream = null;

            String inputFilePath = "C:\\Users\\deuts\\Documents\\CodingNomads\\labs\\online-java-fundamentals\\src\\labs_examples\\input_output\\labs\\inputtext.txt";
            String outputFilePath = "C:\\Users\\deuts\\Documents\\CodingNomads\\labs\\online-java-fundamentals\\src\\labs_examples\\input_output\\labs\\outputtext.txt";


            try{
                inputStream = new BufferedInputStream(new FileInputStream(inputFilePath));
                outputStream = new BufferedOutputStream(new FileOutputStream(outputFilePath));

                byte[] byteArray = new byte[8];
                int bytesRead = 0;

                while((bytesRead = inputStream.read(byteArray)) != -1){

                    outputStream.write(new String(byteArray, 0, bytesRead).getBytes());

                }

                System.out.println("File written!");

            }catch(IOException ex1){
                System.out.println("An error occurred");
            }finally{
                try{
                    inputStream.close();
                }catch(IOException ex2){
                    ex2.printStackTrace();
                }
                try{
                    outputStream.close();
                }catch(IOException ex2){
                    ex2.printStackTrace();
                }
            }




        }
}