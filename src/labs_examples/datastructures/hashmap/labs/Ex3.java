package labs_examples.datastructures.hashmap.labs;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ex3 {
    public static void main(String[] args) {

        int numElements = 100;

        long startTime;

        long endTime;

        long totalTime;

        LinkedList<Integer> myLinkedList = new LinkedList<>();

        Stack<Integer> myStack = new Stack<>();
        Queue<Integer> myQueue = new LinkedList<>();
        HashMap<Integer, Integer> myHashMap = new HashMap<>();

        //time to ADD


        //linked lists
        startTime = System.currentTimeMillis();
        for(int x = 0; x < numElements; x++){
            myLinkedList.add(x);
        }
        endTime = System.currentTimeMillis();
        totalTime = endTime - startTime;
        System.out.println("Time taken to add in linked list: " + totalTime + " milliseconds.");

        // stacks
        startTime = System.currentTimeMillis();
        for(int x = 0; x < numElements; x++){
            myStack.push(x);
        }
        endTime = System.currentTimeMillis();
        totalTime = endTime - startTime;
        System.out.println("Time to add in stack: " + totalTime + " milliseconds.");

        //queue
        startTime = System.currentTimeMillis();
        for(int x = 0; x < numElements; x++){
            myQueue.add(x);
        }
        endTime = System.currentTimeMillis();
        totalTime = endTime - startTime;
        System.out.println("Time taken to add in queue: " + totalTime + " milliseconds.");

        //hashmaps
        startTime = System.currentTimeMillis();
        for(int x = 0; x < numElements; x++){
            myHashMap.put(x, x);
        }
        endTime = System.currentTimeMillis();
        totalTime = endTime - startTime;
        System.out.println("Time taken to add in hashmaps: " + totalTime + " milliseconds.");


        // time to UPDATE

        //for linked list
        startTime = System.currentTimeMillis();
        for(int y = 0; y < numElements; y++){
            myLinkedList.set(y, y+1);
        }
        endTime = System.currentTimeMillis();
        totalTime = endTime = startTime;
        System.out.println("Time taken to update linked lists: " + totalTime + " milliseconds.");

        // for stack

        startTime = System.currentTimeMillis();
        for(int y = 0; y < numElements; y++){
            myStack.set(y, y+1);
        }
        endTime = System.currentTimeMillis();
        totalTime = endTime - startTime;
        System.out.println("Time to update in stack: " + totalTime + " milliseconds.");

        //HashMaps
        startTime = System.currentTimeMillis();
        for(int y = 0; y < numElements; y++){
            myHashMap.replace(y,y);
        }
        endTime = System.currentTimeMillis();
        totalTime = endTime = startTime;
        System.out.println("Time taken to update hashmaps: " + totalTime + " milliseconds.");


        // time to use CONTAINS

        //linked lists
        startTime = System.currentTimeMillis();
        for( int z = 0; z < numElements; z++){
            myLinkedList.contains(z);
        }
        endTime = System.currentTimeMillis();
        totalTime = endTime - startTime;
        System.out.println("Time taken to run contains in linked lists: " + totalTime + " milliseconds.");

        //stack
        startTime = System.currentTimeMillis();
        for(int z = 0; z < numElements; z++){
            myStack.contains(z);
        }
        endTime = System.currentTimeMillis();
        totalTime = endTime - startTime;
        System.out.println("Time to run contains in stack: " + totalTime + " milliseconds.");

        //queue
        startTime = System.currentTimeMillis();
        for(int z = 0; z < numElements; z++){
            myQueue.contains(z);
        }
        endTime = System.currentTimeMillis();
        totalTime = endTime - startTime;
        System.out.println("Time taken to run contains in queue: " + totalTime + " milliseconds.");

        //hashmaps
        startTime = System.currentTimeMillis();
        for( int z = 0; z < numElements; z++){
           myHashMap.containsKey(z);
        }
        endTime = System.currentTimeMillis();
        totalTime = endTime - startTime;
        System.out.println("Time taken to run contains in hashmaps: " + totalTime + " milliseconds.");


        //time to REMOVE

        //linked lists
        startTime = System.currentTimeMillis();
        for(int i = 0; i < numElements; i++){
            myLinkedList.remove();
        }
        endTime = System.currentTimeMillis();
        totalTime = endTime - startTime;
        System.out.println("Time taken to remove in linked lists: " + totalTime + " milliseconds.");
        // stack

        startTime = System.currentTimeMillis();
        for(int i = 0; i < numElements; i++){
            myStack.pop();
        }
        endTime = System.currentTimeMillis();
        totalTime = endTime - startTime;
        System.out.println("Time taken to remove in stack: " + totalTime + " milliseconds.");

        //queue
        startTime = System.currentTimeMillis();
        for(int i = 0; i < numElements; i++){
            myQueue.remove();
        }
        endTime = System.currentTimeMillis();
        totalTime = endTime - startTime;
        System.out.println("Time taken to remove in queue: " + totalTime + " milliseconds.");


        //hashmaps
        startTime = System.currentTimeMillis();
        for(int i = 0; i < numElements; i++){
            myHashMap.remove(i);
        }
        endTime = System.currentTimeMillis();
        totalTime = endTime - startTime;
        System.out.println("Time taken to remove in hashmaps: " + totalTime + " milliseconds.");



    }
}
