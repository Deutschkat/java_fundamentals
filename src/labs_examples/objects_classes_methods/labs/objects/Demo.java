package labs_examples.objects_classes_methods.labs.objects;

public class Demo {
    public static void main(String[] args) {


        Oven myOven = new Oven(true, 500, "GE");
        Dishwasher dishwasher = new Dishwasher(true, "GE Dishwasher", 5);
        Refrigerator fridge = new Refrigerator(true, "Kenmore", 150);
        Sink sink = new Sink(true, "Kohl", "stainless steel");
        Kitchen myKitchen = new Kitchen(dishwasher, myOven, fridge, sink);

      /*  System.out.println("My kitchen has a " + myKitchen.getOven().getBrand() + " oven " +
                "with a max temp of " + myKitchen.getOven().getMaxTemp());

        System.out.println("My kitchen has a " + myKitchen.getDishwasher().getBrand() + " that is " + myKitchen.getDishwasher().getYearsOld() + " years old.");
    */
        System.out.println(myKitchen.toString());

    }

}
