package labs_examples.input_output.examples.csv_parser;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class CSV_Parse {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList();

        String filePath = "src/labs_examples/input_output/files/students.csv";



        try (BufferedReader br =
                     new BufferedReader(new FileReader(filePath))) {

            String line;

            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                students.add(mapValuesToStudentObject(values));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for(Student student : students){
            System.out.println(student.toString());
        }

    }

    private static Student mapValuesToStudentObject(String[] values) {

        Student student = new Student();

        student.setId(Integer.parseInt(values[0]));
        student.setFirstName(values[1]);
        student.setLastName(values[2]);
        student.setGpa(Double.parseDouble(values[3]));

        return student;

    }

}

