package finalproject.Menu;

import finalproject.Home;
import finalproject.Components.dbButtons;
import finalproject.SubjectSchedule;
import finalproject.StudentGrades;
import finalproject.SchoolYear;
import finalproject.Semester;
import finalproject.College;
import finalproject.Course;
import finalproject.Student;
import finalproject.Employee;

public class Dashboard extends javax.swing.JPanel {

    public Dashboard() {
        initComponents();
        setOpaque(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundPanel1 = new finalproject.Components.RoundPanel();
        jLabel2 = new javax.swing.JLabel();
        btnStudentGrades = new finalproject.Components.dbButtons();
        btnSubjSched = new finalproject.Components.dbButtons();
        btnDashboard = new finalproject.Components.dbButtons();
        jLabel1 = new javax.swing.JLabel();
        btnSchoolYear = new finalproject.Components.dbButtons();
        btnSemester = new finalproject.Components.dbButtons();
        btnCollege = new finalproject.Components.dbButtons();
        btnCourse = new finalproject.Components.dbButtons();
        btnStudent = new finalproject.Components.dbButtons();
        btnEmployee = new finalproject.Components.dbButtons();
        btnSubject = new finalproject.Components.dbButtons();

        roundPanel1.setBackground(new java.awt.Color(245, 249, 255));

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

        btnSchoolYear.setBackground(new java.awt.Color(245, 249, 255));
        btnSchoolYear.setBorder(null);
        btnSchoolYear.setForeground(new java.awt.Color(43, 58, 103));
        btnSchoolYear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/images/log out.png"))); // NOI18N
        btnSchoolYear.setText("School Year");
        btnSchoolYear.setBorderColor(new java.awt.Color(245, 249, 255));
        btnSchoolYear.setBorderPainted(false);
        btnSchoolYear.setColor(new java.awt.Color(245, 249, 255));
        btnSchoolYear.setColorClick(new java.awt.Color(224, 234, 255));
        btnSchoolYear.setColorOver(new java.awt.Color(224, 234, 255));
        btnSchoolYear.setFocusPainted(false);
        btnSchoolYear.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        btnSchoolYear.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnSchoolYear.setIconTextGap(5);
        btnSchoolYear.setRadius(15);
        btnSchoolYear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSchoolYearMouseClicked(evt);
            }
        });
        btnSchoolYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSchoolYearActionPerformed(evt);
            }
        });

        btnSemester.setBackground(new java.awt.Color(245, 249, 255));
        btnSemester.setBorder(null);
        btnSemester.setForeground(new java.awt.Color(43, 58, 103));
        btnSemester.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/images/log out.png"))); // NOI18N
        btnSemester.setText("Semester");
        btnSemester.setBorderColor(new java.awt.Color(245, 249, 255));
        btnSemester.setBorderPainted(false);
        btnSemester.setColor(new java.awt.Color(245, 249, 255));
        btnSemester.setColorClick(new java.awt.Color(224, 234, 255));
        btnSemester.setColorOver(new java.awt.Color(224, 234, 255));
        btnSemester.setFocusPainted(false);
        btnSemester.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        btnSemester.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnSemester.setIconTextGap(5);
        btnSemester.setRadius(15);
        btnSemester.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSemesterMouseClicked(evt);
            }
        });
        btnSemester.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSemesterActionPerformed(evt);
            }
        });

        btnCollege.setBackground(new java.awt.Color(245, 249, 255));
        btnCollege.setBorder(null);
        btnCollege.setForeground(new java.awt.Color(43, 58, 103));
        btnCollege.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/images/log out.png"))); // NOI18N
        btnCollege.setText("College");
        btnCollege.setBorderColor(new java.awt.Color(245, 249, 255));
        btnCollege.setBorderPainted(false);
        btnCollege.setColor(new java.awt.Color(245, 249, 255));
        btnCollege.setColorClick(new java.awt.Color(224, 234, 255));
        btnCollege.setColorOver(new java.awt.Color(224, 234, 255));
        btnCollege.setFocusPainted(false);
        btnCollege.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        btnCollege.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnCollege.setIconTextGap(5);
        btnCollege.setRadius(15);
        btnCollege.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCollegeMouseClicked(evt);
            }
        });
        btnCollege.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCollegeActionPerformed(evt);
            }
        });

        btnCourse.setBackground(new java.awt.Color(245, 249, 255));
        btnCourse.setBorder(null);
        btnCourse.setForeground(new java.awt.Color(43, 58, 103));
        btnCourse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/images/log out.png"))); // NOI18N
        btnCourse.setText("Course");
        btnCourse.setBorderColor(new java.awt.Color(245, 249, 255));
        btnCourse.setBorderPainted(false);
        btnCourse.setColor(new java.awt.Color(245, 249, 255));
        btnCourse.setColorClick(new java.awt.Color(224, 234, 255));
        btnCourse.setColorOver(new java.awt.Color(224, 234, 255));
        btnCourse.setFocusPainted(false);
        btnCourse.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        btnCourse.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnCourse.setIconTextGap(5);
        btnCourse.setRadius(15);
        btnCourse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCourseMouseClicked(evt);
            }
        });
        btnCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCourseActionPerformed(evt);
            }
        });

        btnStudent.setBackground(new java.awt.Color(245, 249, 255));
        btnStudent.setBorder(null);
        btnStudent.setForeground(new java.awt.Color(43, 58, 103));
        btnStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/images/log out.png"))); // NOI18N
        btnStudent.setText("Student");
        btnStudent.setBorderColor(new java.awt.Color(245, 249, 255));
        btnStudent.setBorderPainted(false);
        btnStudent.setColor(new java.awt.Color(245, 249, 255));
        btnStudent.setColorClick(new java.awt.Color(224, 234, 255));
        btnStudent.setColorOver(new java.awt.Color(224, 234, 255));
        btnStudent.setFocusPainted(false);
        btnStudent.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        btnStudent.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnStudent.setIconTextGap(5);
        btnStudent.setRadius(15);
        btnStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnStudentMouseClicked(evt);
            }
        });
        btnStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentActionPerformed(evt);
            }
        });

        btnEmployee.setBackground(new java.awt.Color(245, 249, 255));
        btnEmployee.setBorder(null);
        btnEmployee.setForeground(new java.awt.Color(43, 58, 103));
        btnEmployee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/images/log out.png"))); // NOI18N
        btnEmployee.setText("Employee");
        btnEmployee.setBorderColor(new java.awt.Color(245, 249, 255));
        btnEmployee.setBorderPainted(false);
        btnEmployee.setColor(new java.awt.Color(245, 249, 255));
        btnEmployee.setColorClick(new java.awt.Color(224, 234, 255));
        btnEmployee.setColorOver(new java.awt.Color(224, 234, 255));
        btnEmployee.setFocusPainted(false);
        btnEmployee.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        btnEmployee.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnEmployee.setIconTextGap(5);
        btnEmployee.setRadius(15);
        btnEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEmployeeMouseClicked(evt);
            }
        });
        btnEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmployeeActionPerformed(evt);
            }
        });

        btnSubject.setBackground(new java.awt.Color(245, 249, 255));
        btnSubject.setBorder(null);
        btnSubject.setForeground(new java.awt.Color(43, 58, 103));
        btnSubject.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/images/log out.png"))); // NOI18N
        btnSubject.setText("Subject");
        btnSubject.setBorderColor(new java.awt.Color(245, 249, 255));
        btnSubject.setBorderPainted(false);
        btnSubject.setColor(new java.awt.Color(245, 249, 255));
        btnSubject.setColorClick(new java.awt.Color(224, 234, 255));
        btnSubject.setColorOver(new java.awt.Color(224, 234, 255));
        btnSubject.setFocusPainted(false);
        btnSubject.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        btnSubject.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnSubject.setIconTextGap(5);
        btnSubject.setRadius(15);
        btnSubject.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSubjectMouseClicked(evt);
            }
        });
        btnSubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubjectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnStudentGrades, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                    .addComponent(btnSubjSched, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSchoolYear, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                    .addComponent(btnSemester, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                    .addComponent(btnCollege, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                    .addComponent(btnCourse, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                    .addComponent(btnStudent, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                    .addComponent(btnEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSubject, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(10, Short.MAX_VALUE))
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
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSchoolYear, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSemester, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCollege, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
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

    private void btnSchoolYearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSchoolYearMouseClicked
        // TODO add your handling code here:
        if (dbButtons.selectedButton != btnSubjSched) {
            if (dbButtons.selectedButton != null) {
                dbButtons.selectedButton.setSelected(false);
            }
            btnSchoolYear.setSelected(true);
        }

        SchoolYear ss = new SchoolYear();
        ss.setVisible(true);

        java.awt.Window window = javax.swing.SwingUtilities.getWindowAncestor(this);
        if (window != null) {
            window.dispose();
        }          
    }//GEN-LAST:event_btnSchoolYearMouseClicked

    private void btnSchoolYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSchoolYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSchoolYearActionPerformed

    private void btnSemesterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSemesterMouseClicked
        // TODO add your handling code here:
        if (dbButtons.selectedButton != btnSubjSched) {
            if (dbButtons.selectedButton != null) {
                dbButtons.selectedButton.setSelected(false);
            }
            btnSemester.setSelected(true);
        }

        Semester ss = new Semester();
        ss.setVisible(true);

        java.awt.Window window = javax.swing.SwingUtilities.getWindowAncestor(this);
        if (window != null) {
            window.dispose();
        }         
    }//GEN-LAST:event_btnSemesterMouseClicked

    private void btnSemesterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSemesterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSemesterActionPerformed

    private void btnCollegeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCollegeMouseClicked
        // TODO add your handling code here:
        if (dbButtons.selectedButton != btnSubjSched) {
            if (dbButtons.selectedButton != null) {
                dbButtons.selectedButton.setSelected(false);
            }
            btnCollege.setSelected(true);
        }

        College ss = new College();
        ss.setVisible(true);

        java.awt.Window window = javax.swing.SwingUtilities.getWindowAncestor(this);
        if (window != null) {
            window.dispose();
        }      
    }//GEN-LAST:event_btnCollegeMouseClicked

    private void btnCollegeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCollegeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCollegeActionPerformed

    private void btnCourseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCourseMouseClicked
        // TODO add your handling code here:
        if (dbButtons.selectedButton != btnSubjSched) {
            if (dbButtons.selectedButton != null) {
                dbButtons.selectedButton.setSelected(false);
            }
            btnCourse.setSelected(true);
        }

        Course ss = new Course();
        ss.setVisible(true);

        java.awt.Window window = javax.swing.SwingUtilities.getWindowAncestor(this);
        if (window != null) {
            window.dispose();
        }   
    }//GEN-LAST:event_btnCourseMouseClicked

    private void btnCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCourseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCourseActionPerformed

    private void btnStudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStudentMouseClicked
        // TODO add your handling code here:
        if (dbButtons.selectedButton != btnSubjSched) {
            if (dbButtons.selectedButton != null) {
                dbButtons.selectedButton.setSelected(false);
            }
            btnStudent.setSelected(true);
        }

        Student ss = new Student();
        ss.setVisible(true);

        java.awt.Window window = javax.swing.SwingUtilities.getWindowAncestor(this);
        if (window != null) {
            window.dispose();
        }   
    }//GEN-LAST:event_btnStudentMouseClicked

    private void btnStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnStudentActionPerformed

    private void btnEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEmployeeMouseClicked
        // TODO add your handling code here:
        if (dbButtons.selectedButton != btnSubjSched) {
            if (dbButtons.selectedButton != null) {
                dbButtons.selectedButton.setSelected(false);
            }
            btnEmployee.setSelected(true);
        }

        Employee ss = new Employee();
        ss.setVisible(true);

        java.awt.Window window = javax.swing.SwingUtilities.getWindowAncestor(this);
        if (window != null) {
            window.dispose();
        }  
    }//GEN-LAST:event_btnEmployeeMouseClicked

    private void btnEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmployeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEmployeeActionPerformed

    private void btnSubjectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSubjectMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSubjectMouseClicked

    private void btnSubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubjectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSubjectActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private finalproject.Components.dbButtons btnCollege;
    private finalproject.Components.dbButtons btnCourse;
    private finalproject.Components.dbButtons btnDashboard;
    private finalproject.Components.dbButtons btnEmployee;
    private finalproject.Components.dbButtons btnSchoolYear;
    private finalproject.Components.dbButtons btnSemester;
    private finalproject.Components.dbButtons btnStudent;
    private finalproject.Components.dbButtons btnStudentGrades;
    private finalproject.Components.dbButtons btnSubjSched;
    private finalproject.Components.dbButtons btnSubject;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private finalproject.Components.RoundPanel roundPanel1;
    // End of variables declaration//GEN-END:variables

}