/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Controller;

import Main.User;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lenovo
 */
public class UserServiceTest {
    
    public UserServiceTest() {
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
     * Test of getUserIdByEmail method, of class UserService.
     */
@Test
public void testGetUserIdByEmail() {
    System.out.println("getUserIdByEmail");
    String email = "test@example.com";
    int expResult = 19;  // الـ id المتوقع للمستخدم
    int result = UserService.getUserIdByEmail(email);
    assertEquals("User ID should be 19", expResult, result);
}


//   Save in Database value if action in the Future Error with anther Functions Testing 
//@Test
//public void testRegisterUser() {
//    System.out.println("registerUser");
//    User newUser = new User(
//            "NameTest",
//            "test@example.com", 
//            "password123",
//            "Mohamed",
//            "21",
//            "Male",
//            "01117304982");  
//    UserService.registerUser(newUser);  
//}

@Test
public void testUpdatePassword() {
    System.out.println("updatePassword");
    String email = "test@example.com";  
    String newPassword = "2_newPassword123";
    boolean expResult = true;  
    boolean result = UserService.updatePassword(email, newPassword);
    assertEquals(expResult, result);  
}

@Test
public void testIsEmailExist() {
    System.out.println("isEmailExist");
    String email = "test@example.com";  
    boolean expResult = true;  
    boolean result = UserService.isEmailExist(email);
    assertEquals(expResult, result);
}



@Test
public void testFullNameAfterLogin() {
    System.out.println("FullNameAfterLogin");
    String fullname = "Test User";  
    UserService.FullNameAfterLogin(fullname);
   }

    
}
