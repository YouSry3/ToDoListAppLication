package Controller;

import Model.DatabaseConnection;
import Main.User;
import View.Login;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class UsersService {

public static int getUserIdByEmail(String email) {
    String query = "SELECT id FROM users WHERE email = ?";
    
    try (Connection conn = DatabaseConnection.getConnection();
         PreparedStatement stmt = conn.prepareStatement(query)) {
        
        stmt.setString(1, email);
        ResultSet rs = stmt.executeQuery();
        
        if (rs.next()) {
            return rs.getInt("id");
        } else {
            System.out.println("❌ Email not found.");
            return -1;  // ترجع -1 لو مش لاقي الإيميل
        }
    } catch (SQLException e) {
        System.out.println("❌ Error fetching user ID: " + e.getMessage());
        return -1;
    }
}

public void getUsers() {
        String query = "SELECT * FROM Users"; // تأكد من اسم الجدول في قاعدة البيانات.
        
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {

            // معالجة البيانات المسترجعة.
            while (resultSet.next()) {
                System.out.println("User: " + resultSet.getString("username"));
                System.out.println("Email User: " + resultSet.getString("email"));
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

public static void registerUser(User newUser) {
           String query = "INSERT INTO users (username, email, password, fullName, age, phoneNumber, gender) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = DatabaseConnection.getConnection(); // الحصول على الاتصال بقاعدة البيانات
             PreparedStatement stmt = conn.prepareStatement(query)
                ) {

            // تعيين القيم للأعمدة في الاستعلام
            stmt.setString(1, newUser.getUsername());  // username
            stmt.setString(2, newUser.getEmail());     // email
            stmt.setString(3, newUser.getPassword());  // password
            stmt.setString(4, newUser.getFullName());  // fullName
            stmt.setString(5, newUser.getAge());      // age
            stmt.setString(6, newUser.getPhoneNumber());  // phoneNumber
            stmt.setString(7, newUser.getGender());   //  gender
            

            int rowsInserted = stmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("✅ User registered successfully.");
            }

        } catch (SQLException e) {
            System.out.println("❌ Error registering user: " + e.getMessage());
        }
}
  
public static boolean updatePassword(String email, String newPassword) {
    String query = "UPDATE `users` SET `password` = ? WHERE `email` = ?";

    try (Connection conn = DatabaseConnection.getConnection();
         PreparedStatement stmt = conn.prepareStatement(query)) {

        stmt.setString(1, newPassword);
        stmt.setString(2, email);

        int rowsUpdated = stmt.executeUpdate();

        return rowsUpdated > 0;
    } catch (SQLException e) {
        System.out.println("❌ Error updating password: " + e.getMessage());
        return false;
    }
}

public static boolean isEmailExist(String email) {
    String query = "SELECT COUNT(*) FROM users WHERE email = ?";
    
    // تأكد من فتح الاتصال داخل الميثود
    try (Connection conn = DatabaseConnection.getConnection(); 
         PreparedStatement stmt = conn.prepareStatement(query)) {

        // تعيين قيمة البريد الإلكتروني في الاستعلام
        stmt.setString(1, email);
        
        // تنفيذ الاستعلام والحصول على النتيجة
        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            int count = rs.getInt(1); // إذا كانت قيمة count أكبر من 0 فالبريد الإلكتروني موجود
            return count > 0;
        }
    } catch (SQLException e) {
        System.out.println("❌ Error checking email: " + e.getMessage());
    }

    // إذا لم يكن البريد الإلكتروني موجودًا في قاعدة البيانات
    return false;
}

public static boolean Login(User LoginUser) {
        boolean isValidUser = false;
        String query = "SELECT * FROM Users WHERE email = ? AND password = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            // استخدام القيم المرسلة عبر المعاملات
            stmt.setString(1, LoginUser.getEmail());
            stmt.setString(2, LoginUser.getPassword());

            
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    FullNameAfterLogin(rs.getString("username"));
                    
                    System.out.println("✅ User found");
                    isValidUser = true;
                } else {
                    System.out.println("❌ User not found");
                }
            }
        } catch (SQLException e) {
            System.out.println("❌ Error: " + e.getMessage());
        }

        return isValidUser;
    }
    
public static void FullNameAfterLogin(String fullname){
        
        Login login = new Login();
        login.WelcomeUSer(fullname);
        
    }

}
