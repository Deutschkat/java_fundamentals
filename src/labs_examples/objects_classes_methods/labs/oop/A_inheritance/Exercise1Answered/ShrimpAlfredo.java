package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Exercise1Answered;

public class ShrimpAlfredo extends Pasta {

    private boolean isExtraShrimp;

    public ShrimpAlfredo(String name, String culturalOrigin, int calories, String foodCategory, String noodleType, boolean isGlutenFree, int numServings, String sauceType, boolean isExtraShrimp) {
        super(name, culturalOrigin, calories, foodCategory, noodleType, isGlutenFree, numServings, sauceType);
        this.isExtraShrimp = isExtraShrimp;
    }

    public boolean isExtraShrimp() {
        return isExtraShrimp;
    }

    public void setExtraShrimp(boolean extraShrimp) {
        isExtraShrimp = extraShrimp;
    }

    @Override
    public void plateDish(){
        System.out.println("--------------------------------------------------");
        System.out.println("Grab a clean plate.");
        System.out.println("Use serving fork to grab pasta and place on plate.");
        System.out.println("Add shrimp to plate.");
        System.out.println("Generously spoon sauce over plate.");
        System.out.println("Ready to serve.");
        System.out.println("--------------------------------------------------");

    }

}
