import java.sql.DriverManager;

public class DriverRegister {

    public static void main(String[] args) {
        
    }
    public  DriverRegister() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Драйвер не подключен!");
            System.out.println(e);
        }
    }


}
