package labs_examples.objects_classes_methods.labs.objects.Exercise01Airplane;

public class Airplane {
    public static void main(String[] args) {

        System.out.println(Propeller.toString());

    }

    private double fuelCapacity;
    private double currentFuelLevel;

    public Airplane(double fuelCapacity, double currentFuelLevel) {
        this.fuelCapacity = fuelCapacity;
        this.currentFuelLevel = currentFuelLevel;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public double getCurrentFuelLevel() {
        return currentFuelLevel;
    }

    public void setCurrentFuelLevel(double currentFuelLevel) {
        this.currentFuelLevel = currentFuelLevel;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "fuelCapacity=" + fuelCapacity +
                ", currentFuelLevel=" + currentFuelLevel +
                '}';
    }

    public class Propeller {
        private int numBlades;
        private String material;

        public int getNumBlades() {
            return numBlades;
        }

        public void setNumBlades(int numBlades) {
            this.numBlades = numBlades;
        }

        public String getMaterial() {
            return material;
        }

        public void setMaterial(String material) {
            this.material = material;
        }

        @Override
        public String toString() {
            return "Propeller{" +
                    "numBlades=" + numBlades +
                    ", material='" + material + '\'' +
                    '}';
        }
    }

    public class Fuselage {
        private String bodyMaterial;
        private int numPassengers;
        private int numDecks;

        public Fuselage(String bodyMaterial, int numPassengers, int numDecks) {
            this.bodyMaterial = bodyMaterial;
            this.numPassengers = numPassengers;
            this.numDecks = numDecks;
        }

        public String getBodyMaterial() {
            return bodyMaterial;
        }

        public void setBodyMaterial(String bodyMaterial) {
            this.bodyMaterial = bodyMaterial;
        }

        public int getNumPassengers() {
            return numPassengers;
        }

        public void setNumPassengers(int numPassengers) {
            this.numPassengers = numPassengers;
        }

        public int getNumDecks() {
            return numDecks;
        }

        public void setNumDecks(int numDecks) {
            this.numDecks = numDecks;
        }

        @Override
        public String toString() {
            return "Fuselage{" +
                    "bodyMaterial='" + bodyMaterial + '\'' +
                    ", numPassengers=" + numPassengers +
                    ", numDecks=" + numDecks +
                    '}';
        }
    }

    public class Machinery {
        private double engineHorsePower;
        private String engineType;

        public Machinery(double engineHorsePower, String engineType) {
            this.engineHorsePower = engineHorsePower;
            this.engineType = engineType;
        }

        public double getEngineHorsePower() {
            return engineHorsePower;
        }

        public void setEngineHorsePower(double engineHorsePower) {
            this.engineHorsePower = engineHorsePower;
        }

        public String getEngineType() {
            return engineType;
        }

        public void setEngineType(String engineType) {
            this.engineType = engineType;
        }

        @Override
        public String toString() {
            return "Machinery{" +
                    "engineHorsePower=" + engineHorsePower +
                    ", engineType='" + engineType + '\'' +
                    '}';
        }
    }

    public class Cockpit {
        private int numSeats;
        private boolean airConditioned;
        private String avionicType;

        public Cockpit(int numSeats, boolean airConditioned, String avionicType) {
            this.numSeats = numSeats;
            this.airConditioned = airConditioned;
            this.avionicType = avionicType;
        }

        public int getNumSeats() {
            return numSeats;
        }

        public void setNumSeats(int numSeats) {
            this.numSeats = numSeats;
        }

        public boolean isAirConditioned() {
            return airConditioned;
        }

        public void setAirConditioned(boolean airConditioned) {
            this.airConditioned = airConditioned;
        }

        public String getAvionicType() {
            return avionicType;
        }

        public void setAvionicType(String avionicType) {
            this.avionicType = avionicType;
        }

        @Override
        public String toString() {
            return "Cockpit{" +
                    "numSeats=" + numSeats +
                    ", airConditioned=" + airConditioned +
                    ", avionicType='" + avionicType + '\'' +
                    '}';
        }
    }
}


