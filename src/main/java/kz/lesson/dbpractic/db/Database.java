package kz.lesson.dbpractic.db;

import kz.lesson.dbpractic.MyConnection;
import kz.lesson.dbpractic.model.*;

import java.sql.*;
import java.util.ArrayList;

/**
 * Работа с Базой данных
 */
public class Database {

    /**
     * Конструктор
     */
    public void Database() {

    }     


    /**
     * Добавить пользователя
     *
     * @param member
     */
    public void setUser(User member) {
        String sql = "INSERT INTO home_person (name,age,legsize,sex,status,pension) VALUES (?,?,?,?,?,?)";

        try {
            Connection connection = DriverManager.getConnection(MyConnection.DATABASE_URL, MyConnection.USER, MyConnection.PASSWORD);

            try {
                PreparedStatement pst = connection.prepareStatement(sql);

                pst.setString(1, member.getName());
                pst.setInt(2, member.getAge());
                pst.setInt(3, member.getLegSize());
                pst.setString(4, member.getSex());
                pst.setString(5, member.getStatus());
                pst.setInt(6, member.pensiya());


                pst.executeUpdate();

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                connection.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /**
     * Вывод списка полностью
     *
     * @return
     */
    public ArrayList<User> getUsers() {

        String sql = "select * from home_person";
        ArrayList<User> users = new ArrayList<User>();

        try {
            Connection connection = DriverManager.getConnection(MyConnection.DATABASE_URL, MyConnection.USER, MyConnection.PASSWORD);

            try {

                PreparedStatement pst = connection.prepareStatement(sql);

                ResultSet rs = pst.executeQuery();

                while (rs.next()) {
                    User user = new User();

                    user.setId(rs.getInt("id"));
                    user.setName(rs.getString("name"));
                    user.setAge(rs.getInt("age"));
                    user.setLegSize(rs.getInt("legsize"));
                    user.setSex(rs.getString("sex"));
                    user.setStatus(rs.getString("status"));
                    user.pensiya();

                    users.add(user);

                }

            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                connection.close();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }


        return users;
    }


    /**
     * Вывод списка младше/старше 21
     *
     * @return
     */
    public ArrayList<User> getUsers2(String field) {

        String sql = "select * from home_person where age" + field + "21;";
        ArrayList<User> users = new ArrayList<User>();

        try {
            Connection connection = DriverManager.getConnection(MyConnection.DATABASE_URL, MyConnection.USER, MyConnection.PASSWORD);

            try {

                PreparedStatement pst = connection.prepareStatement(sql);

                ResultSet rs = pst.executeQuery();

                while (rs.next()) {
                    User user = new User();

                    user.setId(rs.getInt("id"));
                    user.setName(rs.getString("name"));
                    user.setAge(rs.getInt("age"));
                    user.setLegSize(rs.getInt("legsize"));
                    user.setSex(rs.getString("sex"));
                    user.setStatus(rs.getString("status"));
                    user.pensiya();

                    users.add(user);

                }

            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                connection.close();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }


        return users;
    }

    /**
     * Удаление пользователя
     *
     * @return
     */
    public boolean deleteUser(int id) {
        String sqlDelete = "DELETE FROM home_person WHERE id = ?;";

        try {
            Connection connection = DriverManager.getConnection(MyConnection.DATABASE_URL, MyConnection.USER, MyConnection.PASSWORD);

            try {

                PreparedStatement pst = connection.prepareStatement(sqlDelete);

                pst.setInt(1, id);
                pst.executeUpdate();


            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                connection.close();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }


    /**
     * Изменение данных
     *
     * @param
     * @return
     */


    public void changeByField(String field, int fieldValue, int id) {
        String sqlChange = "UPDATE home_person SET " + field + " = ? WHERE id = ?;";
        try {
            Connection connection = DriverManager.getConnection(MyConnection.DATABASE_URL, MyConnection.USER, MyConnection.PASSWORD);

            try {

                PreparedStatement pst = connection.prepareStatement(sqlChange);

                pst.setInt(1, fieldValue);
                pst.setInt(2, id);
                pst.executeUpdate();


            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                connection.close();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Изменение данных
     *
     * @param
     * @return
     */
    public void changeByfield(String field, String fieldValue, int id) {
        String sqlChange = "UPDATE home_person SET " + field + " = ? WHERE id = ?;";
        try {
            Connection connection = DriverManager.getConnection(MyConnection.DATABASE_URL, MyConnection.USER, MyConnection.PASSWORD);

            try {

                PreparedStatement pst = connection.prepareStatement(sqlChange);

                pst.setString(1, fieldValue);
                pst.setInt(2, id);
                pst.executeUpdate();


            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                connection.close();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
