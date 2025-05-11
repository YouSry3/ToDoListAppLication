/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;


import Model.DatabaseConnection;
import Main.Task;
import Main.User;
import View.Login;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author Lenovo
 */
public class TasksService {
    
    
   public static boolean addTaskToDatabase(Task task) {
    // تعديل الاستعلام لتمكين الحصول على الـ ID المولد تلقائيًا
    String query = "INSERT INTO tasks (title, description, user_id) VALUES (?, ?, ?)";

    try (Connection conn = DatabaseConnection.getConnection();
         PreparedStatement stmt = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {

        stmt.setString(1, task.title);
        stmt.setString(2, task.description);
        stmt.setInt(3, task.userId);

        // تنفيذ الاستعلام لإضافة المهمة
        int rows = stmt.executeUpdate();

        // التحقق إذا تم إضافة المهمة بنجاح
        if (rows > 0) {
            // جلب الـ ID المولد للمهمة
            try (ResultSet generatedKeys = stmt.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    task.id = generatedKeys.getInt(1);  // تعيين الـ ID للمهمة
                    return true;
                }
            }
        }

    } catch (SQLException e) {
        System.out.println("❌ Error adding task: " + e.getMessage());
        return false;
    }
    
    return false; // في حالة فشل إضافة المهمة
}

public static List<Task> getTasksByUserId(int userId) {
    List<Task> tasks = new ArrayList<>();
    String query = "SELECT * FROM tasks WHERE user_id = ?";

    try (Connection conn = DatabaseConnection.getConnection();
         PreparedStatement stmt = conn.prepareStatement(query)) {

        stmt.setInt(1, userId);
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            Task task = new Task(
                rs.getInt("id"),
                rs.getString("title"),
                rs.getString("description"),
                rs.getInt("user_id"),
                rs.getString("status") // ✅ جلب الحالة من قاعدة البيانات
            );
            tasks.add(task);
        }
    } catch (SQLException e) {
        System.out.println("❌ Error fetching tasks: " + e.getMessage());
    }

    return tasks;
}
public static void markTaskAsComplete(int taskId) {
    String query = "UPDATE tasks SET status = 'complete' WHERE id = ?";

    try (Connection conn = DatabaseConnection.getConnection();
         PreparedStatement stmt = conn.prepareStatement(query)) {

        stmt.setInt(1, taskId);
        int rowsUpdated = stmt.executeUpdate();

        if (rowsUpdated > 0) {
            System.out.println("✅ Task marked as complete.");
        } else {
            System.out.println("⚠️ No task found with the given ID.");
        }

    } catch (SQLException e) {
        System.out.println("❌ Error updating task status: " + e.getMessage());
    }
}


    
    public static boolean updateTaskInDatabase(Task task) {
    String query = "UPDATE tasks SET title = ?, description = ? WHERE id = ?";

    try (Connection conn = DatabaseConnection.getConnection();
         PreparedStatement stmt = conn.prepareStatement(query)) {

        stmt.setString(1, task.title);
        stmt.setString(2, task.description);
        stmt.setInt(3, task.id);

        int rowsUpdated = stmt.executeUpdate();
        return rowsUpdated > 0;

    } catch (SQLException e) {
        System.out.println("❌ Error updating task: " + e.getMessage());
        return false;
    }
}

    public static boolean deleteTaskFromDatabase(int taskId) {
    String query = "DELETE FROM tasks WHERE id = ?";

    try (Connection conn = DatabaseConnection.getConnection();
         PreparedStatement stmt = conn.prepareStatement(query)) {

        stmt.setInt(1, taskId);

        int rowsDeleted = stmt.executeUpdate();
        
        return rowsDeleted > 0;

    } catch (SQLException e) {
        System.out.println("❌ Error deleting task: " + e.getMessage());
        return false;
    }
}


    
}
