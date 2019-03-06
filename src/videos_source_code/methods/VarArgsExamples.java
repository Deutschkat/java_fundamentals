package videos_source_code.methods;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class VarArgsExamples {

    public static void main(String[] args) {

        int count1 = countArgs("one", "two", "three");
        int count2 = countArgs("one", "two");
        int count3 = countArgs("one");

        System.out.println("count1 is " + count1);
        System.out.println("count2 is " + count2);
        System.out.println("count3 is " + count3);

    }

    public static int countArgs(String... args){
        int count = 0;

        for(String s : args){
            count++;
        }

        return count;
    }

}
