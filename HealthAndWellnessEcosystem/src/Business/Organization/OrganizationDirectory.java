/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import java.util.ArrayList;

/**
 *
 * @author palsa
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;
    Organization orgn;
    
    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Organization.Type type, String orgName){
        Organization organization = null;
        if (type.getValue().equals(Organization.Type.Customer.getValue())){
            organization = new CustomerOrganization();
            organization.setOrgName(orgName);
            organizationList.add(organization);
        }
        else if(type.getValue().equals(Organization.Type.FitnessTrainer.getValue())){
            organization = new FitnessTrainersOrganization();
            organization.setOrgName(orgName);
            organizationList.add(organization);
        }
        else if(type.getValue().equals(Organization.Type.NutritionSupplier.getValue())){
            organization = new NutritionSupplierOrganization();
            organization.setOrgName(orgName);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Nutritionist.getValue())){
            organization = new NutritionistOrganization();
            organization.setOrgName(orgName);
            organizationList.add(organization);
        }else if (type.getValue().equals(Organization.Type.PharmaSupplier.getValue())){
            organization = new PharmaSupplierOrganization();
            organization.setOrgName(orgName);
            organizationList.add(organization);
        }else if (type.getValue().equals(Organization.Type.Recruitment.getValue())){
            organization = new RecruitmentOrganization();
            organization.setOrgName(orgName);
            organizationList.add(organization);
        }else if (type.getValue().equals(Organization.Type.Rehabilitation.getValue())){
            organization = new RehabilitationOrganization();
            organization.setOrgName(orgName);
            organizationList.add(organization);
        }else if (type.getValue().equals(Organization.Type.SportBrandSupplier.getValue())){
            organization = new SportsBrandSupplierOrganization();
            organization.setOrgName(orgName);
            organizationList.add(organization);
        }else if (type.getValue().equals(Organization.Type.Therapist.getValue())){
            organization = new TherapistOrganization();
            organization.setOrgName(orgName);
            organizationList.add(organization);
        }else if (type.getValue().equals(Organization.Type.CustomerService.getValue())){
            organization = new CustomerServiceOrganization();
            organization.setOrgName(orgName);
            organizationList.add(organization);
        }
        return organization;
    }
    
    public Organization findOrganization(Organization.Type type) {
        for (Organization organization: organizationList)
        {
            if (type.getValue().equals("CustomerService"))
             orgn=organization;   
            
            else if (type.getValue().equals("Customer"))
                orgn=organization;
            
            break;
        }
        return orgn;
    }
}
