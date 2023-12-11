/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Business;

import Business.Customer.CustomerDirectory;
import Business.Network.EnterpriseNetwork;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Roles.NetworkAdmin;
import Business.Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author palsa
 */
public class EcoSystem extends Organization {

    private static EcoSystem business;
    private ArrayList<EnterpriseNetwork> networkList;
    private OrganizationDirectory organizationDirectory;
    private EnterpriseNetwork network;
    private CustomerDirectory custdirectory;
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
    
    public EnterpriseNetwork createAndAddNetwork(){
        EnterpriseNetwork network=new EnterpriseNetwork();
        networkList.add(network);
        return network;
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new NetworkAdmin());
        return roleList;
    }
    public EcoSystem(){
        super(null);
        networkList=new ArrayList<EnterpriseNetwork>();
        organizationDirectory=new OrganizationDirectory();
        custdirectory=new CustomerDirectory();
    }

    public ArrayList<EnterpriseNetwork> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<EnterpriseNetwork> networkList) {
        this.networkList = networkList;
    }
    
    public EnterpriseNetwork findNetwork(String name)
    {
        for(EnterpriseNetwork en: networkList)
        {
            if(en.getName().equals(name))
              network=en;  
        }
        return network;
    }
    
//    public boolean checkIfUserIsUnique(String userName){
//        if(!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)){
//            return false;
//        }
//        for(Network network:networkList){
//            
//        }
//        return true;
//    }
    
    
    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public void setOrganizationDirectory(OrganizationDirectory organizationDirectory) {
        this.organizationDirectory = organizationDirectory;
    }

    public CustomerDirectory getCustdirectory() {
        return custdirectory;
    }

    public void setCustdirectory(CustomerDirectory custdirectory) {
        this.custdirectory = custdirectory;
    }
    
    
    
}
