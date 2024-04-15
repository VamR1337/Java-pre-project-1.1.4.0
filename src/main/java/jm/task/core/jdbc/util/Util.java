package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final  String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final  String URL = "jdbc:mysql://localhost:3306/mydbtest";
    private static final  String USERNAME = "VamR";
    private static final  String PASSWORD = "2440894";
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Connection connection = null;
        Class.forName(DRIVER);
        connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        return connection;
    }
}
