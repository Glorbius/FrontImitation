package WorkWithSql;

import kz.lesson.dbpractic.MyConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class WorkWithTable {

    public static void plusperson() {
        Scanner scanname = new Scanner(System.in);
        Scanner scanlegsize = new Scanner(System.in);
        Scanner scanage = new Scanner(System.in);
        Scanner scansex = new Scanner(System.in);
        Scanner scanstatus = new Scanner(System.in);
        User member = new User();


        try {
            Connection connection = null;
            connection = DriverManager.getConnection(MyConnection.DATABASE_URL, MyConnection.USER, MyConnection.PASSWORD);
            String sqlAdd = "INSERT INTO domashkaMembers (id,name,age,legsize,sex,status,pension) VALUES (NULL,?,?,?,?,?,?)";


            System.out.println(" Введите: ");
            System.out.println("Имя: ");
            member.setName(scanname.nextLine());
            System.out.println("Возраст: ");
            member.setAge(scanage.nextInt());
            System.out.println("Размер ноги: ");
            member.setLegSize(scanlegsize.nextInt());
            System.out.println("Пол: ");
            member.setSex(scansex.nextLine());
            System.out.println("Статус :");
            member.setStatus(scanstatus.nextLine());



            PreparedStatement stAll = connection.prepareStatement(sqlAdd);
            stAll.setString(1, member.getName());
            stAll.setInt(2, member.getAge());
            stAll.setInt(3, member.getLegSize());
            stAll.setString(4, member.getSex());
            stAll.setString(5, member.getStatus());
            stAll.setInt(6, member.pensiya());
            stAll.executeUpdate();

        } catch (SQLException ex) {
            System.err.println("Не удалось добавить члена домашки!");
            ex.printStackTrace();
        }
        System.out.println(member.getName() + " успешно добавлен ");

    }

    public static void deletePerson() {
        Scanner scanId = new Scanner(System.in);
        int choiceId = 0;
        try {
            Connection connection = null;
            connection = DriverManager.getConnection(MyConnection.DATABASE_URL, MyConnection.USER, MyConnection.PASSWORD);
            String sqlDelete = "DELETE FROM domashkaMembers WHERE id = ?;";

            System.out.println("Введите id человека которого хотите удалить: ");
            choiceId = scanId.nextInt();

            PreparedStatement stAll = connection.prepareStatement(sqlDelete);
            stAll.setInt(1,choiceId);
            stAll.executeUpdate();
            System.out.println("Успешно удален!");

        } catch (SQLException e) {
            System.err.println("Не удалось удалить члена домашки!");
            e.printStackTrace();
        }
    }
    public static void changeName () {
        Scanner scanId = new Scanner(System.in);
        Scanner scanName = new Scanner (System.in);
        int choiceId = 0;
        String name;
        try {
            Connection connection = null;
            connection = DriverManager.getConnection(MyConnection.DATABASE_URL, MyConnection.USER, MyConnection.PASSWORD);
            String sqlName = "UPDATE domashkaMembers SET name = ? WHERE id = ?;";

            System.out.println("Введите id человека имя которого хотите изменить: ");
            choiceId = scanId.nextInt();
            System.out.println("Введите новое имя: ");
            name = scanName.nextLine();


            PreparedStatement stAll = connection.prepareStatement(sqlName);
            stAll.setString(1,name);
            stAll.setInt(2,choiceId);
            stAll.executeUpdate();
            System.out.println("Успешно изменено!");

        } catch (SQLException e) {
            System.err.println("Не удалось изменить данные!");
            e.printStackTrace();
        }
    }

    public static void changeAge () {
        Scanner scanId = new Scanner(System.in);
        Scanner scanName = new Scanner (System.in);
        int choiceId = 0;
        String age;
        try {
            Connection connection = null;
            connection = DriverManager.getConnection(MyConnection.DATABASE_URL, MyConnection.USER, MyConnection.PASSWORD);
            String sqlName = "UPDATE domashkaMembers SET age = ? WHERE id = ?;";

            System.out.println("Введите id человека возраст которого хотите изменить: ");
            choiceId = scanId.nextInt();
            System.out.println("Введите новый возраст: ");
            age = scanName.nextLine();


            PreparedStatement stAll = connection.prepareStatement(sqlName);
            stAll.setString(1,age);
            stAll.setInt(2,choiceId);
            stAll.executeUpdate();
            System.out.println("Успешно изменено!");

        } catch (SQLException e) {
            System.err.println("Не удалось изменить данные!");
            e.printStackTrace();
        }
    }

    public static void changeLegSize () {
        Scanner scanId = new Scanner(System.in);
        Scanner scanName = new Scanner (System.in);
        int choiceId = 0;
        String legSize;
        try {
            Connection connection = null;
            connection = DriverManager.getConnection(MyConnection.DATABASE_URL, MyConnection.USER, MyConnection.PASSWORD);
            String sqlName = "UPDATE domashkaMembers SET legsize = ? WHERE id = ?;";

            System.out.println("Введите id человека размер ноги которого хотите изменить: ");
            choiceId = scanId.nextInt();
            System.out.println("Введите новый размер: ");
            legSize = scanName.nextLine();


            PreparedStatement stAll = connection.prepareStatement(sqlName);
            stAll.setString(1,legSize);
            stAll.setInt(2,choiceId);
            stAll.executeUpdate();
            System.out.println("Успешно изменено!");

        } catch (SQLException e) {
            System.err.println("Не удалось изменить данные!");
            e.printStackTrace();
        }
    }

    public static void changeSex () {
        Scanner scanId = new Scanner(System.in);
        Scanner scanName = new Scanner (System.in);
        int choiceId = 0;
        String sex;
        try {
            Connection connection = null;
            connection = DriverManager.getConnection(MyConnection.DATABASE_URL, MyConnection.USER, MyConnection.PASSWORD);
            String sqlName = "UPDATE domashkaMembers SET sex = ? WHERE id = ?;";

            System.out.println("Введите id человека пол которого хотите изменить: ");
            choiceId = scanId.nextInt();
            System.out.println("Введите пол: ");
            sex = scanName.nextLine();


            PreparedStatement stAll = connection.prepareStatement(sqlName);
            stAll.setString(1,sex);
            stAll.setInt(2,choiceId);
            stAll.executeUpdate();
            System.out.println("Успешно изменено!");

        } catch (SQLException e) {
            System.err.println("Не удалось изменить данные!");
            e.printStackTrace();
        }
    }

    public static void changeStatus () {
        Scanner scanId = new Scanner(System.in);
        Scanner scanName = new Scanner (System.in);
        int choiceId = 0;
        String status;
        try {
            Connection connection = null;
            connection = DriverManager.getConnection(MyConnection.DATABASE_URL, MyConnection.USER, MyConnection.PASSWORD);
            String sqlName = "UPDATE domashkaMembers SET status = ? WHERE id = ?;";

            System.out.println("Введите id человека статус которого хотите изменить: ");
            choiceId = scanId.nextInt();
            System.out.println("Введите новый статус: ");
            status = scanName.nextLine();


            PreparedStatement stAll = connection.prepareStatement(sqlName);
            stAll.setString(1,status);
            stAll.setInt(2,choiceId);
            stAll.executeUpdate();
            System.out.println("Успешно изменено!");

        } catch (SQLException e) {
            System.err.println("Не удалось изменить данные!");
            e.printStackTrace();
        }
    }



}
