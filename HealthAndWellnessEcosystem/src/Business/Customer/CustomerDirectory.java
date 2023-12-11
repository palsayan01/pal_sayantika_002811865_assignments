/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Customer;

import java.util.ArrayList;

/**
 *
 * @author palsa
 */
public class CustomerDirectory {
      private ArrayList<Customer> customerList;
      Customer customer;

    public CustomerDirectory() {
        customerList = new ArrayList();
    }
    
    public Customer createCustomer(String name, int age, String email) {
        
        Customer customer=new Customer(name, age, email);
        customerList.add(customer);
        return customer;
        
    }
    
    public boolean findCustomer(Customer c)
    {
        boolean flag=false;
        for (Customer cust: customerList)
        {
            if(cust.getId()==c.getId())
            flag=true;
            break;
        }
        return flag;
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

   
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

   
}
