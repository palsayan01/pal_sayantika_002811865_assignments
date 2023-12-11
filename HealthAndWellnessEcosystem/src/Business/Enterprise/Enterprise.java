/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import Business.Network.EnterpriseNetwork;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author palsa
 */
public abstract class Enterprise extends Organization {
    
    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    private EnterpriseNetwork network;

    public EnterpriseNetwork getNetwork() {
        return network;
    }

    public void setNetwork(EnterpriseNetwork network) {
        this.network = network;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }
    
    
    public enum EnterpriseType{
        FitnessGoodsEnterprise("FitnessGoodsEnterprise") , HealthTrainingEnterprise("HealthTrainingEnterprise") , NutritionEnterprise("NutritionEnterprise") , PharmaceuticalEnterprise("PharmaceuticalEnterprise") , RecruitmentEnterprise("RecruitmentEnterprise");
        
        private String value;
        
        private EnterpriseType(String value){
            this.value=value;
        }
        public String getValue() {
            return value;
        }
        public void setValue(String value)
        {
           this.value=value; 
           
        }
        @Override
        public String toString(){
        return value;
    }
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }
    
    public Enterprise(String name,EnterpriseType type, EnterpriseNetwork network){
        super(name);
        this.enterpriseType=type;
        this.network = network;
        organizationDirectory=new OrganizationDirectory();
    }
}
