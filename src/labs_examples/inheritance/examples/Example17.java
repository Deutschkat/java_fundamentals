package labs_examples.inheritance.examples;

class B3 extends A2 {
    int k;

    B3(int a, int b, int c) {
        super(a, b);
        k = c;
    }
    void show() {
        super.show(); // this calls A's show()
        System.out.println("k: " + k);
    }
}