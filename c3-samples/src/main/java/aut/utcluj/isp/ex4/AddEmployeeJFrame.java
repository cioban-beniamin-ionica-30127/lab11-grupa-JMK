package aut.utcluj.isp.ex4;

import java.awt.Color;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

public class AddEmployeeJFrame extends javax.swing.JFrame {

    private Employee employee;
    private Border border1;
    private Border border2;
    private EmployeeController controller;
    private String monthlySalary;

    public AddEmployeeJFrame() {
    }

    public AddEmployeeJFrame(EmployeeController controller) {
        initComponents();
        this.controller = controller;
        employee = new Employee();
        border1 = BorderFactory.createLineBorder(Color.RED, 1);
        border2 = FirstNameField.getBorder();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        FirstNameField = new javax.swing.JTextField();
        LastNameField = new javax.swing.JTextField();
        CNPField = new javax.swing.JTextField();
        MonthlySalaryField = new javax.swing.JTextField();
        AddEmployeeButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(184, 190, 224));

        jPanel1.setBackground(new java.awt.Color(184, 190, 224));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Monthly salary:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("CNP:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Last name:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("First name:");

        FirstNameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FirstNameFieldKeyReleased(evt);
            }
        });

        LastNameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                LastNameFieldKeyReleased(evt);
            }
        });

        CNPField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CNPFieldKeyReleased(evt);
            }
        });

        MonthlySalaryField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                MonthlySalaryFieldKeyReleased(evt);
            }
        });

        AddEmployeeButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AddEmployeeButton.setText("Add employee");
        AddEmployeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddEmployeeButtonActionPerformed(evt);
            }
        });

        CancelButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CancelButton.setText("Cancel");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 5, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(FirstNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                .addGap(73, 73, 73))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(LastNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                                .addGap(71, 71, 71))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(CNPField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(CancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(MonthlySalaryField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(AddEmployeeButton)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(FirstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(LastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(CNPField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MonthlySalaryField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddEmployeeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
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

    private void AddEmployeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddEmployeeButtonActionPerformed

        boolean err = false;
        if (employee.getFirstName() == null) {
            this.FirstNameField.setBorder(border1);
            err = true;
        }
        if (employee.getLastName() == null) {
            this.LastNameField.setBorder(border1);
            err = true;
        }
        if (employee.getCnp() == null) {
            this.CNPField.setBorder(border1);
            err = true;
        }
        if (monthlySalary == null) {
            this.MonthlySalaryField.setBorder(border1);
            err = true;
        }
        if (err == true) {
            JOptionPane.showMessageDialog(this, "You didn't complete all of the fields.", " ", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                employee.setEmployeeSalaryInfo(new SalaryInfo(Double.valueOf(this.MonthlySalaryField.getText())));
                boolean add = controller.addEmployee(employee);
                if (add == true) {
                    this.setVisible(false);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "This employee already exists.", " ", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NegativeAmountException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), " ", JOptionPane.ERROR_MESSAGE);
                this.MonthlySalaryField.setBorder(border1);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "You can only introduce numbers in 'Monthly salary' field.", " ", JOptionPane.ERROR_MESSAGE);
                this.MonthlySalaryField.setBorder(border1);
            }

        }
        try {
            controller.requestData();
        } catch (IOException ex) {
            Logger.getLogger(EmployeeControllerJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_AddEmployeeButtonActionPerformed

    private void FirstNameFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FirstNameFieldKeyReleased
        FirstNameField.setBorder(border2);
        employee.setFirstName(this.FirstNameField.getText());
    }//GEN-LAST:event_FirstNameFieldKeyReleased

    private void LastNameFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LastNameFieldKeyReleased
        LastNameField.setBorder(border2);
        employee.setLastName(this.LastNameField.getText());
    }//GEN-LAST:event_LastNameFieldKeyReleased

    private void CNPFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CNPFieldKeyReleased
        CNPField.setBorder(border2);
        employee.setCnp(this.CNPField.getText());
    }//GEN-LAST:event_CNPFieldKeyReleased

    private void MonthlySalaryFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MonthlySalaryFieldKeyReleased

        MonthlySalaryField.setBorder(border2);
        monthlySalary = this.MonthlySalaryField.getText();


    }//GEN-LAST:event_MonthlySalaryFieldKeyReleased

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        setVisible(false);
        dispose();
    }//GEN-LAST:event_CancelButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AddEmployeeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddEmployeeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddEmployeeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddEmployeeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddEmployeeJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddEmployeeButton;
    private javax.swing.JTextField CNPField;
    private javax.swing.JButton CancelButton;
    private javax.swing.JTextField FirstNameField;
    private javax.swing.JTextField LastNameField;
    private javax.swing.JTextField MonthlySalaryField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
