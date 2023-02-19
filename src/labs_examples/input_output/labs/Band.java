package labs_examples.input_output.labs;

public class Band {

    private int numMembers;

    private String bandName;

    private String countryOfOrigin;

    public Band(){

    }

    public Band(int numMembers, String bandName, String countryOfOrigin) {
        this.numMembers = numMembers;
        this.bandName = bandName;
        this.countryOfOrigin = countryOfOrigin;
    }

    public int getNumMembers() {
        return numMembers;
    }

    public void setNumMembers(int numMembers) {
        this.numMembers = numMembers;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    @Override
    public String toString() {
        return "Band{" +
                "numMembers=" + numMembers +
                ", bandName='" + bandName + '\'' +
                ", countryOfOrigin='" + countryOfOrigin + '\'' +
                '}';
    }
}
