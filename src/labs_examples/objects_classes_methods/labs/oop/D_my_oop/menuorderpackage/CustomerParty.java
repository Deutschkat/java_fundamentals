package labs_examples.objects_classes_methods.labs.oop.D_my_oop.menuorderpackage;

import java.util.Scanner;

public class CustomerParty {

    String partyName;

    int numCustomers;

    boolean ofAge;


    //Constructor


    public CustomerParty(String partyName, int numCustomers, boolean ofAge) {
        this.partyName = partyName;
        this.numCustomers = numCustomers;
        this.ofAge = ofAge;
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

    public boolean isOfAge() {
        return ofAge;
    }

    public void setOfAge(boolean ofAge) {
        this.ofAge = ofAge;
    }
}




