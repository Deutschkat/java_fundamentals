package labs_examples.objects_classes_methods.labs.oop.D_my_oop.menuorderpackage;

public class CustomerParty {

    String partyName;

    int numCustomers;

    boolean isOver21;

    //Constructor
    public CustomerParty(String name, int numCustomers, boolean ageCustomers) {
        this.partyName = name;
        this.numCustomers = numCustomers;
        this.isOver21 = ageCustomers;
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

    public boolean getIsOver21() {
        return isOver21;
    }

    public void setIsOver21(boolean isOver21) {
        this.isOver21 = isOver21;
    }
}
