/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Customer.CustomerDirectory;
import Business.Organization.Organization.Type;
import Business.Roles.CustomerRole;
import Business.Roles.NutritionSupplierRole;
import Business.Roles.Role;
import Business.Supplier.Product;
import Business.Supplier.ProductCatalog;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author palsa
 */
public class NutritionSupplierOrganization extends Organization {

    ProductCatalog productcatalog;
    CustomerDirectory customerDirectory;
    HashMap<Integer, ArrayList<Product>> orgProdCombo;

    public NutritionSupplierOrganization() {
        super(Type.NutritionSupplier.getValue());
        productcatalog = new ProductCatalog();
        customerDirectory = new CustomerDirectory();
        orgProdCombo=new HashMap();
    }

    public ProductCatalog getProductcatalog() {
        return productcatalog;
    }

    public void setProductcatalog(ProductCatalog productcatalog) {
        this.productcatalog = productcatalog;
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new NutritionSupplierRole());
        return roles;
    }
    
    public HashMap<Integer, ArrayList<Product>> getOrgProdCombo() {
        return orgProdCombo;
    }

    public void setOrgProdCombo(HashMap<Integer, ArrayList<Product>> orgProdCombo) {
        this.orgProdCombo = orgProdCombo;
    }
}
