package labs_examples.interfaces.examples;

class ByTwos3 implements Series {
    int start;
    int val;

    ByTwos3() {
        start = 0;
        val = 0;
    }

    public int getNext() {
        val += 2;
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