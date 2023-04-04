package labs_examples.repl;

import java.util.*;

public class StackREPL {

    public static void main(String[] args) {
        Stack<String> myStack = new Stack();

        // push several elements onto the Stack

        myStack.push("hi");
        myStack.push("there");
        myStack.push("this");
        myStack.push("is stack");


        // print the first element in the Stack

        System.out.println("First element: " + myStack.firstElement());


        // pop the first element off the Stack


        // print the first element in the Stack again


        // demonstrate at least 3 other Stack method




    }
}
