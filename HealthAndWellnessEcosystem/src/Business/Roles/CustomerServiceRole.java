/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Roles;

import Business.Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UI.Business.CustomerServiceRole.CustomerServiceWorkAreaJPanel;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

/**
 *
 * @author palsa
 */
public class CustomerServiceRole extends Role {
    
    public CustomerServiceRole(){
        this.type = RoleType.CustomerService;
    }

    @Override
    public JPanel createWorkArea(JSplitPane splitPane, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
        return new CustomerServiceWorkAreaJPanel( splitPane,  account,  organization,  enterprise,  system);
    }
}
