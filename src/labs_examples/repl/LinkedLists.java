package labs_examples.repl;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedLists {

        public static void main(String[] args) {
            LinkedList<String> myList = new LinkedList();

            // demonstrate adding several elements to the LinkedList

            myList.add("Hi!");
            myList.add("My name is ");
            myList.add("Kat!");
            myList.add("Meep.");
            myList.add("Chirp.");

            // demonstrate retrieving one or more element from the LinkedList

            boolean hasWord = myList.contains("Kat!");
            System.out.println("LinkedList contains word 'Kat!': " + hasWord);

            // demonstrate removing several elements from the LinkedList

            myList.remove("Chirp.");
            myList.remove("Meep.");


            // demonstrate at least 4 additional method calls against the LinkedList

            Iterator iter = myList.iterator();
            while(iter.hasNext()){
                System.out.println(iter.next());
            }
            System.out.println();


            int first = myList.indexOf("Hi!");
            System.out.println("The first index of 'Hi!' is: " + first);


            int last = myList.lastIndexOf("Kat!");
            System.out.println("The index of 'Kat!' is: " + last);

            System.out.println();

            iter = myList.descendingIterator();
            while(iter.hasNext()){
                System.out.println(iter.next());
            }


        }


    }
