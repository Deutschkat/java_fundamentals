package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Exercise1Answered;

public class MenuController {
    public static void main(String[] args) {

        ShrimpAlfredo guestOne = new ShrimpAlfredo("Shrimp Alfredo", "italian", 700, "pasta", "fettucine", false, 1, "alfredo", false);
        Spaghetti guestTwo = new Spaghetti("Spaghetti", "italian", 400,"pasta", "spaghetti", true, 1, "marinara", false);

        ChickenMarsala guestThree = new ChickenMarsala("Chicken Marsala", "italian", 900, "chicken", true);

        System.out.println("Guest One ordered: " + guestOne.getNumServings() + " serving(s) of " + guestOne.getName() + ". This is an " + guestOne.getCulturalOrigin() + " " + guestOne.getFoodCategory()
                + " dish that is " + guestOne.getCalories() + " calories and has " + guestOne.getNoodleType() + " noodles and " + guestOne.getSauceType() + " sauce.");
        System.out.println("To plate " + guestOne.getName() + ": ");

        guestOne.plateDish();






    }
}
