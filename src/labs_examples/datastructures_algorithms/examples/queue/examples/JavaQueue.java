package labs_examples.datastructures_algorithms.examples.queue.examples;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class JavaQueue {

    public static void main(String[] args) {

        // a priority queue orders it's elements by their natural order
        // by default with Strings this will be alphabetically
        PriorityQueue<String> myQueue = new PriorityQueue();

        // add elements to the Queue
        myQueue.add("java");
        myQueue.add("provides");
        myQueue.add("many");
        myQueue.add("queue");
        myQueue.add("implementations");

        // peek at the "top/front" of the Queue
        System.out.println(myQueue.peek());

        // demonstrate contains() method
        boolean hasJava = myQueue.contains("Queue");
        System.out.println("Contains \"Queue\"? -> " + hasJava);

        System.out.println();

        // remove an element from the front of the Queue
        String r1 = myQueue.remove();
        System.out.println(r1);

        // Retrieves, but does not remove, the head of this queue.
        String e1 = myQueue.element();
        System.out.println(e1);

        // iterate over Queue and print out elements
        for(String s : myQueue){
            System.out.println(s);
        }

        // clear the Queue
        myQueue.clear();
    }
}
