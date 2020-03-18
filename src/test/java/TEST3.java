import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TEST3 {
    public static void main(String[] args) {
    String url = "jdbc:mysql://localhost/domashka";
    String username = "macaron";
    String password = "123";
    String sqlCreateTable = "create table domashkaMembers (id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,name VARCHAR(15),age int(3),legsize int(2), sex VARCHAR(3), status VARCHAR(15),pension int(2));";

    try {
        Connection connection = DriverManager.getConnection(url, username, password);


        Statement statement = connection.createStatement();
        statement.executeUpdate("INSERT INTO domashkaMembers (id,name,age,legsize,sex,status,pension) VALUES (NULL,'Tima','24','39','F','Member','39');");
        statement.executeUpdate("INSERT INTO domashkaMembers (id,name,age,legsize,sex,status,pension) VALUES (NULL,'Rapha','24','39','F','Member','39');");
        statement.executeUpdate("INSERT INTO domashkaMembers (id,name,age,legsize,sex,status,pension) VALUES (NULL,'Arman','24','39','F','Member','39');");
        statement.executeUpdate("INSERT INTO domashkaMembers (id,name,age,legsize,sex,status,pension) VALUES (NULL,'Marat','24','39','F','Member','39');");
        statement.executeUpdate("INSERT INTO domashkaMembers(id,name,age,legsize,sex,status,pension) VALUES (NULL,'Ali','24','39','F','Member','39');");
        statement.executeUpdate("INSERT INTO domashkaMembers (id,name,age,legsize,sex,status,pension) VALUES (NULL,'Tahmina','24','39','F','Member','39');");

    } catch (SQLException e) {
            System.out.println("Не удалось подключиться к Базе!");
        e.printStackTrace();
        }

    }
}
