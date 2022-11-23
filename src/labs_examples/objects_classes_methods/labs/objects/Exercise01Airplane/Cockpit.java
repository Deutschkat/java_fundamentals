package labs_examples.objects_classes_methods.labs.objects.Exercise01Airplane;

public class Cockpit {

    private int numSeats;
    private boolean airConditioned;
    private String avionicType;

    public Cockpit(int numSeats, boolean airConditioned, String avionicType) {
        this.numSeats = numSeats;
        this.airConditioned = airConditioned;
        this.avionicType = avionicType;
    }

    public int getNumSeats() {
        return numSeats;
    }

    public void setNumSeats(int numSeats) {
        this.numSeats = numSeats;
    }

    public boolean isAirConditioned() {
        return airConditioned;
    }

    public void setAirConditioned(boolean airConditioned) {
        this.airConditioned = airConditioned;
    }

    public String getAvionicType() {
        return avionicType;
    }

    public void setAvionicType(String avionicType) {
        this.avionicType = avionicType;
    }

    @Override
    public String toString() {
        return "Cockpit{" +
                "numSeats=" + numSeats +
                ", airConditioned=" + airConditioned +
                ", avionicType='" + avionicType + '\'' +
                '}';
    }
}
