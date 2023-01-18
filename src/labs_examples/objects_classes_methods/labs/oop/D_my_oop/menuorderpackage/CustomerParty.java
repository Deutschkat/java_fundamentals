package labs_examples.objects_classes_methods.labs.oop.D_my_oop.menuorderpackage;

import java.util.Scanner;

public class CustomerParty {

    String partyName;

    int numCustomers;


    //Constructor


    public CustomerParty(String partyName, int numCustomers) {
        this.partyName = partyName;
        this.numCustomers = numCustomers;
    }

    //Getters and Setters
    public String getPartyName() {
        return partyName;
    }

    public void setPartyName(String partyName) {
        this.partyName = partyName;
    }

    public int getNumCustomers() {
        return numCustomers;
    }

    public void setNumCustomers(int numCustomers) {
        this.numCustomers = numCustomers;
    }
}




