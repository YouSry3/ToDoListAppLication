package Controller;

import Objects.Task;
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
        Task task = new Task("Test Title", "Test Description", 19); // استخدم ال ID 19 كـ userId
        boolean expResult = true; // إذا كان تم إضافة المهمة بنجاح
        boolean result = TasksService.addTaskToDatabase(task);
        
        assertEquals(expResult, result);
    }

    /**
     * Test of getTasksByUserId method, of class TasksService.
     */
    @Test
    public void testGetTasksByUserId() {
        System.out.println("getTasksByUserId");
        
        // فرضًا أن الـ userId = 19
        int userId = 19;
        List<Task> result = TasksService.getTasksByUserId(userId);
        
        // نتحقق من أن النتيجة ليست فارغة وأنها تحتوي على مهمات.
        assertNotNull(result);
        assertFalse(result.isEmpty());
        
        // نختبر المهمة إذا كانت موجودة بشكل صحيح
        assertEquals(19, result.get(0).getUserId());
    }

    /**
     * Test of updateTaskInDatabase method, of class TasksService.
     */
    @Test
    public void testUpdateTaskInDatabase() {
        System.out.println("updateTaskInDatabase");

        // إنشاء كائن Task جديد
        Task task = new Task(1, "Updated Title", "Updated Description", 19); // فرضًا أن الـ ID = 1
        boolean expResult = true;  // إذا كان تم تحديث المهمة بنجاح
        boolean result = TasksService.updateTaskInDatabase(task);
        
        assertEquals(expResult, result);
    }

    /**
     * Test of deleteTaskFromDatabase method, of class TasksService.
     */
    @Test
    public void testDeleteTaskFromDatabase() {
        System.out.println("deleteTaskFromDatabase");
        
        int taskId = 1;  // فرضًا أن الـ taskId = 1
        boolean expResult = true;  // إذا كان تم حذف المهمة بنجاح
        boolean result = TasksService.deleteTaskFromDatabase(taskId);
        
        assertEquals(expResult, result);
    }
}
