package labs_examples.objects_classes_methods.labs.oop.D_my_oop.menuorderpackage;

public class FoodItem extends MenuItem{

    public String humanOrDogSnack;


    //Constructor

    public FoodItem(String itemName, double costOfItem, String category, int numServings, String humanOrDogSnack) {
        super(itemName, costOfItem, category, numServings);
        this.humanOrDogSnack = humanOrDogSnack;
    }


    //Getters and Setters


    public String getHumanOrDogSnack() {
        return humanOrDogSnack;
    }

    public void setHumanOrDogSnack(String humanOrDogSnack) {
        this.humanOrDogSnack = humanOrDogSnack;
    }

    @Override
    public String toString() {
        return (itemName + "            "+ "$" + costOfItem);
    }
}
