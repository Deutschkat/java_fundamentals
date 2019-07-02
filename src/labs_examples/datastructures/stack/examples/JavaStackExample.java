package labs_examples.datastructures.stack.examples;

import java.util.Stack;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class JavaStackExample {

    public static void main(String[] args){

        Stack<String> myStack = new Stack();

        // check if the Stack is empty
        if (myStack.empty()){
            System.out.println("the stack is empty");
        }

        // push several elements onto the Stack
        myStack.push("Hello");
        myStack.push("World");
        myStack.push("Programming");
        myStack.push("is so");
        myStack.push("COOL");

        System.out.println("Size of the Stack after pushing: " + myStack.size() + "\n");

        // peek at the element on top of the Stack
        System.out.println("Peek: " + myStack.peek() + "\n");

        // get the depth of a given element within the stack
        System.out.println("Depth of \"Programming\": " + myStack.search("Programming")  + "\n");

        // pop every element off of the Stack
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());

        System.out.println("\nSize of the Stack after popping: " + myStack.size());

        // uncomment the line below to generate an EmptyStackException
        //System.out.println(myStack.pop());
    }
}
