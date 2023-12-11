/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Roles;

import Business.Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UI.Enterprise.SportsApparelMgrRole.SportsBrandSupplierWorkAreaJPanel;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

/**
 *
 * @author palsa
 */
public class SportsBrandSupplierRole extends Role {

    public SportsBrandSupplierRole(){
        this.type = RoleType.SportsBrandSupplier;
    }
    @Override
     public JPanel createWorkArea(JSplitPane splitPane, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new SportsBrandSupplierWorkAreaJPanel(splitPane, account,organization,enterprise,business);
  
    }
   
    
}
