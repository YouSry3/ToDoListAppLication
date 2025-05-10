
package Main;

import Controller.UserService;
import View.Homepage;
import View.Login;
import java.awt.Dimension;


public class Master {


    public static void main(String[] args) {

        Homepage home;
         Login startPoint = new Login();
         startPoint.setVisible(true);
    
            startPoint.pack();
            startPoint.setLocationRelativeTo(null);
            startPoint.setVisible(true);
    

    }
    
}
