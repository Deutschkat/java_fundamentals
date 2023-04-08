package labs_examples.datastructures.stack.labs;

import java.util.Stack;

public class Exercise1 {

    public static void main(String[] args) {
        Stack<Integer> KatStack = new Stack<>();

        //Push
        KatStack.push(10);
        KatStack.push(35);
        KatStack.push(45);
        KatStack.push(75);
        KatStack.push(80);

        // Peek
        System.out.println("Top element of stack is: " + KatStack.peek());

        //Size
        System.out.println("The stack size is: " + KatStack.size());

        // Search / Look for
        int findObject = KatStack.search(10);
        System.out.println("This objects is found at index: " + findObject);

        // Pop
        System.out.println("The element you popped is: " + KatStack.pop());

        // Empty the stack
        System.out.println(KatStack.empty());


    }
}
