package aut.utcluj.isp.ex4;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

public class EmployeeAccountJFrame extends javax.swing.JFrame {

    private Employee employee;
    private EmployeeController controller;
    private String name;
    private String password;
    private Border border1, border2;

    public EmployeeAccountJFrame() {
    }

    public EmployeeAccountJFrame(EmployeeController controller) {
        this.controller = controller;
        this.employee = new Employee();
        initComponents();
        border1 = BorderFactory.createLineBorder(Color.RED, 1);
        border2 = NameField.getBorder();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        CancelButton = new javax.swing.JButton();
        SignInButton = new javax.swing.JButton();
        CNPPasswordField = new javax.swing.JPasswordField();
        NameField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(184, 190, 224));

        CancelButton.setBackground(new java.awt.Color(212, 216, 239));
        CancelButton.setFont(new java.awt.Font("Swis721 LtCn BT", 1, 18)); // NOI18N
        CancelButton.setText("Cancel");
        CancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CancelButtonMouseClicked(evt);
            }
        });

        SignInButton.setBackground(new java.awt.Color(212, 216, 239));
        SignInButton.setFont(new java.awt.Font("Swis721 LtCn BT", 1, 18)); // NOI18N
        SignInButton.setText("Sign in");
        SignInButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignInButtonMouseClicked(evt);
            }
        });

        CNPPasswordField.setText("jPasswordField1");
        CNPPasswordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CNPPasswordFieldKeyReleased(evt);
            }
        });

        NameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                NameFieldKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Swis721 LtCn BT", 1, 18)); // NOI18N
        jLabel2.setText("CNP:");

        jLabel1.setFont(new java.awt.Font("Swis721 LtCn BT", 1, 18)); // NOI18N
        jLabel1.setText("Name:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CNPPasswordField)
                            .addComponent(NameField)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(SignInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(CancelButton)))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CNPPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SignInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(96, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void NameFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NameFieldKeyReleased
        NameField.setBorder(border2);
        name = this.NameField.getText();
    }//GEN-LAST:event_NameFieldKeyReleased

    private void CNPPasswordFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CNPPasswordFieldKeyReleased
        CNPPasswordField.setBorder(border2);
        password = this.CNPPasswordField.getText();

    }//GEN-LAST:event_CNPPasswordFieldKeyReleased

    private void SignInButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignInButtonMouseClicked
        boolean err = false;
        if (name == null) {
            NameField.setBorder(border1);
            err = true;
        }
        if (password == null) {
            this.CNPPasswordField.setBorder(border1);
            err = true;
        }
        if (err == true)
            JOptionPane.showMessageDialog(this, "You didn't complete all of the fields.", " ", JOptionPane.ERROR_MESSAGE);
        else {

            employee = controller.getEmployeeByCnp(password);

            if (employee == null) {
                JOptionPane.showMessageDialog(this, "Some fields may be incorrect", " ", JOptionPane.ERROR_MESSAGE);
            } else if (!name.equals(employee.getFirstName() + " " + employee.getLastName())) {
                JOptionPane.showMessageDialog(this, "Some fields may be incorrect", " ", JOptionPane.ERROR_MESSAGE);
            } else {
                this.setVisible(false);
            }
        }
    }//GEN-LAST:event_SignInButtonMouseClicked

    private void CancelButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelButtonMouseClicked
        this.setVisible(false);
        this.setEnabled(false);
    }//GEN-LAST:event_CancelButtonMouseClicked

    public Employee sendInfo() {
        return employee;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EmployeeAccountJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeAccountJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeAccountJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeAccountJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeAccountJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField CNPPasswordField;
    private javax.swing.JButton CancelButton;
    private javax.swing.JTextField NameField;
    private javax.swing.JButton SignInButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
