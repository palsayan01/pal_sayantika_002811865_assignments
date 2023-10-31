/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.WorkAreas.EmployerRole.EmployerRoleWorkResp;

import Business.Profiles.EmployerProfile;
import Business.Profiles.StudentProfile;
import Business.Profiles.ThirdPartyApproval;
import Business.Profiles.ThirdPartyProfile;
import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tanvi
 */
public class FresherRecruitmentJPanel extends javax.swing.JPanel {

    /**
     * Creates new form FresherRecruitmentJPanel
     */
    ThirdPartyApproval tpa;
    JSplitPane jsplitPane;
    EmployerProfile ep; 
    public FresherRecruitmentJPanel(JSplitPane jsplitPane,ThirdPartyApproval tpa, EmployerProfile ep) {
        initComponents();
        this.tpa=tpa;
        this.ep=ep;
        this.jsplitPane=jsplitPane;
        populateTable();
    }

    private void populateTable()
    {
        DefaultTableModel tblStudDtl=(DefaultTableModel)tblStudentDtl.getModel();
        tblStudDtl.setRowCount(0);
        for(StudentProfile sp: tpa.getApprovallist())
        {
            Object row[]=new Object[5];
                row[0]=sp;
                row[1]=sp.getPerson().getName();
                row[2]=sp.getTranscript().getDegreeProg();
                row[3]=sp.getIntakeYear();                
                row[4]=sp.getTranscript().getGradStatus();

                tblStudDtl.addRow(row);
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

        btnBack1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblStudentDtl = new javax.swing.JTable();
        btnShowDtl = new javax.swing.JButton();

        btnBack1.setBackground(new java.awt.Color(102, 153, 255));
        btnBack1.setForeground(new java.awt.Color(255, 255, 255));
        btnBack1.setText("Back");
        btnBack1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBack1.setMaximumSize(new java.awt.Dimension(200, 40));
        btnBack1.setMinimumSize(new java.awt.Dimension(20, 20));
        btnBack1.setPreferredSize(new java.awt.Dimension(240, 25));
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Fresher Recruitment");

        tblStudentDtl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student ID", "Student Name", "Term", "Year", "Grad Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblStudentDtl.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tblStudentDtl);

        btnShowDtl.setBackground(new java.awt.Color(102, 153, 255));
        btnShowDtl.setForeground(new java.awt.Color(255, 255, 255));
        btnShowDtl.setText("Show Details");
        btnShowDtl.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnShowDtl.setMaximumSize(new java.awt.Dimension(200, 40));
        btnShowDtl.setMinimumSize(new java.awt.Dimension(20, 20));
        btnShowDtl.setPreferredSize(new java.awt.Dimension(240, 25));
        btnShowDtl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowDtlActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 912, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnShowDtl, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnShowDtl, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(76, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
        // TODO add your handling code here:
        //        splitPane.setRightComponent(previousScreen);
    }//GEN-LAST:event_btnBack1ActionPerformed

    private void btnShowDtlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowDtlActionPerformed
        // TODO add your handling code here:
        int selectedRow=tblStudentDtl.getSelectedRow();
        if (selectedRow<0)
        JOptionPane.showMessageDialog(this, "Select a row to proceed", "Warning", JOptionPane.WARNING_MESSAGE);
        else
        {
            DefaultTableModel studProfile=(DefaultTableModel)tblStudentDtl.getModel();
            StudentProfile studentprofile= (StudentProfile) studProfile.getValueAt(selectedRow, 0);
            HireStudentJPanel hirestudent=new HireStudentJPanel(jsplitPane, studentprofile,tpa, ep);
            jsplitPane.setRightComponent(hirestudent);
        }

    }//GEN-LAST:event_btnShowDtlActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack1;
    private javax.swing.JButton btnShowDtl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblStudentDtl;
    // End of variables declaration//GEN-END:variables
}
