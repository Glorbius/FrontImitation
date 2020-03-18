package WorkWithSql;

import kz.lesson.dbpractic.MyConnection;

import java.sql.*;

public class ShowTable {

    public static String allTable = "select * from domashkaMembers";
    public static String lessThan21 = "select * from domashkaMembers where age <21;";
    public static String overThan21 = "select * from domashkaMembers where age >21;";

    public static void showTable() {

        Connection connection = null;
        ResultSet rsAll = null;

        try {
            connection = DriverManager.getConnection(MyConnection.DATABASE_URL, MyConnection.USER, MyConnection.PASSWORD);
            Statement stAll = connection.createStatement();


            rsAll = stAll.executeQuery(allTable);
            System.out.println(" Весь список домашки");
            while (rsAll.next()) {
                int id = rsAll.getInt(1);
                String name = rsAll.getString(2);
                int age = rsAll.getInt(3);
                int legsize = rsAll.getInt(4);
                String sex = rsAll.getString(5);
                String status = rsAll.getString(6);
                int pensiya = rsAll.getInt(7);

                //System.out.println("\n==================\n");
                // System.out.println("Id: " + id);
                // System.out.println("Name: " + name);
                // System.out.println("Age: " + age);
                // System.out.println("LegSize: " + legsize);
                //System.out.println("Sex: " + sex);
                //System.out.println("Status: " + status);
                //System.out.println("Pensiya: " + pensiya);


                System.out.println("    " + id + "    " + name + "  " + age + "   " + legsize + "   " + sex + "  " + status + "  " + pensiya);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public static void showless21() {
        Connection connection = null;
        ResultSet rsless21 = null;
        try {
            connection = DriverManager.getConnection(MyConnection.DATABASE_URL, MyConnection.USER, MyConnection.PASSWORD);
            Statement stAll = connection.createStatement();
            rsless21 = stAll.executeQuery(lessThan21);

            System.out.println("Только те кто младше 21");
            while (rsless21.next()) {
                int id = rsless21.getInt(1);
                String name = rsless21.getString(2);
                int age = rsless21.getInt(3);
                int legsize = rsless21.getInt(4);
                String sex = rsless21.getString(5);
                String status = rsless21.getString(6);
                int pensiya = rsless21.getInt(7);

                //System.out.println("\n==================\n");
                // System.out.println("Id: " + id);
                // System.out.println("Name: " + name);
                // System.out.println("Age: " + age);
                // System.out.println("LegSize: " + legsize);
                //System.out.println("Sex: " + sex);
                //System.out.println("Status: " + status);
                //System.out.println("Pensiya: " + pensiya);


                System.out.println("    " + id + "    " + name + "  " + age + "   " + legsize + "   " + sex + "  " + status + "  " + pensiya);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



    public static void showOver() {
        Connection connection = null;
        ResultSet rsOver21 = null;
        try {
            connection = DriverManager.getConnection(MyConnection.DATABASE_URL, MyConnection.USER, MyConnection.PASSWORD);
            Statement stAll = connection.createStatement();

            rsOver21 = stAll.executeQuery(overThan21);
            System.out.println("Только те кто старше 21");
            while (rsOver21.next()) {
                int id = rsOver21.getInt(1);
                String name = rsOver21.getString(2);
                int age = rsOver21.getInt(3);
                int legsize = rsOver21.getInt(4);
                String sex = rsOver21.getString(5);
                String status = rsOver21.getString(6);
                int pensiya = rsOver21.getInt(7);

                //System.out.println("\n==================\n");
                // System.out.println("Id: " + id);
                // System.out.println("Name: " + name);
                // System.out.println("Age: " + age);
                // System.out.println("LegSize: " + legsize);
                //System.out.println("Sex: " + sex);
                //System.out.println("Status: " + status);
                //System.out.println("Pensiya: " + pensiya);


                System.out.println("    " + id + "    " + name + "  " + age + "   " + legsize + "   " + sex + "  " + status + "  " + pensiya);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

}
