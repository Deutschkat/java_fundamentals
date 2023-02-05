package labs_examples.exception_handling.labs;

public class PupVaccinationException extends Exception {

    @Override
    public String toString(){
        return "Pup is not vaccinated :( I'm sorry. All dogs must be vaccinated to come to the park.";

    }

}
