package labs_examples.objects_classes_methods.labs.oop.D_my_oop.menuorderpackage;

public class DogCustomer extends CustomerParty {

    String dogName;

    int numDogs;

    boolean isVaccinated;

    //Constructor

    public DogCustomer(String partyName, int numCustomers, , int numDogs, String dogName boolean isVaccinated) {
        super(partyName, numCustomers);
        this.numDogs = numDogs;
        this.dogName = dogName;

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
