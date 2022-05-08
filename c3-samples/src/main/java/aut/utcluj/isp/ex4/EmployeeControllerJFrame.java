package aut.utcluj.isp.ex4;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class EmployeeControllerJFrame extends javax.swing.JFrame {

    private String password = "1234";
    private EmployeeController controller;
    private Employee employee;
    private EmployeeAccountJFrame employeeAccount;
    private boolean active;

    public EmployeeControllerJFrame() {
        controller = new EmployeeController();
        controller.getEmployees().add(new Employee("john", "mayer", "12345", 300d));
        active = false;
        initComponents();

        this.ManagerPanel.setVisible(false);
        this.ChoosenEmployeePanel.setVisible(false);
        this.EmployeePanel.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        EmployeePanel = new javax.swing.JPanel();
        MonthlySalaryField1 = new javax.swing.JTextField();
        TotalSalaryField1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        FirstNameField1 = new javax.swing.JTextField();
        LastNameField1 = new javax.swing.JTextField();
        CNPField1 = new javax.swing.JTextField();
        PayTaxButton = new javax.swing.JButton();
        GobackIcon2 = new javax.swing.JLabel();
        ChoosenEmployeePanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        FirstNameField = new javax.swing.JTextField();
        LastNameField = new javax.swing.JTextField();
        CNPField = new javax.swing.JTextField();
        MonthlySalaryField = new javax.swing.JTextField();
        TotalSalaryField = new javax.swing.JTextField();
        UpdateSalaryButton = new javax.swing.JButton();
        AddBonusButton = new javax.swing.JButton();
        AddSalaryButton = new javax.swing.JButton();
        GoBackIcon = new javax.swing.JLabel();
        RemoveEmployeeButton = new javax.swing.JButton();
        ManagerPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        AddEmployeeButton = new javax.swing.JButton();
        GoBackIcon3 = new javax.swing.JLabel();
        ChoosingPhasePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ManagerButton = new javax.swing.JButton();
        EmployeeButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        EmployeePanel.setBackground(new java.awt.Color(184, 190, 224));

        MonthlySalaryField1.setEditable(false);

        TotalSalaryField1.setEditable(false);
        TotalSalaryField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalSalaryField1ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Swis721 LtCn BT", 1, 18)); // NOI18N
        jLabel10.setText("First name:");

        jLabel11.setFont(new java.awt.Font("Swis721 LtCn BT", 1, 18)); // NOI18N
        jLabel11.setText("Last name:");

        jLabel12.setFont(new java.awt.Font("Swis721 LtCn BT", 1, 18)); // NOI18N
        jLabel12.setText("CNP:");

        jLabel13.setFont(new java.awt.Font("Swis721 LtCn BT", 1, 18)); // NOI18N
        jLabel13.setText("Monthly salary:");

        jLabel14.setFont(new java.awt.Font("Swis721 LtCn BT", 1, 18)); // NOI18N
        jLabel14.setText("Total salary:");

        FirstNameField1.setEditable(false);

        LastNameField1.setEditable(false);

        CNPField1.setEditable(false);

        PayTaxButton.setBackground(new java.awt.Color(214, 218, 239));
        PayTaxButton.setFont(new java.awt.Font("Swis721 LtCn BT", 1, 18)); // NOI18N
        PayTaxButton.setText("Pay tax");
        PayTaxButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(75, 64, 228)));
        PayTaxButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PayTaxButtonMouseClicked(evt);
            }
        });

        GobackIcon2.setIcon((new javax.swing.ImageIcon("C:/Users/andre/Desktop/cursuri/ISP/lab11-grupa-JMK/c3-samples/src/main/java/aut/utcluj/isp/ex4/left.png")));
        GobackIcon2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GobackIcon2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout EmployeePanelLayout = new javax.swing.GroupLayout(EmployeePanel);
        EmployeePanel.setLayout(EmployeePanelLayout);
        EmployeePanelLayout.setHorizontalGroup(
            EmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EmployeePanelLayout.createSequentialGroup()
                .addGroup(EmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EmployeePanelLayout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addGroup(EmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(EmployeePanelLayout.createSequentialGroup()
                                .addGroup(EmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14))
                                .addGap(18, 18, 18)
                                .addGroup(EmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(MonthlySalaryField1)
                                    .addComponent(TotalSalaryField1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(EmployeePanelLayout.createSequentialGroup()
                                .addGroup(EmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12))
                                .addGap(43, 43, 43)
                                .addGroup(EmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(LastNameField1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CNPField1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FirstNameField1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(PayTaxButton, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(EmployeePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(GobackIcon2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        EmployeePanelLayout.setVerticalGroup(
            EmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EmployeePanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(GobackIcon2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(EmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(FirstNameField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(EmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(LastNameField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(EmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(CNPField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(EmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(MonthlySalaryField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(EmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(TotalSalaryField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addComponent(PayTaxButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(191, Short.MAX_VALUE))
        );

        ChoosenEmployeePanel.setBackground(new java.awt.Color(184, 190, 224));

        jLabel5.setFont(new java.awt.Font("Swis721 LtCn BT", 1, 18)); // NOI18N
        jLabel5.setText("First name:");

        jLabel6.setFont(new java.awt.Font("Swis721 LtCn BT", 1, 18)); // NOI18N
        jLabel6.setText("Last name:");

        jLabel7.setFont(new java.awt.Font("Swis721 LtCn BT", 1, 18)); // NOI18N
        jLabel7.setText("CNP:");

        jLabel8.setFont(new java.awt.Font("Swis721 LtCn BT", 1, 18)); // NOI18N
        jLabel8.setText("Monthly salary:");

        jLabel9.setFont(new java.awt.Font("Swis721 LtCn BT", 1, 18)); // NOI18N
        jLabel9.setText("Total salary:");

        FirstNameField.setEditable(false);

        LastNameField.setEditable(false);

        CNPField.setEditable(false);

        MonthlySalaryField.setEditable(false);

        TotalSalaryField.setEditable(false);

        UpdateSalaryButton.setBackground(new java.awt.Color(214, 218, 239));
        UpdateSalaryButton.setFont(new java.awt.Font("Swis721 LtCn BT", 1, 18)); // NOI18N
        UpdateSalaryButton.setText("Update salary");
        UpdateSalaryButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(75, 64, 228)));
        UpdateSalaryButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateSalaryButtonMouseClicked(evt);
            }
        });

        AddBonusButton.setBackground(new java.awt.Color(214, 218, 239));
        AddBonusButton.setFont(new java.awt.Font("Swis721 LtCn BT", 1, 18)); // NOI18N
        AddBonusButton.setText("Add bonus");
        AddBonusButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 204)));
        AddBonusButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddBonusButtonMouseClicked(evt);
            }
        });

        AddSalaryButton.setBackground(new java.awt.Color(214, 218, 239));
        AddSalaryButton.setFont(new java.awt.Font("Swis721 LtCn BT", 1, 18)); // NOI18N
        AddSalaryButton.setText("Add salary to total revenue");
        AddSalaryButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 204)));
        AddSalaryButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddSalaryButtonMouseClicked(evt);
            }
        });

        GoBackIcon.setIcon(new javax.swing.ImageIcon("C:/Users/andre/Desktop/cursuri/ISP/lab11-grupa-JMK/c3-samples/src/main/java/aut/utcluj/isp/ex4/left.png"));
        GoBackIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GoBackIconMouseClicked(evt);
            }
        });

        RemoveEmployeeButton.setBackground(new java.awt.Color(214, 218, 239));
        RemoveEmployeeButton.setFont(new java.awt.Font("Swis721 LtCn BT", 1, 18)); // NOI18N
        RemoveEmployeeButton.setText("Remove employee");
        RemoveEmployeeButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 204)));
        RemoveEmployeeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RemoveEmployeeButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ChoosenEmployeePanelLayout = new javax.swing.GroupLayout(ChoosenEmployeePanel);
        ChoosenEmployeePanel.setLayout(ChoosenEmployeePanelLayout);
        ChoosenEmployeePanelLayout.setHorizontalGroup(
            ChoosenEmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChoosenEmployeePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(GoBackIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addGroup(ChoosenEmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(RemoveEmployeeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AddSalaryButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(ChoosenEmployeePanelLayout.createSequentialGroup()
                        .addGroup(ChoosenEmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(ChoosenEmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(MonthlySalaryField)
                            .addComponent(TotalSalaryField, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ChoosenEmployeePanelLayout.createSequentialGroup()
                        .addGroup(ChoosenEmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(43, 43, 43)
                        .addGroup(ChoosenEmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(LastNameField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CNPField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FirstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(UpdateSalaryButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AddBonusButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(130, Short.MAX_VALUE))
        );
        ChoosenEmployeePanelLayout.setVerticalGroup(
            ChoosenEmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChoosenEmployeePanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(ChoosenEmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ChoosenEmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(FirstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(GoBackIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ChoosenEmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(LastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ChoosenEmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(CNPField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ChoosenEmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(MonthlySalaryField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ChoosenEmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(TotalSalaryField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addComponent(UpdateSalaryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(AddBonusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AddSalaryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(RemoveEmployeeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        ManagerPanel.setBackground(new java.awt.Color(184, 190, 224));

        jTable1.setBackground(new java.awt.Color(237, 239, 247));
        jTable1.setModel(controller);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel3.setFont(new java.awt.Font("Swis721 LtCn BT", 1, 20)); // NOI18N
        jLabel3.setText("Select an employee:");

        AddEmployeeButton.setBackground(new java.awt.Color(216, 213, 238));
        AddEmployeeButton.setFont(new java.awt.Font("Swis721 LtCn BT", 1, 18)); // NOI18N
        AddEmployeeButton.setText("Add employee");
        AddEmployeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddEmployeeButtonActionPerformed(evt);
            }
        });

        GoBackIcon3.setIcon((new javax.swing.ImageIcon("C:/Users/andre/Desktop/cursuri/ISP/lab11-grupa-JMK/c3-samples/src/main/java/aut/utcluj/isp/ex4/left.png")));
        GoBackIcon3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GoBackIcon3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ManagerPanelLayout = new javax.swing.GroupLayout(ManagerPanel);
        ManagerPanel.setLayout(ManagerPanelLayout);
        ManagerPanelLayout.setHorizontalGroup(
            ManagerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE)
            .addGroup(ManagerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ManagerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(GoBackIcon3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddEmployeeButton)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ManagerPanelLayout.setVerticalGroup(
            ManagerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManagerPanelLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(GoBackIcon3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(AddEmployeeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        ChoosingPhasePanel.setBackground(new java.awt.Color(184, 190, 224));

        jLabel1.setFont(new java.awt.Font("Swis721 LtCn BT", 1, 24)); // NOI18N
        jLabel1.setText("Please choose your role:");

        ManagerButton.setBackground(new java.awt.Color(229, 230, 253));
        ManagerButton.setFont(new java.awt.Font("Swis721 LtCn BT", 1, 20)); // NOI18N
        ManagerButton.setText("Manager");
        ManagerButton.setActionCommand("ManagerButton");
        ManagerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ManagerButtonMouseClicked(evt);
            }
        });

        EmployeeButton.setBackground(new java.awt.Color(212, 216, 239));
        EmployeeButton.setFont(new java.awt.Font("Swis721 LtCn BT", 1, 20)); // NOI18N
        EmployeeButton.setText("Employee");
        EmployeeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EmployeeButtonMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Swis721 LtCn BT", 1, 24)); // NOI18N
        jLabel2.setText("Welcome!");

        javax.swing.GroupLayout ChoosingPhasePanelLayout = new javax.swing.GroupLayout(ChoosingPhasePanel);
        ChoosingPhasePanel.setLayout(ChoosingPhasePanelLayout);
        ChoosingPhasePanelLayout.setHorizontalGroup(
            ChoosingPhasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ChoosingPhasePanelLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(ManagerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addComponent(EmployeeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
            .addGroup(ChoosingPhasePanelLayout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(ChoosingPhasePanelLayout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ChoosingPhasePanelLayout.setVerticalGroup(
            ChoosingPhasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChoosingPhasePanelLayout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(ChoosingPhasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ManagerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EmployeeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(235, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 537, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(ChoosingPhasePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ManagerPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ChoosenEmployeePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(EmployeePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 536, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ChoosingPhasePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ManagerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ChoosenEmployeePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(EmployeePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ManagerButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManagerButtonMouseClicked
        try {
            String passwordAttempt = JOptionPane.showInputDialog(this, "Please enter the password.", " ", JOptionPane.OK_CANCEL_OPTION);
            if (passwordAttempt.equals(password)) {
                ManagerPanel.setVisible(true);
                ChoosingPhasePanel.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(this, "Incorrect pasword. Please try again.", " ", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NullPointerException ex) {
        }


    }//GEN-LAST:event_ManagerButtonMouseClicked

    private void AddEmployeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddEmployeeButtonActionPerformed
        AddEmployeeJFrame addEmployee = new AddEmployeeJFrame(this.controller);
        addEmployee.setVisible(true);
        addEmployee.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }//GEN-LAST:event_AddEmployeeButtonActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        JTable source = (JTable) evt.getSource();
        int row = source.rowAtPoint(evt.getPoint());
        String cnp = source.getModel().getValueAt(row, 1) + "";

        for (Employee e : controller.getEmployees()) {
            if (e.getCnp().equals(cnp)) {
                employee = e;
                this.ManagerPanel.setVisible(false);
                this.ChoosenEmployeePanel.setVisible(true);
                this.FirstNameField.setText(e.getFirstName());
                this.LastNameField.setText(e.getLastName());
                this.CNPField.setText(e.getCnp());
                this.MonthlySalaryField.setText(e.getSalaryInfo().getMonthlyRevenue() + "");
                this.TotalSalaryField.setText(e.getSalaryInfo().getTotalRevenue() + "");
            }
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void GoBackIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GoBackIconMouseClicked
        this.ChoosenEmployeePanel.setVisible(false);
        this.ManagerPanel.setVisible(true);
    }//GEN-LAST:event_GoBackIconMouseClicked

    private void UpdateSalaryButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateSalaryButtonMouseClicked
        try {
            Double newSalary = Double.parseDouble(JOptionPane.showInputDialog(this, "Please introduce the new salary:"));
            controller.updateEmployeeSalaryByCnp(employee.getCnp(), newSalary);
            this.MonthlySalaryField.setText(employee.getSalaryInfo().getMonthlyRevenue() + "");
        } catch (NullPointerException ex) {
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "You can introduce only numbers in this field.", " ", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_UpdateSalaryButtonMouseClicked

    private void AddBonusButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBonusButtonMouseClicked
        try {
            Double bonus = Double.parseDouble(JOptionPane.showInputDialog(this, "Please introduce the amount of many you want to add as a bonus:"));
            employee.addMoney(bonus);
            this.TotalSalaryField.setText(employee.getSalaryInfo().getTotalRevenue() + "");
        } catch (NullPointerException ex) {
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "You can introduce only numbers in this field.", " ", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_AddBonusButtonMouseClicked

    private void AddSalaryButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddSalaryButtonMouseClicked
        employee.addSalary();
        this.TotalSalaryField.setText(employee.getSalaryInfo().getTotalRevenue() + "");
    }//GEN-LAST:event_AddSalaryButtonMouseClicked

    private void RemoveEmployeeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RemoveEmployeeButtonMouseClicked
        int option = JOptionPane.showConfirmDialog(this, "Are you sure yo want to remove this employee?", " ", JOptionPane.YES_NO_OPTION);
        if (option == 0) {
            controller.getEmployees().remove(employee);
            JOptionPane.showMessageDialog(this, "Employee removed.");
            this.ChoosenEmployeePanel.setVisible(false);
            this.ManagerPanel.setVisible(true);
            try {
                controller.requestData();
            } catch (IOException ex) {
                Logger.getLogger(EmployeeControllerJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_RemoveEmployeeButtonMouseClicked

    private void EmployeeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmployeeButtonMouseClicked
        active = true;
        employeeAccount = new EmployeeAccountJFrame(controller);
        employeeAccount.setVisible(true);
        employeeAccount.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


    }//GEN-LAST:event_EmployeeButtonMouseClicked

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        if (active == true) {
            employee = employeeAccount.sendInfo();
            try {
                if (!employee.getFirstName().isEmpty()) {
                    this.EmployeePanel.setVisible(true);
                    this.ChoosingPhasePanel.setVisible(false);
                    active = false;
                    this.FirstNameField1.setText(employee.getFirstName());
                    this.LastNameField1.setText(employee.getLastName());
                    this.CNPField1.setText(employee.getCnp());
                    this.MonthlySalaryField1.setText(employee.getSalaryInfo().getMonthlyRevenue() + "");
                    this.TotalSalaryField1.setText(employee.getSalaryInfo().getTotalRevenue() + "");
                }
            } catch (Exception ex) {

            }
        }
    }//GEN-LAST:event_formWindowGainedFocus

    private void TotalSalaryField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalSalaryField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotalSalaryField1ActionPerformed

    private void PayTaxButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PayTaxButtonMouseClicked
        String tax = JOptionPane.showInputDialog(this, "Please introduce the amount of money you want to pay:");
        try {
            employee.payTax(Double.parseDouble(tax));
            this.TotalSalaryField1.setText(employee.getSalaryInfo().getTotalRevenue() + "");
        } catch (NegativeAmountException | NegativeBalanceException ex) {
            JOptionPane.showMessageDialog(this, ex.toString(), " ", JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "You can introduce only numbers. ", " ", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {

        }
    }//GEN-LAST:event_PayTaxButtonMouseClicked

    private void GoBackIcon3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GoBackIcon3MouseClicked
        this.ManagerPanel.setVisible(false);
        this.ChoosingPhasePanel.setVisible(true);
    }//GEN-LAST:event_GoBackIcon3MouseClicked

    private void GobackIcon2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GobackIcon2MouseClicked
        this.EmployeePanel.setVisible(false);
        this.ChoosingPhasePanel.setVisible(true);
    }//GEN-LAST:event_GobackIcon2MouseClicked

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
            java.util.logging.Logger.getLogger(EmployeeControllerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeControllerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeControllerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeControllerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeControllerJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBonusButton;
    private javax.swing.JButton AddEmployeeButton;
    private javax.swing.JButton AddSalaryButton;
    private javax.swing.JTextField CNPField;
    private javax.swing.JTextField CNPField1;
    private javax.swing.JPanel ChoosenEmployeePanel;
    private javax.swing.JPanel ChoosingPhasePanel;
    private javax.swing.JButton EmployeeButton;
    private javax.swing.JPanel EmployeePanel;
    private javax.swing.JTextField FirstNameField;
    private javax.swing.JTextField FirstNameField1;
    private javax.swing.JLabel GoBackIcon;
    private javax.swing.JLabel GoBackIcon3;
    private javax.swing.JLabel GobackIcon2;
    private javax.swing.JTextField LastNameField;
    private javax.swing.JTextField LastNameField1;
    private javax.swing.JButton ManagerButton;
    private javax.swing.JPanel ManagerPanel;
    private javax.swing.JTextField MonthlySalaryField;
    private javax.swing.JTextField MonthlySalaryField1;
    private javax.swing.JButton PayTaxButton;
    private javax.swing.JButton RemoveEmployeeButton;
    private javax.swing.JTextField TotalSalaryField;
    private javax.swing.JTextField TotalSalaryField1;
    private javax.swing.JButton UpdateSalaryButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
