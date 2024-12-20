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
import java.text.*;
import java.awt.print.*;
import javax.swing.JTable;
import javax.swing.table.TableColumnModel;

public class StudentGrades extends javax.swing.JFrame {
    Connection conn = null; 
    PreparedStatement ps = null;
    ResultSet rs = null; 

    public StudentGrades() {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));

        tblStudentGrades.getColumnModel().getColumn(7).setCellRenderer(new TableActionCellRender());
        tblStudentGrades.getColumnModel().getColumn(7).setPreferredWidth(90);
        tblStudentGrades.getTableHeader().setFont (new Font("Microsoft Jheng Hei UI", Font.PLAIN, 14)); 
        tblStudentGrades.getTableHeader().setOpaque (false);
        tblStudentGrades.getTableHeader().setBackground (new Color (212,228,255));
        tblStudentGrades.getTableHeader().setForeground (new Color (0,0,0));
        tblStudentGrades.setRowHeight(40);
    }

    public void refresh() {
        try {
            conn = ConnectPLMDB.Connect();
            ps = conn.prepareStatement("SELECT * FROM plm.vwgrades ORDER BY syear DESC");
            rs = ps.executeQuery();

            // Create a custom table model
            DefaultTableModel model = new DefaultTableModel(new Object[]{
                "School Year", "Semester", "Student Number", "Subject Code", "Description", "Block No", "Grade", "Remark"
            }, 0);

            // Populate the table model with data from the result set
            while (rs.next()) {
                String syear = rs.getString("syear");
                String semester = rs.getString("semester");
                String studentNo = rs.getString("student_no");
                String subjectCode = rs.getString("subject_code");
                String subjectTitle = rs.getString("description");
                String blockNo = rs.getString("block_no"); 
                String grade = rs.getString("grade");
                String remark = rs.getString("remark");

                model.addRow(new Object[]{syear, semester, studentNo, subjectCode, subjectTitle, blockNo, grade, remark});
            }

            tblStudentGrades.setModel(model);
            TableColumnModel columnModel = tblStudentGrades.getColumnModel();
            columnModel.getColumn(0).setPreferredWidth(30); 
            columnModel.getColumn(1).setPreferredWidth(20); 
            columnModel.getColumn(2).setPreferredWidth(60); 
            columnModel.getColumn(3).setPreferredWidth(50); 
            columnModel.getColumn(4).setPreferredWidth(170); 
            columnModel.getColumn(5).setPreferredWidth(10);
            columnModel.getColumn(6).setPreferredWidth(10);
            columnModel.getColumn(7).setPreferredWidth(60);  
            rs.close();
            ps.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header1 = new finalproject.Menu.Header();
        roundPanel1 = new com.raven.swing.RoundPanel();
        dashboard1 = new finalproject.Menu.Dashboard();
        jLabel1 = new javax.swing.JLabel();
        btnAddRec = new finalproject.Components.Button();
        txtSearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblStudentGrades = new javax.swing.JTable();
        header3 = new finalproject.Menu.Header();
        cmdPrint = new finalproject.Components.Button();

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
        setPreferredSize(new java.awt.Dimension(1660, 675));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        roundPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(43, 58, 103));
        jLabel1.setText("Student Grades");

        btnAddRec.setBackground(new java.awt.Color(91, 142, 225));
        btnAddRec.setBorder(null);
        btnAddRec.setForeground(new java.awt.Color(255, 255, 255));
        btnAddRec.setText("Add New Record");
        btnAddRec.setBorderColor(new java.awt.Color(91, 142, 225));
        btnAddRec.setBorderPainted(false);
        btnAddRec.setColor(new java.awt.Color(91, 142, 225));
        btnAddRec.setColorClick(new java.awt.Color(73, 114, 180));
        btnAddRec.setColorOver(new java.awt.Color(82, 128, 203));
        btnAddRec.setFocusPainted(false);
        btnAddRec.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        btnAddRec.setRadius(20);
        btnAddRec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddRecMouseClicked(evt);
            }
        });

        txtSearch.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 14)); // NOI18N
        txtSearch.setForeground(new java.awt.Color(153, 153, 153));
        txtSearch.setText("Search...");

        tblStudentGrades.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 12)); // NOI18N
        tblStudentGrades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {"School Year", "Semester", "Student Number", "Subject Code", "Description", "Block No", "Grade", "Remark"}
        ));
        tblStudentGrades.setFocusable(false);
        tblStudentGrades.setGridColor(new java.awt.Color(204, 204, 204));
        tblStudentGrades.setRowHeight(40);
        tblStudentGrades.setSelectionBackground(new java.awt.Color(212, 228, 255));
        tblStudentGrades.setShowGrid(true);
        tblStudentGrades.setShowVerticalLines(false);
        tblStudentGrades.getTableHeader().setReorderingAllowed(false);
        tblStudentGrades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblStudentGradesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblStudentGrades);

        cmdPrint.setBackground(new java.awt.Color(255, 255, 255));
        cmdPrint.setText("Print");
        cmdPrint.setBorderColor(new java.awt.Color(204, 204, 204));
        cmdPrint.setBorderPainted(false);
        cmdPrint.setColor(new java.awt.Color(255, 255, 255));
        cmdPrint.setColorClick(new java.awt.Color(227, 227, 227));
        cmdPrint.setColorOver(new java.awt.Color(239, 239, 239));
        cmdPrint.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        cmdPrint.setRadius(15);
        cmdPrint.setRequestFocusEnabled(false);
        cmdPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdPrintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(dashboard1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(btnAddRec, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cmdPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
            .addComponent(header3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addComponent(header3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cmdPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnAddRec, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 7, Short.MAX_VALUE))
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(dashboard1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(10, 10, 10))
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

        roundPanel1.getAccessibleContext().setAccessibleName("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddRecMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddRecMouseClicked
    AddStudentGrade addSG = new AddStudentGrade();
    addSG.setVisible(true);

    java.awt.Window window = javax.swing.SwingUtilities.getWindowAncestor(this);
    if (window != null) {
        window.dispose();
        }
    }//GEN-LAST:event_btnAddRecMouseClicked

    private void cmdPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdPrintActionPerformed
        MessageFormat header = new MessageFormat("Student Grades Report"); 
        MessageFormat footer = new MessageFormat("Page{0, number, integer}"); 
            try { 
                tblStudentGrades.print(JTable.PrintMode.NORMAL, header, footer);
            } catch (java.awt.print.PrinterException e){
            System.err.format("Cannot print %s%n", e.getMessage());
            }
    }//GEN-LAST:event_cmdPrintActionPerformed

    private void tblStudentGradesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblStudentGradesMouseClicked
        int row = tblStudentGrades.getSelectedRow();
        if (row >= 0) {
            // Retrieve values from the selected row
            String syear = tblStudentGrades.getValueAt(row, 0).toString();
            String semester = tblStudentGrades.getValueAt(row, 1).toString();
            String studentNo = tblStudentGrades.getValueAt(row, 2).toString();
            String subjectCode = tblStudentGrades.getValueAt(row, 3).toString();
            String description = tblStudentGrades.getValueAt(row, 4).toString();
            String blockNo = tblStudentGrades.getValueAt(row, 5).toString();
            String grade = tblStudentGrades.getValueAt(row, 6).toString();
            String remark = tblStudentGrades.getValueAt(row, 7).toString();

            // Create an array to hold the values
            Object[] rowData = {syear, semester, studentNo, subjectCode, description, blockNo, grade, remark};

            // Pass the values to the EditStudentGrade class
            EditStudentGrade editGrade = new EditStudentGrade(rowData);
            editGrade.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row to edit.");
        }
    }//GEN-LAST:event_tblStudentGradesMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:                                    
        refresh();
    }//GEN-LAST:event_formWindowOpened

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentGrades().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private finalproject.Components.Button btnAddRec;
    private finalproject.Components.Button cmdPrint;
    private finalproject.Menu.Dashboard dashboard1;
    private finalproject.Menu.Header header1;
    private finalproject.Menu.Header header3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.raven.swing.RoundPanel roundPanel1;
    private javax.swing.JTable tblStudentGrades;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables


}
