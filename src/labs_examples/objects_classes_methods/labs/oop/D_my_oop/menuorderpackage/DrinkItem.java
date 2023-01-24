package labs_examples.objects_classes_methods.labs.oop.D_my_oop.menuorderpackage;

public class DrinkItem extends MenuItem{

    public boolean isAlcoholic;

    public int numDrinks;

    //Constructor

    public DrinkItem(String itemName, double costOfItem, String category, boolean isAlcoholic, int numDrinks) {
        super(itemName, costOfItem, category);
        this.isAlcoholic = isAlcoholic;
        this.numDrinks = numDrinks;
    }

    //Getters and Setters


    public boolean isAlcoholic() {
        return isAlcoholic;
    }

    public void setAlcoholic(boolean alcoholic) {
        isAlcoholic = alcoholic;
    }

    public int getNumDrinks() {
        return numDrinks;
    }

    public void setNumDrinks(int numDrinks) {
        this.numDrinks = numDrinks;
    }

    @Override
    public String toString() {
        return (itemName + "            " + "$" + costOfItem);
    }
}
