package mysql.examples;

import java.sql.*;

// NOTE: This is more or less a copy of the example shown here on the platform
// here: https://platform.codingnomads.co/learn/mod/page/view.php?id=2132

public class JDBC_Example_1 {


    public static void main(String[] args)  {

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            // This will load the MySQL driver, each DB has its own driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            String connectionString = "jdbc:mysql://127.0.0.1:3306/college?"
                    + "user=root&password=IND14N4C#0MP";

            // Setup the connection with the DB
            connection = DriverManager
                    .getConnection(connectionString);

            // Statements allow to issue SQL queries to the database
            statement = connection.createStatement();
            // Result set get the result of the SQL query
            resultSet = statement
                    .executeQuery("select * from college.courses");

            // loop through the result set while there are more records
            while (resultSet.next()) {

                // get the id, name and units fields from the result set and assign them to local variables
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int units = resultSet.getInt("credits");

                // print out the result
                System.out.println("Course ID: " + id + " is " + name + " and has " + units + units);
            }

        } catch (SQLException exc) {
            System.out.println("Exception occurred");
            System.out.println(exc.getMessage());
            exc.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Exception occured - driver not found on classpath");
            e.printStackTrace();
        } finally {
            try {
                // close all JDBC elements
                statement.close();
                resultSet.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}