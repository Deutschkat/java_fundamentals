package labs_examples.datastructures_algorithms.examples.linkedlist.examples;

/**
 * Created by Kevin Graham - https://codingnomads.co
 */
public class CustomLinkedList<T> {

    // this "head" variable will always keep track of the first Node in the list.
    private Node head;

    // this constructor uses VarArgs - meaning you can pass in zero or more data elements to add to the list
    public CustomLinkedList(T... data) {

        if (data.length < 1) {
            // if you don't pass in any data elements it will just instantiate an empty LinkedList (where "head" == null)
            head = null;
        } else {
            // if you pass in 1 or more elements, each element will be added to the LinkedList by calling the add() method
            for (int i = 0; i < data.length; i++) {
                add(data[i]);
            }
        }
    }

    /**
     * Adds a new Node the given data to the end of the list
     *
     * @param data to be added
     */
    public void add(T data) {
        // call the insert() method, pass in the data as well as the current size of the LinkedList
        // by calling the size() method which will return the length of the LinkedList
        insert(data, size());
    }

    /**
     * Inserts a new Node with the given data at the given index
     *
     * @param data  to be added
     * @param index to put the Node
     */
    public void insert(T data, int index) {
        // if "head" is null, create new root node
        if (head == null) {
            head = new Node(data);
        } else {

            // make a new reference to the head node that we can use to traverse the list
            // we do this so we NEVER lose a secure reference to the head node
            Node iterator = head;
            // create an empty variable to track the "previous" node in the list as we traverse
            Node previous = null;

            if (index == 0) {

                // if we hit this "if" block it means the user wants to insert a new node
                // to the front of the list, insert new node in front
                head = new Node(data, head);

            } else if (index < size()) {

                // if we hit this "else" block, it means the user wants to insert the new node into the
                // middle of this list (because "index" is < size)

                // simple variable to use while traversing to the proper index
                int count = 0;

                // this while loops traverses the LinkedList till we get to the desired index
                // notice how we keep assiging the iterator to "previous" so that we always know the previous node
                // before we assign the iterator variable to "iterator.next"
                while (count != index) {
                    previous = iterator;
                    iterator = iterator.next;
                    count++;
                }

                // create new node linked to the previous node by connecting "previous.next" to the new node
                // and connecting the rest of the LinkedList (currently stored in "iterator") to the
                // "next" variable of the new Node
                previous.next = new Node(data, iterator);

            } else {

                // if we hit this "else" block, it means the user wants to attach the new node to the end of the list

                // so we need to iterate all the way through list to find last node
                // we'll know we've hit the last node when "iterator.next" is equal to null
                while (iterator.next != null) {
                    iterator = iterator.next;
                }

                // once we exit the loop above, "iterator.next" will be referencing the final node in the list
                // at this point we can attach the new Node to the "next" variable of the final node in th list
                iterator.next = new Node(data);
            }
        }
    }

    /**
     * Removes the Node at the given index
     *
     * @param index to put the Node
     */
    public void remove(int index) {
        if (index == 0) {

            // if we hit this "if" block, it means the user wants to delete the first node in the list
            // so we just set "head" to "head.next" which effectively cuts the first node out of the list
            head = head.next;

        } else if (index < size()){

            // if we hit this "else" block, it means that the user wants to delete a
            // node in the middle of the list
            try {
                // create a simple variable to use for looping
                int count = 0;

                // create a "previous" node variable to use for tracking the "previous" node.
                // we'll use this for deleting a node from the middle of the list
                Node previous = null;

                // creating a new variable that initially references the "head" node
                // we'll use this new variable to traverse across the list
                Node iterator = head;

                // iterate until index is reached
                while (count != index) {
                    previous = iterator;
                    iterator = iterator.next;
                    count++;
                }

                // link previous node to the node after the current
                previous.next = iterator.next;
            } catch (NullPointerException ex) {
                System.out.println("invalid index");
            }
        } else {
            // if we hit this "else" block, it means the user wants to delete the node at the end of the list

            // creating a new variable that initially references the "head" node
            // we'll use this new variable to traverse across the list
            Node iterator = head;

            // so we need to iterate all the way through list to find last node
            // we'll know we've hit the last node when "iterator.next" is equal to null
            while (iterator.next != null) {
                iterator = iterator.next;
            }

            // once we exit the loop above, "iterator.next" will be referencing the final node in the list
            // at this point we can assign "iterator.next" to null - effectively "cutting off" the final node
            iterator.next = null;

        }
    }

    /**
     * Returns the value at the given index
     *
     * @param index to get the value
     * @return the value at the index
     */
    public T get(int index) {
        try {
            // simple variable to use for looping over the list
            int count = 0;

            // creating a new variable that initially references the "head" node
            // we'll use this new variable to traverse across the list
            Node iterator = head;

            // iterate until index is reach
            while (count != index) {
                iterator = iterator.next;
                count++;
            }
            return (T) iterator.data;

        } catch (NullPointerException ex) {
            return null; // list is empty
        }
    }

    /**
     * Sets (updates) the value of the given index to the given data
     *
     * @param index to put the data
     * @param data  to be set
     */
    public void set(int index, T data) {
        try {
            int count = 0;
            Node iterator = head;

            // iterate through list
            while (count != index) {
                iterator = iterator.next;
                count++;
            }

            // change data
            iterator.data = data;

        } catch (NullPointerException ex) {
            System.out.println("invalid index");
        }
    }

    /**
     * Determines the size of the list
     *
     * @return an Integer size
     */
    public int size() {
        int count = 0;
        Node iterator = head;

        // iterate through list
        while (iterator != null) {
            count++;
            iterator = iterator.next;
        }

        return count;
    }

    /**
     * Converts the list into a String
     *
     * @return a human readable String
     */
    public String toString() {
        Node iterator = head;
        String output = "";

        // iterate through list
        while (iterator != null) {
            output += iterator.data + " ";
            iterator = iterator.next;
        }

        return output;
    }

    public boolean isEmpty() {
        return head == null;
    }



}
