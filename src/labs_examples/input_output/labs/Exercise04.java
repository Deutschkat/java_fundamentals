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
        }catch(FileNotFoundException ex) {
            ex.printStackTrace();
        }catch (IOException ex) {
            ex.printStackTrace();
        }

        for(Band band : bands){
            System.out.println(band.toString());
        }

    }

    private static Band mapValuesToBandObject(String[] values) {

        Band band = new Band();

        band.setNumMembers(Integer.parseInt(values[0]));
        band.setBandName(values[1]);
        band.setCountryOfOrigin(values[2]);

        return band;
    }




}


