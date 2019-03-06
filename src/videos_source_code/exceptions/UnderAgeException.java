package videos_source_code.exceptions;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class UnderAgeException extends Exception {

    @Override
    public String toString() {
        return "UnderAgeException{Must be 21 to buy alcohol in the US}";
    }
}
