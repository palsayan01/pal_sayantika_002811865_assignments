/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.WorkAreas.FacultyRole.FacultyRoleWorkResp;

import Business.Business;
import Business.Course.CourseDirectory;
import Business.Course.CourseLoadDirectory;
import Business.Course.CourseOffer;
import Business.Course.CourseOfferDirectory;
import Business.Profiles.FacultyProfile;
import UserInterface.WorkAreas.FacultyRole.FacultyWorkAreaJPanel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

/**
 *
 * @author tanvi
 */
public class FacultyProfileJPanel extends javax.swing.JPanel {

    javax.swing.JPanel CardSequencePanel;
    Business business;
    JSplitPane splitPane;
    FacultyProfile facultyProfile;
    CourseDirectory cd;
    CourseOfferDirectory cod;
    CourseLoadDirectory courseLoadDirectory;

    /**
     * Creates new form FacultyProfileJPanel
     */
    public FacultyProfileJPanel(JSplitPane splitPane,FacultyProfile f, CourseDirectory cd, CourseOfferDirectory cod,CourseLoadDirectory courseLoadDirectory) {
        
        
        this.splitPane = splitPane;
        this.facultyProfile = f;
        this.cd=cd;
        this.cod=cod;
        this.courseLoadDirectory=courseLoadDirectory;
        initComponents();
        
        for (CourseOffer co: cod.getCourseofferlist())
        {
            if(co.getFacultyProfile().getPerson().getPersonId()==f.getPerson().getPersonId())
            {
                facultyProfile=co.getFacultyProfile();
                break;
            }
        }
        txtFacultyProfileID.setText(String.valueOf(facultyProfile.getPerson().getPersonId()));
        txtFacultyProfileName.setText(facultyProfile.getPerson().getName());
        txtFacultyProfileAge.setText(String.valueOf(facultyProfile.getPerson().getAge()));
        txtFacultyProfileGender.setText(facultyProfile.getPerson().getGender());
        txtFacultyProfileAddress.setText(facultyProfile.getPerson().getAddress());
        txtFacultyProfileEmailId.setText(facultyProfile.getPerson().getEmailId());
        txtFacultyProfileRegion.setText(facultyProfile.getPerson().getRegion());
        txtFacultyProfileCountry.setText(facultyProfile.getPerson().getCountry());
        txtFacultyProfileExpertise.setText(facultyProfile.getExpertise());
        txtFacultyProfileLanguage.setText(facultyProfile.getPerson().getLanguage());
        txtFacultyProfileRating.setText(String.valueOf(facultyProfile.getRating()));
               
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtFacultyProfileAge = new javax.swing.JTextField();
        txtFacultyProfileGender = new javax.swing.JTextField();
        txtTitleMyProfile = new javax.swing.JLabel();
        txtFacultyProfileAddress = new javax.swing.JTextField();
        txtFacultyProfileEmailId = new javax.swing.JTextField();
        lblFacultyProfileID = new javax.swing.JLabel();
        lblFacultyProfileName = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        lblFacultyProfileAge = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        lblFacultyProfileEmailID = new javax.swing.JLabel();
        lblFacultyProfileGender = new javax.swing.JLabel();
        lblFacultyProfileAddress = new javax.swing.JLabel();
        txtFacultyProfileID = new javax.swing.JTextField();
        txtFacultyProfileName = new javax.swing.JTextField();
        txtFacultyProfileLanguage = new javax.swing.JTextField();
        txtFacultyProfileExpertise = new javax.swing.JTextField();
        lblFacultyProfileRating = new javax.swing.JLabel();
        txtFacultyProfileRegion = new javax.swing.JTextField();
        txtFacultyProfileRating = new javax.swing.JTextField();
        txtFacultyProfileCountry = new javax.swing.JTextField();
        lblFacultyProfileRegion = new javax.swing.JLabel();
        lblFacultyProfileCountry = new javax.swing.JLabel();
        lblFacultyProfileLanguage = new javax.swing.JLabel();
        lblFacultyProfileExpertise = new javax.swing.JLabel();
        btnUpdate1 = new javax.swing.JButton();

        txtFacultyProfileAge.setEditable(false);
        txtFacultyProfileAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFacultyProfileAgeActionPerformed(evt);
            }
        });

        txtFacultyProfileGender.setEditable(false);

        txtTitleMyProfile.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        txtTitleMyProfile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTitleMyProfile.setText("My Profile");

        txtFacultyProfileAddress.setEditable(false);

        txtFacultyProfileEmailId.setEditable(false);
        txtFacultyProfileEmailId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFacultyProfileEmailIdActionPerformed(evt);
            }
        });

        lblFacultyProfileID.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblFacultyProfileID.setText("Faculty ID:");

        lblFacultyProfileName.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblFacultyProfileName.setText("Name:");

        btnSave.setBackground(new java.awt.Color(102, 153, 255));
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Save");
        btnSave.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSave.setEnabled(false);
        btnSave.setMaximumSize(new java.awt.Dimension(200, 40));
        btnSave.setMinimumSize(new java.awt.Dimension(20, 20));
        btnSave.setPreferredSize(new java.awt.Dimension(240, 25));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        lblFacultyProfileAge.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblFacultyProfileAge.setText("Age:");

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

        lblFacultyProfileEmailID.setText("Email id:");

        lblFacultyProfileGender.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblFacultyProfileGender.setText("Gender:");

        lblFacultyProfileAddress.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblFacultyProfileAddress.setText("Address:");

        txtFacultyProfileID.setEditable(false);
        txtFacultyProfileID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFacultyProfileIDActionPerformed(evt);
            }
        });

        txtFacultyProfileName.setEditable(false);
        txtFacultyProfileName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFacultyProfileNameActionPerformed(evt);
            }
        });

        txtFacultyProfileLanguage.setEditable(false);
        txtFacultyProfileLanguage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFacultyProfileLanguageActionPerformed(evt);
            }
        });

        txtFacultyProfileExpertise.setEditable(false);

        lblFacultyProfileRating.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblFacultyProfileRating.setText("Rating:");

        txtFacultyProfileRegion.setEditable(false);
        txtFacultyProfileRegion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFacultyProfileRegionActionPerformed(evt);
            }
        });

        txtFacultyProfileRating.setEditable(false);

        txtFacultyProfileCountry.setEditable(false);
        txtFacultyProfileCountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFacultyProfileCountryActionPerformed(evt);
            }
        });

        lblFacultyProfileRegion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblFacultyProfileRegion.setText("Region:");

        lblFacultyProfileCountry.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblFacultyProfileCountry.setText("Country:");

        lblFacultyProfileLanguage.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblFacultyProfileLanguage.setText("Language:");

        lblFacultyProfileExpertise.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblFacultyProfileExpertise.setText("Expertise:");

        btnUpdate1.setBackground(new java.awt.Color(102, 153, 255));
        btnUpdate1.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate1.setText("Update");
        btnUpdate1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnUpdate1.setMaximumSize(new java.awt.Dimension(200, 40));
        btnUpdate1.setMinimumSize(new java.awt.Dimension(20, 20));
        btnUpdate1.setPreferredSize(new java.awt.Dimension(240, 25));
        btnUpdate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtTitleMyProfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFacultyProfileName, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblFacultyProfileAge, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblFacultyProfileID, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblFacultyProfileGender, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblFacultyProfileAddress, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblFacultyProfileEmailID, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtFacultyProfileID)
                            .addComponent(txtFacultyProfileName)
                            .addComponent(txtFacultyProfileAge)
                            .addComponent(txtFacultyProfileGender)
                            .addComponent(txtFacultyProfileAddress)
                            .addComponent(txtFacultyProfileEmailId, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFacultyProfileCountry, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblFacultyProfileLanguage, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblFacultyProfileRegion, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblFacultyProfileExpertise, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblFacultyProfileRating, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtFacultyProfileRegion, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                            .addComponent(txtFacultyProfileCountry)
                            .addComponent(txtFacultyProfileLanguage)
                            .addComponent(txtFacultyProfileExpertise)
                            .addComponent(txtFacultyProfileRating)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnUpdate1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(txtTitleMyProfile)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFacultyProfileID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFacultyProfileID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFacultyProfileName)
                    .addComponent(txtFacultyProfileName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFacultyProfileAge)
                    .addComponent(txtFacultyProfileAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFacultyProfileGender)
                    .addComponent(txtFacultyProfileGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFacultyProfileAddress)
                    .addComponent(txtFacultyProfileAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFacultyProfileEmailId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFacultyProfileEmailID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFacultyProfileRegion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFacultyProfileRegion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFacultyProfileCountry)
                    .addComponent(txtFacultyProfileCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFacultyProfileLanguage)
                    .addComponent(txtFacultyProfileLanguage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFacultyProfileExpertise)
                    .addComponent(txtFacultyProfileExpertise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFacultyProfileRating)
                    .addComponent(txtFacultyProfileRating, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 69, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtFacultyProfileAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFacultyProfileAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFacultyProfileAgeActionPerformed

    private void txtFacultyProfileEmailIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFacultyProfileEmailIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFacultyProfileEmailIdActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
     
        
         facultyProfile.getPerson().setName(txtFacultyProfileName.getText());
        facultyProfile.setExpertise(txtFacultyProfileExpertise.getText());
        facultyProfile.getPerson().setAddress(txtFacultyProfileAddress.getText());
        facultyProfile.getPerson().setAge(Integer.parseInt(txtFacultyProfileAge.getText()));
        facultyProfile.getPerson().setCountry(txtFacultyProfileCountry.getText());
        facultyProfile.getPerson().setEmailId(txtFacultyProfileEmailId.getText());
        facultyProfile.getPerson().setGender(txtFacultyProfileGender.getText());
        facultyProfile.getPerson().setGender(txtFacultyProfileGender.getText());
        facultyProfile.getPerson().setLanguage(txtFacultyProfileLanguage.getText());
        facultyProfile.getPerson().setRegion(txtFacultyProfileRegion.getText());
        
      
        
        String name = txtFacultyProfileName.getText();
        String ageStr = txtFacultyProfileAge.getText();
        String gender = txtFacultyProfileGender.getText();
        String address = txtFacultyProfileAddress.getText();
        String email = txtFacultyProfileEmailId.getText();
        String country = txtFacultyProfileCountry.getText();
        String region = txtFacultyProfileRegion.getText();
        String language = txtFacultyProfileLanguage.getText();
        String expertise = txtFacultyProfileExpertise.getText();

        if (name.isEmpty() || ageStr.isEmpty() || gender.isEmpty() || address.isEmpty() || email.isEmpty()
                || country.isEmpty() || region.isEmpty() || language.isEmpty() || expertise.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter all values.");
            return;
        }

        if (!ageStr.matches("[1-9][0-9]")) {
            JOptionPane.showMessageDialog(this, "Age must be a numeric value.");
            return;
        }

        if (!email.matches("[a-zA-Z0-9]+@[a-z]+\\.edu")) {
            JOptionPane.showMessageDialog(this, "Invalid email address format.");
            return;
        }

        JOptionPane.showMessageDialog(this, "Data saved successfully!");
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        FacultyWorkAreaJPanel facultyworkarea = new FacultyWorkAreaJPanel(splitPane,facultyProfile, cd, cod,courseLoadDirectory);
        splitPane.setRightComponent(facultyworkarea);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtFacultyProfileIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFacultyProfileIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFacultyProfileIDActionPerformed

    private void txtFacultyProfileNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFacultyProfileNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFacultyProfileNameActionPerformed

    private void txtFacultyProfileLanguageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFacultyProfileLanguageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFacultyProfileLanguageActionPerformed

    private void txtFacultyProfileRegionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFacultyProfileRegionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFacultyProfileRegionActionPerformed

    private void txtFacultyProfileCountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFacultyProfileCountryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFacultyProfileCountryActionPerformed

    private void btnUpdate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate1ActionPerformed
        // TODO add your handling code here:
        txtFacultyProfileName.setEditable(true);
        txtFacultyProfileAge.setEditable(true);
        txtFacultyProfileGender.setEditable(true);
        txtFacultyProfileAddress.setEditable(true);
        txtFacultyProfileEmailId.setEditable(true);
        txtFacultyProfileCountry.setEditable(true);
        txtFacultyProfileRegion.setEditable(true);
        txtFacultyProfileLanguage.setEditable(true);
        txtFacultyProfileExpertise.setEditable(true);

        btnSave.setEnabled(true);

    }//GEN-LAST:event_btnUpdate1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate1;
    private javax.swing.JLabel lblFacultyProfileAddress;
    private javax.swing.JLabel lblFacultyProfileAge;
    private javax.swing.JLabel lblFacultyProfileCountry;
    private javax.swing.JLabel lblFacultyProfileEmailID;
    private javax.swing.JLabel lblFacultyProfileExpertise;
    private javax.swing.JLabel lblFacultyProfileGender;
    private javax.swing.JLabel lblFacultyProfileID;
    private javax.swing.JLabel lblFacultyProfileLanguage;
    private javax.swing.JLabel lblFacultyProfileName;
    private javax.swing.JLabel lblFacultyProfileRating;
    private javax.swing.JLabel lblFacultyProfileRegion;
    private javax.swing.JTextField txtFacultyProfileAddress;
    private javax.swing.JTextField txtFacultyProfileAge;
    private javax.swing.JTextField txtFacultyProfileCountry;
    private javax.swing.JTextField txtFacultyProfileEmailId;
    private javax.swing.JTextField txtFacultyProfileExpertise;
    private javax.swing.JTextField txtFacultyProfileGender;
    private javax.swing.JTextField txtFacultyProfileID;
    private javax.swing.JTextField txtFacultyProfileLanguage;
    private javax.swing.JTextField txtFacultyProfileName;
    private javax.swing.JTextField txtFacultyProfileRating;
    private javax.swing.JTextField txtFacultyProfileRegion;
    private javax.swing.JLabel txtTitleMyProfile;
    // End of variables declaration//GEN-END:variables
}
