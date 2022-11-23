package labs_examples.objects_classes_methods.labs.objects.Exercise01Airplane;

public class Fuselage {

    private String bodyMaterial;
    private int numPassengers;
    private int numDecks;

    public Fuselage(String bodyMaterial, int numPassengers, int numDecks) {
        this.bodyMaterial = bodyMaterial;
        this.numPassengers = numPassengers;
        this.numDecks = numDecks;
    }

    public String getBodyMaterial() {
        return bodyMaterial;
    }

    public void setBodyMaterial(String bodyMaterial) {
        this.bodyMaterial = bodyMaterial;
    }

    public int getNumPassengers() {
        return numPassengers;
    }

    public void setNumPassengers(int numPassengers) {
        this.numPassengers = numPassengers;
    }

    public int getNumDecks() {
        return numDecks;
    }

    public void setNumDecks(int numDecks) {
        this.numDecks = numDecks;
    }

    @Override
    public String toString() {
        return "Fuselage{" +
                "bodyMaterial='" + bodyMaterial + '\'' +
                ", numPassengers=" + numPassengers +
                ", numDecks=" + numDecks +
                '}';
    }
}
