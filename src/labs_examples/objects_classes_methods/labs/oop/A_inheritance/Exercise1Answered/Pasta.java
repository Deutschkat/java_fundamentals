package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Exercise1Answered;

public class Pasta extends MenuItem {

    private String noodleType;
    private boolean isGlutenFree;
    private int numServings;

    private String sauceType;

    public Pasta(String name, String culturalOrigin, int calories, String foodCategory, String noodleType, boolean isGlutenFree, int numServings, String sauceType) {
        super(name, culturalOrigin, calories, foodCategory);
        this.noodleType = noodleType;
        this.isGlutenFree = isGlutenFree;
        this.numServings = numServings;
        this.sauceType = sauceType;
    }

    @Override
    public void plateDish(){
        System.out.println("--------------------------------------------------");
        System.out.println("Grab a clean plate.");
        System.out.println("Fork pasta onto plate.");
        System.out.println("Generously spoon sauce over plate.");
        System.out.println("Ready to serve.");
        System.out.println("--------------------------------------------------");

    }

    public String getNoodleType() {
        return noodleType;
    }

    public void setNoodleType(String noodleType) {
        this.noodleType = noodleType;
    }

    public boolean isGlutenFree() {
        return isGlutenFree;
    }

    public void setGlutenFree(boolean glutenFree) {
        isGlutenFree = glutenFree;
    }

    public int getNumServings() {
        return numServings;
    }

    public void setNumServings(int numServings) {
        this.numServings = numServings;
    }

    public String getSauceType() {
        return sauceType;
    }

    public void setSauceType(String sauceType) {
        this.sauceType = sauceType;
    }
}
