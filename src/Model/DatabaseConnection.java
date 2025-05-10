package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    
    // Step 1: معلومات الاتصال بقاعدة البيانات
    private static final String URL = "jdbc:mysql://localhost:3306/Tazkartiy";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    // Step 2: دالة بتنشئ اتصال جديد في كل مرة
    public static Connection getConnection() throws SQLException {
        try {
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("✅ Connection established.");
            return conn;
        } catch (SQLException e) {
            System.out.println("❌ Error while connecting to the database: " + e.getMessage());
            throw e;
        }
    }
}
