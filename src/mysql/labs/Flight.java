package mysql.labs;

public class Flight {
    String FlightNum;
    String Origin;
    String Destination;
    String FlightDate;
    int PlaneID;
    String FlightDepartTime;

    public Flight(String FlightNum, String Origin, String Destination, String FlightDate, int PlaneID, String FlightDepartTime) {
        this.FlightNum = FlightNum;
        this.Origin = Origin;
        this.Destination = Destination;
        this.FlightDate = FlightDate;
        this.PlaneID = PlaneID;
        this.FlightDepartTime = FlightDepartTime;
    }

    public String getFlightNum() {
        return FlightNum;
    }

    public void setFlightNum(String flightNum) {
        FlightNum = flightNum;
    }

    public String getOrigin() {
        return Origin;
    }

    public void setOrigin(String origin) {
        Origin = origin;
    }

    public String getDestination() {
        return Destination;
    }

    public void setDestination(String destination) {
        Destination = destination;
    }

    public String getFlightDate() {
        return FlightDate;
    }

    public void setFlightDate(String flightDate) {
        FlightDate = flightDate;
    }

    public int getPlaneID() {
        return PlaneID;
    }

    public void setPlaneID(int planeID) {
        PlaneID = planeID;
    }

    public String getFlightDepartTime() {
        return FlightDepartTime;
    }

    public void setFlightDepartTime(String flightDepartTime) {
        FlightDepartTime = flightDepartTime;
    }
}
