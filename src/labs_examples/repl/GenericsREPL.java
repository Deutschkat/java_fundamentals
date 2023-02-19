package labs_examples.repl;

public class GenericsREPL {
    public static void main(String[] args) {

        // Step 1) Create an object of the Generic class below and call the print() method on it

        MyGeneric<Integer> number = new MyGeneric<>(55);
        number.print();
        System.out.println();

        // Step 2) Create another object of the Generic class below using a different data type and call the print() method on it

        MyGeneric<String> words = new MyGeneric<>("Words, words, words!");
        words.print();
        System.out.println();
        // Step 3) modify the class below to require two generic types - then modify your objects above so it still works
        // ** I just went ahead and created a different class to do this because i didnt want to lose my first examples.

        MySecondGeneric<String,String> firstLast = new MySecondGeneric<>("Kat", "Nix");
        System.out.println("Last name: ");
        firstLast.printVal2();
        System.out.println();
        System.out.println("First name: ");
        firstLast.printVal1();


    }
}

class MyGeneric <T> {

    T val;

    public MyGeneric(T val){
        this.val = val;
    }

    public void print(){
        System.out.println(val);
    }
}

class MySecondGeneric <E,K>{

    E val1;
    K val2;

    public MySecondGeneric(E val1, K val2) {
        this.val1 = val1;
        this.val2 = val2;
    }

    public void printVal1(){
        System.out.println(val1);
    }

    public void printVal2(){
        System.out.println(val2);
    }


}
