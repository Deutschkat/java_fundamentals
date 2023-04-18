package mysql.labs;


/*
*  MySQL Exercise 4:
*
*   Now that you have mastered your air travel database, it's time to connect this DB to a Java application
*   using JDBC. You can start simple here and build your way up. Within a Java application, using JDBC, please
*   demonstrate how to:
*
*   Note: CRUD means (Create, Read, Update, Delete)
*
*       1.) CRUD new flights
*       2.) CRUD new passengers
*       3.) Bonus: flex those JDBC muscles! How nice, clean, useful can you make this? Show us what you've got!
*
*
*   Caution: Before you push this code to GitHub, be sure to REMOVE or REPLACE your DATABASE PASSWORD. You do not 
*   want to push your database password to GitHub. If you do push your password to GitHub you'll need to delete
*   the commit from your Git history. See, for instance: https://medium.com/multinetinventiv/removing-commits-from-git-history-4e2340288484 
*
 */

import java.sql.*;

public class Exercise_04 {

    public static void main(String[] args) {


        Connection connection = null;
        Statement statement = null;
        Flight newFlight = new Flight("1808", "1", "21", "2023-05-01", 3004, "12:34:00");


        //Adding a new flight with object above
        addFlight(newFlight);
        //Querying flights with origin 1, destination 21, flight date 2023-05-01
        queryFlights("1", "21", "2023-05-01");
        //Updated a flight (2005) to have a new departure time.
        updateFlight("2005", "2022-12-15", "12:50:00");
        //Remove a flight (The one we made earlier)
        removeFlight("1808", "2023-05-01");





    }
//To add flights
    public static void addFlight(Flight flight) {
        Connection connection = null;
        Statement statement = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");

            String connectionString = "jdbc:mysql://Hercules:3306/airtravel"
                    + "user=root&password=<DATABASEPASSWORD>"
                    + "&useSSL=false&allowPublicKeyRetrieval=true";


            connection = DriverManager.getConnection(connectionString);

            //Query statement to insert new flight.
            statement = connection.createStatement();
            String creating = "INSERT INTO flight (FlightNum, Origin, Destination, FlightDate, PlaneID, FlightDepartTime)" +
                    "VALUES ('" + flight.getFlightNum() + "', '" + flight.getOrigin() + "', '" + flight.getDestination() +
                    "', '" + flight.getFlightDate() + "', " + flight.getPlaneID() + ", '" + flight.getFlightDepartTime() + "')";
            statement.executeUpdate(creating);


            statement.close();
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (connection != null) statement.close();
            } catch (SQLException e2) {
            }
            try {
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

    //To query flights

    public static void queryFlights(String Origin, String Destination, String FlightDate) {
        Connection connection = null;
        Statement statement = null;

        try{
            Class.forName("com.mysql.jdbc.Driver");

            String connectionString = "jdbc:mysql://Hercules:3306/airtravel"
                    + "user=root&password=<DATABASEPASSWORD>"
                    + "&useSSL=false&allowPublicKeyRetrieval=true";


            connection = DriverManager.getConnection(connectionString);
            statement = connection.createStatement();

            String sqlQuery = "SELECT * FROM Flight WHERE Origin = '" + Origin + "' AND destination = '" + Destination +
                    "' AND FlightDate = '" + FlightDate + "'";

            ResultSet resultSet = statement.executeQuery(sqlQuery);

            while(resultSet.next()){
                String FlightNum = resultSet.getString("FlightNum");
                String OriginRes = resultSet.getString("Origin");
                String DestinationRes = resultSet.getString("Destination");
                String FlightDateRes = resultSet.getString("FlightDate");
                int PlaneID = resultSet.getInt("PlaneID");
                String FlightDepartTime = resultSet.getString("FlightDepartTime");

                System.out.println("FlightNum: " + FlightNum);
                System.out.println(", Origin: " + OriginRes);
                System.out.println(", Destination: " + DestinationRes);
                System.out.println(", FlightDate: " + FlightDateRes);
                System.out.println(", PlaneID: " + PlaneID);
                System.out.println(", FlightDepartTime: " + FlightDepartTime);

            }
            resultSet.close();
            statement.close();
            connection.close();

        }catch(SQLException s1){
            s1.printStackTrace();
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            try{
                if(statement != null) statement.close();
            }catch(SQLException s2){

            }try{
                if (connection != null) connection.close();
            }catch(SQLException s1){
                s1.printStackTrace();
            }
        }



    }
//To update Flights
    public static void updateFlight(String FlightNum, String FlightDate, String FlightDepartTime) {
        Connection connection = null;
        Statement statement = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");

            String connectionString = "jdbc:mysql://Hercules:3306/airtravel"
                    + "user=root&password=<DATABASEPASSWORD>"
                    + "&useSSL=false&allowPublicKeyRetrieval=true";


            connection = DriverManager.getConnection(connectionString);

            //Query statement to insert new flight.
            statement = connection.createStatement();
            String updating = "UPDATE flight SET FlightDepartTime = '" + FlightDepartTime +
                    "' WHERE FlightNum = '" + FlightNum + "' AND FlightDate = '" + FlightDate + "'";
            int rowUpdated = statement.executeUpdate(updating);

            if (rowUpdated > 0) {
                System.out.println("Flight updated successfully.");
            } else {
                System.out.println("Flight not found or not updated.");
            }


            statement.close();
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (connection != null) statement.close();
            } catch (SQLException e2) {
            }
            try {
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

    public static void removeFlight(String FlightNum, String FlightDate) {
        Connection connection = null;
        Statement statement = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");

            String connectionString = "jdbc:mysql://Hercules:3306/airtravel"
                    + "user=root&password=<DATABASEPASSWORD>"
                    + "&useSSL=false&allowPublicKeyRetrieval=true";


            connection = DriverManager.getConnection(connectionString);

            //Query statement to insert new flight.
            statement = connection.createStatement();
            String delete = "DELETE FROM flight WHERE FlightNum = '" + FlightNum +
                    "' AND FlightDate = '" + FlightDate + "'";
            int rowDeleted = statement.executeUpdate(delete);

            if (rowDeleted > 0) {
                System.out.println("Flight removed successfully.");
            } else {
                System.out.println("Flight not found or not removed.");
            }


            statement.close();
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (connection != null) statement.close();
            } catch (SQLException e2) {
            }
            try {
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }





}
