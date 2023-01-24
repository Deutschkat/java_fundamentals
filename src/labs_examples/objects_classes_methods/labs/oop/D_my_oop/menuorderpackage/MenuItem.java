package labs_examples.objects_classes_methods.labs.oop.D_my_oop.menuorderpackage;

public class MenuItem {

    String itemName;
    double costOfItem;
    String category;

    //Constructor


    public MenuItem(String itemName, double costOfItem, String category) {
        this.itemName = itemName;
        this.costOfItem = costOfItem;
        this.category = category;
    }

    //Getters and Setters

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getCostOfItem() {
        return costOfItem;
    }

    public void setCostOfItem(double costOfItem) {
        this.costOfItem = costOfItem;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
