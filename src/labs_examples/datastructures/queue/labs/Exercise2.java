package labs_examples.datastructures.queue.labs;

public class Exercise2 <T>{

    T[] array;
    int front;
    int rear;

    int size;

    //constructor
    public Exercise2() {
        this.array = (T[]) new Object[10];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    //Add to queue when 3/4 full
    public void addToQueue(T item) {
        if (isFull()) {
            resize(array.length * 2);
        }
        rear = (rear + 1) % array.length;
        array[rear] = item;
        size++;
    }

    //Removes from queue and changes it to be half the length if 1/4th empty
    public T removeFromQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        }
        T item = array[front];
        array[front] = null;
        front = (front + 1) % array.length;
        size--;
        if (size < array.length / 4) {
            resize(array.length / 2);
        }
        return item;
    }

    public void resize(int newSize) {
        T[] newArray = (T[]) new Object[newSize];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[(front + i) % array.length];
        }
        array = newArray;
        front = 0;
        rear = size - 1;
    }

    public T peekFirst() {
        if (isEmpty()) {
            System.out.println("Queue empty");
        }
        return array[front];
    }

    public T peekLast() {
        if (isEmpty()) {
            System.out.println("Queue empty");
        }
        return array[rear];
    }

    public int size() {
        return size;
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue empty");
            return;
        }
        for (int i = 0; i < size; i++) {
            System.out.print(array[(front + i) % array.length] + " ");
        }
        System.out.println();
    }

    public boolean isFull() {
        return size == array.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }


}
