package labs_examples.repl;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import static java.lang.System.in;

public class InputOutput {
    public static void main(String[] args){


        String letter;
        ArrayList<String> string = new ArrayList<>();
        String joined = String.join("", string); // Made ArrayList display as a string.

        try{

            FileInputStream in = new FileInputStream("C:\\Users\\deuts\\Documents\\CodingNomads\\labs\\online-java-fundamentals\\src\\labs_examples\\repl\\example.txt");



            // this int will hold the byte we read in from the file
            int i;

            // while there are more bytes to read, continue looping
            // the FileInputStream read() methods returns -1 when it reaches the end of the file
            while((i = in.read()) != -1){
                // cast the int to a char (so it's a letter) and print it out
                System.out.print((char) i);
                letter = String.valueOf((char)i);

                string.add(letter);




            }

            System.out.println(joined);

            // close the connection to the file
            in.close();


        }catch(IOException e2){
            System.out.println("error detected");
            e2.printStackTrace();
        }
        try{
                FileOutputStream out = new FileOutputStream("C:\\Users\\deuts\\Documents\\CodingNomads\\labs\\online-java-fundamentals\\src\\labs_examples\\repl\\blank.txt");

                byte[] bytes = joined.getBytes();

                out.write(bytes);

            // close the connection to the file
            out.close();
        }catch(IOException e1){
            System.out.println("error detected");
            e1.printStackTrace();
        }


    }
}
