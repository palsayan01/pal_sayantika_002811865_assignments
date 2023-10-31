/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Course.Course;							  
import Business.Course.CourseDirectory;
import Business.Course.CourseLoadDirectory;
import Business.Course.CourseOfferDirectory;
import Business.Course.Transcript;								  
import Business.Person.Person;
import Business.Person.PersonDirectory;
import Business.Profiles.EmployeeProfile;
import Business.Profiles.EmployerDirectory;
import Business.Profiles.EmployerProfile;
import Business.Profiles.FacultyDirectory;
import Business.Profiles.Profile;
import Business.Profiles.StudentProfile;
import Business.Profiles.FacultyProfile;
import Business.Profiles.StudentDirectory;
import Business.Profiles.ThirdPartyApproval;
import Business.Profiles.ThirdPartyDirectory;
import Business.Profiles.ThirdPartyProfile;
import Business.UserAccounts.UserAccount;
import Business.UserAccounts.UserAccountDirectory;
import UserInterface.WorkAreas.EmployerRole.EmployerWorkAreaJPanel;
import UserInterface.WorkArea.ThirdPartyRole.ThirdPartyWorkAreaJPanel;
import UserInterface.WorkAreas.AdminRole.AdminRoleWorkAreaJPanel;
import UserInterface.WorkAreas.AdminRole.AdministerUserAccountsWorkResp.Signup1JPanel;
import UserInterface.WorkAreas.EmployerRole.EmployerWorkAreaJPanel;
import UserInterface.WorkAreas.FacultyRole.FacultyWorkAreaJPanel;
import UserInterface.WorkAreas.StudentRole.StudentWorkAreaJPanel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;						  							 

/**
 *
 * @author kal bugrara
 */
public class ProfileWorkAreaMainFrame extends javax.swing.JFrame {

    Business business;
    PersonDirectory personDirectory;
    UserAccountDirectory userAccountDirectory;
    CourseLoadDirectory courseLoadDirectory;
    CourseOfferDirectory courseofferdirectory;
    CourseDirectory coursedirectory;
    FacultyDirectory facultydirectory;
    StudentDirectory studentdirectory;
    EmployerDirectory ed;
    UserAccount userAcc;
    ThirdPartyApproval tpa;
    ThirdPartyDirectory tpd;
    Profile profile;
    Person prsn;
    
    private boolean logout = false;
    private boolean userExist = true;
    //private boolean validUser;

    /**
     * Creates new form PricingMainFrame
     */
    public ProfileWorkAreaMainFrame(boolean logout) {
        initComponents();
        //business = ConfigureABusiness.initialize();
        personDirectory = new PersonDirectory();
        userAccountDirectory = new UserAccountDirectory();
        courseLoadDirectory = new CourseLoadDirectory();
        coursedirectory = new CourseDirectory();
        courseofferdirectory = new CourseOfferDirectory();
        facultydirectory = new FacultyDirectory();
        studentdirectory = new StudentDirectory();
        tpd=new ThirdPartyDirectory();
        tpa=new ThirdPartyApproval();
        ed=new EmployerDirectory();
        this.logout = logout;
        prepopulate();

        // Seed Faculty
        //Person johnPerson = personDirectory.newPerson("johndoe", "John Doe", "Male", 45, "St Alphonsus St, Boston", "johndoe@gmail.com", "MA", "USA", "Laptop", "English");
        //FacultyProfile johnFaculty = facultydirectory.newFacultyProfile(johnPerson, "johndoe", "Mathematics", (float) 4.5);
        //UserAccount johnAccount = userAccountDirectory.newUserAccount(johnPerson, johnFaculty, "johndoe", "1234", "Faculty", "Active");

         //Admin
       Person prsn1= personDirectory.newPerson("1", "admin", "female", 42, "Northeastern", "admin@admin.edu", "North", "USA", "Laptop", "English");
       Profile adminprofile = new EmployeeProfile(prsn1);
       UserAccount userAcc1 = userAccountDirectory.newUserAccount(prsn1, adminprofile, "admin", "XXXX", "admin", "Enabled");
        
    }
    
    public void prepopulate()
    {
        //Admin
       Person prsn1= personDirectory.newPerson("1", "admin", "female", 42, "Northeastern", "admin@admin.edu", "North", "USA", "Laptop", "English");
       Profile adminprofile = new EmployeeProfile(prsn1);
       UserAccount userAcc1 = userAccountDirectory.newUserAccount(prsn1, adminprofile, "admin", "XXXX", "admin", "Enabled"); 
       
       //Students
       Person prsn2= personDirectory.newPerson("2", "Maria", "Female", 42, "Northeastern", "admin@admin.edu", "North", "USA", "Laptop", "English");
       Transcript t1= new Transcript();
       t1.setDegreeProg("MSIS");
       t1.setGradStatus("Not Graduated");
       Profile studentProfile1 = studentdirectory.newStudentProfile(prsn2, prsn2.getPersonId(),t1,"2023");
       UserAccount userAcc2 = userAccountDirectory.newUserAccount(prsn2, studentProfile1, "maria", "Maria123", "Student", "Enabled");
       Person prsn3= personDirectory.newPerson("3", "Smith", "Female", 42, "Northeastern", "admin@admin.edu", "North", "USA", "Phone", "English");
       Transcript t2= new Transcript();
       t2.setDegreeProg("MSIS");
       t2.setGradStatus("Not Graduated");
       Profile studentProfile2 = studentdirectory.newStudentProfile(prsn3, prsn3.getPersonId(),t2,"2023");
       UserAccount userAcc3 = userAccountDirectory.newUserAccount(prsn3, studentProfile1, "smith", "Smith123", "Student", "Enabled"); 
       
       Person prsn4= personDirectory.newPerson("4", "Kaira", "Female", 42, "Northeastern", "admin@admin.edu", "North", "USA", "Phone", "English");
       Transcript t3= new Transcript();
       t3.setDegreeProg("MSIS");
       t3.setGradStatus("Not Graduated");
       Profile studentProfile3 = studentdirectory.newStudentProfile(prsn4, prsn4.getPersonId(),t3,"2023");
       UserAccount userAcc4 = userAccountDirectory.newUserAccount(prsn4, studentProfile1, "kaira", "Kaira123", "Student", "Enabled"); 
       
       Person prsn5= personDirectory.newPerson("5", "John", "Male", 35, "Northeastern", "admin@admin.edu", "North", "USA", "Phone", "English");
       Transcript t4= new Transcript();
       t4.setDegreeProg("MSIS");
       t4.setGradStatus("Not Graduated");
       Profile studentProfile4 = studentdirectory.newStudentProfile(prsn5, prsn5.getPersonId(),t4,"2023");
       UserAccount userAcc5 = userAccountDirectory.newUserAccount(prsn5, studentProfile1, "john", "John1234", "Student", "Enabled"); 
        
       
       Person prsn6 = personDirectory.newPerson("6", "Lee", "Female", 29, "Yale", "lee@yale.edu", "East", "USA", "Phone", "English");
        Transcript t5 = new Transcript();
        t5.setDegreeProg("Ph.D. in Biology");
        t5.setGradStatus("Not Graduated");
        Profile studentProfile6 = studentdirectory.newStudentProfile(prsn6, prsn6.getPersonId(), t5, "2025");
        UserAccount userAcc6 = userAccountDirectory.newUserAccount(prsn6, studentProfile6, "lee", "Lee123", "Student", "Enabled");
    
        
        Person prsn7 = personDirectory.newPerson("7", "Martinez", "Male", 31, "Columbia", "martinez@columbia.edu", "West", "USA", "Phone", "English");
        Transcript t6 = new Transcript();
        t6.setDegreeProg("MSIS");
        t6.setGradStatus("Not Graduated");
        Profile studentProfile7 = studentdirectory.newStudentProfile(prsn7, prsn7.getPersonId(), t6, "2024");
        UserAccount userAcc7 = userAccountDirectory.newUserAccount(prsn7, studentProfile7, "martinez", "Martinez123", "Student", "Enabled");
 
// Student 8
Person prsn8 = personDirectory.newPerson("8", "Kim", "Female", 27, "Oxford", "kim@oxford.edu", "South", "UK", "Phone", "English");
Transcript t7 = new Transcript();
t7.setDegreeProg("M.Sc. in Economics");
t7.setGradStatus("Not Graduated");
Profile studentProfile8 = studentdirectory.newStudentProfile(prsn8, prsn8.getPersonId(), t7, "2023");
UserAccount userAcc8 = userAccountDirectory.newUserAccount(prsn8, studentProfile8, "kim", "Kim123", "Student", "Enabled");
 
// Student 9
Person prsn9 = personDirectory.newPerson("9", "Garcia", "Male", 30, "Cambridge", "garcia@cambridge.edu", "East", "UK", "Phone", "English");
Transcript t8 = new Transcript();
t8.setDegreeProg("MSDS");
t8.setGradStatus("Not Graduated");
Profile studentProfile9 = studentdirectory.newStudentProfile(prsn9, prsn9.getPersonId(), t8, "2025");
UserAccount userAcc9 = userAccountDirectory.newUserAccount(prsn9, studentProfile9, "garcia", "Garcia123", "Student", "Enabled");
 
// Student 10
Person prsn10 = personDirectory.newPerson("10", "Liu", "Female", 26, "Harvard", "liu@harvard.edu", "North", "USA", "Phone", "English");
Transcript t9 = new Transcript();
t9.setDegreeProg("MSIS");
t9.setGradStatus("Not Graduated");
Profile studentProfile10 = studentdirectory.newStudentProfile(prsn10, prsn10.getPersonId(), t9, "2024");
UserAccount userAcc10 = userAccountDirectory.newUserAccount(prsn10, studentProfile10, "liu", "Liu123", "Student", "Enabled");


Person prsn11 = personDirectory.newPerson("11", "Evan", "Male", 29, "Yale", "lee@yale.edu", "East", "USA", "Phone", "English");
    Transcript t10 = new Transcript();
    t10.setDegreeProg("Ph.D. in Biology");
    t10.setGradStatus("Not Graduated");
    Profile studentProfile11 = studentdirectory.newStudentProfile(prsn11, prsn11.getPersonId(), t10, "2025");
    UserAccount userAcc11 = userAccountDirectory.newUserAccount(prsn6, studentProfile11, "lee", "Lee123", "Student", "Enabled");
    

//Faculty
// Person prsn13
Person prsn13 = personDirectory.newPerson("13", "Alice", "Female", 27, "Harvard", "alice@harvard.edu", "West", "USA", "Phone", "English");
Profile facultyProfile2 = facultydirectory.newFacultyProfile(prsn13, prsn13.getPersonId(), "Python", 1);
UserAccount userAcc13 = userAccountDirectory.newUserAccount(prsn13, facultyProfile2, "alice", "Alice123", "Faculty", "Enabled");
 
// Person prsn14
Person prsn14 = personDirectory.newPerson("14", "Bob", "Male", 30, "MIT", "bob@mit.edu", "North", "USA", "Phone", "English");
Profile facultyProfile3 = facultydirectory.newFacultyProfile(prsn14, prsn14.getPersonId(), "Java", 2);
UserAccount userAcc14 = userAccountDirectory.newUserAccount(prsn14, facultyProfile3, "bob", "Bob123", "Faculty", "Enabled");
 
// Person prsn15
Person prsn15 = personDirectory.newPerson("15", "Charlie", "Male", 25, "Stanford", "charlie@stanford.edu", "West", "USA", "Phone", "English");
Profile facultyProfile4 = facultydirectory.newFacultyProfile(prsn15, prsn15.getPersonId(), "JavaScript", 3);
UserAccount userAcc15 = userAccountDirectory.newUserAccount(prsn15, facultyProfile4, "charlie", "Charlie123", "Student", "Enabled");
 
// Person prsn16
Person prsn16 = personDirectory.newPerson("16", "David", "Male", 33, "Cambridge", "david@cambridge.edu", "North", "UK", "Phone", "English");
Profile facultyProfile5 = facultydirectory.newFacultyProfile(prsn16, prsn16.getPersonId(), "Ruby", 4);
UserAccount userAcc16 = userAccountDirectory.newUserAccount(prsn16, facultyProfile5, "david", "David123", "Student", "Enabled");
 
// Person prsn17
Person prsn17 = personDirectory.newPerson("17", "Grace", "Female", 31, "Caltech", "grace@caltech.edu", "West", "USA", "Phone", "English");
Profile facultyProfile6 = facultydirectory.newFacultyProfile(prsn17, prsn17.getPersonId(), "C#", 5);
UserAccount userAcc17 = userAccountDirectory.newUserAccount(prsn17, facultyProfile6, "grace", "Grace123", "Student", "Enabled");
 
// Person prsn18
Person prsn18 = personDirectory.newPerson("18", "Henry", "Male", 29, "ETH Zurich", "henry@ethzurich.edu", "Europe", "Switzerland", "Phone", "English");
Profile facultyProfile7 = facultydirectory.newFacultyProfile(prsn18, prsn18.getPersonId(), "Swift", 6);
UserAccount userAcc18 = userAccountDirectory.newUserAccount(prsn18, facultyProfile7, "henry", "Henry123", "Student", "Enabled");
 
// Person prsn19
Person prsn19 = personDirectory.newPerson("19", "Ivy", "Female", 27, "UC Berkeley", "ivy@berkeley.edu", "West", "USA", "Phone", "English");
Profile facultyProfile8 = facultydirectory.newFacultyProfile(prsn19, prsn19.getPersonId(), "Rust", 7);
UserAccount userAcc19 = userAccountDirectory.newUserAccount(prsn19, facultyProfile8, "ivy", "Ivy123", "Student", "Enabled");
 
// Person prsn20
Person prsn20 = personDirectory.newPerson("20", "Jack", "Male", 34, "Harvard", "jack@harvard.edu", "East", "USA", "Phone", "English");
Profile facultyProfile9 = facultydirectory.newFacultyProfile(prsn20, prsn20.getPersonId(), "Kotlin", 8);
UserAccount userAcc20 = userAccountDirectory.newUserAccount(prsn20, facultyProfile9, "jack", "Jack123", "Student", "Enabled");
 
// Person prsn21
Person prsn21 = personDirectory.newPerson("21", "Karen", "Female", 28, "Stanford", "karen@stanford.edu", "West", "USA", "Phone", "English");
Profile facultyProfile10 = facultydirectory.newFacultyProfile(prsn21, prsn21.getPersonId(), "Go", 9);
UserAccount userAcc21 = userAccountDirectory.newUserAccount(prsn21, facultyProfile10, "karen", "Karen123", "Student", "Enabled");
 
// Person prsn22
Person prsn22 = personDirectory.newPerson("22", "Fiona", "Female", 26, "Princeton", "fiona@princeton.edu", "East", "USA", "Phone", "English");
Profile facultyProfile11 = facultydirectory.newFacultyProfile(prsn22, prsn22.getPersonId(), "PHP", 10);
UserAccount userAcc22 = userAccountDirectory.newUserAccount(prsn22, facultyProfile11, "fiona", "Fiona123", "Student", "Enabled");
 
// Person prsn23
Person prsn23 = personDirectory.newPerson("23", "Eva", "Female", 28, "Oxford", "eva@oxford.edu", "South", "UK", "Phone", "English");
Profile facultyProfile12 = facultydirectory.newFacultyProfile(prsn23, prsn23.getPersonId(), "C++", 11);
UserAccount userAcc23 = userAccountDirectory.newUserAccount(prsn23, facultyProfile12, "eva", "Eva123", "Student", "Enabled"); 
    
    }

//    public void insert(JPanel jpanel) {
//
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SplitHomeArea = new javax.swing.JSplitPane();
        actionsidejpanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        UserNameTextField = new javax.swing.JTextField();
        PasswordTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnSignup = new javax.swing.JButton();
        comboRole = new javax.swing.JComboBox<>();
        lbRole = new javax.swing.JLabel();
        CardSequencePanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        actionsidejpanel.setBackground(new java.awt.Color(0, 153, 153));
        actionsidejpanel.setMinimumSize(new java.awt.Dimension(200, 200));

        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("User Name");

        UserNameTextField.setText("admin");

        PasswordTextField.setText("XXXX");
        PasswordTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordTextFieldActionPerformed(evt);
            }
        });

        jLabel2.setText("Password");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("OR");

        btnSignup.setText("Sign Up");
        btnSignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignupActionPerformed(evt);
            }
        });

        comboRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrator", "Student", "Faculty", "Authorizer", "Employer"}));

        lbRole.setText("Role");

        javax.swing.GroupLayout actionsidejpanelLayout = new javax.swing.GroupLayout(actionsidejpanel);
        actionsidejpanel.setLayout(actionsidejpanelLayout);
        actionsidejpanelLayout.setHorizontalGroup(
            actionsidejpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actionsidejpanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(actionsidejpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(actionsidejpanelLayout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSignup, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE))
                    .addGroup(actionsidejpanelLayout.createSequentialGroup()
                        .addGroup(actionsidejpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(comboRole, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PasswordTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UserNameTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbRole, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        actionsidejpanelLayout.setVerticalGroup(
            actionsidejpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actionsidejpanelLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(lbRole)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(4, 4, 4)
                .addComponent(UserNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(PasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(actionsidejpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSignup)
                    .addComponent(jLabel4))
                .addContainerGap(320, Short.MAX_VALUE))
        );

        actionsidejpanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnSignup, jButton1});

        SplitHomeArea.setLeftComponent(actionsidejpanel);

        CardSequencePanel.setLayout(new java.awt.CardLayout());

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 153, 255));
        jLabel3.setText("Education Going Digital .... Info 5100 ");
        CardSequencePanel.add(jLabel3, "card2");

        SplitHomeArea.setRightComponent(CardSequencePanel);

        getContentPane().add(SplitHomeArea, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        // TODO add your handling code here:
        //      WorkAreaJPanel ura = new WorkAreaJPanel(workareajpanl);

        String un = UserNameTextField.getText();
        String pw = PasswordTextField.getText();

        for (UserAccount ua: userAccountDirectory.getUserAccountList())
            {   
                userExist=true;
        if ((comboRole.getSelectedItem().toString()).equals("Administrator") && ua.getRole()=="admin" )
        {
            //System.out.println("1");
            
            if(ua.IsValidUser(un, pw) && ua.getStatus().equals("Enabled"))
                {
                    //System.out.println("2");
                    AdminRoleWorkAreaJPanel adminworkarea=adminworkarea = new AdminRoleWorkAreaJPanel(business, CardSequencePanel, SplitHomeArea, personDirectory, userAccountDirectory, facultydirectory, studentdirectory, tpd,ed);
                    SplitHomeArea.setRightComponent(adminworkarea); 
                    break;
                }
            
            //System.out.println("3");
            
              else if(!ua.IsValidUser(un, pw))
                {
                    JOptionPane.showMessageDialog(this, "Invalid admin credentials");
                    break;
                }
            
            
            
            else if(ua.getStatus().equals("Disabled")){
                
              
                    //System.out.println("4");
            
                   JOptionPane.showMessageDialog(this, "User is Blocked");
                    break;
            
            }
            
            
            

            
        }
        
        else if ((comboRole.getSelectedItem().toString()).equals("Student") && ua.getRole()=="Student")
        {
            if(ua.IsValidUser(un, pw) && ua.getStatus().equals("Enabled"))
                {
                    prsn=ua.getPrsn();
                    this.userAcc=ua;
                    StudentProfile spp = (StudentProfile) ua.getProfile();
                    StudentWorkAreaJPanel studentworkareajpanel = new StudentWorkAreaJPanel(business, spp, CardSequencePanel, courseofferdirectory, SplitHomeArea, courseLoadDirectory, tpa);
                    SplitHomeArea.setRightComponent(studentworkareajpanel);
                    break;
                }
            
            
            
             else if(!ua.IsValidUser(un, pw) )
                {
                    userExist=false;
                }
            
            
             else if(ua.getStatus().equals("Disabled")){
                    //System.out.println("4");
            
                   JOptionPane.showMessageDialog(this, "User is Blocked");
                    break;
            
            }
            

            
        }
        
        else if ((comboRole.getSelectedItem().toString()).equals("Faculty") && ua.getRole()=="Faculty")
        {
            if(ua.IsValidUser(un, pw) && ua.getStatus().equals("Enabled"))
                {
                    System.out.println(ua);
                    prsn=ua.getPrsn();
                    this.userAcc=ua;
                    FacultyProfile spp = (FacultyProfile) ua.getProfile();
                    FacultyWorkAreaJPanel facultyworkarea = new FacultyWorkAreaJPanel(SplitHomeArea, spp, coursedirectory, courseofferdirectory,courseLoadDirectory);
                    SplitHomeArea.setRightComponent(facultyworkarea);
                    break;
                }
            
            
             
              else if(!ua.IsValidUser(un, pw))
                {
                    userExist=false;
                }
            
            else if(ua.getStatus().equals("Disabled")){
                 
                    //System.out.println("4");
            
                   JOptionPane.showMessageDialog(this, "User is Blocked");
                    break;
            
            }
            
        }
        
        else if ((comboRole.getSelectedItem().toString()).equals("Authorizer") && ua.getRole()=="Authorizer")
        {
            if(ua.IsValidUser(un, pw) && ua.getStatus().equals("Enabled"))
                {
                    System.out.println(ua);
                    prsn=ua.getPrsn();
                    this.userAcc=ua;
                    ThirdPartyProfile tpp = (ThirdPartyProfile) ua.getProfile();
                    ThirdPartyWorkAreaJPanel tpworkarea = new ThirdPartyWorkAreaJPanel(SplitHomeArea, tpp, tpa);
                    SplitHomeArea.setRightComponent(tpworkarea);
                    break;
                }
            
            
             
              else if(!ua.IsValidUser(un, pw))
                {
                    userExist=false;
                }
            
            else if(ua.getStatus().equals("Disabled")){
                 
                    //System.out.println("4");
            
                   JOptionPane.showMessageDialog(this, "User is Blocked");
                    break;
            
            }
            
        }
        
        else if ((comboRole.getSelectedItem().toString()).equals("Employer") && ua.getRole()=="Employer")
        {
            if(ua.IsValidUser(un, pw) && ua.getStatus().equals("Enabled"))
                {
                    System.out.println(ua);
                    prsn=ua.getPrsn();
                    this.userAcc=ua;
                    EmployerProfile ep = (EmployerProfile) ua.getProfile();
                    EmployerWorkAreaJPanel empworkarea = new EmployerWorkAreaJPanel(SplitHomeArea,ep, tpa);
                    SplitHomeArea.setRightComponent(empworkarea);
                    break;
                }
            
            
             
              else if(!ua.IsValidUser(un, pw))
                {
                    userExist=false;
                }
            
            else if(ua.getStatus().equals("Disabled")){
                 
                    //System.out.println("4");
            
                   JOptionPane.showMessageDialog(this, "User is Blocked");
                    break;
            
            }
            
        }
        
        else
            userExist = false;
            }
            

        if (userExist == false) {
            JOptionPane.showMessageDialog(this, "Invalid user credentials");
        }

//        UserAccountDirectory uad = business.getUserAccountDirectory();
//        //System.out.println(uad);
//        UserAccount useraccount = uad.AuthenticateUser(un, pw);
//        System.out.println(useraccount);
//        if (useraccount == null) {
//            return;
//        }
//        StudentWorkAreaJPanel studentworkareajpanel;
//        FacultyWorkAreaJPanel facultyworkarea;
//        AdminRoleWorkAreaJPanel adminworkarea;
//        String r = useraccount.getRole();
//        Profile profile = useraccount.getAssociatedPersonProfile();
//        //       if (r.equalsIgnoreCase("sales")) {
//
//        if (profile instanceof EmployeeProfile) {
//
//            adminworkarea = new AdminRoleWorkAreaJPanel(business, CardSequencePanel, SplitHomeArea, personDirectory, userAccountDirectory);
//            SplitHomeArea.setRightComponent(adminworkarea);
//            //CardSequencePanel.removeAll();
//            //CardSequencePanel.add("Admin", adminworkarea);
//            //((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
//
//        }
//        
//        if (profile instanceof StudentProfile) {
//
//            StudentProfile spp = (StudentProfile) profile;
//            studentworkareajpanel = new StudentWorkAreaJPanel(business, spp, CardSequencePanel, userAccountDirectory,SplitHomeArea );
//            CardSequencePanel.removeAll();
//            CardSequencePanel.add("student", studentworkareajpanel);
//            ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
//
//        }
//        if (profile instanceof FacultyProfile) {
//            facultyworkarea = new FacultyWorkAreaJPanel(business, CardSequencePanel, SplitHomeArea, (FacultyProfile) profile);
//            CardSequencePanel.removeAll();
//            CardSequencePanel.add("faculty", facultyworkarea);
//            ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
//
//        }

    }//GEN-LAST:event_LoginButtonActionPerformed

    private void PasswordTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordTextFieldActionPerformed

    private void btnSignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignupActionPerformed
        // TODO add your handling code here:

        
          //Signup1JPanel sjpl1 = new Signup1JPanel( SplitHomeArea, personDirectory);
          //splitPane.setRightComponent(sjpl1);
        
            Signup1JPanel sjpl1;
            sjpl1 = new Signup1JPanel(business, CardSequencePanel, SplitHomeArea, personDirectory,prsn, userAccountDirectory,facultydirectory,studentdirectory, userAcc, tpd);
            SplitHomeArea.setRightComponent(sjpl1);
        
            //CardSequencePanel.removeAll();
            //CardSequencePanel.add("Signup1", sjpl1);
            //((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);

    }//GEN-LAST:event_btnSignupActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProfileWorkAreaMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProfileWorkAreaMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProfileWorkAreaMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProfileWorkAreaMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProfileWorkAreaMainFrame(false).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CardSequencePanel;
    private javax.swing.JTextField PasswordTextField;
    private javax.swing.JSplitPane SplitHomeArea;
    private javax.swing.JTextField UserNameTextField;
    private javax.swing.JPanel actionsidejpanel;
    private javax.swing.JButton btnSignup;
    private javax.swing.JComboBox<String> comboRole;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbRole;
    // End of variables declaration//GEN-END:variables
}
