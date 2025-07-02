package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnection {
    private static final String URL = "jdbc:mysql://localhost:3306/flatreservation";
    private static final String USER = "root";
    private static final String PASSWORD = "ROOT";

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
//            System.out.println("Database connection successful!");
            return conn;
        } catch (Exception e) {
            System.out.println(" Database connection failed! Check your URL, username, or password.");
            e.printStackTrace();
            return null;
        }
    }
}
