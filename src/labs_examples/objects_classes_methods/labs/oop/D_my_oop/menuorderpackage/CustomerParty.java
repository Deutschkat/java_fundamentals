package labs_examples.objects_classes_methods.labs.oop.D_my_oop.menuorderpackage;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerParty {

    String partyName;

    int numCustomers;

    boolean ofAge;

    ArrayList<MenuItem> customerOrder;


    //Constructor

    public CustomerParty(String partyName, int numCustomers, boolean ofAge, ArrayList<MenuItem> customerOrder) {
        this.partyName = partyName;
        this.numCustomers = numCustomers;
        this.ofAge = ofAge;
        this.customerOrder = customerOrder;
    }


    public void addItemToOrder(MenuItem orderedItem){
        customerOrder.add(orderedItem);

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

    public ArrayList<MenuItem> getCustomerOrder() {
        return customerOrder;
    }

    public void setCustomerOrder(ArrayList<MenuItem> customerOrder) {
        this.customerOrder = customerOrder;
    }
}




