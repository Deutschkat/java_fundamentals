package labs_examples.conditional_statements;

public class SwitchStatements {
    public static void main(String[] args) {

        int i = 7;

        switch(i) {
            case 0 :
                System.out.println("i is 0");
                break;
            case 1 :
                System.out.println("i is 1");
                break;
            case 2 :
                System.out.println("i is 2");
                break;
            case 3 :
                System.out.println("i is 3");
                break;
            case 4 :
                System.out.println("i is 4");
                break;
            case 5 :
                System.out.println("i is 5");
                break;
            default :
                System.out.println("default was hit");
        }
        System.out.println();
        System.out.println("done with switch statement");
        System.out.println();

        //Example of cascading effect:

        String str = "Gold";

        System.out.println("Your membership gives you access to the following levels: ");

        switch(str) {
            case "Gold" :
                System.out.println("Gold level");
            case "Silver" :
                System.out.println("Silver level");
            case "Bronze" :
                System.out.println("Bronze level");
        }
    }
}
