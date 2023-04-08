package labs_examples.datastructures.hashmap.labs;

import java.util.HashMap;

public class Ex1 {
    public static void main(String[] args) {

        HashMap<String, Integer> myMap = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();

        myMap.put("Kat", 30);
        myMap.put("Chris", 37);
        myMap.put("Dave", 54);
        myMap.put("Till", 60);
        myMap.put("Liesel", 40);

        System.out.println(myMap);

        map2.put("Nadja", 37);
        map2.put("Alexi", 42);

        System.out.println();

        int age = myMap.get("Chris");
        System.out.println("Chris is " + age);
        int age2 = myMap.get("Kat");
        System.out.println("Kat is " + age2);

        myMap.putAll(map2);

        System.out.println();

        System.out.println(myMap);

        System.out.println();

        int size = myMap.size();
        System.out.println("The size of this map is: " + size);

        System.out.println();

        boolean containsKey = myMap.containsKey("Till");
        System.out.println("If true, map contains the key 'Till': " + containsKey);

        System.out.println();

        System.out.println("The keys in the map: " + myMap.keySet());

        System.out.println();

        System.out.println(myMap.entrySet());

        System.out.println();

        myMap.putIfAbsent("Jenna", 31);
        myMap.putIfAbsent("Julien", 30);

        System.out.println();

        myMap.remove("Nadja");
        System.out.println(myMap);

        System.out.println();

        myMap.replace("Liesel", 42);

        System.out.println();

        myMap.forEach((key, value) -> System.out.println(key + " is " + value + " years old."));

        System.out.println();

        myMap.clear();
    }
}
