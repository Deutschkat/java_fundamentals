package labs_examples.lambdas.examples.stream_api;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
    Java Stream API

    source: https://raw.githubusercontent.com/joeyajames/Java/master/Java%208%20Streams/JavaStreams.java

    Stream steps:
    1) Obtain a stream
    2) call zero or more "non-terminal" operations on the stream
        * non-terminal operations include things like:
            - map (aka modify)
            - filter
            - sorted
            - etc
    3) call a terminal operation on the stream
        * terminal operations include:
            - foreach
            - sum
            - count
            - max/min
            - collect
            - etc
 */

public class JavaStreams {
    public static void main(String[] args) throws IOException {

        // 1. Integer Stream
        System.out.println("\n---------- Example 1 ------------");
        IntStream
                .range(1, 10)
                .forEach(System.out::print);

        // 2. Integer Stream with skip
        System.out.println("\n---------- Example 2 ------------");
        IntStream
                .range(1, 10)
                .skip(5)
                .forEach(x -> System.out.println(x));

        // 3. Integer Stream with sum
        System.out.println("\n---------- Example 3 ------------");
        System.out.println(IntStream.range(1, 5).sum());

        // 4. Stream.of, sorted and findFirst
        System.out.println("\n---------- Example 4 ------------");
        Stream.of("Ava", "Aneri", "Alberto")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);

        // 5. Stream from Array, sort, filter and print
        System.out.println("\n---------- Example 5 ------------");
        String[] names = {"Al", "Ankit", "Kushal", "Brent", "Sarika", "Amanda", "Hans", "Shivika", "Sarah"};
        Arrays.stream(names)	// same as Stream.of(names)
                .filter(x -> x.startsWith("S"))
                .sorted()
                .forEach(System.out::println);

        //Extra demo
        //Stream<String> stream = Arrays.stream(names);
        //stream.forEach((String element) -> System.out.print(element));

        // 6. average of squares of an int array
        System.out.println("\n---------- Example 6 ------------");
        Arrays.stream(new int[] {2, 4, 6, 8, 10})
                .map(x -> x * x)
                .average()
                .ifPresent(System.out::println);

        // 7. Stream from List, filter and print
        System.out.println("\n---------- Example 7 ------------");
        List<String> people = Arrays.asList("Al", "Ankit", "Brent", "Sarika", "Amanda", "Hans", "Shivika", "Sarah");
        people
                .stream()
                .map(String::toLowerCase)
                .filter(x -> x.startsWith("a"))
                .forEach(System.out::println);


        // declare paths to data files in this examples_files directory
        String bandsFile = "src/labs_examples/lambdas/examples/stream_api/example_files/bands.txt";
        String dataFile = "src/labs_examples/lambdas/examples/stream_api/example_files/data.txt";

        // 8. Stream rows from text file, sort, filter, and print
        System.out.println("\n---------- Example 8 ------------");
        Stream<String> bands = Files.lines(Paths.get(bandsFile));
        bands
                .sorted()
                .filter(x -> x.length() > 13)
                .forEach(System.out::println);
        bands.close();

        // 9. Stream rows from text file and save to List
        System.out.println("\n---------- Example 10 ------------");
        List<String> bands2 = Files.lines(Paths.get(bandsFile))
                .filter(x -> x.contains("jit"))
                .collect(Collectors.toList());

        bands2.forEach(x -> System.out.println(x));
        //bands2.close();


        // 10. Stream rows from CSV file and count
        System.out.println("\n---------- Example 10 ------------");
        Stream<String> rows1 = Files.lines(Paths.get(dataFile));
        int rowCount = (int)rows1
                .map(x -> x.split(","))
                .filter(x -> x.length == 3)
                .count();
        System.out.println(rowCount + " rows.");
        rows1.close();

        // 11. Stream rows from CSV file, parse data from rows
        System.out.println("\n---------- Example 11 ------------");
        Stream<String> rows2 = Files.lines(Paths.get(dataFile));
        rows2
                .map(x -> x.split(","))
                .filter(x -> x.length == 3)
                .filter(x -> Integer.parseInt(x[1]) > 15)
                .forEach(x -> System.out.println(x[0] + "  " + x[1] + "  " + x[2]));
        rows2.close();

        // 12. Stream rows from CSV file, store fields in HashMap
        System.out.println("\n---------- Example 12 ------------");
        Stream<String> rows3 = Files.lines(Paths.get(dataFile));
        Map<String, Integer> map = new HashMap<>();
        map = rows3
                .map(x -> x.split(","))
                .filter(x -> x.length == 3)
                .filter(x -> Integer.parseInt(x[1]) > 15)
                .collect(Collectors.toMap(
                        x -> x[0],
                        x -> Integer.parseInt(x[1])));
        rows3.close();
        for (String key : map.keySet()) {
            System.out.println(key + "  " + map.get(key));
        }

        // 13. Reduction - sum
        System.out.println("\n---------- Example 13 ------------");
        double total = Stream.of(7.3, 1.5, 4.8)
                .reduce(0.0, (Double a, Double b) -> a + b);

        System.out.println("Total = " + total);
    }
}