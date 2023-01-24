package labs_examples.objects_classes_methods.labs.oop.D_my_oop.menuorderpackage;

public class DrinkItem extends MenuItem{

    public boolean isAlcoholic;

    //Constructor

    public DrinkItem(String itemName, double costOfItem, String category, int numServings, boolean isAlcoholic) {
        super(itemName, costOfItem, category, numServings);
        this.isAlcoholic = isAlcoholic;
    }


    //Getters and Setters


    public boolean isAlcoholic() {
        return isAlcoholic;
    }

    public void setAlcoholic(boolean alcoholic) {
        isAlcoholic = alcoholic;
    }

    @Override
    public String toString() {
        return (itemName + "            " + "$" + costOfItem);
    }
}
