package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.*;



public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        Connection connection = Util.getConnection();


        UserDao userDao = new UserDaoJDBCImpl();

        userDao.createUsersTable();

        userDao.saveUser("Максим", "Суханов", (byte) 33);
        userDao.saveUser("Егор", "Пирожков", (byte) 28);
        userDao.saveUser("Герман", "Катов", (byte) 30);
        userDao.saveUser("Морти", "Риков", (byte) 52);

        userDao.removeUserById(1);
        userDao.getAllUsers();
        userDao.cleanUsersTable();
        userDao.dropUsersTable();


        try {
            Util.getConnection().close();
            System.out.println("Соединение с БД закрыто");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
