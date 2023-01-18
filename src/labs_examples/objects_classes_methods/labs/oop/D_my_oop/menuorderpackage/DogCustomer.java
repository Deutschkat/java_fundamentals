package labs_examples.objects_classes_methods.labs.oop.D_my_oop.menuorderpackage;

public class DogCustomer {

    protected String dogName;

    protected int numDogs;

    protected boolean isVaccinated;

    //Constructor
    public DogCustomer(String dogName, int numDogs, boolean isVaccinated) {
        this.dogName = dogName;
        this.numDogs = numDogs;
        this.isVaccinated = isVaccinated;
    }

    //Getters and Setters

    public String getDogName() {
        return dogName;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public int getNumDogs() {
        return numDogs;
    }

    public void setNumDogs(int numDogs) {
        this.numDogs = numDogs;
    }

    public boolean isVaccinated() {
        return isVaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        isVaccinated = vaccinated;
    }
}
