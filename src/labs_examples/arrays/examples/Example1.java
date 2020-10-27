package labs_examples.arrays.examples;

// Demonstrate a one-dimensional array.
class ArrayDemo {
    public static void main(String[] args) {
        char[] alphabet = new char[26];

        char i = 'A';

        for (int x = 0; x < 26; x++, i++){
            alphabet[x] = i;
            System.out.print(alphabet[x]);
        }
    }
}