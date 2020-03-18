import com.sun.org.apache.bcel.internal.generic.ACONST_NULL;
import jdk.nashorn.internal.runtime.ScriptEnvironment;

import java.sql.*;
import java.util.Scanner;


public class Test2 {

    //Добавить домашку с id
    // изменить в процессе все чтобы было
    //изменение без повторений(имя.возраст.проверка возраста) ошибка
    //получаю айди и меняю
    // практика update
    //удалить из домашки по айди
    //4 получить весь список
    //5 кто выше 20 а кто ниже 20 лет
    //1 добавить
    // 2 изменить
    //3 удалить


    public static void main(String[] args) {

       /* Scanner scanName = new Scanner(System.in);
        Scanner scanAge = new Scanner (System.in);
        Scanner scanLegsizege = new Scanner (System.in);
        Scanner scanSex = new Scanner (System.in);
        Scanner scanStatus = new Scanner (System.in);
        String name = scanName.nextLine();
        int age = scanAge.nextInt();
        int legsize = scanLegsizege.nextInt();
        String sex = scanSex.nextLine();
        String status = scanStatus.nextLine();

        */


        String crerateTable = "create table domashkaMembers (id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,name VARCHAR(15),age int(3),legsize int(2), sex VARCHAR(3), status VARCHAR(15),pension int(2));";
        String insertInTable = "insert into domashkaMembers (id,name,age,legsize,sex,status,pension) VALUES (NULL,'Mama','45','53','fem','TIGR','34');";
        String updateTable = "UPDATE domashkaMembers SET name = 'mariamagdalena',age='100',legsize ='50',sex = 'sex',status = 'statusMmeber', pension = '50'  WHERE id = '1'  ;";
        String dropTable = "drop table domashkaMembers";


        try {
            String url = "jdbc:mysql://localhost/domashka";
            String username = "macaron";
            String password = "123";
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            Connection conn = DriverManager.getConnection(url, username, password);


            //  statement.execute("INSERT INTO domashkaMembers (id,name,age,legsize,sex,status,pension) VALUES (NULL,'gavno','24','39','F','Member','39');");
            //statement.executeUpdate(crerateTable);
            //statement.executeUpdate(insertInTable);
            //statement.executeUpdate(updateTable);
            // statement.executeUpdate(dropTable);

            Statement statement = conn.createStatement();

            ResultSet resultSet = statement.executeQuery("select * from domashkaMembers;");


            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                int age = resultSet.getInt(3);
                int legsize = resultSet.getInt(4);
                String sex = resultSet.getString(5);
                String status = resultSet.getString(6);
                int pensiya = resultSet.getInt(7);

                System.out.println( id + " " +  " "  + name+ " " + age+ " " + legsize + " " + sex +  " " + status + " " + pensiya);
            }


        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Connection failed...");
            System.out.println(ex);
        }


    }

}