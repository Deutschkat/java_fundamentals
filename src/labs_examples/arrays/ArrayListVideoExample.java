package labs_examples.arrays;

import java.util.ArrayList;

public class ArrayListVideoExample {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Hello");
        arrayList.add("World! ");
        arrayList.add("Programming");
        arrayList.add("is");
        arrayList.add("so");
        arrayList.add("Hello");
        arrayList.add("cool");

        // -- Code below used to check if string included in array list

     //   boolean check = arrayList.contains("Programming");
     //   System.out.println(check);

        //-- Code below used to print entire list:

      //  for(String s : arrayList){
        //    System.out.println(s);


        // -- code below used to locate last index of object in array

        int lastIndexOfHello = arrayList.lastIndexOf("Hello");
        System.out.println(lastIndexOfHello);

        }


    }
