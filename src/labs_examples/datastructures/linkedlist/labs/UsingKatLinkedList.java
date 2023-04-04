package labs_examples.datastructures.linkedlist.labs;

public class UsingKatLinkedList {
    public static void main(String[] args) {


        KatLinkedList<String> katList = new KatLinkedList<>();


        katList.add("The");
        katList.add("dog");
        katList.add("is");
        katList.add("5!");

        //Print Linked list
        System.out.println(katList.toString());

        System.out.println();

        //Size of LinkedList
        System.out.println(katList.size());

        System.out.println();

        //Add to first.
        katList.addAtFirst("Aww!");

        //Print Linked List
        System.out.println(katList.toString());


        //Add to end.
        katList.addAtEnd("What a cutie.");
        katList.addAtEnd("Have a good day!");

        System.out.println();

        //Remove from first
        katList.removeFirst();
        System.out.println(katList.toString());

        System.out.println();

        //Remove from end
        katList.removeLast();
        System.out.println(katList.toString());


    }



}
