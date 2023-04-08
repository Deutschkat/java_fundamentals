package labs_examples.repl;

import java.util.PriorityQueue;

public class QueueREPL{

    public static void main(String[] args) {
    PriorityQueue<String> newQueue = new PriorityQueue();

    // add several elements to the myQueue

        newQueue.add("hi");
        newQueue.add("my");
        newQueue.add("name");
        newQueue.add("is");
        newQueue.add("Kat");



    // print out every element in this myQueue
        System.out.println(newQueue);

    // why did they print out in the order they did
//  They printed out in this order because they are considered first in and first out.
        //The first element you add will be the first one out.


    // pop the first element off the myQueue
        String r1 = newQueue.remove();
        System.out.println(r1);

    // print out every element again
        System.out.println(newQueue);


    // demonstrate several other PriorityQueue methods

        String peek = newQueue.peek();
        System.out.println("Peek: " + peek);

        boolean isEmpty = newQueue.isEmpty();
        System.out.println("Is queue empty?: " + isEmpty);

        for(String s : newQueue){
            System.out.println(s);
        }

        int queueSize = newQueue.size();
        System.out.println("Size: " + queueSize);


}
}
