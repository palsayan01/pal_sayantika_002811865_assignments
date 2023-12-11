/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Roles.CustomerRole;
import Business.Roles.RecruiterRole;
import Business.Roles.RehabMgrRole;
import Business.Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author palsa
 */
public class RecruitmentOrganization extends Organization {
    
    public RecruitmentOrganization() {
        super(Type.Recruitment.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new RecruiterRole());
        return roles;
    }
}
