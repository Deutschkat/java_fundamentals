package labs_examples.objects_classes_methods.labs.oop.D_my_oop.menuorderpackage;

public class HumanCustomer {

    protected String name;

    protected int numCustomers;

    protected int ageCustomers;

    //Constructor
    public HumanCustomer(String name, int numCustomers, int ageCustomers) {
        this.name = name;
        this.numCustomers = numCustomers;
        this.ageCustomers = ageCustomers;
    }

    //Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumCustomers() {
        return numCustomers;
    }

    public void setNumCustomers(int numCustomers) {
        this.numCustomers = numCustomers;
    }

    public int getAgeCustomers() {
        return ageCustomers;
    }

    public void setAgeCustomers(int ageCustomers) {
        this.ageCustomers = ageCustomers;
    }
}
