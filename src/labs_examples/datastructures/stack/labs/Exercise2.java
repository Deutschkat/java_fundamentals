package labs_examples.datastructures.stack.labs;

public class Exercise2 <T>{
    private T[] data;
    private int topOfStack;
    private int capacity;


    private void resize (int objsize) {
        T[] ResizeData = (T[]) new Object[10];
        for (int x = 0; x <= topOfStack; x++) {

            ResizeData[x] = data[x];
        }
        data = ResizeData;
        capacity = objsize;
    }
    public void CustomStack () {
        capacity = 10;
        data = (T[]) new Object[capacity];
        topOfStack = -1;
    }

    public void push(T item) {
        if (topOfStack == capacity - 1) {
            resize(capacity * 2);
        }
        topOfStack++;
        data[topOfStack] = item;
    }

    public int size() {
        return topOfStack + 1;
    }
    public T pop() {
        if (isEmpty()) {
            System.out.println("Nothing to pop.");
        }
        T item = data[topOfStack];
        topOfStack--;
        if (capacity > 10 && topOfStack < capacity / 4) {
            resize(capacity / 2);
        }
        return item;
    }

    public T peekFirst() {
        if (isEmpty()) {
            System.out.println("Nothing to peek.");;
        }
        return data[0];
    }

    public T peekLast() {
        if (isEmpty()) {
            System.out.println("Nothing to peek.");
        }
        return data[topOfStack];
    }

    public void PrintEntireStack() {
        if (isEmpty()) {
            System.out.println("Stack empty");
            return;
        }
        for (int i = 0; i <= topOfStack; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }



    public boolean isEmpty() {
        return topOfStack == -1;
    }




}

