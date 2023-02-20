package labs_examples.input_output.labs;
import java.io.*;
import java.util.ArrayList;

public class Exercise04 {
    public static void main(String[] args) {

        ArrayList<Band> bands = new ArrayList<>();

        String filePath = "C:\\Users\\deuts\\Documents\\CodingNomads\\labs\\online-java-fundamentals\\src\\labs_examples\\input_output\\labs\\Bands.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;

            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                bands.add(mapValuesToBandObject(values));
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        for (Band band : bands) {
            System.out.println(band.toString());
        }

        //Turn ArrayList<Band> back into a .csv file

        try {
            FileWriter filepath = new FileWriter("C:\\Users\\deuts\\Documents\\CodingNomads\\labs\\online-java-fundamentals\\src\\labs_examples\\input_output\\labs\\BandsCreated.csv");
            PrintWriter write = new PrintWriter(filepath);
            for (Band name : bands) {
                write.println(name);
            }
            write.close();
        }catch(Exception ex){
            System.out.println("An error occurred.");
        }

    }

    //Mapping the .csv values to the band object

    private static Band mapValuesToBandObject(String[] values) {

        Band band = new Band();

        band.setNumMembers(Integer.parseInt(values[0]));
        band.setBandName(values[1]);
        band.setCountryOfOrigin(values[2]);

        return band;
    }




}


