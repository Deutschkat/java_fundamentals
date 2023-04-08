package labs_examples.repl;

import java.util.HashMap;

public class HashMapREPL {
    public static void main(String[] args) {
        HashMap<String, Integer> cityPopulations = new HashMap();

        // add several cities (key )and their populations (value )to the HashMap

        cityPopulations.put("New York City", 8467513);
        cityPopulations.put("Los Angeles", 3849297);
        cityPopulations.put("Houston", 2288250);
        cityPopulations.put("Chicago", 2696555);
        cityPopulations.put("Dallas", 1288457);

        // retrieve the population of each city using the key

        int nycPop = cityPopulations.get("New York City");
        int dalPop = cityPopulations.get("Dallas");
        int chiPop = cityPopulations.get("Chicago");
        int laPop = cityPopulations.get("Los Angeles");
        int houPop = cityPopulations.get("Houston");

        // print each element (key and value) in the HashMap
        for(String city : cityPopulations.keySet()) {

            int population = cityPopulations.get(city);
            System.out.println(city + " population is: " + population);
        }


        // demonstrate at least 3 other HashMap methods

        //contains
        System.out.println("Does HM contain 'Dallas' ?" + cityPopulations.containsKey("Dallas"));


        //check if empty
        System.out.println("Is this HM empty? " + cityPopulations.isEmpty());

        //get size of hash map

        System.out.println("Size of HM = " + cityPopulations.size());

    }
}
