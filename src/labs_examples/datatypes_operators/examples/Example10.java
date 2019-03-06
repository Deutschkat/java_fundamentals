package labs_examples.datatypes_operators.examples;

/*
   This program attempts to declared a variable
   in an inner scope with the same name as one
   defined in an outer scope.

   *** This program will not compile. ***
*/

/*
complies but enters infinite for loop because
count keeps getting reset to 0

Update- does not compile when i is reinitialized
*/
class NestVar {
    public static void main(String args[]) {
        int count;

        for(count = 0; count < 10; count = count+1) {
            System.out.println("This is count: " + count);

            //int count; // illegal!!!
            for(count = 0; count < 2; count++)
                System.out.println("This program is in error!");
        }
    }
}
