/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Supplier;

import java.util.ArrayList;

/**
 *
 * @author palsa
 */
public class ProductCatalog {
    
    private ArrayList<Product> productCatalog;
    Product product;
    
    public ProductCatalog() {
        productCatalog = new ArrayList<Product>();
    }

    public ArrayList<Product> getProductCatalog() {
        return productCatalog;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    
    public Product addProduct() {
        Product p = new Product();
        productCatalog.add(p);
        return p;
    }
    
    public void removeProduct(Product p) {
        productCatalog.remove(p);
    }
    
    public Product searchProduct(int id) {

        for(Product p : productCatalog) {
            if(p.getId() == id) {
                return p;
            }
        }
        return null;
    }
    
    public int getProductCount(){
        return productCatalog.size();
    }
    
        public boolean isProductNameUnique(String productName) {
        for (Product p : productCatalog) {
            if (p.getName().equalsIgnoreCase(productName)) {
                return false; // Product with the same name already exists
            }
        }
        return true; // Product name is unique
    }
}
