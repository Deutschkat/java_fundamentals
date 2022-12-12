package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Exercise1Answered;

public class Spaghetti extends Pasta {

    private boolean addMeatballs;

    public Spaghetti(String name, String culturalOrigin, int calories, String foodCategory, String noodleType, boolean isGlutenFree, int numServings, String sauceType, boolean addMeatballs) {
        super(name, culturalOrigin, calories, foodCategory, noodleType, isGlutenFree, numServings, sauceType);
        this.addMeatballs = addMeatballs;
    }

    public boolean isAddMeatballs() {
        return addMeatballs;
    }

    public void setAddMeatballs(boolean addMeatballs) {
        this.addMeatballs = addMeatballs;
    }
}
