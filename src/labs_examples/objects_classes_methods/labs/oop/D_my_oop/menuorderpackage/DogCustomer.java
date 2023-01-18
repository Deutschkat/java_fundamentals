package labs_examples.objects_classes_methods.labs.oop.D_my_oop.menuorderpackage;

import java.util.ArrayList;
import java.util.Scanner;

public class DogCustomer extends CustomerParty {

    int numDogs;

    boolean isVaccinated;

    //Constructor

    public DogCustomer(String partyName, int numCustomers, int numDogs, boolean isVaccinated) {
        super(partyName, numCustomers);

        this.numDogs = numDogs;
        this.isVaccinated = isVaccinated;
    }



    //Getters and Setters

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
