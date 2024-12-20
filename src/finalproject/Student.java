package finalproject;
import finalproject.Connection.ConnectPLMDB;
import java.sql.*;
import net.proteanit.sql.DbUtils;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import finalproject.Table.TableActionCellRender;
import javax.swing.text.AbstractDocument;
import finalproject.FieldValidation.CharacterCountFilter;
import finalproject.FieldValidation.IntDigitFilter;
import finalproject.FieldValidation.IntDateFilter;
import javax.swing.table.TableColumnModel;

public class Student extends javax.swing.JFrame {
    Connection conn = null; 
    PreparedStatement ps = null;
    ResultSet rs = null; 

    public Student() {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));

        // Set custom renderer for the action column
        tblStudents.getColumnModel().getColumn(0).setCellRenderer(new TableActionCellRender());
        tblStudents.getColumnModel().getColumn(0).setPreferredWidth(90);
        tblStudents.getTableHeader().setFont(new Font("Microsoft Jheng Hei UI", Font.PLAIN, 14)); 
        tblStudents.getTableHeader().setOpaque(false);
        tblStudents.getTableHeader().setBackground(new Color(212, 228, 255));
        tblStudents.getTableHeader().setForeground(new Color(0, 0, 0));
        tblStudents.setRowHeight(40); 
        toggleFilter(true);
    }
   private void toggleFilter(boolean status){
        applyDocumentDigitFilter(txtStudentNo, 10, status); 
        applyDocumentFilter(txtLastName, 32, status); 
        applyDocumentFilter(txtFirstName, 32, status);   
        applyDocumentFilter(txtEmail, 32, status); 
        applyDocumentDigitFilter(txtMobileNo, 11, status); 
        applyDocumentFilter(txtAddress, 32, status);   
        applyDocumentDigitFilter(txtBDYear, 4, status); 
        applyDocumentMonthFilter(txtBDMonth, status);
        applyDocumentDayFilter(txtBDDay, txtBDMonth.getText(), status);   
        applyDocumentDigitFilter(txtDSYear, 4, status); 
        applyDocumentMonthFilter(txtDSMonth, status);
        applyDocumentDayFilter(txtDSDay, txtDSMonth.getText(), status);   
        applyDocumentDigitFilter(txtDGYear, 4, status); 
        applyDocumentMonthFilter(txtDGMonth, status);
        applyDocumentDayFilter(txtDGDay, txtDGMonth.getText(), status);
   }
    
   private void applyDocumentFilter(JTextField textField, int characterCount, boolean apply) {
        if (apply) {
            ((AbstractDocument) textField.getDocument()).setDocumentFilter(new CharacterCountFilter(characterCount));
        } else {
            ((AbstractDocument) textField.getDocument()).setDocumentFilter(null);
        }
    }
   private void applyDocumentDigitFilter(JTextField textField, int digitCount, boolean apply) {
        if (apply) {
            ((AbstractDocument) textField.getDocument()).setDocumentFilter(new IntDigitFilter(digitCount));
        } else {
            ((AbstractDocument) textField.getDocument()).setDocumentFilter(null);
        }
    }
   private void applyDocumentMonthFilter(JTextField textField, boolean apply) {
        if (apply) {
            ((AbstractDocument) textField.getDocument()).setDocumentFilter(new IntDateFilter(null, true));
        } else {
            ((AbstractDocument) textField.getDocument()).setDocumentFilter(null);
        }
    }
   private void applyDocumentDayFilter(JTextField textField, String month, boolean apply) {
        if (apply) {
            ((AbstractDocument) textField.getDocument()).setDocumentFilter(new IntDateFilter(month, false));
        } else {
            ((AbstractDocument) textField.getDocument()).setDocumentFilter(null);
        }
    }
    public void refresh() {
        try {
            conn = ConnectPLMDB.Connect();
            ps = conn.prepareStatement("SELECT student_no, lastname, firstname, email, gender, course_code, cp_num, address, bday, status, date_started, date_graduated FROM student ORDER BY lastname ASC");
            rs = ps.executeQuery();
            DefaultTableModel model = new DefaultTableModel(new Object[]{"Student No", "Name", "Email", "Gender", "Course", "Mobile No", "Address", "Birthdate", "Status", "Date Started", "Date Graduated"}, 0);
            while (rs.next()) {
                String studentNo = rs.getString("student_no");
                String name = rs.getString("lastname") + ", " + rs.getString("firstname");
                String email = rs.getString("email");
                String gender = rs.getString("gender");
                String courseCode = rs.getString("course_code");
                String mobileNo = rs.getString("cp_num");
                String address = rs.getString("address");
                Date birthdate = rs.getDate("bday");
                String status = rs.getString("status");
                Date dateStarted = rs.getDate("date_started");
                Date dateGraduated = rs.getDate("date_graduated");

                model.addRow(new Object[]{studentNo, name, email, gender, courseCode, mobileNo, address, birthdate, status, dateStarted, dateGraduated});
            }
            tblStudents.setModel(model);    
            toggleFilter(true);
            TableColumnModel columnModel = tblStudents.getColumnModel();
            columnModel.getColumn(0).setPreferredWidth(100); // Student No
            columnModel.getColumn(1).setPreferredWidth(200); // Name
            columnModel.getColumn(2).setPreferredWidth(100); // Email
            columnModel.getColumn(3).setPreferredWidth(50);  // Gender
            columnModel.getColumn(4).setPreferredWidth(50); // Course
            columnModel.getColumn(5).setPreferredWidth(50); // Mobile No
            columnModel.getColumn(6).setPreferredWidth(50); // Address
            columnModel.getColumn(7).setPreferredWidth(100); // Birthdate
            columnModel.getColumn(8).setPreferredWidth(50);  // Status
            columnModel.getColumn(9).setPreferredWidth(100); // Date Started
            columnModel.getColumn(10).setPreferredWidth(100); // Date Graduated

            // Populate cmbCourse with distinct course_code values
            ps = conn.prepareStatement("SELECT DISTINCT course_code FROM course ORDER BY course_code ASC");
            rs = ps.executeQuery();
            cmbCourse.removeAllItems();
            while (rs.next()) {
                cmbCourse.addItem(rs.getString("course_code"));
            }
            conn.close();
        } catch (Exception e) {
            System.out.print(e);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header1 = new finalproject.Menu.Header();
        roundPanel1 = new com.raven.swing.RoundPanel();
        header2 = new finalproject.Menu.Header();
        dashboard1 = new finalproject.Menu.Dashboard();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblStudents = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtStudentNo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtBDYear = new javax.swing.JTextField();
        txtBDMonth = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtBDDay = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cmbCourse = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        btnAdd = new finalproject.Components.Button();
        btnDelete = new finalproject.Components.Button();
        btnUpdate = new finalproject.Components.Button();
        jLabel1 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        cmbGender = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        txtMobileNo = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtDSYear = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtDSMonth = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtDSDay = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtDGYear = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtDGMonth = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtDGDay = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cmbStatus = new javax.swing.JComboBox<>();

        javax.swing.GroupLayout header1Layout = new javax.swing.GroupLayout(header1);
        header1.setLayout(header1Layout);
        header1Layout.setHorizontalGroup(
            header1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        header1Layout.setVerticalGroup(
            header1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1600, 675));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        roundPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(43, 58, 103));
        jLabel2.setText("Students");

        tblStudents.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 12)); // NOI18N
        tblStudents.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {"Student No", "Name", "Email", "Gender", "Course", "Mobile No", "Address", "Birthdate", "Status", "Date Started", "Date Graduated"}
        ));
        tblStudents.setFocusable(false);
        tblStudents.setGridColor(new java.awt.Color(204, 204, 204));
        tblStudents.setRowHeight(40);
        tblStudents.setSelectionBackground(new java.awt.Color(224, 234, 255));
        tblStudents.setShowGrid(true);
        tblStudents.setShowVerticalLines(false);
        tblStudents.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblStudentsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblStudents);

        jLabel5.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 12)); // NOI18N
        jLabel5.setText("Student No.");

        txtStudentNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStudentNoActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 12)); // NOI18N
        jLabel7.setText("Last Name");

        txtLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastNameActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 12)); // NOI18N
        jLabel8.setText("Birthday (YYYY-MM-DD)");

        txtBDYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBDYearActionPerformed(evt);
            }
        });

        jLabel3.setText("-");

        jLabel4.setText("-");

        jLabel6.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 12)); // NOI18N
        jLabel6.setText("Course");

        cmbCourse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel11.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 12)); // NOI18N
        jLabel11.setText("First Name");

        btnAdd.setBackground(new java.awt.Color(91, 142, 225));
        btnAdd.setBorder(null);
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Add");
        btnAdd.setBorderColor(new java.awt.Color(91, 142, 225));
        btnAdd.setBorderPainted(false);
        btnAdd.setColor(new java.awt.Color(91, 142, 225));
        btnAdd.setColorClick(new java.awt.Color(73, 114, 180));
        btnAdd.setColorOver(new java.awt.Color(82, 128, 203));
        btnAdd.setFocusPainted(false);
        btnAdd.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        btnAdd.setRadius(20);
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddMouseClicked(evt);
            }
        });
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(91, 142, 225));
        btnDelete.setBorder(null);
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.setBorderColor(new java.awt.Color(91, 142, 225));
        btnDelete.setBorderPainted(false);
        btnDelete.setColor(new java.awt.Color(91, 142, 225));
        btnDelete.setColorClick(new java.awt.Color(73, 114, 180));
        btnDelete.setColorOver(new java.awt.Color(82, 128, 203));
        btnDelete.setFocusPainted(false);
        btnDelete.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        btnDelete.setRadius(20);
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteMouseClicked(evt);
            }
        });
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(91, 142, 225));
        btnUpdate.setBorder(null);
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.setBorderColor(new java.awt.Color(91, 142, 225));
        btnUpdate.setBorderPainted(false);
        btnUpdate.setColor(new java.awt.Color(91, 142, 225));
        btnUpdate.setColorClick(new java.awt.Color(73, 114, 180));
        btnUpdate.setColorOver(new java.awt.Color(82, 128, 203));
        btnUpdate.setFocusPainted(false);
        btnUpdate.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        btnUpdate.setRadius(20);
        btnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpdateMouseClicked(evt);
            }
        });
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jLabel1.setText("E-mail");

        jLabel14.setText("Gender");

        cmbGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F"}));

        jLabel15.setText("Mobile Number");

        jLabel16.setText("Address");

        jLabel9.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 12)); // NOI18N
        jLabel9.setText("Date Started (YYYY-MM-DD)");

        txtDSYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDSYearActionPerformed(evt);
            }
        });

        jLabel12.setText("-");

        jLabel13.setText("-");

        jLabel17.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 12)); // NOI18N
        jLabel17.setText("Date Graduated (YYYY-MM-DD)");

        txtDGYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDGYearActionPerformed(evt);
            }
        });

        jLabel18.setText("-");

        jLabel19.setText("-");

        jLabel10.setText("Status");

        cmbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "I"}));

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(dashboard1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(187, 187, 187))
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 836, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(roundPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69)
                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(roundPanel1Layout.createSequentialGroup()
                                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(roundPanel1Layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(roundPanel1Layout.createSequentialGroup()
                                                .addComponent(txtDGYear, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(3, 3, 3)
                                                .addComponent(jLabel18)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtDGMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel19)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtDGDay, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel8)
                                            .addGroup(roundPanel1Layout.createSequentialGroup()
                                                .addComponent(txtBDYear, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(3, 3, 3)
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtBDMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtBDDay, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel9)
                                            .addGroup(roundPanel1Layout.createSequentialGroup()
                                                .addComponent(txtDSYear, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(3, 3, 3)
                                                .addComponent(jLabel12)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtDSMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel13)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtDSDay, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel17))
                                        .addGap(8, 8, 8)
                                        .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(roundPanel1Layout.createSequentialGroup()
                                                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(roundPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel10)
                                                        .addGap(58, 58, 58))
                                                    .addGroup(roundPanel1Layout.createSequentialGroup()
                                                        .addComponent(cmbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(21, 21, 21)))
                                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(roundPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(69, 69, 69)
                                        .addComponent(jLabel6))
                                    .addGroup(roundPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addGap(99, 99, 99)
                                        .addComponent(jLabel16))
                                    .addGroup(roundPanel1Layout.createSequentialGroup()
                                        .addComponent(txtMobileNo, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(roundPanel1Layout.createSequentialGroup()
                                        .addComponent(txtStudentNo, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cmbCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(roundPanel1Layout.createSequentialGroup()
                                        .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(roundPanel1Layout.createSequentialGroup()
                                        .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1))
                                        .addGap(18, 18, 18)
                                        .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel14)
                                            .addComponent(cmbGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 32, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addComponent(header2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(dashboard1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(10, 10, 10))
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(roundPanel1Layout.createSequentialGroup()
                                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(roundPanel1Layout.createSequentialGroup()
                                        .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(26, 26, 26))
                                    .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtStudentNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cmbCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel11))
                                .addGap(8, 8, 8)
                                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(roundPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(28, 28, 28))
                                    .addGroup(roundPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cmbGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel16))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtMobileNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel1Layout.createSequentialGroup()
                                        .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtBDYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtBDMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)
                                            .addComponent(txtBDDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(roundPanel1Layout.createSequentialGroup()
                                                .addGap(46, 46, 46)
                                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(roundPanel1Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel9)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(txtDSYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtDSMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel12)
                                                    .addComponent(jLabel13)
                                                    .addComponent(txtDSDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(roundPanel1Layout.createSequentialGroup()
                                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(roundPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtDGYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtDGMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel18)
                                            .addComponent(jLabel19)
                                            .addComponent(txtDGDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(roundPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 20, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        refresh();
    }//GEN-LAST:event_formWindowOpened

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseClicked
        // TODO add your handling code here:
        String studentNo = txtStudentNo.getText();
        String lastName = txtLastName.getText();
        String firstName = txtFirstName.getText();
        String email = txtEmail.getText();
        String gender = cmbGender.getSelectedItem().toString();
        String courseCode = cmbCourse.getSelectedItem().toString();
        String mobileNo = txtMobileNo.getText();
        String address = txtAddress.getText();
        String birthdateStr = txtBDYear.getText() + "-" + txtBDMonth.getText() + "-" + txtBDDay.getText();
        String status = cmbStatus.getSelectedItem().toString();
        String dateStartedStr = txtDSYear.getText() + "-" + txtDSMonth.getText() + "-" + txtDSDay.getText();
        String dateGraduatedStr = txtDGYear.getText() + "-" + txtDGMonth.getText() + "-" + txtDGDay.getText();

        if (studentNo.isEmpty() || lastName.isEmpty() || firstName.isEmpty() || email.isEmpty() || gender.isEmpty() || courseCode.isEmpty() || mobileNo.isEmpty() || address.isEmpty() || birthdateStr.isEmpty() || status.isEmpty() || dateStartedStr.isEmpty() || dateGraduatedStr.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill in all fields.");
            return;
        }

        try {
            // Parse the dates
            java.sql.Date birthdate = java.sql.Date.valueOf(birthdateStr);
            java.sql.Date dateStarted = java.sql.Date.valueOf(dateStartedStr);
            java.sql.Date dateGraduated = java.sql.Date.valueOf(dateGraduatedStr);

            conn = ConnectPLMDB.Connect();
            ps = conn.prepareStatement("SELECT COUNT(*) FROM student WHERE student_no = ?");
            ps.setString(1, studentNo);
            rs = ps.executeQuery();
            if (rs.next() && rs.getInt(1) == 0) {
                JOptionPane.showMessageDialog(null, "Student number not found.");
                conn.close();
                return;
            }

            ps = conn.prepareStatement("UPDATE student SET lastname = ?, firstname = ?, email = ?, gender = ?, course_code = ?, cp_num = ?, address = ?, bday = ?, status = ?, date_started = ?, date_graduated = ? WHERE student_no = ?");
            ps.setString(1, lastName);
            ps.setString(2, firstName);
            ps.setString(3, email);
            ps.setString(4, gender);
            ps.setString(5, courseCode);
            ps.setString(6, mobileNo);
            ps.setString(7, address);
            ps.setDate(8, birthdate);
            ps.setString(9, status);
            ps.setDate(10, dateStarted);
            ps.setDate(11, dateGraduated);
            ps.setString(12, studentNo);
            ps.executeUpdate();
            conn.close();
            JOptionPane.showMessageDialog(null, "Record updated successfully!");
            refresh();
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error updating record: " + ex.getMessage());
        } catch (IllegalArgumentException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Invalid date format. Please use YYYY-MM-DD.");
        }
    }//GEN-LAST:event_btnUpdateMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseClicked
        // TODO add your handling code here:
        String studentNo = txtStudentNo.getText();

        if (studentNo.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter the Student Number to delete.");
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this record?", "Delete Confirmation", JOptionPane.YES_NO_OPTION);
        if (confirm != JOptionPane.YES_OPTION) {
            return;
        }

        try {
            conn = ConnectPLMDB.Connect();
            ps = conn.prepareStatement("SELECT COUNT(*) FROM student WHERE student_no = ?");
            ps.setString(1, studentNo);
            rs = ps.executeQuery();
            if (rs.next() && rs.getInt(1) == 0) {
                JOptionPane.showMessageDialog(null, "Student number not found.");
                conn.close();
                return;
            }

            ps = conn.prepareStatement("DELETE FROM student WHERE student_no = ?");
            ps.setString(1, studentNo);
            int rowsDeleted = ps.executeUpdate();
            conn.close();

            if (rowsDeleted > 0) {
                JOptionPane.showMessageDialog(null, "Record deleted successfully!");
                refresh();
            } else {
                JOptionPane.showMessageDialog(null, "Student number not found.");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error deleting record: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnDeleteMouseClicked

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseClicked
        String studentNo = txtStudentNo.getText();
        String lastName = txtLastName.getText();
        String firstName = txtFirstName.getText();
        String email = txtEmail.getText();
        String gender = cmbGender.getSelectedItem().toString();
        String courseCode = cmbCourse.getSelectedItem().toString();
        String mobileNo = txtMobileNo.getText();
        String address = txtAddress.getText();
        String birthdateStr = txtBDYear.getText() + "-" + txtBDMonth.getText() + "-" + txtBDDay.getText();
        String status = cmbStatus.getSelectedItem().toString();
        String dateStartedStr = txtDSYear.getText() + "-" + txtDSMonth.getText() + "-" + txtDSDay.getText();
        String dateGraduatedStr = txtDGYear.getText() + "-" + txtDGMonth.getText() + "-" + txtDGDay.getText();

        if (studentNo.isEmpty() || lastName.isEmpty() || firstName.isEmpty() || email.isEmpty() || gender.isEmpty() || courseCode.isEmpty() || mobileNo.isEmpty() || address.isEmpty() || birthdateStr.isEmpty() || status.isEmpty() || dateStartedStr.isEmpty() || dateGraduatedStr.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill in all fields.");
            return;
        }

        try {
            // Parse the dates
            java.sql.Date birthdate = java.sql.Date.valueOf(birthdateStr);
            java.sql.Date dateStarted = java.sql.Date.valueOf(dateStartedStr);
            java.sql.Date dateGraduated = java.sql.Date.valueOf(dateGraduatedStr);

            conn = ConnectPLMDB.Connect();
            ps = conn.prepareStatement("SELECT COUNT(*) FROM student WHERE student_no = ?");
            ps.setString(1, studentNo);
            rs = ps.executeQuery();
            if (rs.next() && rs.getInt(1) > 0) {
                JOptionPane.showMessageDialog(null, "Student number already exists.");
                conn.close();
                return;
            }

            ps = conn.prepareStatement("INSERT INTO student (student_no, lastname, firstname, email, gender, course_code, cp_num, address, bday, status, date_started, date_graduated) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            ps.setString(1, studentNo);
            ps.setString(2, lastName);
            ps.setString(3, firstName);
            ps.setString(4, email);
            ps.setString(5, gender);
            ps.setString(6, courseCode);
            ps.setString(7, mobileNo);
            ps.setString(8, address);
            ps.setDate(9, birthdate);
            ps.setString(10, status);
            ps.setDate(11, dateStarted);
            ps.setDate(12, dateGraduated);
            ps.executeUpdate();
            conn.close();
            JOptionPane.showMessageDialog(null, "Record added successfully!");
            refresh();
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error adding record: " + ex.getMessage());
        } catch (IllegalArgumentException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Invalid date format. Please use YYYY-MM-DD.");
        }
    }//GEN-LAST:event_btnAddMouseClicked

    private void txtBDYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBDYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBDYearActionPerformed

    private void txtStudentNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStudentNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStudentNoActionPerformed

    private void tblStudentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblStudentsMouseClicked
        int row = tblStudents.getSelectedRow();
        toggleFilter(false);
        if (row >= 0) {
            txtStudentNo.setText(tblStudents.getModel().getValueAt(row, 0).toString());
            String[] name = tblStudents.getModel().getValueAt(row, 1).toString().split(", ");
            txtLastName.setText(name[0]);
            txtFirstName.setText(name[1]);
            txtEmail.setText(tblStudents.getModel().getValueAt(row, 2).toString());
            cmbGender.setSelectedItem(tblStudents.getModel().getValueAt(row, 3).toString());
            cmbCourse.setSelectedItem(tblStudents.getModel().getValueAt(row, 4).toString());
            txtMobileNo.setText(tblStudents.getModel().getValueAt(row, 5).toString());
            txtAddress.setText(tblStudents.getModel().getValueAt(row, 6).toString());
            String[] birthdate = tblStudents.getModel().getValueAt(row, 7).toString().split("-");
            txtBDYear.setText(birthdate[0]);
            txtBDMonth.setText(birthdate[1]);
            txtBDDay.setText(birthdate[2]);
            cmbStatus.setSelectedItem(tblStudents.getModel().getValueAt(row, 8).toString());
            String[] dateStarted = tblStudents.getModel().getValueAt(row, 9).toString().split("-");
            txtDSYear.setText(dateStarted[0]);
            txtDSMonth.setText(dateStarted[1]);
            txtDSDay.setText(dateStarted[2]);
            String[] dateGraduated = tblStudents.getModel().getValueAt(row, 10).toString().split("-");
            txtDGYear.setText(dateGraduated[0]);
            txtDGMonth.setText(dateGraduated[1]);
            txtDGDay.setText(dateGraduated[2]);
        }
        toggleFilter(false);
    }//GEN-LAST:event_tblStudentsMouseClicked

    private void txtDSYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDSYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDSYearActionPerformed

    private void txtDGYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDGYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDGYearActionPerformed

    private void txtLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastNameActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private finalproject.Components.Button btnAdd;
    private finalproject.Components.Button btnDelete;
    private finalproject.Components.Button btnUpdate;
    private javax.swing.JComboBox<String> cmbCourse;
    private javax.swing.JComboBox<String> cmbGender;
    private javax.swing.JComboBox<String> cmbStatus;
    private finalproject.Menu.Dashboard dashboard1;
    private finalproject.Menu.Header header1;
    private finalproject.Menu.Header header2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private com.raven.swing.RoundPanel roundPanel1;
    private javax.swing.JTable tblStudents;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtBDDay;
    private javax.swing.JTextField txtBDMonth;
    private javax.swing.JTextField txtBDYear;
    private javax.swing.JTextField txtDGDay;
    private javax.swing.JTextField txtDGMonth;
    private javax.swing.JTextField txtDGYear;
    private javax.swing.JTextField txtDSDay;
    private javax.swing.JTextField txtDSMonth;
    private javax.swing.JTextField txtDSYear;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtMobileNo;
    private javax.swing.JTextField txtStudentNo;
    // End of variables declaration//GEN-END:variables
}
    

