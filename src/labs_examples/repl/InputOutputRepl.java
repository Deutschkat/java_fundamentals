package labs_examples.repl;
import java.io.*;

public class InputOutputRepl {

    public static void main(String[] args) {

        try{
            FileWriter fw = new FileWriter("src/labs_examples/repl/created.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("Oh hey. This is a freshly created file.");
            bw.newLine();
            bw.write("I think I am getting it...?");

            bw.close();
            fw.close();
        }catch(IOException ex1){
            System.out.println("this didn't work");
            ex1.printStackTrace();
        }

        try{
            FileReader fr = new FileReader("src/labs_examples/repl/created.txt");
            BufferedReader br = new BufferedReader(fr);

            String line = br.readLine();

            while(line != null){
                System.out.println(line);
                line = br.readLine();
            }

            br.close();
            fr.close();
        }catch(IOException ex2){
            System.out.println("there is an error in the reader.");
            ex2.printStackTrace();
        }

    }
}
