/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Roles.CustomerServiceRole;
import Business.Roles.FitnessTrainerRole;
import Business.Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author palsa
 */
public class FitnessTrainersOrganization extends Organization {
    
    public FitnessTrainersOrganization() {
        super(Type.FitnessTrainer.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new FitnessTrainerRole());
        return roles;
    }
    
}
