/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.WorkAreas.ThirdPartyRole.ThirdPartyRoleWorkResp;

import Business.Course.CourseLoad;
import Business.Course.Transcript;
import Business.Profiles.StudentProfile;
import Business.Profiles.ThirdPartyApproval;
import Business.Profiles.ThirdPartyProfile;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tanvi
 */
public class ApproveGradJPanel extends javax.swing.JPanel {

    /**
     * Creates new form StudentCourseDetailsJPanel
     */
    JSplitPane jsplitPane;
    StudentProfile sp;
    ThirdPartyApproval tpa;
    ThirdPartyProfile tpp;
    public ApproveGradJPanel(JSplitPane jsplitPane, StudentProfile sp, ThirdPartyApproval tpa, ThirdPartyProfile tpp) {
        initComponents();
        this.sp=sp;
        this.jsplitPane=jsplitPane;
        this.tpa=tpa;
        this.tpp=tpp;
        
        populateTable();
    }
    
    private void populateTable()
            
    {
        DefaultTableModel tblApp=(DefaultTableModel)tblApprove.getModel();
        tblApp.setRowCount(0);
        for(CourseLoad cl: sp.getTranscript().gettranscript())
        {
            Object row[]=new Object[6];
                row[0]=cl.getCourseOffer().getCourse().getCourseId();
                row[1]=cl.getCourseOffer().getCourse().getCourseName();
                row[2]=cl;
                row[3]=cl.getCourseOffer().getTerm();
                row[4]=cl.getCourseOffer().getYear();
                row[5]=cl.getGrade();

                tblApp.addRow(row);
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

        jLabel1 = new javax.swing.JLabel();
        btnApprove = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblApprove = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Approve Grad Status");

        btnApprove.setBackground(new java.awt.Color(102, 153, 255));
        btnApprove.setForeground(new java.awt.Color(255, 255, 255));
        btnApprove.setText("Approve");
        btnApprove.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnApprove.setMaximumSize(new java.awt.Dimension(200, 40));
        btnApprove.setMinimumSize(new java.awt.Dimension(20, 20));
        btnApprove.setPreferredSize(new java.awt.Dimension(240, 25));
        btnApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveActionPerformed(evt);
            }
        });

        tblApprove.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Course ID", "Course Name", "Progress Status", "Term", "Year", "Grade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblApprove.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tblApprove);

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
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(561, 561, 561)
                        .addComponent(btnApprove, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 739, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnApprove, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(118, 118, 118))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveActionPerformed
        // TODO add your handling code here:
        Date date=new Date();
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
        sp.getTranscript().setGradDate(dateFormat.format(date));
        sp.getTranscript().setGradStatus("Graduated");
        
        JOptionPane.showMessageDialog(this, "Successfully approved student's graduation","Information", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_btnApproveActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        StudentDetailsJPanel studdtl=new StudentDetailsJPanel(jsplitPane,tpa, tpp);
        jsplitPane.setRightComponent(studdtl);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApprove;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblApprove;
    // End of variables declaration//GEN-END:variables
}