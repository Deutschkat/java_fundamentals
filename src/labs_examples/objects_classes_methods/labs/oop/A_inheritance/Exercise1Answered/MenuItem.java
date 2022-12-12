package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Exercise1Answered;

public class MenuItem {

    protected String name;
    protected String culturalOrigin;
    protected int calories;
    protected String foodCategory;

    public MenuItem(String name, String culturalOrigin, int calories, String foodCategory) {
        this.name = name;
        this.culturalOrigin = culturalOrigin;
        this.calories = calories;
        this.foodCategory = foodCategory;
    }

    public void plateDish() {
        System.out.println("--------------------------------------------------");
        System.out.println("Grab a clean plate.");
        System.out.println("Place the item on the dish.");
        System.out.println("Ready to serve.");
        System.out.println("--------------------------------------------------");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCulturalOrigin() {
        return culturalOrigin;
    }

    public void setCulturalOrigin(String culturalOrigin) {
        this.culturalOrigin = culturalOrigin;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public String getFoodCategory() {
        return foodCategory;
    }

    public void setFoodCategory(String foodCategory) {
        this.foodCategory = foodCategory;
    }
}