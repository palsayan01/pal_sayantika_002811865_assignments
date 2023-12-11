/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Roles;

import Business.Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

/**
 *
 * @author palsa
 */
public abstract class Role {
    
    public enum RoleType{
        SysAdmin("System Admin"),
        CustomerService("Customer Service Representative"),
        Customer("Customer"),
        Nutritionist("Nutritionist - Nutrition Enterprise"),
        NutritionSupplier("Nutrition products supplier - Nutrition Enterprise"),
        PharmaSupplier("Pharmaceutical products supplier - Pharmaceutical Enterprise"),
        FitnessTrainer("Fitness Trainer - Health Training Enterprise"),
        Therapist("Therapist - Health Training Enterprise"),
        RehabCenterMgr("Rehabilitation center manager - Health Training Enterprise"),
        Recruiter("Recruiter - Recruitment Enterprise"),
        SportsBrandSupplier("Fitness product supplier - Fitness Goods Enterprise");
        
        private String value;
        
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public RoleType type;
    public abstract JPanel createWorkArea(JSplitPane splitPane, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business);
    
    @Override
    public String toString() {
        return (type != null) ? this.type.getValue() : this.getClass().getName();
    }  
    
    
}
