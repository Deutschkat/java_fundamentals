package labs_examples.lambdas.labs;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Lambdas Exercise 4:
 *
 *      Stream API Labs
 *
 *      1) Demonstrate the use of the range function to print out the numbers 1 through 15 (inclusive)
 *      (check)
 *
 *      2) Demonstrate the use of the sum function to determine the range of a set of numbers.
 *      (check)
 *
 *      3) Demonstrate the use of the map() function to alter each int in a List of Integers, then use the sum function
 *          to get the sum of the modified list
 *      (check)
 *
 *
 *      4) Demontrate the filter function by filtering out all Integers that are less than 10 - then use the average
 *          function to average the remaining numbers, assign this result to an int variable.
 *       (Check)
 *
 *      5) Demonstrate the reduce() function to determine the sum of a list of Integers
 *      (Check)
 *
 *      6) Demontsrate how to Stream a text file and print out each line
 *      (Check)
 *
 *      7) Demonstrate how to Stream the stream_text_lab.csv file in this package. Split the lines into String arrays,
 *          the print out the element at the 1 index for each array.
 *      (Check)
 *
 *
 *      8) Demonstrate how to Stream the stream_text_lab.csv file in this package. Split the lines into String arrays,
 *          the print out the sum of all elements at index 2.
 *      (Check)
 *
 *      9) Demonstrate the anyMatch() function.
 *      (Check)
 *
 *      10) Demonstrate the allMatch() function.
 *      (Check)
 *
 *      11) Demonstrate the collect() terminal operation to store resulting values into a List
 *      // Google search collect()
 *      // List instead of int like line 63 <></>
 *
 */

class Example {
    public static void main(String[] args) {

        IntStream.range(1, 16).forEach(value -> System.out.print(value));

        int sum = IntStream.range(1, 11).sum();
        System.out.println(sum);

        int sum2 = Arrays.stream(new int[] {1, 3, 5, 7, 9}).map(x-> x+1).sum();
        System.out.println(sum2);

        OptionalDouble var = Arrays.stream(new int[] {2, 3, 4, 9, 11, 14, 15, 17}).filter(value -> value < 10).average();
        System.out.println(var);

        int total = Arrays.stream(new int[] {1, 2, 3, 4, 5}).reduce(0,(int a, int b) -> a + b);
        System.out.println(total);

        String filePath = "C:\\Users\\deuts\\Documents\\CodingNomads\\labs\\online-java-fundamentals\\src\\labs_examples\\input_output\\labs\\inputtext.txt";
        Stream<String> newStream = null;
        try {
            newStream = Files.lines(Paths.get(filePath));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        newStream.forEach(System.out::println);

        Stream<String> lab = null;
        try {
            lab = Files.lines(Paths.get("C:\\Users\\deuts\\Documents\\CodingNomads\\labs\\online-java-fundamentals\\src\\labs_examples\\lambdas\\labs\\stream_text_lab.csv"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        lab.map(x-> x.split(",")).forEach(x-> System.out.println(x[1] + " "));

        Stream<String> lab2 = null;
        try {
            lab2 = Files.lines(Paths.get("C:\\Users\\deuts\\Documents\\CodingNomads\\labs\\online-java-fundamentals\\src\\labs_examples\\lambdas\\labs\\stream_text_lab.csv"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        lab2.map(x-> x.split(",")).forEach(x-> System.out.println(x[2] + " "));

        List<Integer> listOne = Arrays.asList(3,4,5,6,7,9,12);
        boolean answer = listOne.stream().anyMatch(n -> (n / 2 == 6));
        System.out.println(answer);

        List<Integer> allList = Arrays.asList(7,8,9,15,20);
        boolean allOrNot = allList.stream().allMatch(n-> n / 2 == 4);
        System.out.println(allOrNot);

        List<Integer> numList = List.of(10, 15, 20, 25, 30, 35, 40);
        List<Integer> oddNums = numList.stream().filter(n-> n % 2 != 0).collect(Collectors.toList());
        System.out.println(oddNums);















    }
    
}