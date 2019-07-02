package labs_examples.datastructures.linkedlist.examples;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class UsingLinkedList {

    public static void main(String[] args) {
        CustomLinkedList<String> myLinkedList = new CustomLinkedList();

        myLinkedList.add("Hey");
        myLinkedList.add("I'm");
        myLinkedList.add("using");
        myLinkedList.add("data structures!");

        System.out.println(myLinkedList.get(0));
        System.out.println(myLinkedList.get(1));
        System.out.println(myLinkedList.get(2));
        System.out.println(myLinkedList.get(3));
    }

}
