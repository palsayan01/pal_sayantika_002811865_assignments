/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Business;

import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.EnterpriseNetwork;
import Business.Organization.Organization;
import Business.Roles.AdminRole;
import Business.Roles.CustomerRole;
import Business.Roles.CustomerServiceRole;
import Business.Roles.FitnessTrainerRole;
import Business.Roles.NutritionSupplierRole;
import Business.Roles.NutritionistRole;
import Business.Roles.PharmaSupplierRole;
import Business.Roles.SportsBrandSupplierRole;
import Business.Roles.SuperAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author palsa
 */
public class ConfigureABusiness {

    public static EcoSystem configure() {

        EcoSystem system = EcoSystem.getInstance();
        EnterpriseNetwork network = system.createAndAddNetwork();
        // Set a name for the network
network.setName("HealthWellnessNetwork");
 
// Create and add a Pharmaceutical Enterprise to the network
Enterprise enterprise1 = network.getEnterpriseDirectory().createAndAddEnterprise("PharmaEnterprise", Enterprise.EnterpriseType.PharmaceuticalEnterprise, network);
Organization organization = enterprise1.getOrganizationDirectory().createOrganization(Organization.Type.PharmaSupplier,"PharmaSupplierOrganization");
Employee emp1 = organization.getEmployeeDirectory().createEmployee("John Doe");
UserAccount ua1 = organization.getUserAccountDirectory().createUserAccount("John", "John@1234", emp1, new PharmaSupplierRole());
Employee emp2 = organization.getEmployeeDirectory().createEmployee("Jane Smith");
UserAccount ua2 = organization.getUserAccountDirectory().createUserAccount("Jane", "Jane@1234", emp1, new PharmaSupplierRole());
Employee empp1 = enterprise1.getEmployeeDirectory().createEmployee("PharmaSupplierAdmin");
UserAccount uaa1 = enterprise1.getUserAccountDirectory().createUserAccount("PharmaAdmin", "Pharma@1234", empp1, new AdminRole());
 
 
// Create and add a Fitness Goods Enterprise to the network
Enterprise enterprise2 = network.getEnterpriseDirectory().createAndAddEnterprise("SportsApparelEnterprise", Enterprise.EnterpriseType.FitnessGoodsEnterprise, network);
Organization organization2 = enterprise2.getOrganizationDirectory().createOrganization(Organization.Type.SportBrandSupplier,"SportsBrandSupplierOrganization");
Employee emp3 = organization2.getEmployeeDirectory().createEmployee("SportBrandSupplier");
UserAccount ua3 = organization2.getUserAccountDirectory().createUserAccount("SportGear", "Gear@1234", emp3, new SportsBrandSupplierRole());
Employee emp4 = organization2.getEmployeeDirectory().createEmployee("SportBrandSupplier");
UserAccount ua4 = organization2.getUserAccountDirectory().createUserAccount("SportsHaven", "Haven@1234", emp4, new SportsBrandSupplierRole());
Employee empp2 = enterprise2.getEmployeeDirectory().createEmployee("SportBrandAdmin");
UserAccount uaa2 = enterprise2.getUserAccountDirectory().createUserAccount("SportBrandAdmin", "SportBrand@1234", empp2, new AdminRole());
 
// Create and add a Nutrition Enterprise to the network
Enterprise enterprise3 = network.getEnterpriseDirectory().createAndAddEnterprise("NutritionEnterprise", Enterprise.EnterpriseType.NutritionEnterprise, network);
Organization organization3 = enterprise3.getOrganizationDirectory().createOrganization(Organization.Type.NutritionSupplier,"NutritionSupplierOrganization");
Employee emp5 = organization3.getEmployeeDirectory().createEmployee("NutritionSupplier");
UserAccount ua5 = organization3.getUserAccountDirectory().createUserAccount("NutriStore", "Nutri@1234", emp5, new NutritionSupplierRole());
Employee emp6 = organization3.getEmployeeDirectory().createEmployee("NutritionSupplier");
UserAccount ua6 = organization3.getUserAccountDirectory().createUserAccount("HealthyBites", "Healthy@1234", emp6, new NutritionSupplierRole());
Employee empp3 = enterprise3.getEmployeeDirectory().createEmployee("NutritionAdmin");
UserAccount uaa3 = enterprise3.getUserAccountDirectory().createUserAccount("NutritionAdmin", "Nutrition@1234", empp3, new AdminRole());
 
 
// Create and add a Nutritionist for the Nutrition Enterprise
Organization organization4 = enterprise3.getOrganizationDirectory().createOrganization(Organization.Type.Nutritionist, "NutritionistOrganization");
Employee emp7 = organization4.getEmployeeDirectory().createEmployee("Nutritionist");
UserAccount ua7 = organization4.getUserAccountDirectory().createUserAccount("WellnessGuru", "Wellness@123", emp7, new NutritionistRole());
Employee emp8 = organization4.getEmployeeDirectory().createEmployee("Nutritionist");
UserAccount ua8 = organization4.getUserAccountDirectory().createUserAccount("NutriExpert", "Nutri@123", emp8, new NutritionistRole());
 
 
// Create and add a Health Training Enterprise to the network
Enterprise enterprise4 = network.getEnterpriseDirectory().createAndAddEnterprise("HealthTrainingEnterprise", Enterprise.EnterpriseType.HealthTrainingEnterprise, network);
Organization organization5 = enterprise4.getOrganizationDirectory().createOrganization(Organization.Type.FitnessTrainer, "FitnessTrainersOrganization");
Employee emp9 = organization5.getEmployeeDirectory().createEmployee("FitnessTrainer");
UserAccount ua9 = organization5.getUserAccountDirectory().createUserAccount("FitProTrainer", "Fit@1234", emp9, new FitnessTrainerRole());
Employee emp10 = organization5.getEmployeeDirectory().createEmployee("FitnessTrainer");
UserAccount ua10 = organization5.getUserAccountDirectory().createUserAccount("EnergyBoost", "Energy@1234", emp10, new FitnessTrainerRole());
Employee empp4 = enterprise4.getEmployeeDirectory().createEmployee("FitnessAdmin");
UserAccount uaa4 = enterprise4.getUserAccountDirectory().createUserAccount("FitnessAdminAdmin", "Fitness@1234", empp4, new AdminRole());
        
        //Customer and Customer service account creation
        Organization orgn2 = system.getOrganizationDirectory().createOrganization(Organization.Type.Customer, "Customer");
        //orgn2.setName("Customer");
        CustomerDirectory custlist = new CustomerDirectory();
        Customer customer = custlist.createCustomer("Sayan", 26, "pal.sayan@gmail.com");
        UserAccount us2 = orgn2.getUserAccountDirectory().createUserAccount("customer", "Cust@12345", new CustomerRole());
        us2.setCustomer(customer);
        Organization orgn3 = system.getOrganizationDirectory().createOrganization(Organization.Type.CustomerService,"CSR");
        orgn3.setName("CustomerService");
        UserAccount us3=orgn3.getUserAccountDirectory().createUserAccount("csr", "csr", new CustomerServiceRole());
        //UserAccount us3 = system.getUserAccountDirectory().createUserAccount("csr", "csr", new CustomerServiceRole());
        Employee empcsr = orgn3.getEmployeeDirectory().createEmployee("CSR");
        us3.setEmployee(emp2);

            Employee employee1 = system.getEmployeeDirectory().createEmployee("superadmin");
        //Employee employee2 = system.getEmployeeDirectory().createEmployee("csr");
        //Employee employee3 = system.getEmployeeDirectory().createEmployee("pharmasupplier");
        //Employee employee4 = system.getEmployeeDirectory().createEmployee("sportssupplier");

        UserAccount usuperadmin = system.getUserAccountDirectory().createUserAccount("superadmin", "superadmin", employee1, new SuperAdminRole());
        //UserAccount ua2 = system.getUserAccountDirectory().createUserAccount("csr", "csr", employee2, new CustomerServiceRole());
        //UserAccount ua3 = system.getUserAccountDirectory().createUserAccount("psr", "psr", employee3, new PharmaSupplierRole());
        //UserAccount ua4 = system.getUserAccountDirectory().createUserAccount("sbr", "sbr", employee4, new SportsBrandSupplierRole());
        return system;
    }
}
