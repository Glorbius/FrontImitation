import java.sql.*;

public class Test {


    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DATABASE_URL = "jdbc:mysql://localhost:/domashka";

    /**
     * User and Password
     */
    static final String USER = "macaron";
    static final String PASSWORD = "123";

    public static void main(String[] args) throws ClassNotFoundException, SQLException {


            Connection connection = null;
            Statement statement = null;

            System.out.println("Registering JDBC driver...");

            Class.forName("com.mysql.cj.jdbc.Driver");

            System.out.println("Creating database connection...");
            connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);

            System.out.println("Executing statement...");
            statement = connection.createStatement();

            String sql;
            sql = "SELECT * FROM spisok";

            ResultSet resultSet = statement.executeQuery(sql);

            System.out.println("Retrieving data from database...");
            System.out.println("\nDevelopers:");
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String specialty = resultSet.getString("specialty");
                int salary = resultSet.getInt("salary");

                System.out.println("\n================\n");
                System.out.println("id: " + id);
                System.out.println("Name: " + name);
                System.out.println("Specialty: " + specialty);
                System.out.println("Salary: $" + salary);
            }



        System.out.println("Closing connection and releasing resources...");
        resultSet.close();
        statement.close();
        connection.close();
    }
}



