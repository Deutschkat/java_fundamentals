package labs_examples.repl;

public class StaticMethods {
        public static void main(String[] args) {

            // demonstrate how to invoke both method in the MyMath class below

            //Calling static method
           int x = MyMath.multiply(5, 5);
            int y = MyMath.divide(10,2);

            System.out.println(x);
            System.out.println(y);
        }
    }

    class MyMath{
        public static int multiply(int a, int b){
            return a * b;
        }

        public static int divide(int a, int b){
            if (b == 0){
                return -1;
            } else {
                return a/b;
            }
        }
    }

