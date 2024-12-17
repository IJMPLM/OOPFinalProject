package finalproject;
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

public class StudentGrades extends javax.swing.JFrame {
    Connection conn = null; 
    PreparedStatement ps = null;
    ResultSet rs = null; 

    public StudentGrades() {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));

        tblStudentGrades.getColumnModel().getColumn(8).setCellRenderer(new TableActionCellRender());
        tblStudentGrades.getColumnModel().getColumn(8).setPreferredWidth(90);
        tblStudentGrades.getTableHeader().setFont (new Font("Microsoft Jheng Hei UI", Font.PLAIN, 14)); 
        tblStudentGrades.getTableHeader().setOpaque (false);
        tblStudentGrades.getTableHeader().setBackground (new Color (212,228,255));
        tblStudentGrades.getTableHeader().setForeground (new Color (0,0,0));
        tblStudentGrades.setRowHeight(40);
    }

    public void refresh() {
        try {
            conn = ConnectPLMDB.Connect();
            ps = conn.prepareStatement("SELECT * FROM plm.vwgrades ORDER BY DESCRIPTION");
            rs = ps.executeQuery();
            tblStudentGrades.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            System.out.print(e);
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
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "School Year", "Sem", "Student Number", "Sub Code", "Description", "Block No", "Grade", "Remark", "Action"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
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
        if (tblStudentGrades.getColumnModel().getColumnCount() > 0) {
            tblStudentGrades.getColumnModel().getColumn(0).setPreferredWidth(80);
            tblStudentGrades.getColumnModel().getColumn(1).setPreferredWidth(50);
            tblStudentGrades.getColumnModel().getColumn(2).setPreferredWidth(100);
            tblStudentGrades.getColumnModel().getColumn(4).setPreferredWidth(150);
            tblStudentGrades.getColumnModel().getColumn(8).setPreferredWidth(50);
        }

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
                .addGap(35, 35, 35)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(btnAddRec, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cmdPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(214, 214, 214)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 940, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
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
                            .addComponent(cmdPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnAddRec, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1))
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 17, Short.MAX_VALUE))
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(dashboard1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(10, 10, 10))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        refresh();
    }//GEN-LAST:event_tblStudentGradesMouseClicked

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
