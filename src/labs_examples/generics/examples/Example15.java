package labs_examples.generics.examples;

// A generic, fixed-size queue class.
class GenQueue<T> implements IGenQ<T> {
    private T q[]; // this array holds the queue
    private int putloc, getloc; // the put and get indices

    // Construct an empty queue with the given array.
    public GenQueue(T[] aRef) {
        q = aRef;
        putloc = getloc = 0;
    }

    // Put an item into the queue.
    public void put(T obj)
            throws QueueFullException {

        if(putloc==q.length)
            throw new QueueFullException(q.length);

        q[putloc++] = obj;
    }

    // Get a character from the queue.
    public T get()
            throws QueueEmptyException {

        if(getloc == putloc)
            throw new QueueEmptyException();

        return q[getloc++];
    }
}