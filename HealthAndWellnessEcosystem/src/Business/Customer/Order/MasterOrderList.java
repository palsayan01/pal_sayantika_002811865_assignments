/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Customer.Order;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author palsa
 */
public class MasterOrderList {
    UserAccount account;
     
    ArrayList<Order>orderList;

    public MasterOrderList(UserAccount account) {
        this.account=account;
        orderList= new ArrayList<Order>();
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }
    
    public void addNewOrder(Order order){
        this.orderList.add(order);
    }
    
}
