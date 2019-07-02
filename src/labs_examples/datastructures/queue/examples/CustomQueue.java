package labs_examples.datastructures.queue.examples;

import labs_examples.datastructures.linkedlist.examples.CustomLinkedList;

/**
 * Created by Kevin Graham - https://codingnomads.co
 */
// Queue is generic so it can hold any object type
public class CustomQueue<V> {

    // create a LinkedList for us to use as the underlying data structure
    private CustomLinkedList<V> list = new CustomLinkedList<>();

    // simple boolean to track whether or not the queue is empty
    private boolean isEmpty;

    // constructor - set empty to true upon creation
    public CustomQueue() {
        isEmpty = true;
    }

    /**
     * Adds an item to the Queue
     * @param item to be added
     */
    public void enqueue(V item) {
        // insert item into front of list
        list.add(item);
        isEmpty = false;
    }

    /**
     * Removes an item from the Queue
     * @return the removed item
     */
    public V dequeue() {
        try {
            // get item from the front of the Queue
            V item = list.get(0);

            // remove that item from the front of the Queue
            list.remove(0);

            // check if empty
            if (list.get(0) == null) {
                isEmpty = true;
            }

            // return first item we got just above
            return item;

        } catch (NullPointerException ex) {
            return null;
        }
    }

    public boolean isEmpty() {
        return isEmpty;
    }
}
