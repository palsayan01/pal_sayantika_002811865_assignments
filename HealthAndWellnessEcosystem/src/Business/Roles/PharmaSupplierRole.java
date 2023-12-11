/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Roles;

import Business.Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.PharmaSupplierOrganization;
import Business.UserAccount.UserAccount;
import UI.Enterprise.PharmacyMgrRole.PharmaSupplierWorkAreaJPanel;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

/**
 *
 * @author palsa
 */
public class PharmaSupplierRole extends Role {
  
    public PharmaSupplierRole(){
        this.type = RoleType.PharmaSupplier;
    }

    @Override
    public JPanel createWorkArea(JSplitPane splitPane, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new PharmaSupplierWorkAreaJPanel(splitPane, account,organization,enterprise,business);
    }
}
