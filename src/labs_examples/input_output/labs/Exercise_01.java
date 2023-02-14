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

        try{
            inputStream = new BufferedInputStream(new FileInputStream("C:\\Users\\deuts\\Documents\\CodingNomads\\labs\\online-java-fundamentals\\src\\labs_examples\\repl\\example.txt"));
            outputStream = new BufferedOutputStream(new FileOutputStream("C:\\Users\\deuts\\Documents\\CodingNomads\\labs\\online-java-fundamentals\\src\\labs_examples\\input_output\\example.txt"));

            byte[] byteArray;

            while((byteArray = inputStream.readNBytes(5)) != null){
                outputStream.write(byteArray,0,5);

            }


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