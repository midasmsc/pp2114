package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

public class Util {
    static Logger logger = Logger.getLogger("UtilLogger");

    private static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/Kata";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "root1";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName(DB_DRIVER);
            connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            logger.info("Соединение с БД установлено");
        } catch (ClassNotFoundException | SQLException e) {
            logger.info("Ошибка соединения с БД");
            e.printStackTrace();
        }
        return connection;
    }
}
