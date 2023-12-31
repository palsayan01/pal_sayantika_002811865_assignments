/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.WorkAreas.StudentRole.StudentRoleWorkResp01;

import Business.Business;
import Business.Course.CourseLoad;
import Business.Course.CourseLoadDirectory;
import Business.Course.CourseOffer;
import Business.Course.CourseOfferDirectory;
import Business.Course.Transcript;
import Business.Profiles.StudentProfile;
import Business.Profiles.ThirdPartyApproval;
import UserInterface.WorkAreas.StudentRole.StudentWorkAreaJPanel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author palsa
 */
public class CourseWorkJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CourseWorkJPanel
     */
    StudentProfile studentprofile;
    CourseLoadDirectory courseloaddirectory;
    JSplitPane jSplitPane;
    javax.swing.JPanel CardSequencePanel;
    Business business;
    CourseOfferDirectory courseofferdirectory;
    ThirdPartyApproval tpa;

    int selectedRow;
    public CourseWorkJPanel(Business b, StudentProfile studentprofile, JPanel clp, CourseOfferDirectory courseofferdirectory, JSplitPane jSplitPane, CourseLoadDirectory courseloaddirectory, ThirdPartyApproval tpa) {
        initComponents();
        this.studentprofile=studentprofile;
        this.courseloaddirectory=courseloaddirectory;
        this.courseofferdirectory=courseofferdirectory;        
        business = b;
        this.CardSequencePanel = clp;
        lbRateCourse.setVisible(false);
        lbRateProf.setVisible(false);
        txtRateCourse.setVisible(false);
        txtRateProf.setVisible(false);
        this.jSplitPane=jSplitPane;
        this.tpa=tpa;
        //generateTranscript();
        populateTable();

    }
    
//    private void generateTranscript()
//    {
//        studentprofile.getTranscript().setCourseLoad(courseloaddirectory);
//        
//    }
    
    public void populateTable()
    {
        DefaultTableModel searchModel=(DefaultTableModel)tblCourseWork.getModel();
        searchModel.setRowCount(0);
        for (CourseLoad cl: courseloaddirectory.getCourseloadlist())
            {
                if(cl.getStudentProfile().getStudentId().equals(studentprofile.getStudentId()))
                {
                    Object row[]=new Object[5];
                    row[0]=cl;
                    row[1]=cl.getCourseOffer().getCrn();
                    row[2]=cl.getCourseOffer().getCourse().getCourseName();
                    row[3]=cl.getCourseOffer().getCourse().getCredit();
                    row[4]=cl.getGrade();

                    searchModel.addRow(row);
                }
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCourseWork = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        cmbProgress = new javax.swing.JComboBox<>();
        lbRateCourse = new javax.swing.JLabel();
        txtRateCourse = new javax.swing.JTextField();
        lbRateProf = new javax.swing.JLabel();
        txtRateProf = new javax.swing.JTextField();
        btnUpdateProg = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnDelete1 = new javax.swing.JButton();
        btnSave1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        tblCourseWork.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Progress", "CRN", "Course Name ", "Credits", "Grade"
            }
        ));
        jScrollPane1.setViewportView(tblCourseWork);

        jLabel2.setText("Progress");

        cmbProgress.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Not Started", "In Progress", "Completed" }));

        lbRateCourse.setText("Rate course:");

        txtRateCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRateCourseActionPerformed(evt);
            }
        });

        lbRateProf.setText("Rate Professor:");

        btnUpdateProg.setBackground(new java.awt.Color(102, 153, 255));
        btnUpdateProg.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateProg.setText("Update Progress");
        btnUpdateProg.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnUpdateProg.setMaximumSize(new java.awt.Dimension(200, 40));
        btnUpdateProg.setMinimumSize(new java.awt.Dimension(20, 23));
        btnUpdateProg.setPreferredSize(new java.awt.Dimension(240, 30));
        btnUpdateProg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateProgIdentifyResourceAssetsActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(102, 153, 255));
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBack.setMaximumSize(new java.awt.Dimension(200, 40));
        btnBack.setMinimumSize(new java.awt.Dimension(20, 23));
        btnBack.setPreferredSize(new java.awt.Dimension(240, 30));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackIdentifyResourceAssetsActionPerformed(evt);
            }
        });

        btnDelete1.setBackground(new java.awt.Color(102, 153, 255));
        btnDelete1.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete1.setText("Delete");
        btnDelete1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDelete1.setMaximumSize(new java.awt.Dimension(200, 40));
        btnDelete1.setMinimumSize(new java.awt.Dimension(20, 23));
        btnDelete1.setPreferredSize(new java.awt.Dimension(240, 30));
        btnDelete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete1IdentifyResourceAssetsActionPerformed(evt);
            }
        });

        btnSave1.setBackground(new java.awt.Color(102, 153, 255));
        btnSave1.setForeground(new java.awt.Color(255, 255, 255));
        btnSave1.setText("Save");
        btnSave1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSave1.setMaximumSize(new java.awt.Dimension(200, 40));
        btnSave1.setMinimumSize(new java.awt.Dimension(20, 23));
        btnSave1.setPreferredSize(new java.awt.Dimension(240, 30));
        btnSave1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSave1IdentifyResourceAssetsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cmbProgress, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnUpdateProg, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbRateProf)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(85, 85, 85)
                                        .addComponent(txtRateProf, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(15, 15, 15)
                                    .addComponent(lbRateCourse)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtRateCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 725, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(40, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDelete1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSave1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbProgress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdateProg, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbRateCourse)
                    .addComponent(txtRateCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbRateProf)
                    .addComponent(txtRateProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("My Course Work");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtRateCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRateCourseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRateCourseActionPerformed

    private void btnBackIdentifyResourceAssetsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackIdentifyResourceAssetsActionPerformed

        StudentWorkAreaJPanel studentwork=new StudentWorkAreaJPanel(business, studentprofile, CardSequencePanel, courseofferdirectory, jSplitPane, courseloaddirectory, tpa);
        jSplitPane.setRightComponent(studentwork);
        
    }//GEN-LAST:event_btnBackIdentifyResourceAssetsActionPerformed

    private void btnSave1IdentifyResourceAssetsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSave1IdentifyResourceAssetsActionPerformed
        // TODO add your handling code here: 
        selectedRow=tblCourseWork.getSelectedRow();
        if (selectedRow<0)
        JOptionPane.showMessageDialog(this, "Select a row to proceed", "Warning", JOptionPane.WARNING_MESSAGE);
        DefaultTableModel searchModel=(DefaultTableModel)tblCourseWork.getModel();
        CourseLoad courseload=(CourseLoad) searchModel.getValueAt(selectedRow, 0);
        courseload.getCourseOffer().getFacultyProfile().getRatinglist().add(Float.parseFloat(txtRateProf.getText()));
        courseload.getCourseOffer().getCourse().getRatinglist().add(Float.parseFloat(txtRateCourse.getText()));
        txtRateCourse.setText("");
        txtRateProf.setText("");
        JOptionPane.showMessageDialog(this, "Successfully updated", "Information", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnSave1IdentifyResourceAssetsActionPerformed

    private void btnUpdateProgIdentifyResourceAssetsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateProgIdentifyResourceAssetsActionPerformed
        // TODO add your handling code here:
        selectedRow=tblCourseWork.getSelectedRow();
        if (selectedRow<0)
        JOptionPane.showMessageDialog(this, "Select a row to proceed", "Warning", JOptionPane.WARNING_MESSAGE);
        DefaultTableModel searchModel=(DefaultTableModel)tblCourseWork.getModel();
        CourseLoad courseload=(CourseLoad) searchModel.getValueAt(selectedRow, 0);
        courseload.setProgressStatus(cmbProgress.getSelectedItem().toString());              
        JOptionPane.showMessageDialog(this, "Progress updated", "Information", JOptionPane.INFORMATION_MESSAGE);
        populateTable();
        
        if (cmbProgress.getSelectedItem().toString().equals("Completed"))
        {
            lbRateCourse.setVisible(true);
            lbRateProf.setVisible(true);
            txtRateCourse.setVisible(true);
            txtRateCourse.setEditable(true);
            txtRateProf.setVisible(true);
            txtRateProf.setEditable(true);
        }
    }//GEN-LAST:event_btnUpdateProgIdentifyResourceAssetsActionPerformed

    private void btnDelete1IdentifyResourceAssetsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete1IdentifyResourceAssetsActionPerformed
        // TODO add your handling code here:
        selectedRow=tblCourseWork.getSelectedRow();
        if (selectedRow<0)
        JOptionPane.showMessageDialog(this, "Select a row to proceed", "Warning", JOptionPane.WARNING_MESSAGE);
        DefaultTableModel searchModel=(DefaultTableModel)tblCourseWork.getModel();
        CourseLoad courseload=(CourseLoad) searchModel.getValueAt(selectedRow, 0);
        courseloaddirectory.getCourseloadlist().remove(courseload);
        populateTable();
        JOptionPane.showMessageDialog(this, "Course load deleted successfully", "Information", JOptionPane.INFORMATION_MESSAGE);
        
        
    }//GEN-LAST:event_btnDelete1IdentifyResourceAssetsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete1;
    private javax.swing.JButton btnSave1;
    private javax.swing.JButton btnUpdateProg;
    private javax.swing.JComboBox<String> cmbProgress;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbRateCourse;
    private javax.swing.JLabel lbRateProf;
    private javax.swing.JTable tblCourseWork;
    private javax.swing.JTextField txtRateCourse;
    private javax.swing.JTextField txtRateProf;
    // End of variables declaration//GEN-END:variables
}
