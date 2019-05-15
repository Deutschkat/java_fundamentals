package labs_examples.datastructures_algorithms.examples.hashmap.examples;

import labs_examples.datastructures_algorithms.examples.linkedlist.examples.CustomLinkedList;

/**
 * Created by Kevin Graham - https://codingnomads.co
 */
public class CustomHashMap<K, V> {

    // create the underlying Entry array with the initial size of 10
    private Entry<K, V>[] table = new Entry[10];


    /**
     * Hashes the given key and returns a table index
     *
     * @param key to be hashed
     * @return a table index
     */
    private int hash(K key) {
        // get the hashCode for the key and mod that hashCode by the length of the array
        int index = Math.abs(key.hashCode() % table.length);
        // the result will be the index where we can find and/or place entries
        return index;
    }

    /**
     * Adds the key-value pair to the hashmap
     *
     * @param key   a key Object
     * @param value a value Object
     */
    public void put(K key, V value) {
        // call the hash() method to get the index to place the element
        int index = hash(key);

        // create the Entry object containing the key and value that we will store in the underlying array
        Entry<K,V> entry = new Entry(key, value);

        // no element at the given index, means no collision
        // go ahead and simply add the value to the array
        if (table[index] == null) {

            table[index] = new Entry(key, value);
        }
        // otherwise, there was a collision
        // we need iterate through the linked list at that index
        else {
            // get the first Entry (in the linked list) at the given index
            Entry<K, V> p = table[index];

            // traverse the linked list
            while (p.next != null) {
                p = p.next;
            }

            // after we exit the while loop above, we'll be at the end of the linked list
            // this is where we can add the new Entry
            p.next = entry;
        }

        // check for resize
        if (keys().size() > table.length * .75) {
            // the resize method will create a bigger underlying array and
            // add all values in the existing array to the new, larger array
            resize();
        }
    }

    /**
     * Resizes the underlying array to double its previous size and copies the old values into it
     */
    private void resize() {
        // make a copy of the existing table and call it "old"
        Entry<K, V>[] old = table;
        // create a new Entry[] that is twice the size of the old one
        table = new Entry[old.length * 2];

        // iterate over the length of the old array
        for (int i = 0; i < old.length; i++) {
            try {
                // get the Entry at the index of "i" from the "old" table
                Entry entry = old[i];
                // call the put() method passing the key and value to add this element to the new table
                put((K) entry.getKey(), (V) entry.getValue());

                // check to see if this entry is actually the start of a linked list
                while (entry.next != null) {
                    // if it is, traverse to the next node
                    entry = entry.next;
                    // and call the put() method to add this element
                    put((K) entry.getKey(), (V) entry.getValue());
                    // loop
                }
            } catch (Exception e) {
                // do nothing - this is just to handle empty indexes
            }
        }
    }

    /**
     * Removes the pair at the given key from the hashmap
     *
     * @param key of the pair to be removed
     */
    public void remove(K key) {

        // ensure key exists by calling the get() method
        if (get(key) == null) {
            // if the get() method returns null, there's nothing to delete
            return;
        }

        // otherwise, get the index for the key by calling the hash() method
        int index = hash(key);

        // get the Entry at the index
        Entry<K, V> entry = table[index];

        // if this entry has the matching key, remove the element at this index
        if (entry.getKey().equals(key)){
            table[index] = null;
        }

        // otherwise, if the next element in the linked list is not null
        while (entry.next != null ) {
            // if the key of the next element in the linked list is not the key we're looking for
            if (entry.next.getKey() != key) {
                // traverse the linked list to the next node
                entry = entry.next;
            }
        }

        // when we exit the loop above, entry.next will contain the key we're looking for
        // if we're deleting from the middle of a linked list we need to link
        // entry.next to entry.next.next - this is basically like turning this list:
        // a -> b -> c
        // into this list:
        // a -> c
        if(entry.next.next != null){
            entry.next = entry.next.next;
        }
        // otherwise, entry.next is the end of the list so we can just chop it off
        else {
            entry.next = null;
        }
    }

    /**
     * Finds the value of a key
     *
     * @param key to search for
     * @return value of the given key
     */
    public V get(K key) {
        // call the hash() method to get the index for the key
        int hash = hash(key);

        // nothing at key - return null
        if (table[hash] == null) {
            return null;
        }

        // otherwise, get the Entry at the index
        Entry<K, V> entry = table[hash];

        // if the key of the current entry is not the key we're looking for
        // that means we're looking at a linked list and we need to traverse it
        // if the key does match right from the start, this loop will be skipped
        while (entry.getKey() != key) {

            // if we reach the end of the list and haven't found it return null
            if (entry.next == null) {
                return null;
            }

            // otherwise, keep traversing the linked list
            entry = entry.next;
        }

        // if we get here, that means the key has been found, return the value
        return entry.getValue();
    }

    /**
     * Returns all the keys in the hashmap
     *
     * @return a CustomLinkedList of keys
     */
    public CustomLinkedList<K> keys() {
        CustomLinkedList<K> keys = new CustomLinkedList<>();

        // iterate through all indexes of the table
        for (int i = 0; i < table.length; i++) {
            // if the element at the index of "i" is not null
            if (table[i] != null) {

                // get the element at the index of "i"
                Entry<K, V> p = table[i];

                // check to see if this is the beginning of a linked list
                while (p != null) {
                    // if it is, traverse the list and add all keys
                    keys.add(p.getKey());
                    p = p.next;
                }

            }
        }

        return keys;
    }

    /**
     * For Testing: gets the size of the underlying array
     *
     * @return int storage size
     */
    public int getStorage() {
        return table.length;
    }

}

/**
 * A Key-Value Pair
 */
 class Entry<K, V> {
    private K key;
    private V value;
    Entry next = null;

    Entry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
