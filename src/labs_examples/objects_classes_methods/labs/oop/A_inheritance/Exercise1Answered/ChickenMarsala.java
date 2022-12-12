package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Exercise1Answered;

public class ChickenMarsala extends MenuItem{

    private boolean addExtraMushrooms;

    public ChickenMarsala(String name, String culturalOrigin, int calories, String foodCategory, boolean addExtraMushrooms) {
        super(name, culturalOrigin, calories, foodCategory);
        this.addExtraMushrooms = addExtraMushrooms;
    }

    public boolean isAddExtraMushrooms() {
        return addExtraMushrooms;
    }

    public void setAddExtraMushrooms(boolean addExtraMushrooms) {
        this.addExtraMushrooms = addExtraMushrooms;
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
