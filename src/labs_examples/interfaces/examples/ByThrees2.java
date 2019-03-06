package labs_examples.interfaces.examples;

class ByThrees2 implements Series {
    int start;
    int val;

    ByThrees2() {
        start = 0;
        val = 0;
    }

    public int getNext() {
        val += 3;
        return val;
    }

    public void reset() {
        val = start;
    }

    public void setStart(int x) {
        start = x;
        val = x;
    }
}