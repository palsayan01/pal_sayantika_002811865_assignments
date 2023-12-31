package UserInterface.WorkAreas.AdminRole.AdministerUserAccountsWorkResp;

import Business.Business;
import Business.Person.Person;
import Business.Person.PersonDirectory;
import Business.ProfileWorkAreaMainFrame;
import Business.Profiles.FacultyDirectory;
import Business.Profiles.StudentDirectory;
import Business.Profiles.ThirdPartyDirectory;
import Business.UserAccounts.UserAccount;
import Business.UserAccounts.UserAccountDirectory;
import Home.HomeJPanel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
/**
 *
 * @author anupb
 */
public class Signup1JPanel extends javax.swing.JPanel {

    /**
     * Creates new form Signup1JPanel
     */
    javax.swing.JPanel CardSequencePanel;
    Business business;

    JSplitPane splitPane;
    PersonDirectory personDirectory;
    private boolean personExist = false;
    UserAccountDirectory useraccountdirectroy;
    StudentDirectory studentdirectory;
    FacultyDirectory facultydirectory;
    ThirdPartyDirectory thirdpartydirectory;
    UserAccount userAcc;
    // Person pr;

    public Signup1JPanel(Business b, JPanel clp, JSplitPane splitPane, PersonDirectory personDirectory, Person prsn, UserAccountDirectory useraccountdirectroy, FacultyDirectory facultydirectory, StudentDirectory studentdirectory, UserAccount userAcc, ThirdPartyDirectory thirdpartydirectory) {
        initComponents();

        business = b;
        this.CardSequencePanel = clp;

        this.splitPane = splitPane;
        this.personDirectory = personDirectory;
        this.useraccountdirectroy = useraccountdirectroy;
        this.facultydirectory = facultydirectory;
        this.studentdirectory = studentdirectory;
        this.thirdpartydirectory=thirdpartydirectory;

        btnCreate.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDevice = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblLanguage = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        lblEmail = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        lblId = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        txtGender = new javax.swing.JTextField();
        lblAge = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        lblGender = new javax.swing.JLabel();
        txtRegion = new javax.swing.JTextField();
        lblAddress = new javax.swing.JLabel();
        txtCountry = new javax.swing.JTextField();
        lblRegion = new javax.swing.JLabel();
        lblCountry = new javax.swing.JLabel();
        txtLanguage = new javax.swing.JTextField();
        lblTitle = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();
        cmbDevice = new javax.swing.JComboBox<>();

        lblDevice.setText("Device");

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        lblLanguage.setText("Language");

        btnAdd.setText("Add Details");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        lblEmail.setText("Email Id");

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblId.setText("ID");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        lblName.setText("Name");

        lblAge.setText("Age");

        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });

        lblGender.setText("Gender");

        txtRegion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegionActionPerformed(evt);
            }
        });

        lblAddress.setText("Address");

        lblRegion.setText("Region");

        lblCountry.setText("Country");

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitle.setText("ADD YOUR DETAILS");

        btnCreate.setText("Create Account");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        cmbDevice.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Phone", "Laptop", "Desktop"}));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(271, 271, 271)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAdd)
                        .addGap(51, 51, 51)
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(btnCreate))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblId)
                            .addComponent(lblAge)
                            .addComponent(lblName)
                            .addComponent(lblGender)
                            .addComponent(lblAddress)
                            .addComponent(lblRegion)
                            .addComponent(lblCountry)
                            .addComponent(lblDevice)
                            .addComponent(lblLanguage)
                            .addComponent(lblEmail))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                            .addComponent(txtName)
                            .addComponent(txtAge)
                            .addComponent(txtGender)
                            .addComponent(txtAddress)
                            .addComponent(txtRegion)
                            .addComponent(txtCountry)
                            .addComponent(cmbDevice, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLanguage)
                            .addComponent(txtId)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(173, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAdd, btnBack, btnCreate});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblId)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAge)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGender)
                    .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddress)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRegion)
                    .addComponent(txtRegion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCountry)
                    .addComponent(txtCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDevice)
                    .addComponent(cmbDevice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLanguage)
                    .addComponent(txtLanguage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnAdd)
                    .addComponent(btnCreate))
                .addContainerGap(77, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:

        for (Person prsn : personDirectory.getPersonlist()) {
            if (txtId.getText().equals(prsn.getPersonId())) {
                JOptionPane.showMessageDialog(this, "Person already exists");
                personExist = true;
                btnCreate.setEnabled(true);
            }
        }

        if (txtId.getText().isEmpty() || txtName.getText().isEmpty() || txtAge.getText().isEmpty() || txtGender.getText().isEmpty() || txtAddress.getText().isEmpty() || txtRegion.getText().isEmpty() || txtCountry.getText().isEmpty() || txtLanguage.getText().isEmpty() || txtEmail.getText().isEmpty()) {

            JOptionPane.showMessageDialog(this, "Field is empty");
        } else if (txtId.getText().matches("[a-z][A-Z]")) {

            JOptionPane.showMessageDialog(this, "Invalid ID");

        } else if (!txtAge.getText().matches("[1-9][0-9]")) {

            JOptionPane.showMessageDialog(this, "Invalid Age");

        } else if (!txtName.getText().matches("^[A-Za-z]+$")) {

            JOptionPane.showMessageDialog(this, "Invalid Name");

        } else if (!txtEmail.getText().matches("[a-zA-Z0-9]+@[a-z]+\\.edu")) {

            JOptionPane.showMessageDialog(this, "Please enter correct email id!");
        } else if (!(txtGender.getText().matches("Male") || txtGender.getText().matches("Female"))) {

            JOptionPane.showMessageDialog(this, "Please enter correct Gender");
        } else if (!txtRegion.getText().matches("^[A-Za-z]+$")) {

            JOptionPane.showMessageDialog(this, "Invalid Region");

        } else if (!txtCountry.getText().matches("^[A-Za-z]+$")) {

            JOptionPane.showMessageDialog(this, "Invalid Country");

        } else if (!txtLanguage.getText().matches("^[A-Za-z]+$")) {

            JOptionPane.showMessageDialog(this, "Invalid Languague");

        } else {

            if (personExist == false) {
                String id = txtId.getText();
                String name = txtName.getText();
                String gender = txtGender.getText();
                int age = Integer.parseInt(txtAge.getText());
                String address = txtAddress.getText();
                String emailId = txtEmail.getText();
                String region = txtRegion.getText();
                String country = txtCountry.getText();
                String device = cmbDevice.getSelectedItem().toString();
                String language = txtLanguage.getText();

                Person p = personDirectory.newPerson(id, name, gender, age, address, emailId, region, country, device, language);

                p.setPersonId(id);
                p.setName(name);
                p.setGender(gender);
                p.setAge(age);
                p.setAddress(address);
                p.setEmailId(emailId);
                p.setRegion(region);
                p.setCountry(country);
                p.setDevice(device);
                p.setLanguage(language);

                JOptionPane.showMessageDialog(null, "Person successfully added!");

                btnCreate.setEnabled(true);
            }

        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:

        ProfileWorkAreaMainFrame frame = new ProfileWorkAreaMainFrame(true);
        HomeJPanel home = new HomeJPanel();
        splitPane.setRightComponent(home);

        // Register4JPanel rjpl4 = new Register4JPanel(splitPane, personDirectory);
        // splitPane.setRightComponent(rjpl4);

    }//GEN-LAST:event_btnBackActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void txtRegionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRegionActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:

        String id = txtId.getText();
        String name = txtName.getText();
        String gender = txtGender.getText();
        int age = Integer.parseInt(txtAge.getText());
        String address = txtAddress.getText();
        String emailId = txtEmail.getText();
        String region = txtRegion.getText();
        String country = txtCountry.getText();
        String device = cmbDevice.getSelectedItem().toString();
        String language = txtLanguage.getText();

        Person pr = new Person(id, name, gender, age, address, emailId, region, country, device, language);
        pr.setPersonId(txtId.getText());
        pr.setName(txtName.getText());

        Signup2JPanel sjpl2 = new Signup2JPanel(splitPane, personDirectory, pr, useraccountdirectroy, facultydirectory, studentdirectory, userAcc, thirdpartydirectory);
        splitPane.setRightComponent(sjpl2);

    }//GEN-LAST:event_btnCreateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JComboBox<String> cmbDevice;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblCountry;
    private javax.swing.JLabel lblDevice;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblLanguage;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblRegion;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtCountry;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtLanguage;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtRegion;
    // End of variables declaration//GEN-END:variables
}
