package labs_examples.repl;

public class VarArgs {
    public static void main(String[] args) {

        int numOfArgs1 = numArgs(5, 7, 8, 20, 35);
        int numOfArgs2 = numArgs(7, 15, 21, 55, 78, 99, 100);
        int numOfArgs3 = numArgs(18);

        System.out.println("Array 1 has " + numOfArgs1 + " args");
        System.out.println("Array 2 has " + numOfArgs2 + " args");
        System.out.println("Array 3 has " + numOfArgs3 + " args");


    }

    public static int numArgs(int arg, int... args){
        int num = 0;
        for(int s: args){
            num++;
        }

        return num;
    }
}
