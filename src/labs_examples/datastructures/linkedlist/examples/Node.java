package labs_examples.datastructures.linkedlist.examples;

/**
 * Created by ryandesmond - https://codingnomads.co
 */

public class Node<T> {

    // a generic variable to hold the data we want to store in the list
    T data;
    // a "link" to the "next" Node in the LinkedList
    Node next;

    // a simple constructor that takes in data
    public Node(T data) {
        this.data = data;
        this.next = null;
    }

    // an overloaded constructor we'll use to add Nodes to the front of the LinkedList
    public Node(T data, Node node) {
        this.data = data;
        this.next = node;

    }
}