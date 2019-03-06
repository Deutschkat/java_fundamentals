package videos_source_code.objects;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Demo {

    public static void main(String[] args) {

        Oven myOven = new Oven(true, 500, "GE");
        Dishwasher dishwasher = new Dishwasher(true, "GE", 5);
        Refigerator fridge = new Refigerator(true, "Kenmore", 150);
        Sink sink = new Sink(true, "sinkBrand", "stainless steel");
        Kitchen myKitchen = new Kitchen(dishwasher, myOven, fridge, sink);

//        System.out.println("My kitchen has a " + myKitchen.getOven().getBrand() + " oven " +
//                "with a max temp of " + myKitchen.getOven().getMaxTemp());

        System.out.println(myKitchen.toString());

    }

}
