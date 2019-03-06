package videos_source_code.conditional_statements;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class ForLoop {

    public static void main(String[] args) {

        // for(initialization; (boolean) condition; iterator)
        for(int i = 0; i < 10; i++){
            System.out.println("i = " + i);
            for(int x = 0; x < 10; x++){
                System.out.println("-- x = " + x);
            }
        }

    }

}
