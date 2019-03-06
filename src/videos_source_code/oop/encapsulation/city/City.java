package videos_source_code.oop.encapsulation.city;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
// the class is the root of all encapsulation
// the City class can't affect/access the Dog class and vice versa
public class City {

    // access modifiers are the next level of encapsulation
    private String name;
    private int population;
    private String latLong;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getLatLong() {
        return latLong;
    }

    public void setLatLong(String latLong) {
        this.latLong = latLong;
    }
}
