/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.WorkAreas.StudentRole.StudentRoleWorkResp01;

import Business.Profiles.StudentProfile;

/**
 *
 * @author palsa
 */
public class MyProfileJPanel extends javax.swing.JPanel {

    /**
     * Creates new form MyProfileJPanel
     */
    StudentProfile studentprofile;
    public MyProfileJPanel(StudentProfile studentprofile) {
        initComponents();
        this.studentprofile=studentprofile;
        displayPanel();
    }
    
    public void displayPanel()
    {
        txtID.setEditable(false);
        txtIntakeYr.setEditable(false);
        txtAddr.setEditable(false);
        txtAge.setEditable(false);
        txtCountry.setEditable(false);
        txtDevice.setEditable(false);
        txtEmail.setEditable(false);
        txtGender.setEditable(false);
        txtLang.setEditable(false);
        txtName.setEditable(false);
        
        txtDevice.setText(studentprofile.getPerson().getDevice());
        txtName.setText(studentprofile.getPerson().getName());
        txtID.setText(String.valueOf(studentprofile.getStudentId()));
        txtEmail.setText(studentprofile.getPerson().getEmailId());
        txtAge.setText(String.valueOf(studentprofile.getPerson().getAge()));
        txtCountry.setText(studentprofile.getPerson().getCountry());
        txtGender.setText(studentprofile.getPerson().getGender());
        txtIntakeYr.setText(String.valueOf(studentprofile.getIntakeYear()));
        txtLang.setText(studentprofile.getPerson().getLanguage());
        txtAddr.setText(studentprofile.getPerson().getAddress());
        btnSave.setEnabled(false);
        
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
        lbID = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        lbEmail = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lbAge = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lbGender = new javax.swing.JLabel();
        txtGender = new javax.swing.JTextField();
        lbLang = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        lbIntakeYr = new javax.swing.JLabel();
        txtLang = new javax.swing.JTextField();
        lbAddr = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtDevice = new javax.swing.JTextField();
        txtIntakeYr = new javax.swing.JTextField();
        lbCountry = new javax.swing.JLabel();
        txtCountry = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAddr = new javax.swing.JTextArea();
        btnBack = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Hi");

        lbID.setText("ID#:");

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        lbEmail.setText("Email ID:");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        lbAge.setText("Age:");

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        lbGender.setText("Gender:");

        lbLang.setText("Language:");

        lbIntakeYr.setText("Intake Year:");

        txtLang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLangActionPerformed(evt);
            }
        });

        lbAddr.setText("Address:");

        jLabel9.setText("Connected with:");

        txtIntakeYr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIntakeYrActionPerformed(evt);
            }
        });

        lbCountry.setText("Country:");

        txtAddr.setColumns(20);
        txtAddr.setRows(5);
        jScrollPane1.setViewportView(txtAddr);

        btnBack.setText("Back");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDevice, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(lbCountry)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBack)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnUpdate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSave))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbAge)
                                    .addComponent(lbID)
                                    .addComponent(lbLang)
                                    .addComponent(lbAddr))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtLang, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(txtAge)
                                                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lbEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(lbGender, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(lbIntakeYr, javax.swing.GroupLayout.Alignment.TRAILING))))
                                        .addGap(14, 14, 14)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtGender, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                                            .addComponent(txtIntakeYr)
                                            .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addComponent(jScrollPane1))))
                        .addGap(21, 21, 21))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtDevice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbID)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbAge)
                    .addComponent(lbGender)
                    .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbLang)
                    .addComponent(lbIntakeYr)
                    .addComponent(txtLang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIntakeYr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbAddr)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCountry)
                    .addComponent(txtCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnSave)
                    .addComponent(btnUpdate))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtLangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLangActionPerformed

    private void txtIntakeYrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIntakeYrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIntakeYrActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        btnSave.setEnabled(true);
        txtAddr.setEditable(true);
        txtAge.setEditable(true);
        txtCountry.setEditable(true);
        txtDevice.setEditable(true);
        txtEmail.setEditable(true);
        txtGender.setEditable(true);
        txtLang.setEditable(true);
        txtName.setEditable(true);
                
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        studentprofile.setIntakeYear(txtIntakeYr.getText());
        studentprofile.setStudentId(txtID.getText());
        studentprofile.getPerson().setAddress(txtAddr.getText());
        studentprofile.getPerson().setAge(Integer.parseInt(txtAge.getText()));
        studentprofile.getPerson().setCountry(txtCountry.getText());
        studentprofile.getPerson().setEmailId(txtEmail.getText());
        studentprofile.getPerson().setDevice(txtDevice.getText());
        studentprofile.getPerson().setGender(txtGender.getText());
        studentprofile.getPerson().setLanguage(txtLang.getText());
        studentprofile.getPerson().setName(txtName.getText());
    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbAddr;
    private javax.swing.JLabel lbAge;
    private javax.swing.JLabel lbCountry;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbGender;
    private javax.swing.JLabel lbID;
    private javax.swing.JLabel lbIntakeYr;
    private javax.swing.JLabel lbLang;
    private javax.swing.JTextArea txtAddr;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtCountry;
    private javax.swing.JTextField txtDevice;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtIntakeYr;
    private javax.swing.JTextField txtLang;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
