package UserInterface.WorkAreas.AdminRole.AdministerUserAccountsWorkResp;


import Business.Business;
import Business.Course.Transcript;
import Business.Person.Person;
import Business.Person.PersonDirectory;
import Business.Profiles.FacultyDirectory;
import Business.Profiles.FacultyProfile;
import Business.Profiles.Profile;
import Business.Profiles.StudentDirectory;
import Business.Profiles.ThirdPartyDirectory;
import Business.Profiles.ThirdPartyProfile;
import Business.UserAccounts.UserAccount;
import Business.UserAccounts.UserAccountDirectory;
import UserInterface.WorkAreas.AdminRole.AdminRoleWorkAreaJPanel;
import javax.swing.JOptionPane;
import javax.swing.JSplitPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author anupb
 */
public class Signup2JPanel extends javax.swing.JPanel {

    /**
     * Creates new form Signup2JPanel
     */
    JSplitPane splitPane;
    PersonDirectory personDirectory;
    UserAccountDirectory useraccountdirectroy;
    StudentDirectory studentdirectory;
    FacultyDirectory facultydirectory;
    ThirdPartyDirectory thirdpartydirectory;
    UserAccount userAcc;
    boolean accExist;
    
    javax.swing.JPanel CardSequencePanel;
    Business business;
    Person prsn;     
    
    
    
    
    
    
    public Signup2JPanel(JSplitPane splitPane, PersonDirectory personDirectory,Person prsn,UserAccountDirectory useraccountdirectroy, FacultyDirectory facultydirectory, StudentDirectory studentdirectory,  UserAccount userAcc, ThirdPartyDirectory thirdpartydirectory ) {
        initComponents();
        this.prsn=prsn;
        
        this.thirdpartydirectory=thirdpartydirectory;
        this.splitPane = splitPane;
        this.personDirectory = personDirectory;
        this.useraccountdirectroy=useraccountdirectroy;
        this.facultydirectory=facultydirectory;
        this.studentdirectory=studentdirectory;
        
        userdisplay();
        
        txtId.setEditable(false);
        txtName.setEditable(false);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblRole = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtPwd = new javax.swing.JTextField();
        lblId = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        lblName = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblPwd = new javax.swing.JLabel();
        cmbRole = new javax.swing.JComboBox<>();
        cmbStatus = new javax.swing.JComboBox<>();

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitle.setText("CREATE USER ACCOUNT");

        lblRole.setText("Role");

        lblStatus.setText("Status");

        lblId.setText("ID");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblName.setText("Name");

        lblUsername.setText("Username");

        lblPwd.setText("Password");

        cmbRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Faculty", "Student","Authorizer", "Employer" }));

        cmbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enabled" }));
        cmbStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbStatusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblUsername)
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPwd, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblName)
                                    .addComponent(lblId))
                                .addGap(58, 58, 58)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                                    .addComponent(txtId)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPwd)
                                    .addComponent(lblRole)
                                    .addComponent(lblStatus))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmbRole, 0, 135, Short.MAX_VALUE)
                                    .addComponent(cmbStatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(119, 119, 119))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(btnBack))
                            .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(245, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnBack, btnSave});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblId)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsername))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPwd)
                    .addComponent(txtPwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRole)
                    .addComponent(cmbRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStatus)
                    .addComponent(cmbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnBack))
                .addContainerGap(199, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        
        
                        if(txtId.getText().equals("") || txtPwd.getText().equals("") || cmbRole.getSelectedItem().toString().equals("") || cmbStatus.getSelectedItem().toString().equals("")||txtUsername.getText().equals(""))
        {
          JOptionPane.showMessageDialog(this,"Please enter all the fields to create user account", "Warning", JOptionPane.WARNING_MESSAGE);
        }   
        else
        { 
            if (cmbRole.getSelectedItem().toString().equals("Student"))
            {
                                               
                //Profile studprofile=studentdirectory.newStudentProfile(prsn, txtId.getText(), transcript, "XXXX");
                System.out.println(useraccountdirectroy.getUserAccountList());
                for (UserAccount ua : useraccountdirectroy.getUserAccountList())
                    {
                        if (ua.getRole().equals("admin"))
                            continue;
                        
                        else if(useraccountdirectroy.getUserAccountList().size()>1)
                      {
                          if(ua.getPrsn().getPersonId()!=null && txtId.getText().equals(ua.getPrsn().getPersonId()) )
                          {
                          JOptionPane.showMessageDialog(this, "User account already exists", "Warning", JOptionPane.WARNING_MESSAGE);
                          accExist=true;
                          break; 
                          }
                      }
                        else if (useraccountdirectroy.getUserAccountList().size()==1)
                      {
                         accExist=false;
                         break;
                      }
                        else
                            continue;
                    }
                if(accExist==false)
                {   
                    Transcript t=new Transcript();
                    Profile studprofile=studentdirectory.newStudentProfile(prsn, txtId.getText(), t, "XXXX");
                    //userAcc=useraccountdirectroy.newUserAccount(prsn, studprofile, txtUsername.getText(), txtPwd.getText(), cmbRole.getSelectedItem().toString(), cmbStatus.getSelectedItem().toString());
                    //useraccountdirectroy.getUserAccountList().add(userAcc);
                    useraccountdirectroy.newUserAccount(prsn, studprofile, txtUsername.getText(), txtPwd.getText(), cmbRole.getSelectedItem().toString(), cmbStatus.getSelectedItem().toString());
                    //userAcc=new UserAccount(prsn, studprofile, txtUsername.getText(), txtPwd.getText(), txtRole.getText(), txtStatus.getText());
                    //useraccountdirectroy.getUserAccountList().add(userAcc);
                    JOptionPane.showMessageDialog(this, "User account created successfully", "Information", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            
            else if (cmbRole.getSelectedItem().toString().equals("Faculty"))
            {
                               
                for (UserAccount ua : useraccountdirectroy.getUserAccountList())
                    {   
                        System.out.println(useraccountdirectroy.getUserAccountList().size());
                        if (ua.getRole().equals("admin"))
                            continue;
                        
                        else if(useraccountdirectroy.getUserAccountList().size()>1)
                      {
                          System.out.println(ua.getPrsn().getPersonId());
                          if(ua.getPrsn().getPersonId()!=null && txtId.getText().equals(ua.getPrsn().getPersonId()) )
                                  {
                          JOptionPane.showMessageDialog(this, "User account already exists", "Warning", JOptionPane.WARNING_MESSAGE);
                          accExist=true;
                          break;   
                                  }
                      }
                      else if (useraccountdirectroy.getUserAccountList().size()==1)
                      {
                         accExist=false;
                         break;
                      }
                      else
                          continue;
                    }
                if(accExist==false)
                {
                    
                    
                   if(!txtPwd.getText().matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{8,}$")){
                    
                        JOptionPane.showMessageDialog(this, "Password must be at least 8 characters long and contain at least one uppercase letter, one lowercase letter, and one digit.", "Warning", JOptionPane.WARNING_MESSAGE);
                    }
                   
                   else{
                       FacultyProfile facultyprofile=facultydirectory.newFacultyProfile(prsn, txtId.getText(), "Not Defined", 5);
                    //userAcc=new UserAccount(prsn, facultyprofile, txtUsername.getText(), txtPwd.getText(), cmbRole.getSelectedItem().toString(), cmbStatus.getSelectedItem().toString());
                    //useraccountdirectroy.getUserAccountList().add(userAcc);
                    useraccountdirectroy.newUserAccount(prsn, facultyprofile, txtUsername.getText(), txtPwd.getText(), cmbRole.getSelectedItem().toString(), cmbStatus.getSelectedItem().toString());
                    //facultydirectory.getFacultylist().add(facultyprofile);
                    JOptionPane.showMessageDialog(this, "User account created successfully", "Information", JOptionPane.INFORMATION_MESSAGE);
                }
                }
            }
            
            else if (cmbRole.getSelectedItem().toString().equals("Authorizer"))
            {
                               
                for (UserAccount ua : useraccountdirectroy.getUserAccountList())
                    {   
                        System.out.println(useraccountdirectroy.getUserAccountList().size());
                        if (ua.getRole().equals("admin"))
                            continue;
                        
                        else if(useraccountdirectroy.getUserAccountList().size()>1)
                      {
                          System.out.println(ua.getPrsn().getPersonId());
                          if(ua.getPrsn().getPersonId()!=null && txtId.getText().equals(ua.getPrsn().getPersonId()) )
                                  {
                          JOptionPane.showMessageDialog(this, "User account already exists", "Warning", JOptionPane.WARNING_MESSAGE);
                          accExist=true;
                          break;   
                                  }
                      }
                      else if (useraccountdirectroy.getUserAccountList().size()==1)
                      {
                         accExist=false;
                         break;
                      }
                      else
                          continue;
                    }
                if(accExist==false)
                {
                    
                    
                    
                    if(!txtPwd.getText().matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{8,}$")){
                    
                        JOptionPane.showMessageDialog(this, "Password must be at least 8 characters long and contain at least one uppercase letter, one lowercase letter, and one digit.", "Warning", JOptionPane.WARNING_MESSAGE);
                    }
                    
                    else{ 
                    ThirdPartyProfile thirdparty=thirdpartydirectory.newTPProfile(txtId.getText(),prsn, "Not Defined", "Not Defined");
                    //userAcc=new UserAccount(prsn, facultyprofile, txtUsername.getText(), txtPwd.getText(), cmbRole.getSelectedItem().toString(), cmbStatus.getSelectedItem().toString());
                    //useraccountdirectroy.getUserAccountList().add(userAcc);
                    useraccountdirectroy.newUserAccount(prsn, thirdparty, txtUsername.getText(), txtPwd.getText(), cmbRole.getSelectedItem().toString(), cmbStatus.getSelectedItem().toString());
                    //facultydirectory.getFacultylist().add(facultyprofile);
                    JOptionPane.showMessageDialog(this, "User account created successfully", "Information", JOptionPane.INFORMATION_MESSAGE);
                }
                }
            }
        
        
        }
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        
        Signup1JPanel sjpl1 = new Signup1JPanel( business, CardSequencePanel, splitPane, personDirectory,prsn, useraccountdirectroy,facultydirectory,studentdirectory, userAcc, thirdpartydirectory);
        splitPane.setRightComponent(sjpl1);
        
        
        
        
    }//GEN-LAST:event_btnBackActionPerformed

    private void cmbStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbStatusActionPerformed
        // TODO add your handling code here:
        

    }//GEN-LAST:event_cmbStatusActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cmbRole;
    private javax.swing.JComboBox<String> cmbStatus;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPwd;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPwd;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

    private void userdisplay() {
        
          txtId.setText(prsn.getPersonId());
          txtName.setText(prsn.getName());
          
        
    }
}
