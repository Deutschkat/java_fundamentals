package labs_examples.objects_classes_methods.examples;

// This program creates two Vehicle objects.

class Vehicle_4_1 {
    int passengers; // number of passengers
    int fuelcap;    // fuel capacity in gallons
    int mpg;        // fuel consumption in miles per gallon
}

// This class declares an object of type Vehicle.
class TwoVehicles {
    public static void main(String args[]) {

        Vehicle_4_1 minivan = new Vehicle_4_1();
        Vehicle_4_1 sportscar = new Vehicle_4_1();

        int range1, range2;

        // assign values to fields in minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // assign values to fields in sportscar
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        // compute the ranges assuming a full tank of gas
        range1 = minivan.fuelcap * minivan.mpg; // 16 * 21;
        range2 = sportscar.fuelcap * sportscar.mpg; // 14 * 12

        System.out.println("Minivan can carry " + minivan.passengers +
                " with a range of " + range1);

        System.out.println("Sportscar can carry " + sportscar.passengers +
                " with a range of " + range2);
    }
}