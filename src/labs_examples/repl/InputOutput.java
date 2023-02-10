package labs_examples.repl;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class InputOutput {
    public static void main(String[] args){


        String letter;
        ArrayList<String> string = new ArrayList<>();

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

            System.out.println(string);

            // close the connection to the file
            in.close();


            //Still need to write// <---Start


        }catch(IOException e2){
            System.out.println("error detected");
            e2.printStackTrace();
        }
        try{
            // create the FileInputStream object
            // after you run this you should see the example.txt file in this REPL
            FileOutputStream out = new FileOutputStream("blank.txt");

            // close the connection to the file
            out.close();
        }catch(IOException e1){
            System.out.println("error detected");
            e1.printStackTrace();
        }


    }
}
