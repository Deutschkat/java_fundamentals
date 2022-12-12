package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Exercise1Answered;

public class ChickenMarsala extends MenuItem{

    private boolean addExtraMushrooms;
    private int numServings; // I know this should have been in MenuItem, but I found this near the end of the exercise.

    public ChickenMarsala(String name, String culturalOrigin, int calories, String foodCategory, boolean addExtraMushrooms, int numServings) {
        super(name, culturalOrigin, calories, foodCategory);
        this.addExtraMushrooms = addExtraMushrooms;
        this.numServings = numServings;
    }

    public boolean isAddExtraMushrooms() {
        return addExtraMushrooms;
    }

    public void setAddExtraMushrooms(boolean addExtraMushrooms) {
        this.addExtraMushrooms = addExtraMushrooms;
    }

    public int getNumServings() {
        return numServings;
    }

    public void setNumServings(int numServings) {
        this.numServings = numServings;
    }

    @Override
    public void plateDish(){
        System.out.println("--------------------------------------------------");
        System.out.println("Grab a clean plate.");
        System.out.println("Grab cooked pieces of chicken with tongs and plate.");
        System.out.println("Add cooked mushrooms to plate.");
        System.out.println("Generously spoon sauce over plate.");
        System.out.println("Ready to serve.");
        System.out.println("--------------------------------------------------");

    }
}
