package labs_examples.objects_classes_methods.labs.ryan;

import java.util.Scanner;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class BlackjackController {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        Player player = new Player(name, 20, false);
        Player computer = new Player("computer", 20, true);



    }

}
