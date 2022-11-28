package labs_examples.objects_classes_methods.labs.objects.Exercise4;

public class RockBand {

    String name;
    int numMembers;
    String countryOfOrigin;

    public RockBand(){}

    public RockBand(String name, int numMembers, String countryOfOrigin) {
        this.name = name;
        this.numMembers = numMembers;
        this.countryOfOrigin = countryOfOrigin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumMembers() {
        return numMembers;
    }

    public void setNumMembers(int numMembers) {
        this.numMembers = numMembers;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    String typeOfBand;

    public RockBand(String typeOfBand) {
        this.typeOfBand = typeOfBand;
    }


}
