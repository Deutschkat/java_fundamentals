package labs_examples.repl;

public class SwitchStatements {

    public static void main(String[] args) {

        String str = "Monday";

        switch (str) {
            case "Monday":
                System.out.println("Today is Monday");
                break;
            case "Tuesday":
                System.out.println("Today is Tuesday");
                break;
            case "Wednesday":
                System.out.println("Today is Wednesday");
                break;
            case "Thursday":
                System.out.println("Today is Thursday");
                break;
            case "Friday":
                System.out.println("Today is Friday");
                break;
            case "Saturday":
                System.out.println("Today is Saturday");
                break;
            case "Sunday":
                System.out.println("Today is Sunday");
                break;
        }

        System.out.println();
        System.out.println("--Now without break statements--");
        System.out.println();

        String str2 = "Monday";

        System.out.println("Days left this week: ");

        switch (str2) {
            case "Sunday":
                System.out.println("Sunday");
            case "Monday":
                System.out.println("Monday");
            case "Tuesday":
                System.out.println("Tuesday");
            case "Wednesday":
                System.out.println("Wednesday");
            case "Thursday":
                System.out.println("Thursday");
            case "Friday":
                System.out.println("Friday");
            case "Saturday":
                System.out.println("Saturday");

        }
    }
}
