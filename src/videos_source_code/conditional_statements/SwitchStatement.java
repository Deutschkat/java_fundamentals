package videos_source_code.conditional_statements;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class SwitchStatement {

    public static void main(String[] args) {

        int i = 7;

        switch (i) {
            case 0:
                System.out.println("i is 0");
                break;
            case 1:
                System.out.println("i is 1");
                break;
            case 2:
                System.out.println("i is 2");
                break;
            case 3:
                System.out.println("i is 3");
                break;
            case 4:
                System.out.println("i is 4");
                break;
            case 5:
                System.out.println("i is 5");
                break;
            default:
                System.out.println("default was hit");
        }

        // example without break statements - shows cascading behavior

        String str = "bronze";

        System.out.println("Your member gives you access to the following levels");

        switch (str) {
            case "gold":
                System.out.println("gold level");
            case "silver":
                System.out.println("silver level");
            case "bronze":
                System.out.println("bronze level");

                System.out.println("done with switch statement");

        }
    }
}
