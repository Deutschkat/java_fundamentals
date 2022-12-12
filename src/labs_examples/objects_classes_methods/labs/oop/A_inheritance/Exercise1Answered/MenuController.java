package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Exercise1Answered;

public class MenuController {
    public static void main(String[] args) {

        ShrimpAlfredo guestOne = new ShrimpAlfredo("Shrimp Alfredo", "italian", 700, "pasta", "fettucine", false, 1, "alfredo", false);
        Spaghetti guestTwo = new Spaghetti("Spaghetti", "italian", 400,"pasta", "spaghetti", true, 1, "marinara", false);

        ChickenMarsala guestThree = new ChickenMarsala("Chicken Marsala", "italian", 900, "chicken", true, 2);

        //Guest One ordered Shrimp Alfredo - So we print out the details and run the method plateDish that has overridden the original plateDish.

        System.out.println("Guest One ordered: " + guestOne.getNumServings() + " serving(s) of " + guestOne.getName() + ". This is an " + guestOne.getCulturalOrigin() + " " + guestOne.getFoodCategory()
                + " dish that is " + guestOne.getCalories() + " calories and has " + guestOne.getNoodleType() + " noodles and " + guestOne.getSauceType() + " sauce.");
        System.out.println("To plate " + guestOne.getName() + ": ");

        guestOne.plateDish();

        //Guest Two ordered Spaghetti - So we print out the details again, and run the method plateDish that is found in the Pasta class.
        // Because spaghetti is pretty basic pasta, so it can be plated like a basic pasta.

        System.out.println("Guest Two ordered: " + guestTwo.getNumServings() + " serving(s) of " + guestTwo.getName() + ". This is an " + guestTwo.getCulturalOrigin() + " " + guestTwo.getFoodCategory()
                + " dish that is " + guestTwo.getCalories() + " calories and has " + guestTwo.getNoodleType() + " noodles and " + guestTwo.getSauceType() + " sauce.");
        System.out.println("To plate " + guestTwo.getName() + ": ");

        guestTwo.plateDish();

        //Guest Three ordered Chicken Marsala - So we print out the details again, and run the method plateDish found in the Chicken Marsala class.
        //If we had another menu item, we could demonstrate the original plateDish method, however I did show 3 overrides.

        System.out.println("Guest Three ordered: " + guestThree.getNumServings() + " serving(s) of " + guestThree.getName() + ". This is an " + guestThree.getCulturalOrigin() + " " + guestThree.getFoodCategory()
                + " dish that is " + guestThree.getCalories() + " calories.");
        System.out.println("To plate " + guestThree.getName() + ": ");

        guestThree.plateDish();







    }
}
