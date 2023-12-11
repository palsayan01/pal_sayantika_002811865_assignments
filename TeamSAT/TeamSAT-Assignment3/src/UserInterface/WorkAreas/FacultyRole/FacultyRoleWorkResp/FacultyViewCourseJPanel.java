/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.WorkAreas.FacultyRole.FacultyRoleWorkResp;

import Business.Course.CourseDirectory;
import Business.Course.CourseLoadDirectory;
import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import javax.swing.table.DefaultTableModel;
import Business.Course.CourseOffer;
import Business.Course.CourseOfferDirectory;
import Business.Profiles.FacultyProfile;
import UserInterface.WorkAreas.FacultyRole.FacultyWorkAreaJPanel;
import java.awt.Component;

/**
 *
 * @author tanvi
 */
public class FacultyViewCourseJPanel extends javax.swing.JPanel {

    Component previousScreen;
    JSplitPane splitPane;
    FacultyProfile facultyProfile;
    CourseDirectory courseDirectory;
    CourseOfferDirectory courseOfferDirectory;
    CourseLoadDirectory courseLoadDirectory;

    /**
     * Creates new form FacultyViewCourse
     */
    public FacultyViewCourseJPanel(Component ps, JSplitPane splitPane, FacultyProfile f, CourseDirectory cd, CourseOfferDirectory cod, CourseLoadDirectory courseLoadDirectory) {
        initComponents();
        this.previousScreen = ps;
        this.splitPane = splitPane;
        this.facultyProfile = f;
        this.courseDirectory = cd;
        this.courseOfferDirectory = cod;
        this.courseLoadDirectory=courseLoadDirectory;

        populateTable();
    }

    private void populateTable() {
        DefaultTableModel searchModel = (DefaultTableModel) tblListCourse.getModel();
        searchModel.setRowCount(0);
        
        for (CourseOffer courseOffer : courseOfferDirectory.getCourseOffersByFacultyId(facultyProfile.getPerson().getPersonId())) {
            Object row[] = new Object[8];
            row[0] = courseOffer.getCrn();
            row[1] = courseOffer.getCourse().getCourseName();
            row[2] = courseOffer.getCourse().getDescription();
            row[3] = courseOffer.getCourse().getCredit();
            row[4] = courseOffer.getTerm();
            row[5] = courseOffer.getYear();
            row[6] = courseOffer.getCourse().getLanguage();
            row[7] = courseOffer.getSchedule();

            searchModel.addRow(row);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tblListCourse = new javax.swing.JTable();
        lblTitleViewCourseTitle = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        tblListCourse.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Course CRN", "Course Name", "Description", "Credits", "Term", "Year", "Language", "Course Schedule"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblListCourse.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tblListCourse);
        if (tblListCourse.getColumnModel().getColumnCount() > 0) {
            tblListCourse.getColumnModel().getColumn(0).setResizable(false);
            tblListCourse.getColumnModel().getColumn(1).setResizable(false);
            tblListCourse.getColumnModel().getColumn(2).setResizable(false);
            tblListCourse.getColumnModel().getColumn(3).setResizable(false);
            tblListCourse.getColumnModel().getColumn(4).setResizable(false);
            tblListCourse.getColumnModel().getColumn(5).setResizable(false);
            tblListCourse.getColumnModel().getColumn(6).setResizable(false);
        }

        lblTitleViewCourseTitle.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblTitleViewCourseTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitleViewCourseTitle.setText("View course offerings");

        btnDelete.setBackground(new java.awt.Color(102, 153, 255));
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDelete.setMaximumSize(new java.awt.Dimension(200, 40));
        btnDelete.setMinimumSize(new java.awt.Dimension(20, 20));
        btnDelete.setPreferredSize(new java.awt.Dimension(240, 25));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(102, 153, 255));
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnUpdate.setMaximumSize(new java.awt.Dimension(200, 40));
        btnUpdate.setMinimumSize(new java.awt.Dimension(20, 20));
        btnUpdate.setPreferredSize(new java.awt.Dimension(240, 25));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(102, 153, 255));
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBack.setMaximumSize(new java.awt.Dimension(200, 40));
        btnBack.setMinimumSize(new java.awt.Dimension(20, 20));
        btnBack.setPreferredSize(new java.awt.Dimension(240, 25));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitleViewCourseTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(996, 996, 996)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1275, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblTitleViewCourseTitle)
                .addGap(20, 20, 20)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblListCourse.getModel();
        int selectedRow = tblListCourse.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
        } else {
            int confirmDialogResult = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this record?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);
            if (confirmDialogResult == JOptionPane.YES_OPTION) {
                int selectedCourseOfferId = (int) model.getValueAt(selectedRow, 0);
                CourseOffer co = courseOfferDirectory.findCourseOffer(selectedCourseOfferId);
                courseOfferDirectory.removeCourseOffer(co.getCrn());
                courseDirectory.removeCourse(co.getCourse().getCourseId());
                populateTable();
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblListCourse.getModel();
        int selectedRow = tblListCourse.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row to update.");
        } else {
            int selectedCourseOfferId = (int) model.getValueAt(selectedRow, 0);
            CourseOffer co = courseOfferDirectory.findCourseOffer(selectedCourseOfferId);
            FacultyUpdateCourseJPanel facultyUpdateCourseJPanel = new FacultyUpdateCourseJPanel(this, splitPane, co, courseDirectory, courseOfferDirectory,facultyProfile, courseLoadDirectory);
            splitPane.setRightComponent(facultyUpdateCourseJPanel);
        }

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        FacultyManageCourseJPanel facultymanagecourse = new FacultyManageCourseJPanel(previousScreen, splitPane, facultyProfile, courseDirectory, courseOfferDirectory,courseLoadDirectory );
        splitPane.setRightComponent(facultymanagecourse);
    }//GEN-LAST:event_btnBackActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_formComponentShown


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblTitleViewCourseTitle;
    private javax.swing.JTable tblListCourse;
    // End of variables declaration//GEN-END:variables
}