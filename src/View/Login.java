
package View;

import Controller.UserService;
import Objects.LoggedInUser;
import Objects.User;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
 import javax.swing.JPanel;



public class Login extends javax.swing.JFrame {

  
    public Login() {
        initComponents();
           int width = 820;
           int height = 530;

            setPreferredSize(new Dimension(width, height));
            setMinimumSize(new Dimension(width, height));
            setMaximumSize(new Dimension(width, height)); 

           
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Right = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Left = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        EmailInput = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        PasswordInput = new javax.swing.JPasswordField();
        ClearInputBTN = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        LoginBTN = new javax.swing.JButton();
        ChangePassBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        Right.setBackground(new java.awt.Color(0, 102, 102));
        Right.setPreferredSize(new java.awt.Dimension(400, 500));

        jLabel6.setFont(new java.awt.Font("Showcard Gothic", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Company Tazkartiy");

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("copyright © company name All rights reserved");

        javax.swing.GroupLayout RightLayout = new javax.swing.GroupLayout(Right);
        Right.setLayout(RightLayout);
        RightLayout.setHorizontalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RightLayout.createSequentialGroup()
                .addGap(0, 76, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(40, 40, 40))
            .addGroup(RightLayout.createSequentialGroup()
                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RightLayout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jLabel5))
                    .addGroup(RightLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        RightLayout.setVerticalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel6)
                .addGap(44, 44, 44)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 266, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(78, 78, 78))
        );

        jPanel1.add(Right);
        Right.setBounds(0, 0, 400, 500);

        Left.setBackground(new java.awt.Color(255, 255, 255));
        Left.setMinimumSize(new java.awt.Dimension(400, 500));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("LOGIN");

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Email");

        EmailInput.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        EmailInput.setForeground(new java.awt.Color(102, 102, 102));

        jLabel3.setBackground(new java.awt.Color(102, 102, 102));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Password");

        ClearInputBTN.setBackground(new java.awt.Color(255, 0, 51));
        ClearInputBTN.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ClearInputBTN.setForeground(new java.awt.Color(255, 255, 255));
        ClearInputBTN.setText("Clear");
        ClearInputBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearInputBTNActionPerformed(evt);
            }
        });

        jLabel4.setText("I don't have an account");

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 51, 51));
        jButton2.setText("Sign Up");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        LoginBTN.setBackground(new java.awt.Color(0, 102, 102));
        LoginBTN.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LoginBTN.setForeground(new java.awt.Color(255, 255, 255));
        LoginBTN.setText("Login");
        LoginBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBTNActionPerformed(evt);
            }
        });

        ChangePassBTN.setBackground(new java.awt.Color(0, 0, 255));
        ChangePassBTN.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ChangePassBTN.setForeground(new java.awt.Color(255, 255, 255));
        ChangePassBTN.setText("Forget Pass");
        ChangePassBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangePassBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LeftLayout = new javax.swing.GroupLayout(Left);
        Left.setLayout(LeftLayout);
        LeftLayout.setHorizontalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(47, 47, 47)
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(ClearInputBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(LeftLayout.createSequentialGroup()
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jLabel1))
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(EmailInput)
                            .addComponent(jLabel3)
                            .addComponent(PasswordInput, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ChangePassBTN)))
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftLayout.createSequentialGroup()
                .addGap(0, 29, Short.MAX_VALUE)
                .addComponent(LoginBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(278, 278, 278))
        );
        LeftLayout.setVerticalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(EmailInput, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PasswordInput, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ChangePassBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LoginBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ClearInputBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jButton2))
                .addGap(35, 35, 35))
        );

        jPanel1.add(Left);
        Left.setBounds(400, 0, 400, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        SignUp SignUpFrame = new SignUp();
        SignUpFrame.setVisible(true);
        SignUpFrame.pack();
        SignUpFrame.setLocationRelativeTo(null); 
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void ClearInputBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearInputBTNActionPerformed

        // TODO add your handling code here:
       

   
      clearAllInput();
     
        
    }//GEN-LAST:event_ClearInputBTNActionPerformed

    private void LoginBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginBTNActionPerformed
       
    // 1. قراءة البيانات من الـ input fields
    String email = EmailInput.getText().trim();
    String password = PasswordInput.getText().trim();

    // 2. التحقق من أن الحقول مش فاضية
    if (email.isEmpty() || password.isEmpty()) {
        JOptionPane.showMessageDialog(this, "❌ Please enter both email and password.", "Missing Data", JOptionPane.WARNING_MESSAGE);
        return;
    }
    User LogUser = new User(email, password);
    

    // 3. التحقق من صحة البيانات من قاعدة البيانات
    if (UserService.Login(LogUser)) {
        JOptionPane.showMessageDialog(this, "✅ Login successful!", "Welcome", JOptionPane.INFORMATION_MESSAGE);

        // 4. فتح الصفحة الرئيسية بعد تسجيل الدخول
        LoggedInUser.id = UserService.getUserIdByEmail(email);
        LoggedInUser.email = email;
        
        
     
        Homepage home = new Homepage(LoggedInUser.id,LoggedInUser.email);  // غير الاسم حسب اسم صفحتك
        home.setVisible(true);
        home.setLocationRelativeTo(null);

        // 5. إغلاق صفحة تسجيل الدخول
        this.dispose();

    } else {
        JOptionPane.showMessageDialog(this, "❌ Invalid email or password.", "Login Failed", JOptionPane.ERROR_MESSAGE);
    }


    }//GEN-LAST:event_LoginBTNActionPerformed

    private void ChangePassBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangePassBTNActionPerformed
        // TODO add your handling code here:
        
  String email = EmailInput.getText().trim();  // تأكد أن هذا هو الحقل الذي يحتوي على البريد الإلكتروني

    // التحقق من وجود البريد الإلكتروني في قاعدة البيانات
    if (UserService.isEmailExist(email)) {
        // إذا كان البريد الإلكتروني موجودًا في قاعدة البيانات، افتح صفحة تغيير كلمة المرور
        ForgetPassword forgetpass = new ForgetPassword(email);
        forgetpass.setVisible(true);  // إظهار صفحة تغيير كلمة المرور
        forgetpass.pack();
        forgetpass.setLocationRelativeTo(null);
    } else {
        // إذا لم يكن البريد الإلكتروني موجودًا، عرض رسالة للمستخدم
        JOptionPane.showMessageDialog(this, "❌ The email is not registered. Please check your email.", "Email Not Found", JOptionPane.WARNING_MESSAGE);
    }
            

    }//GEN-LAST:event_ChangePassBTNActionPerformed

    /**
     * @param args the command line arguments
     */
    private void clearAllInput(){
        EmailInput.setText("");
        PasswordInput.setText("");
        
    }
    public void  WelcomeUSer(String UserName){
               
        showCustomMessage(UserName);
        
    }  
    public static void showCustomMessage(String userName) {
        // نص الرسالة
        String message = "Welcome " + userName;
        String title = "Login Success";

        // إعداد الألوان والتصميم
        JPanel panel = new JPanel();
        panel.setBackground(new Color(0, 153, 255));  // خلفية بلون أزرق جميل

        // إعداد النصوص
        JLabel label = new JLabel(message);
        label.setFont(new Font("Segoe UI", Font.BOLD, 24));  // خط جميل مع حجم كبير
        label.setForeground(Color.WHITE);  // نص باللون الأبيض
        label.setHorizontalAlignment(JLabel.CENTER);  // تموضع النص في المنتصف

        // إضافة التأثيرات على الرسالة (تظليل أو تأثيرات)
        label.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));  // إضافة حدود للنص
        label.setOpaque(true);  // تفعيل التعتيم لزيادة وضوح النص

        // إضافة النص إلى اللوحة
        panel.add(label);

        // إنشاء نافذة مخصصة بدون زر OK
        JDialog dialog = new JDialog();
        dialog.setTitle(title);
        dialog.setSize(400, 200);
        dialog.setLocationRelativeTo(null); // تحديد مكان النافذة في وسط الشاشة
        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE); // عند إغلاق النافذة تخرج بدون مشاكل
        dialog.setModal(true);  // تحديد أن النافذة هي نافذة مميزة وتمنع التفاعل مع النوافذ الأخرى

        // إضافة اللوحة إلى النافذة
        dialog.add(panel);
        dialog.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ChangePassBTN;
    private javax.swing.JButton ClearInputBTN;
    private javax.swing.JTextField EmailInput;
    private javax.swing.JPanel Left;
    private javax.swing.JButton LoginBTN;
    private javax.swing.JPasswordField PasswordInput;
    private javax.swing.JPanel Right;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
