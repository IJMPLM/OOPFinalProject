package finalproject.Menu;

import finalproject.Home;
import finalproject.SubjectSchedule;
import finalproject.Components.dbButtons;
import finalproject.StudentGrades;

public class Dashboard extends javax.swing.JPanel {

    public Dashboard() {
        initComponents();
        setOpaque(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundPanel1 = new finalproject.Components.RoundPanel();
        btnLogOut = new finalproject.Components.dbButtons();
        jLabel2 = new javax.swing.JLabel();
        btnStudentGrades = new finalproject.Components.dbButtons();
        btnSubjSched = new finalproject.Components.dbButtons();
        btnDashboard = new finalproject.Components.dbButtons();
        jLabel1 = new javax.swing.JLabel();

        roundPanel1.setBackground(new java.awt.Color(245, 249, 255));

        btnLogOut.setBackground(new java.awt.Color(245, 249, 255));
        btnLogOut.setBorder(null);
        btnLogOut.setForeground(new java.awt.Color(43, 58, 103));
        btnLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/images/log out.png"))); // NOI18N
        btnLogOut.setText("Log Out");
        btnLogOut.setBorderColor(new java.awt.Color(245, 249, 255));
        btnLogOut.setBorderPainted(false);
        btnLogOut.setColor(new java.awt.Color(245, 249, 255));
        btnLogOut.setColorClick(new java.awt.Color(224, 234, 255));
        btnLogOut.setColorOver(new java.awt.Color(224, 234, 255));
        btnLogOut.setFocusPainted(false);
        btnLogOut.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        btnLogOut.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnLogOut.setIconTextGap(5);
        btnLogOut.setRadius(15);
        btnLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogOutMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(43, 58, 103));
        jLabel2.setText("OTHERS");

        btnStudentGrades.setBackground(new java.awt.Color(245, 249, 255));
        btnStudentGrades.setBorder(null);
        btnStudentGrades.setForeground(new java.awt.Color(43, 58, 103));
        btnStudentGrades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/images/grades.png"))); // NOI18N
        btnStudentGrades.setText("Student Grades");
        btnStudentGrades.setBorderColor(new java.awt.Color(245, 249, 255));
        btnStudentGrades.setBorderPainted(false);
        btnStudentGrades.setColor(new java.awt.Color(245, 249, 255));
        btnStudentGrades.setColorClick(new java.awt.Color(224, 234, 255));
        btnStudentGrades.setColorOver(new java.awt.Color(224, 234, 255));
        btnStudentGrades.setFocusPainted(false);
        btnStudentGrades.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        btnStudentGrades.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnStudentGrades.setIconTextGap(5);
        btnStudentGrades.setRadius(15);
        btnStudentGrades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnStudentGradesMouseClicked(evt);
            }
        });

        btnSubjSched.setBackground(new java.awt.Color(245, 249, 255));
        btnSubjSched.setBorder(null);
        btnSubjSched.setForeground(new java.awt.Color(43, 58, 103));
        btnSubjSched.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/images/sched.png"))); // NOI18N
        btnSubjSched.setText("Subject Schedule");
        btnSubjSched.setBorderColor(new java.awt.Color(245, 249, 255));
        btnSubjSched.setBorderPainted(false);
        btnSubjSched.setColor(new java.awt.Color(245, 249, 255));
        btnSubjSched.setColorClick(new java.awt.Color(224, 234, 255));
        btnSubjSched.setColorOver(new java.awt.Color(224, 234, 255));
        btnSubjSched.setFocusPainted(false);
        btnSubjSched.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        btnSubjSched.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnSubjSched.setIconTextGap(5);
        btnSubjSched.setRadius(15);
        btnSubjSched.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSubjSchedMouseClicked(evt);
            }
        });

        btnDashboard.setBackground(new java.awt.Color(245, 249, 255));
        btnDashboard.setBorder(null);
        btnDashboard.setForeground(new java.awt.Color(43, 58, 103));
        btnDashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/images/dashboard.png"))); // NOI18N
        btnDashboard.setText("Dashboard");
        btnDashboard.setBorderColor(new java.awt.Color(245, 249, 255));
        btnDashboard.setBorderPainted(false);
        btnDashboard.setColor(new java.awt.Color(245, 249, 255));
        btnDashboard.setColorClick(new java.awt.Color(224, 234, 255));
        btnDashboard.setColorOver(new java.awt.Color(224, 234, 255));
        btnDashboard.setFocusPainted(false);
        btnDashboard.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        btnDashboard.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnDashboard.setIconTextGap(5);
        btnDashboard.setRadius(15);
        btnDashboard.setRequestFocusEnabled(false);
        btnDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDashboardMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(43, 58, 103));
        jLabel1.setText("MENU");

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnLogOut, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                    .addComponent(btnStudentGrades, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                    .addComponent(btnSubjSched, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(9, Short.MAX_VALUE))
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSubjSched, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnStudentGrades, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(233, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDashboardMouseClicked
    if (dbButtons.selectedButton != btnDashboard) {
        if (dbButtons.selectedButton != null) {
            dbButtons.selectedButton.setSelected(false);
        }
        btnDashboard.setSelected(true);
    }

    Home hp = new Home();
    hp.setVisible(true);

    java.awt.Window window = javax.swing.SwingUtilities.getWindowAncestor(this);
    if (window != null) {
        window.dispose();
        }
    }//GEN-LAST:event_btnDashboardMouseClicked

    private void btnSubjSchedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSubjSchedMouseClicked
    if (dbButtons.selectedButton != btnSubjSched) {
        if (dbButtons.selectedButton != null) {
            dbButtons.selectedButton.setSelected(false);
        }
        btnSubjSched.setSelected(true);
    }

    SubjectSchedule ss = new SubjectSchedule();
    ss.setVisible(true);

    java.awt.Window window = javax.swing.SwingUtilities.getWindowAncestor(this);
    if (window != null) {
        window.dispose();
        }
    }//GEN-LAST:event_btnSubjSchedMouseClicked

    private void btnStudentGradesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStudentGradesMouseClicked
    if (dbButtons.selectedButton != btnStudentGrades) {
        if (dbButtons.selectedButton != null) {
            dbButtons.selectedButton.setSelected(false);
        }
        btnStudentGrades.setSelected(true);
    }

    StudentGrades sg = new StudentGrades();
    sg.setVisible(true);

    java.awt.Window window = javax.swing.SwingUtilities.getWindowAncestor(this);
    if (window != null) {
        window.dispose();
        }
    }//GEN-LAST:event_btnStudentGradesMouseClicked

    private void btnLogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogOutMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnLogOutMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private finalproject.Components.dbButtons btnDashboard;
    private finalproject.Components.dbButtons btnLogOut;
    private finalproject.Components.dbButtons btnStudentGrades;
    private finalproject.Components.dbButtons btnSubjSched;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private finalproject.Components.RoundPanel roundPanel1;
    // End of variables declaration//GEN-END:variables

}