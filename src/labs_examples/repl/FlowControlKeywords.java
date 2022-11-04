package labs_examples.repl;

public class FlowControlKeywords {

    public static void main(String[] args) {

        for (int j = 0; j <=25; j++){
            if(j == 7 || j == 17) {
                continue;


            }
            System.out.println("j is: " +j);
        }

        System.out.println();
        System.out.println();

        int x = 0;

        do{
            System.out.println("X is: " + x);
            x++;
                if(x == 4)
                break;
        }while (x <=10);


    }
}
