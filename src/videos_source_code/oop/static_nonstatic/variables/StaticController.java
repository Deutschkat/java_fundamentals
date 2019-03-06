package videos_source_code.oop.static_nonstatic.variables;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class StaticController {

    public static void main(String[] args) {

        House house1 = new House(1000, "123 A Street");
        House house2 = new House(500, "234 B Street");
        House house3 = new House(1500, "567 C Street");

//        System.out.println(house1.toString());
//        System.out.println(house2.toString());
//        System.out.println(house3.toString());

        System.out.println(house1.numHousesBuilt);
        System.out.println(house2.numHousesBuilt);
        System.out.println(house3.numHousesBuilt);

        House house4 = new House(2000, "678 D Street");

        System.out.println(house1.numHousesBuilt);
        System.out.println(house2.numHousesBuilt);
        System.out.println(house3.numHousesBuilt);
        System.out.println(house4.numHousesBuilt);

    }

}
