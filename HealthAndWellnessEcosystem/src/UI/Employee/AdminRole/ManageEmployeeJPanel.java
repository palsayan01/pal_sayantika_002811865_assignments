/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Employee.AdminRole;

import Business.Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.UserAccount.UserAccount;
import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author anupb
 */
public class ManageEmployeeJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageEmployeeJPanel
     */
    
    JSplitPane splitPanel;
    EcoSystem business;
    Enterprise enterprise;
    UserAccount account;
    private OrganizationDirectory organizationDir;
    
    public ManageEmployeeJPanel(JSplitPane splitPanel, EcoSystem business,  Enterprise enterprise,UserAccount account, OrganizationDirectory organizationDir) {
        initComponents();
        
        this.splitPanel = splitPanel;
        this.business = business;
        this.enterprise = enterprise;
        this.account = account;
        this.organizationDir = organizationDir;
        
        populateOrganizationComboBox();
        populateOrganizationEmpComboBox();
        //populateOrganizationNameComboBox(Organization organization);
                      
    }   

    
        public void populateOrganizationComboBox(){
        cmbOrg.removeAllItems();
        
        for (Organization organization : organizationDir.getOrganizationList()){
            cmbOrg.addItem(organization);
        }
    }
    
    public void populateOrganizationEmpComboBox(){
        cmborgEmp.removeAllItems();
        
        for (Organization organization : organizationDir.getOrganizationList()){
            cmborgEmp.addItem(organization);
        }
    }

    public void populateOrganizationNameComboBox(Organization organization){
        cmborgName.removeAllItems();
        
            cmborgName.addItem(organization.getOrgName());
        
    }
    private void populateTable(Organization organization){
        DefaultTableModel model = (DefaultTableModel) tblOrg.getModel();
        
        model.setRowCount(0);
        
        for (Employee employee : organization.getEmployeeDirectory().getEmployeeList()){
            Object[] row = new Object[2];
            row[0] = employee.getId();
            row[1] = employee.getName();
            model.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrg = new javax.swing.JTable();
        btnCreatee = new javax.swing.JButton();
        cmbOrg = new javax.swing.JComboBox();
        lblOrg = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        cmborgEmp = new javax.swing.JComboBox();
        lblSelOrganization = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        cmborgName = new javax.swing.JComboBox();
        lblSelOrgName = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        tblOrg.setForeground(new java.awt.Color(36, 47, 65));
        tblOrg.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Employee ID", "Employee Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblOrg);

        btnCreatee.setBackground(new java.awt.Color(102, 153, 255));
        btnCreatee.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCreatee.setForeground(new java.awt.Color(255, 255, 255));
        btnCreatee.setText("Create Employee");
        btnCreatee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateeActionPerformed(evt);
            }
        });

        cmbOrg.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbOrg.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbOrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbOrgActionPerformed(evt);
            }
        });

        lblOrg.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblOrg.setText("Organization:");

        lblName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblName.setText("Employee Name:");

        cmborgEmp.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmborgEmp.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmborgEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmborgEmpActionPerformed(evt);
            }
        });

        lblSelOrganization.setBackground(new java.awt.Color(0, 0, 0));
        lblSelOrganization.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblSelOrganization.setText("Select organization to add new employee in:");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Employee");

        btnBack.setBackground(new java.awt.Color(102, 153, 255));
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        cmborgName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmborgName.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmborgName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmborgNameActionPerformed(evt);
            }
        });

        lblSelOrgName.setBackground(new java.awt.Color(0, 0, 0));
        lblSelOrgName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblSelOrgName.setText("Organization Name:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSelOrgName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmborgName, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSelOrganization)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmborgEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblOrg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbOrg, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98)))
                .addGap(0, 44, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnCreatee)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbOrg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOrg))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmborgEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSelOrganization))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmborgName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSelOrgName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCreatee, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnBack, btnCreatee});

    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateeActionPerformed
        Organization organization = (Organization) cmborgEmp.getSelectedItem();
        String name = txtName.getText();
        if(name.equals("")){
            JOptionPane.showMessageDialog(null, "Please enter a name", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        organization.getEmployeeDirectory().createEmployee(name);
        populateTable(organization);
        //store data in database
        //dB4OUtil.storeSystem(system);
        txtName.setText("");
        JOptionPane.showMessageDialog(null, "Employee created");

    }//GEN-LAST:event_btnCreateeActionPerformed

    private void cmbOrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbOrgActionPerformed
        Organization organization = (Organization) cmbOrg.getSelectedItem();
        if (organization != null){
            populateTable(organization);
        }
    }//GEN-LAST:event_cmbOrgActionPerformed

    private void cmborgEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmborgEmpActionPerformed
        // TODO add your handling code here:
        Organization organization = (Organization) cmborgEmp.getSelectedItem();
        if (organization != null){
            populateOrganizationNameComboBox(organization);
    }//GEN-LAST:event_cmborgEmpActionPerformed
    }
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        
        AdminWorkAreaJPanel awjpl = new AdminWorkAreaJPanel(splitPanel,business,enterprise,account);
        splitPanel.setRightComponent(awjpl);
        
    }//GEN-LAST:event_btnBackActionPerformed

    private void cmborgNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmborgNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmborgNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreatee;
    private javax.swing.JComboBox cmbOrg;
    private javax.swing.JComboBox cmborgEmp;
    private javax.swing.JComboBox cmborgName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblOrg;
    private javax.swing.JLabel lblSelOrgName;
    private javax.swing.JLabel lblSelOrganization;
    private javax.swing.JTable tblOrg;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}