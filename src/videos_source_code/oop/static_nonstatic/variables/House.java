package videos_source_code.oop.static_nonstatic.variables;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class House {

    int squareFeet;
    String address;
    static int numHousesBuilt;

    public House(int squareFeet, String address) {
        this.squareFeet = squareFeet;
        this.address = address;
        numHousesBuilt++;
    }

    @Override
    public String toString() {
        return "House{" +
                "squareFeet=" + squareFeet +
                ", address='" + address + '\'' +
                ", numHousesBuild= " + numHousesBuilt + '}';
    }
}
