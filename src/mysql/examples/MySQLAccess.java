package mysql.examples;

import java.sql.*;
import java.util.ArrayList;

/**
 * Created by ryandesmond - https://codingnomads.co
 */

public class MySQLAccess {
    private Connection connection = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;

    public static void main(String[] args) {
        MySQLAccess example = new MySQLAccess();


        try {
            example.readDataBase("JDBC Course 1", 3);
        } catch (Exception e){
            System.out.println("error in readDateBase()" + e.getMessage());
            System.out.println(e.getStackTrace());
        }
    }

    public void readDataBase(String course_name, int units)
            throws Exception {
        try {
            // This will load the MySQL driver, each DB has its own driver
            Class.forName("com.mysql.jdbc.Driver");
            // Setup the connection with the DB
            connection = DriverManager.getConnection("jdbc:mysql://localhost/University?" +
                    "user=root&password=&useSSL=false");


            // Statements allow to issue SQL queries to the database
            statement = connection.createStatement();

            // Result set get the result of the SQL query
            resultSet = statement.executeQuery("select * from University.courses;");

            //writeResultSet(resultSet);
            ArrayList<Course> course = mapResultSetToObjects(resultSet);

            for (Course c : course){
                System.out.println(c.toString());
            }


            // PreparedStatements can use variables and are more efficient
            preparedStatement = connection
                    .prepareStatement("insert into  University.courses (name, units) " +
                            "values (?, ?)");
            // Parameters start with 1
            preparedStatement.setString(1, course_name);
            // preparedStatement.setString(2, credits);
            preparedStatement.setInt(2, units);
            //preparedStatement.setString(4, department);
            preparedStatement.executeUpdate();


            preparedStatement = connection
                    .prepareStatement("SELECT * from University.courses");
            resultSet = preparedStatement.executeQuery();

            //writeResultSet(resultSet);



            //Remove again the insert comment
            preparedStatement = connection
                    .prepareStatement("delete from University.courses where name = ? ; ");
            preparedStatement.setString(1, "JDBC Course 1");
            preparedStatement.executeUpdate();

            resultSet = statement.executeQuery("select * from University.courses");

            writeMetaData(resultSet);

        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        } finally {
            close();
        }

    }

    private void writeMetaData(ResultSet resultSet) throws SQLException {
        //         Now get some metadata from the database
        // Result set get the result of the SQL query

        System.out.println("The columns in the table are: ");

        System.out.println("Table: " + resultSet.getMetaData().getTableName(1));

        for  (int i = 1; i<= resultSet.getMetaData().getColumnCount(); i++){
            System.out.println("Column " +i  + " "+ resultSet.getMetaData().getColumnName(i));
        }
    }

    private void writeResultSet(ResultSet resultSet) throws SQLException {
        // ResultSet is initially before the first data set
        while (resultSet.next()) {
            // It is possible to get the columns via name
            // also possible to get the columns via the column number
            // which starts at 1
            // e.g. resultSet.getSTring(2);
            String course = resultSet.getString("name");
            //String description = resultSet.getString("description");
            int credits = resultSet.getInt("units");
            //String department = resultSet.getString("department");
            System.out.println("Course: " + course);
            // System.out.println("Description: " + description);
            System.out.println("Credits: " + credits);
            // System.out.println("Department: " + department);
            System.out.println("---------------------------------");
            System.out.println("---------------------------------");

        }
    }

    private ArrayList<Course> mapResultSetToObjects(ResultSet resultSet) throws SQLException {

        ArrayList<Course> retList = new ArrayList();

        // ResultSet is initially before the first data set
        while (resultSet.next()) {
            Course c = new Course();
            c.setId(resultSet.getInt("id"));
            c.setName(resultSet.getString("name"));
            c.setUnits(resultSet.getInt("units"));

            retList.add(c);
        }

        return retList;
    }





    // You need to close the resultSet
    private void close() {
        try {
            if (resultSet != null) {
                resultSet.close();
            }

            if (statement != null) {
                statement.close();
            }

            if (connection != null) {
                connection.close();
            }
        } catch (Exception e) {

        }
    }

}
