package labs_examples.objects_classes_methods.labs.objects.Exercise4;

public class Controller {
    public static void main(String[] args) {

        //Default Constructor
        RockBand testBand = new RockBand();

        testBand.name = "null";
        testBand.numMembers = 0;
        testBand.countryOfOrigin = "null";


        System.out.println(testBand.name);
        System.out.println(testBand.numMembers);
        System.out.println(testBand.countryOfOrigin);

        System.out.println();
        System.out.println();
        //Parameterized

        RockBand bandOne = new RockBand("Rammstein", 6, "Germany");

        System.out.println(bandOne.name + " is my favorite band. They are from " + bandOne.countryOfOrigin +
                ". They have " + bandOne.numMembers + " members.");

        bandOne.typeOfBand = "industrial metal";

        System.out.println("They play " + bandOne.typeOfBand + ".");





        System.out.println(testBand);
    }
}