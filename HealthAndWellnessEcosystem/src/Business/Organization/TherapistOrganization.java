/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Roles.Role;
import Business.Roles.SportsBrandSupplierRole;
import Business.Roles.TherapistRole;
import java.util.ArrayList;

/**
 *
 * @author palsa
 */
public class TherapistOrganization extends Organization {
 
    public TherapistOrganization() {
        super(Type.Therapist.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new TherapistRole());
        return roles;
    }
}
