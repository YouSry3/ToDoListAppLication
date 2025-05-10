package Controller;

import Main.Task;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public class TasksServiceTest {

    public TasksServiceTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of addTaskToDatabase method, of class TasksService.
     */
    @Test
    public void testAddTaskToDatabase() {
        System.out.println("addTaskToDatabase");

        // إنشاء كائن Task جديد
        Task task = new Task("1_Test Title", "1_Test Description", 19); // استخدم ال ID 19 كـ userId
        boolean expResult = true; // إذا كان تم إضافة المهمة بنجاح
        boolean result = TasksService.addTaskToDatabase(task);
        
        // التحقق من إضافة المهمة بنجاح
        assertEquals("The task should be added successfully.", expResult, result);
    }

    /**
     * Test of getTasksByUserId method, of class TasksService.
     */
    @Test
    public void testGetTasksByUserId() {
        System.out.println("getTasksByUserId");
        
        int userId = 19;  // استخدم الـ userId الذي تم اختياره
        List<Task> result = TasksService.getTasksByUserId(userId);
        
        // التحقق من وجود المهام
        assertNotNull("The list of tasks should not be null.", result);
        assertFalse("The task list should not be empty.", result.isEmpty());
        
        // التحقق من أن المهام التي تم إرجاعها هي للمستخدم 19
        for (Task task : result) {
            assertEquals("The userId of the task should be 19.", 19, task.userId);
        }
    }

    /**
     * Test of updateTaskInDatabase method, of class TasksService.
     */
   

    /**
     * Test of deleteTaskFromDatabase method, of class TasksService.
     */
}
