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
import finalproject.FieldValidation.IntValueFilter;
import finalproject.FieldValidation.IntDateFilter;
import finalproject.FieldValidation.IntDigitFilter;
import javax.swing.table.TableColumnModel;

public class Course extends javax.swing.JFrame {
    Connection conn = null; 
    PreparedStatement ps = null;
    ResultSet rs = null; 

    public Course() {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));

        // Set custom renderer for the action column
        tblCourses.getColumnModel().getColumn(0).setCellRenderer(new TableActionCellRender());
        tblCourses.getColumnModel().getColumn(0).setPreferredWidth(90);
        tblCourses.getTableHeader().setFont(new Font("Microsoft Jheng Hei UI", Font.PLAIN, 14)); 
        tblCourses.getTableHeader().setOpaque(false);
        tblCourses.getTableHeader().setBackground(new Color(212, 228, 255));
        tblCourses.getTableHeader().setForeground(new Color(0, 0, 0));
        tblCourses.setRowHeight(40); 
        toggleFilter(true);
    }
   private void toggleFilter(boolean status){
        applyDocumentFilter(txtCourseCode, 10, status); 
        applyDocumentFilter(txtDescription, 200, status); 
        applyDocumentDigitFilter(txtDOYear, 4, status); 
        applyDocumentMonthFilter(txtDOMonth, status);
        applyDocumentDayFilter(txtDODay, txtDOMonth.getText(), status);
        applyDocumentDigitFilter(txtDCYear, 4, status); 
        applyDocumentMonthFilter(txtDCMonth, status);
        applyDocumentDayFilter(txtDCDay, txtDCMonth.getText(), status);
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
            ps = conn.prepareStatement("SELECT course_code, description, college_code, date_opened, date_closed, status FROM course ORDER BY course_code ASC");
            rs = ps.executeQuery();
            DefaultTableModel model = new DefaultTableModel(new Object[]{"Course Code", "Description", "College Code", "Date Opened", "Date Closed", "Status"}, 0);
            while (rs.next()) {
                String courseCode = rs.getString("course_code");
                String description = rs.getString("description");
                String collegeCode = rs.getString("college_code");
                Date dateOpened = rs.getDate("date_opened");
                Date dateClosed = rs.getDate("date_closed");
                String status = rs.getString("status");

                model.addRow(new Object[]{courseCode, description, collegeCode, dateOpened, dateClosed, status});
            }
            tblCourses.setModel(model); 
            toggleFilter(true);
            TableColumnModel columnModel = tblCourses.getColumnModel();
            columnModel.getColumn(0).setPreferredWidth(30); // Course Code
            columnModel.getColumn(1).setPreferredWidth(400); // Description
            columnModel.getColumn(2).setPreferredWidth(30); // College Code
            columnModel.getColumn(3).setPreferredWidth(30); // Date Opened
            columnModel.getColumn(4).setPreferredWidth(30); // Date Closed
            columnModel.getColumn(5).setPreferredWidth(25); // Status

            // Populate cmbCollege with distinct college_code values
            ps = conn.prepareStatement("SELECT DISTINCT college_code FROM course ORDER BY college_code ASC");
            rs = ps.executeQuery();
            cmbCollege.removeAllItems();
            while (rs.next()) {
                cmbCollege.addItem(rs.getString("college_code"));
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
        tblCourses = new javax.swing.JTable();
        btnAdd = new finalproject.Components.Button();
        jLabel5 = new javax.swing.JLabel();
        txtCourseCode = new javax.swing.JTextField();
        btnDelete = new finalproject.Components.Button();
        jLabel7 = new javax.swing.JLabel();
        txtDescription = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtDOYear = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnUpdate = new finalproject.Components.Button();
        txtDOMonth = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDODay = new javax.swing.JTextField();
        txtDCYear = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtDCMonth = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtDCDay = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cmbCollege = new javax.swing.JComboBox<>();
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
        jLabel2.setText("Courses");

        tblCourses.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 12)); // NOI18N
        tblCourses.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {"Course Code", "Description", "College Code", "Date Opened", "Date Closed", "Status"}
        ));
        tblCourses.setFocusable(false);
        tblCourses.setGridColor(new java.awt.Color(204, 204, 204));
        tblCourses.setRowHeight(40);
        tblCourses.setSelectionBackground(new java.awt.Color(224, 234, 255));
        tblCourses.setShowGrid(true);
        tblCourses.setShowVerticalLines(false);
        tblCourses.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCoursesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCourses);

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

        jLabel5.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 12)); // NOI18N
        jLabel5.setText("Course Code");

        txtCourseCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCourseCodeActionPerformed(evt);
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

        jLabel7.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 12)); // NOI18N
        jLabel7.setText("Description");

        jLabel8.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 12)); // NOI18N
        jLabel8.setText("Date Opened (YYYY-MM-DD)");

        txtDOYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDOYearActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 12)); // NOI18N
        jLabel9.setText("Date Closed (YYYY-MM-DD)");

        jLabel10.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 12)); // NOI18N
        jLabel10.setText("Status");

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

        jLabel3.setText("-");

        jLabel4.setText("-");

        jLabel12.setText("-");

        jLabel13.setText("-");

        jLabel6.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 12)); // NOI18N
        jLabel6.setText("College");

        cmbCollege.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

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
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 847, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, roundPanel1Layout.createSequentialGroup()
                                    .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtDescription, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(1, 1, 1)))
                            .addGroup(roundPanel1Layout.createSequentialGroup()
                                .addComponent(txtDOYear, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDOMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDODay, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(roundPanel1Layout.createSequentialGroup()
                                .addComponent(txtDCYear, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDCMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDCDay, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(roundPanel1Layout.createSequentialGroup()
                                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCourseCode, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(cmbCollege, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(cmbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addComponent(header2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(dashboard1, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE)
                        .addGap(10, 10, 10))
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(roundPanel1Layout.createSequentialGroup()
                                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCourseCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbCollege, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtDOYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDOMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(txtDODay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtDCYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDCMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13)
                                    .addComponent(txtDCDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(roundPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
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

    private void btnAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseClicked
        String courseCode = txtCourseCode.getText();
        String description = txtDescription.getText();
        String collegeCode = cmbCollege.getSelectedItem().toString();
        String dateOpenedStr = txtDOYear.getText() + "-" + txtDOMonth.getText() + "-" + txtDODay.getText();
        String dateClosedStr = txtDCYear.getText() + "-" + txtDCMonth.getText() + "-" + txtDCDay.getText();
        String status = cmbStatus.getSelectedItem().toString();

        if (courseCode.isEmpty() || description.isEmpty() || collegeCode.isEmpty() || dateOpenedStr.isEmpty() || dateClosedStr.isEmpty() || status.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill in all fields.");
            return;
        }

        try {
            // Parse the dates
            java.sql.Date dateOpened = java.sql.Date.valueOf(dateOpenedStr);
            java.sql.Date dateClosed = java.sql.Date.valueOf(dateClosedStr);

            conn = ConnectPLMDB.Connect();
            ps = conn.prepareStatement("SELECT COUNT(*) FROM course WHERE course_code = ?");
            ps.setString(1, courseCode);
            rs = ps.executeQuery();
            if (rs.next() && rs.getInt(1) > 0) {
                JOptionPane.showMessageDialog(null, "Course code already exists.");
                conn.close();
                return;
            }

            ps = conn.prepareStatement("INSERT INTO course (course_code, description, college_code, date_opened, date_closed, status) VALUES (?, ?, ?, ?, ?, ?)");
            ps.setString(1, courseCode);
            ps.setString(2, description);
            ps.setString(3, collegeCode);
            ps.setDate(4, dateOpened);
            ps.setDate(5, dateClosed);
            ps.setString(6, status);
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

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddActionPerformed

    private void tblCoursesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCoursesMouseClicked
        int row = tblCourses.getSelectedRow();
        toggleFilter(false);
        if (row >= 0) {
            txtCourseCode.setText(tblCourses.getModel().getValueAt(row, 0).toString());
            txtDescription.setText(tblCourses.getModel().getValueAt(row, 1).toString());
            cmbCollege.setSelectedItem(tblCourses.getModel().getValueAt(row, 2).toString());
            txtDOYear.setText(tblCourses.getModel().getValueAt(row, 3).toString().substring(0, 4));
            txtDOMonth.setText(tblCourses.getModel().getValueAt(row, 3).toString().substring(5, 7));
            txtDODay.setText(tblCourses.getModel().getValueAt(row, 3).toString().substring(8, 10));
            txtDCYear.setText(tblCourses.getModel().getValueAt(row, 4).toString().substring(0, 4));
            txtDCMonth.setText(tblCourses.getModel().getValueAt(row, 4).toString().substring(5, 7));
            txtDCDay.setText(tblCourses.getModel().getValueAt(row, 4).toString().substring(8, 10));
            cmbStatus.setSelectedItem(tblCourses.getModel().getValueAt(row, 5).toString());
        }
        toggleFilter(false);
    }//GEN-LAST:event_tblCoursesMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        refresh();
    }//GEN-LAST:event_formWindowOpened

    private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseClicked
        // TODO add your handling code here:
        String courseCode = txtCourseCode.getText();

        if (courseCode.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter the Course Code to delete.");
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this record?", "Delete Confirmation", JOptionPane.YES_NO_OPTION);
        if (confirm != JOptionPane.YES_OPTION) {
            return;
        }

        try {
            conn = ConnectPLMDB.Connect();
            ps = conn.prepareStatement("SELECT COUNT(*) FROM course WHERE course_code = ?");
            ps.setString(1, courseCode);
            rs = ps.executeQuery();
            if (rs.next() && rs.getInt(1) == 0) {
                JOptionPane.showMessageDialog(null, "Course code not found.");
                conn.close();
                return;
            }

            ps = conn.prepareStatement("DELETE FROM course WHERE course_code = ?");
            ps.setString(1, courseCode);
            int rowsDeleted = ps.executeUpdate();
            conn.close();

            if (rowsDeleted > 0) {
                JOptionPane.showMessageDialog(null, "Record deleted successfully!");
                refresh();
            } else {
                JOptionPane.showMessageDialog(null, "Course code not found.");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error deleting record: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnDeleteMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseClicked
        // TODO add your handling code here:
        String courseCode = txtCourseCode.getText();
        String description = txtDescription.getText();
        String collegeCode = cmbCollege.getSelectedItem().toString();
        String dateOpenedStr = txtDOYear.getText() + "-" + txtDOMonth.getText() + "-" + txtDODay.getText();
        String dateClosedStr = txtDCYear.getText() + "-" + txtDCMonth.getText() + "-" + txtDCDay.getText();
        String status = cmbStatus.getSelectedItem().toString();

        if (courseCode.isEmpty() || description.isEmpty() || collegeCode.isEmpty() || dateOpenedStr.isEmpty() || dateClosedStr.isEmpty() || status.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill in all fields.");
            return;
        }

        try {
            // Parse the dates
            java.sql.Date dateOpened = java.sql.Date.valueOf(dateOpenedStr);
            java.sql.Date dateClosed = java.sql.Date.valueOf(dateClosedStr);

            conn = ConnectPLMDB.Connect();
            ps = conn.prepareStatement("SELECT COUNT(*) FROM course WHERE course_code = ?");
            ps.setString(1, courseCode);
            rs = ps.executeQuery();
            if (rs.next() && rs.getInt(1) == 0) {
                JOptionPane.showMessageDialog(null, "Course code not found.");
                conn.close();
                return;
            }

            ps = conn.prepareStatement("UPDATE course SET description = ?, college_code = ?, date_opened = ?, date_closed = ?, status = ? WHERE course_code = ?");
            ps.setString(1, description);
            ps.setString(2, collegeCode);
            ps.setDate(3, dateOpened);
            ps.setDate(4, dateClosed);
            ps.setString(5, status);
            ps.setString(6, courseCode);
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

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtCourseCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCourseCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCourseCodeActionPerformed

    private void txtDOYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDOYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDOYearActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Course().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private finalproject.Components.Button btnAdd;
    private finalproject.Components.Button btnDelete;
    private finalproject.Components.Button btnUpdate;
    private javax.swing.JComboBox<String> cmbCollege;
    private javax.swing.JComboBox<String> cmbStatus;
    private finalproject.Menu.Dashboard dashboard1;
    private finalproject.Menu.Header header1;
    private finalproject.Menu.Header header2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JTable tblCourses;
    private javax.swing.JTextField txtCourseCode;
    private javax.swing.JTextField txtDCDay;
    private javax.swing.JTextField txtDCMonth;
    private javax.swing.JTextField txtDCYear;
    private javax.swing.JTextField txtDODay;
    private javax.swing.JTextField txtDOMonth;
    private javax.swing.JTextField txtDOYear;
    private javax.swing.JTextField txtDescription;
    // End of variables declaration//GEN-END:variables
}
    

