package labs_examples.repl;

import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {

        // please demonstrate how to declare an ArrayList below

        // please demonstrate how to add values to an array ArrayList

        // please demonstrate how to remove values from an ArrayList

        // please demonstrate how to retrieve values from an ArrayList

        // please demonstrate at least two other useful methods available
        // to us when we use ArrayLists


        //Delaring an ArrayList
        ArrayList<String> arrayList = new ArrayList<>();

        // Adding to an ArrayList
        arrayList.add("Hi! ");
        arrayList.add("My ");
        arrayList.add("name ");
        arrayList.add("is ");
        arrayList.add("Kat!");

        // Removing values from an Arraylist

        arrayList.remove("Hi! ");

        // Find index of an object

        int indexOfKat = arrayList.indexOf("Kat!");
        System.out.println(indexOfKat);

        System.out.println();
        System.out.println();

        // Printing out the ArrayList
        for(String k : arrayList){
            System.out.println(k);
        }

        System.out.println();
        System.out.println();

        //Checking to see if an object is within the ArrayList

        boolean check = arrayList.contains("is ");
        System.out.println(check);

    }
}
