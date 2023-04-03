package labs_examples.datastructures.linkedlist.labs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 *      LinkedLists - Exercise_01
 *
 *      Demonstrate your mastery of Java's built-in LinkedList class by demonstrating the following:
 *
 *      1) create a LinkedList (from Java's libraries)
 *      2) add()
 *      3) addAll()
 *      4) addFirst()
 *      5) addLast()
 *      6) getFirst()
 *      7) getLast()
 *      8) get()
 *      9) set()
 *      10) push()
 *      11) pop()
 *      12) remove()
 *      13) contains()
 *      14) listIterator()
 *      15) clear()
 */


class Exercise_01 {
public static void main(String[]args){
    //1
    LinkedList<String> linkin = new LinkedList<>();

    //2
    linkin.add("Oh.");
    linkin.add("Hi");
    linkin.add(" there.");
    linkin.add("Welcome ");
    linkin.add(" to my ");
    linkin.add("list!");

    //3
    Collection<String> foo = new ArrayList<String>();
    foo.add("Hello!");
    foo.add("I've ");
    foo.add("waited here ");
    foo.add("for you...");
    foo.add(" everlong.");

    linkin.addAll(foo);


    //4
    linkin.addFirst("Before we begin...");

    //5
    linkin.addLast(" That's a good song.");


    //6
    System.out.println();
    System.out.println("The first element is: " + linkin.getFirst());

    //7
    System.out.println();
    System.out.println("The last element is: " + linkin.getLast());

    //8
    System.out.println();
    System.out.println("The element at index 4 is: " + linkin.get(4));

    System.out.println("Current linked list: " + linkin);
    System.out.println();
    //9
    System.out.println("Replacing index of 2.");
    linkin.set(2,"-REDACTED-");
    System.out.println("Redacted linked list: " + linkin);

    //10
    linkin.push("This was pushed to the beginning at one point. ");
    System.out.println(linkin);
    System.out.println();

    //11
    linkin.pop();
    System.out.println(linkin);
    System.out.println();

    //12
    linkin.remove();
    System.out.println(linkin);
    System.out.println();

    //13
    System.out.println("\nDoes the List contain 'for you...': " + linkin.contains("for you..."));
    System.out.println();

    //14
    ListIterator iter = linkin.listIterator();
    System.out.println("The list is as follows: ");
    while(iter.hasNext()){
        System.out.println(iter.next());
    }

    System.out.println();

    //15
    linkin.clear();
    System.out.println(linkin);




        }
        }