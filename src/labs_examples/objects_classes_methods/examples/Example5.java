package labs_examples.objects_classes_methods.examples;

class Vehicle_4_5 {
    int passengers; // number of passengers
    int fuelcap;    // fuel capacity in gallons
    int mpg;        // fuel consumption in miles per gallon

    // Return the range.
    int range() {
        return mpg * fuelcap;
    }
}

class RetMeth {
    public static void main(String args[]) {
        Vehicle_4_5 minivan = new Vehicle_4_5();
        Vehicle_4_5 sportscar = new Vehicle_4_5();

        int range1, range2;

        // assign values to fields in minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // assign values to fields in sportscar
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        // get the ranges
        range1 = minivan.range();
        range2 = sportscar.range();


        System.out.println("Minivan can carry " + minivan.passengers +
                " with range of " + range1 + " Miles");


        System.out.println("Sportscar can carry " + sportscar.passengers +
                " with range of " + range2 + " miles");

    }
}