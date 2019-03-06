package labs_examples.generics.examples;

// A generic queue interface.
interface IGenQ<T> {
    // Put an item into the queue.
    void put(T ch) throws QueueFullException;

    // Get an item from the queue.
    T get() throws QueueEmptyException;
}