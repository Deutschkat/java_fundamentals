package labs_examples.objects_classes_methods.labs.ryan;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Player {

    public String name;
    public Hand hand;
    public int currentPotValue;
    public boolean isComputer;

    public Player(String name, int currentPotValue, boolean isComputer) {
        this.name = name;
        this.currentPotValue = currentPotValue;
        this.isComputer = isComputer;
    }
}
