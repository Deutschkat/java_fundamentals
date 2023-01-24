package labs_examples.objects_classes_methods.labs.oop.D_my_oop.menuorderpackage;

import java.util.ArrayList;
import java.util.Scanner;

public class DogCustomer extends CustomerParty {

    int numDogs;

    boolean isVaccinated;

    //Constructor

    public DogCustomer(String partyName, int numCustomers, boolean ofAge, ArrayList<MenuItem> customerOrder, int numDogs, boolean isVaccinated) {
        super(partyName, numCustomers, ofAge, customerOrder);
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

    @Override
    public String toString() {
        return "DogCustomer{" +
                "numDogs=" + numDogs +
                ", isVaccinated=" + isVaccinated +
                ", partyName='" + partyName + '\'' +
                ", numCustomers=" + numCustomers +
                ", ofAge=" + ofAge +
                '}';
    }
}
