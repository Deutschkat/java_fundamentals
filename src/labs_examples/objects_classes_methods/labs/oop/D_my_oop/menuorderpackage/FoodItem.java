package labs_examples.objects_classes_methods.labs.oop.D_my_oop.menuorderpackage;

public class FoodItem extends MenuItem{

    public String humanOrDogSnack;

    public int numServings;

    //Constructor

    public FoodItem(String itemName, double costOfItem, String category, String humanOrDogSnack, int numServings) {
        super(itemName, costOfItem, category);
        this.humanOrDogSnack = humanOrDogSnack;
        this.numServings = numServings;
    }

    //Getters and Setters

    public String getHumanOrDogSnack() {
        return humanOrDogSnack;
    }

    public void setHumanOrDogSnack(String humanOrDogSnack) {
        this.humanOrDogSnack = humanOrDogSnack;
    }

    public int getNumServings() {
        return numServings;
    }

    public void setNumServings(int numServings) {
        this.numServings = numServings;
    }

    @Override
    public String toString() {
        return (itemName + "        " + "$" + costOfItem + "     " + "       " + category);
    }
}
