package finalproject;
import finalproject.Connection.ConnectPLMDB;
import java.sql.*;
import net.proteanit.sql.DbUtils;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableColumnModel;
import finalproject.Table.TableActionCellRender;
import finalproject.EditSubjectSchedule;

public class SubjectSchedule extends javax.swing.JFrame {
    Connection conn = null; 
    PreparedStatement ps = null;
    ResultSet rs = null; 

    public SubjectSchedule() {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));

        tblSubjectSchedule.getColumnModel().getColumn(12).setCellRenderer(new TableActionCellRender());
        tblSubjectSchedule.getColumnModel().getColumn(12).setPreferredWidth(90);
        tblSubjectSchedule.getTableHeader().setFont (new Font("Microsoft Jheng Hei UI", Font.PLAIN, 14)); 
        tblSubjectSchedule.getTableHeader().setOpaque (false);
        tblSubjectSchedule.getTableHeader().setBackground (new Color (212,228,255));
        tblSubjectSchedule.getTableHeader().setForeground (new Color (0,0,0));
        tblSubjectSchedule.setRowHeight(40);
    }

    public void refresh() {
        try {
            conn = ConnectPLMDB.Connect();
            ps = conn.prepareStatement("SELECT * FROM plm.vwschedule ORDER BY DESCRIPTION");
            rs = ps.executeQuery();

            // Create a custom table model
            DefaultTableModel model = new DefaultTableModel(new Object[]{
                "School Year", "Sem", "College", "Block", "Subject Code", "Subject Title", "Day", "Time", "Room", "Type", "Seq", "Faculty Id", "Faculty Name"
            }, 0);

            // Populate the table model with data from the result set
            while (rs.next()) {
                String syear = rs.getString("syear");
                String semester = rs.getString("semester");
                String collegeCode = rs.getString("college_code");
                String blockNo = rs.getString("block_no");
                String subjectCode = rs.getString("subject_code");
                String subjectTitle = rs.getString("description"); // Assuming 'description' is the subject title
                String day = rs.getString("day");
                String time = rs.getString("time");
                String room = rs.getString("room");
                String type = rs.getString("type");
                int sequenceNo = rs.getInt("sequence_no");
                String employeeId = rs.getString("employee_id");
                String facultyName = rs.getString("employee_name");

                model.addRow(new Object[]{syear, semester, collegeCode, blockNo, subjectCode, subjectTitle, day, time, room, type, sequenceNo, employeeId, facultyName});
            }

            tblSubjectSchedule.setModel(model);

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
        header2 = new finalproject.Menu.Header();
        dashboard1 = new finalproject.Menu.Dashboard();
        jLabel2 = new javax.swing.JLabel();
        btnAddRec = new finalproject.Components.Button();
        txtSearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSubjectSchedule = new javax.swing.JTable();
        btnPrint = new finalproject.Components.Button();

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
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        roundPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(43, 58, 103));
        jLabel2.setText("Subject Schedule");

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
        btnAddRec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddRecActionPerformed(evt);
            }
        });

        txtSearch.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 14)); // NOI18N
        txtSearch.setForeground(new java.awt.Color(153, 153, 153));
        txtSearch.setText("Search...");

        tblSubjectSchedule.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 12)); // NOI18N
        tblSubjectSchedule.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {"School Year", "Sem", "College", "Block", "Subject Code", "Subject Title", "Day", "Time", "Room", "Type", "Seq", "Faculty Id", "Faculty Name"}
        ));
        tblSubjectSchedule.setFocusable(false);
        tblSubjectSchedule.setGridColor(new java.awt.Color(204, 204, 204));
        tblSubjectSchedule.setRowHeight(40);
        tblSubjectSchedule.setSelectionBackground(new java.awt.Color(224, 234, 255));
        tblSubjectSchedule.setShowGrid(true);
        tblSubjectSchedule.setShowVerticalLines(false);
        tblSubjectSchedule.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSubjectScheduleMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSubjectSchedule);

        btnPrint.setBackground(new java.awt.Color(255, 255, 255));
        btnPrint.setText("Print");
        btnPrint.setBorderColor(new java.awt.Color(204, 204, 204));
        btnPrint.setBorderPainted(false);
        btnPrint.setColor(new java.awt.Color(255, 255, 255));
        btnPrint.setColorClick(new java.awt.Color(227, 227, 227));
        btnPrint.setColorOver(new java.awt.Color(239, 239, 239));
        btnPrint.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        btnPrint.setRadius(15);
        btnPrint.setRequestFocusEnabled(false);
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(dashboard1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel2)
                        .addGap(45, 45, 45)
                        .addComponent(btnAddRec, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1094, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addComponent(header2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(roundPanel1Layout.createSequentialGroup()
                                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(roundPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnAddRec, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, roundPanel1Layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(jLabel2)))
                                .addGap(1, 1, 1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 18, Short.MAX_VALUE))
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

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddRecMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddRecMouseClicked
    AddSubjectSchedule addSS = new AddSubjectSchedule();
    addSS.setVisible(true);

    java.awt.Window window = javax.swing.SwingUtilities.getWindowAncestor(this);
    if (window != null) {
        window.dispose();
        }
    }//GEN-LAST:event_btnAddRecMouseClicked

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPrintActionPerformed

    private void btnAddRecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddRecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddRecActionPerformed

    private void tblSubjectScheduleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSubjectScheduleMouseClicked
        int row = tblSubjectSchedule.getSelectedRow();    
        if (row >= 0) {
                // Retrieve values from the selected row
                String syear = tblSubjectSchedule.getValueAt(row, 0).toString();
                String semester = tblSubjectSchedule.getValueAt(row, 1).toString();
                String collegeCode = tblSubjectSchedule.getValueAt(row, 2).toString();
                String blockNo = tblSubjectSchedule.getValueAt(row, 3).toString();
                String subjectCode = tblSubjectSchedule.getValueAt(row, 4).toString();
                String subjectTitle = tblSubjectSchedule.getValueAt(row, 5).toString();
                String day = tblSubjectSchedule.getValueAt(row, 6).toString();
                String time = tblSubjectSchedule.getValueAt(row, 7).toString();
                String room = tblSubjectSchedule.getValueAt(row, 8).toString();
                String type = tblSubjectSchedule.getValueAt(row, 9).toString();
                String sequenceNo = tblSubjectSchedule.getValueAt(row, 10).toString();
                String employeeId = tblSubjectSchedule.getValueAt(row, 11).toString();
                String facultyName = tblSubjectSchedule.getValueAt(row, 12).toString();

                // Create an array to hold the values
                Object[] rowData = {syear, semester, collegeCode, blockNo, subjectCode, subjectTitle, day, time, room, type, sequenceNo, employeeId, facultyName};

                // Pass the values to the EditSubjectSchedule class
                EditSubjectSchedule editSchedule = new EditSubjectSchedule(rowData);
                editSchedule.setVisible(true);
            }
    }//GEN-LAST:event_tblSubjectScheduleMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        refresh();
    }//GEN-LAST:event_formWindowOpened

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SubjectSchedule().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private finalproject.Components.Button btnAddRec;
    private finalproject.Components.Button btnPrint;
    private finalproject.Menu.Dashboard dashboard1;
    private finalproject.Menu.Header header1;
    private finalproject.Menu.Header header2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private com.raven.swing.RoundPanel roundPanel1;
    private javax.swing.JTable tblSubjectSchedule;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
    

