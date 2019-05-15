package labs_examples.datastructures_algorithms.examples.stack.examples;

import labs_examples.datastructures_algorithms.examples.linkedlist.examples.CustomLinkedList;

/**
 * Created by Kevin Graham - https://codingnomads.co
 */
public class CustomStackExample<V> {
    private CustomLinkedList<V> list = new CustomLinkedList<>();

    /**
     * Adds an item to the stack
     * @param item to be added
     */
    public void push(V item) {
        // insert item into front of list
        list.insert(item, 0);
    }

    /**
     * Removes an item from the stack
     * @return the removed item
     */
    public V pop() {
        try {
            // get first item
            V item = list.get(0);
            // remove first item
            list.remove(0);
            // return first item
            return item;
        } catch (NullPointerException ex) {
            System.out.println("Exception" + ex);
            return null;
        }
    }

    /**
     * Determines if the stack is empty
     * @return true if empty, false if not empty
     */
    public boolean empty() {
        return list.isEmpty();
    }
}