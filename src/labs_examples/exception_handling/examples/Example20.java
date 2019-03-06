package labs_examples.exception_handling.examples;

// A character queue interface that throws exceptions.
interface ICharQ {
    // Put a characer into the queue.
    void put(char ch) throws QueueFullException;

    // Get a character from the queue.
    char get() throws QueueEmptyException;
}
