/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Organization.CustomerRole;

import Business.Business.EcoSystem;
import Business.Customer.Customer;
import Business.Customer.Order.MasterOrderList;
import Business.Customer.Order.Order;
import Business.Customer.Order.OrderItem;
import Business.Enterprise.Enterprise;
import Business.Network.EnterpriseNetwork;
import Business.Organization.NutritionSupplierOrganization;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Organization.PharmaSupplierOrganization;
import Business.Organization.SportsBrandSupplierOrganization;
import Business.Supplier.Product;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author palsa
 */
public class ShopEssentialsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ShopEssentialsJPanel
     */
    private UserAccount account;
    private JSplitPane splitPane;
    private EcoSystem system;
    EnterpriseNetwork network;
    Enterprise enterprise;
    Organization organization;
    MasterOrderList masterOrderList;
    Order currentOrder;
    PharmaSupplierOrganization porgn;
    NutritionSupplierOrganization norgn;
    SportsBrandSupplierOrganization sorgn;
    public ShopEssentialsJPanel(JSplitPane splitPane, UserAccount account, Organization organization, EcoSystem system) {
        initComponents();
        this.splitPane=splitPane;
        this.account=account;
        this.system=system;
        this.currentOrder = new Order();
        popNetworkComboBox();
    }
    
    public void popNetworkComboBox() {
        cmbNetwork.removeAllItems();

        for (EnterpriseNetwork network : system.getNetworkList()) {
            cmbNetwork.addItem(network.getName());
        }
    }
        
    public void populateEnterpriseComboBox(String name)
    {
      cmbEntType.removeAllItems();
      for(EnterpriseNetwork network: system.getNetworkList())
      {
          if (network.getName().equals(name))
          {
             this.network=network;
                break; 
          }
              
      }
      
      for(Enterprise enterprise: network.getEnterpriseDirectory().getEnterpriseList())
          cmbEntType.addItem(enterprise.getName());
      
    }
    
    public void populateOrganizationComboBox(String name)
    {
        cmbOrg.removeAllItems();
        
        for(Enterprise ent: this.network.getEnterpriseDirectory().getEnterpriseList())
      {
          if (ent.getName().equals(name))
          {
             this.enterprise=ent;
                break; 
          }
              
      }   
      
      for(Organization org: this.enterprise.getOrganizationDirectory().getOrganizationList()) {
          {
             System.out.println("Cmb org drop down values:"+org.getOrgName());
             cmbOrg.addItem(org.getOrgName()); 
          }
      }
               
    }
    
    public void populateProductList(String orgname, String ent)
    {
        //cmbOrg.removeAllItems();
        
         for(Enterprise var: network.getEnterpriseDirectory().getEnterpriseList())
      {
          if (var.getName().equals(ent))
          {
             this.enterprise=var;
                break; 
          }
              
      }
        for(Organization org: enterprise.getOrganizationDirectory().getOrganizationList())
      {
          System.out.println("Inside product table pop:"+org.getName());
          
          if (org.getOrgName().equals(orgname))
              
          {
              if(org instanceof PharmaSupplierOrganization)
              {
                  porgn= (PharmaSupplierOrganization) org;
                  //this.organization=porgn;
                  populateTable(porgn);
                  break;
                  
              }
              
              if(org instanceof SportsBrandSupplierOrganization)
              {
                 sorgn=(SportsBrandSupplierOrganization) org;
                 //this.organization=orgn;   
                 populateTable(sorgn);
                 break; 
              }
              
              if(org instanceof NutritionSupplierOrganization)
              {
                  norgn=(NutritionSupplierOrganization) org;
                  //this.organization=orgn;   
                  populateTable(norgn);
                  break; 
              }
              
//              else
//                  JOptionPane.showMessageDialog(this, "No products sold by this organization", "Warning", JOptionPane.WARNING_MESSAGE);
//             
          }
            
       }
    }
    
    public void populateTable(Organization org)
    {
        
        if(org instanceof PharmaSupplierOrganization)
        {
           PharmaSupplierOrganization orgn=(PharmaSupplierOrganization) org;
           DefaultTableModel model = (DefaultTableModel) tblProductCatalog.getModel();
           model.setRowCount(0);
           for(Product product: orgn.getProductcatalog().getProductCatalog())
           {
               System.out.println(product);
                Object row[] = new Object[6];
                row[0] = product;
                row[1] = product.getId();
                row[2] = product.getDescription();
                row[3] = product.getPrice();
                row[4] = product.getAvail();
                row[5] = orgn;

                model.addRow(row);
         
           }
        }
        
        
        if(org instanceof SportsBrandSupplierOrganization)
        {
           SportsBrandSupplierOrganization orgn=(SportsBrandSupplierOrganization) org;
           DefaultTableModel model = (DefaultTableModel) tblProductCatalog.getModel();
           model.setRowCount(0);
           for(Product product: orgn.getProductcatalog().getProductCatalog())
           {
               System.out.println(product);
                Object row[] = new Object[6];
                row[0] = product;
                row[1] = product.getId();
                row[2] = product.getDescription();
                row[3] = product.getPrice();
                row[4] = product.getAvail();
                row[5] = orgn;

                model.addRow(row);
         
           }
        }
        
        if(org instanceof NutritionSupplierOrganization)
        {
           NutritionSupplierOrganization orgn=(NutritionSupplierOrganization) org;
           DefaultTableModel model = (DefaultTableModel) tblProductCatalog.getModel();
           model.setRowCount(0);
           for(Product product: orgn.getProductcatalog().getProductCatalog())
           {
               System.out.println(product);
                Object row[] = new Object[6];
                row[0] = product;
                row[1] = product.getId();
                row[2] = product.getDescription();
                row[3] = product.getPrice();
                row[4] = product.getAvail();
                row[5] = orgn;

                model.addRow(row);
         
           }
        }
            
        
    }
    
    private void populateCartTable(Organization orgn) {

        DefaultTableModel model = (DefaultTableModel) tblCart.getModel();
        model.setRowCount(0);

        for (OrderItem oi : currentOrder.getOrderItemList()) {

            Object row[] = new Object[5];
            row[0] = oi;
            row[1] = oi.getSalesPrice();
            row[2] = oi.getQuantity();
            row[3] = oi.getQuantity() * oi.getSalesPrice();
            row[4] = orgn;
            model.addRow(row);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cmbNetwork = new javax.swing.JComboBox<>();
        cmbEntType = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cmbOrg = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductCatalog = new javax.swing.JTable();
        lblSalesPrice = new javax.swing.JLabel();
        txtSalesPrice = new javax.swing.JTextField();
        lblQuantity = new javax.swing.JLabel();
        spnQuantity = new javax.swing.JSpinner();
        btnAddToCart = new javax.swing.JButton();
        lblItemsInCart = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCart = new javax.swing.JTable();
        txtNewQuantity = new javax.swing.JTextField();
        btnModifyQuantity = new javax.swing.JButton();
        btnRemoveOrderItem = new javax.swing.JButton();
        btnCheckOut = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Network");

        cmbNetwork.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {}));
        cmbNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNetworkActionPerformed(evt);
            }
        });

        cmbEntType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {}));
        cmbEntType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEntTypeActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Enterprise:");

        cmbOrg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Item 1"}));
        cmbOrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbOrgActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Organization:");

        tblProductCatalog.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Product Id", "Description", "Price", "Availability", "Org"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblProductCatalog);

        lblSalesPrice.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblSalesPrice.setText("Sales Price:");

        lblQuantity.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblQuantity.setText("Quantity:");

        spnQuantity.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        btnAddToCart.setBackground(new java.awt.Color(102, 153, 255));
        btnAddToCart.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAddToCart.setForeground(new java.awt.Color(255, 255, 255));
        btnAddToCart.setText("Add to Cart");
        btnAddToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddToCartActionPerformed(evt);
            }
        });

        lblItemsInCart.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblItemsInCart.setText("Items in cart:");

        tblCart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Item Name", "Price", "Quantity", "Total Amount", "Org"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblCart);

        btnModifyQuantity.setBackground(new java.awt.Color(102, 153, 255));
        btnModifyQuantity.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnModifyQuantity.setForeground(new java.awt.Color(255, 255, 255));
        btnModifyQuantity.setText("Modify Quantity");
        btnModifyQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyQuantityActionPerformed(evt);
            }
        });

        btnRemoveOrderItem.setBackground(new java.awt.Color(102, 153, 255));
        btnRemoveOrderItem.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRemoveOrderItem.setForeground(new java.awt.Color(255, 255, 255));
        btnRemoveOrderItem.setText("Remove");
        btnRemoveOrderItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveOrderItemActionPerformed(evt);
            }
        });

        btnCheckOut.setBackground(new java.awt.Color(102, 153, 255));
        btnCheckOut.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnCheckOut.setForeground(new java.awt.Color(255, 255, 255));
        btnCheckOut.setText("Check out");
        btnCheckOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckOutActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(102, 153, 255));
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblItemsInCart)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmbNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbEntType, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbOrg, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(lblSalesPrice)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtSalesPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(lblQuantity)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(spnQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAddToCart, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnBack)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnModifyQuantity)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtNewQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRemoveOrderItem))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(cmbEntType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(cmbOrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSalesPrice)
                    .addComponent(txtSalesPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblQuantity)
                    .addComponent(spnQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddToCart, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(lblItemsInCart)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRemoveOrderItem, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnModifyQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNewQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack))
                .addContainerGap(22, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddToCartActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblProductCatalog.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select the product first.");
            return;
        }

        Product product = (Product) tblProductCatalog.getValueAt(selectedRowIndex, 0);
        System.out.println(product);
        Organization og= (Organization) tblProductCatalog.getValueAt(selectedRowIndex, 5);
        if (og instanceof PharmaSupplierOrganization)
        {
            HashMap custPharmacombo=((PharmaSupplierOrganization) og).getOrgProdCombo();
            PharmaSupplierOrganization orgn=(PharmaSupplierOrganization) og;
            Customer cust=account.getCustomer();
            if(!custPharmacombo.containsKey(cust.getId()))
            {
                custPharmacombo.put(cust.getId(), new ArrayList<Product> ());
                ((ArrayList<Product>) custPharmacombo.get(cust.getId())).add(product);
            }
            
            else if (custPharmacombo.containsKey(cust.getId()))
            {
                System.out.println("Contains cust");
                ((ArrayList<Product>) custPharmacombo.get(cust.getId())).add(product);
                System.out.println("Added prod into hashmap:"+(ArrayList<Product>) custPharmacombo.get(cust.getId()));
            }
            
            
            if(!orgn.getCustomerDirectory().findCustomer(cust))
            orgn.getCustomerDirectory().getCustomerList().add(cust);
            
        }
        
        if (og instanceof NutritionSupplierOrganization)
        {
            HashMap custNutritioncombo=((NutritionSupplierOrganization) og).getOrgProdCombo();
            NutritionSupplierOrganization orgn=(NutritionSupplierOrganization) og;
            Customer cust=account.getCustomer();
            if(!custNutritioncombo.containsKey(cust.getId()))
            {
                custNutritioncombo.put(cust.getId(), new ArrayList<Product> ());
                ((ArrayList<Product>) custNutritioncombo.get(cust.getId())).add(product);
            }
            
            else if (custNutritioncombo.containsKey(cust.getId()))
            {
                System.out.println("Contains cust");
                ((ArrayList<Product>) custNutritioncombo.get(cust.getId())).add(product);
                System.out.println("Added prod into hashmap:"+(ArrayList<Product>) custNutritioncombo.get(cust.getId()));
            }
            
            if(!orgn.getCustomerDirectory().findCustomer(cust))
            orgn.getCustomerDirectory().getCustomerList().add(cust);
            
        }
        
        if (og instanceof SportsBrandSupplierOrganization)
        {
            HashMap custSportscombo=((SportsBrandSupplierOrganization) og).getOrgProdCombo();
            SportsBrandSupplierOrganization orgn=(SportsBrandSupplierOrganization) og;
            Customer cust=account.getCustomer();
            
            if(!custSportscombo.containsKey(cust.getId()))
            {
                custSportscombo.put(cust.getId(), new ArrayList<Product> ());
                ((ArrayList<Product>) custSportscombo.get(cust.getId())).add(product);
            }
            
            else if (custSportscombo.containsKey(cust.getId()))
            {
                System.out.println("Contains cust");
                ((ArrayList<Product>) custSportscombo.get(cust.getId())).add(product);
                System.out.println("Added prod into hashmap:"+(ArrayList<Product>) custSportscombo.get(cust.getId()));
            }
            if(!orgn.getCustomerDirectory().findCustomer(cust))
            orgn.getCustomerDirectory().getCustomerList().add(cust);
            
        }
        double salesPrice = 0;
        int quant = 0;

        try {
            salesPrice = Double.parseDouble(txtSalesPrice.getText());
            quant = (Integer) spnQuantity.getValue();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Please check the price and quantity fields.");
            return;
        }
        if (salesPrice < product.getPrice()) {
            JOptionPane.showMessageDialog(this, "Price should be more than it is set in the price.");
            return;
        }

        OrderItem item = currentOrder.findProduct(product);
        if (item == null) {
            if (product.getAvail() >= quant) {

                currentOrder.addNewOrderItem(product, salesPrice, quant);
                
                product.setAvail(product.getAvail() - quant);

            } else {
                JOptionPane.showMessageDialog(this, "Please check product availability.");
                return;
            }
        } else {
            int oldQuant = item.getQuantity();
            if (item.getProduct().getAvail() + oldQuant < quant) {
                JOptionPane.showMessageDialog(this, "Please check product availability.");
                return;
            }
            item.getProduct().setAvail(item.getProduct().getAvail() + oldQuant - quant);
            item.setQuantity(quant);
        }
        populateTable(organization);
        populateCartTable(organization);

        //
    }//GEN-LAST:event_btnAddToCartActionPerformed

    private void btnModifyQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyQuantityActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblCart.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select the order item first.");
            return;
        }
        OrderItem item = (OrderItem) tblCart.getValueAt(selectedRowIndex, 0);
        int quant = 0;
        try {
            quant = Integer.parseInt(txtNewQuantity.getText());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Please check the modified quantity fields.");
            return;
        }
        int oldQuant = item.getQuantity();
        if (item.getProduct().getAvail() + oldQuant < quant) {
            JOptionPane.showMessageDialog(this, "Please check product availability.");
            return;
        }
        item.getProduct().setAvail(item.getProduct().getAvail() + oldQuant - quant);
        item.setQuantity(quant);

        populateTable(organization);
        populateCartTable(organization);
    }//GEN-LAST:event_btnModifyQuantityActionPerformed

    private void btnRemoveOrderItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveOrderItemActionPerformed
        int selectedRowIndex = tblCart.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select the order item first.");
            return;
        }
        OrderItem item = (OrderItem) tblCart.getValueAt(selectedRowIndex, 0);
        int quant = 0;
        Product product=item.getProduct();
        Organization og= (Organization) tblCart.getValueAt(selectedRowIndex, 4);

        item.getProduct().setAvail(item.getProduct().getAvail() + item.getQuantity());
        currentOrder.deleteItem(item);
        
        if (og instanceof PharmaSupplierOrganization)
        {
            PharmaSupplierOrganization orgn=(PharmaSupplierOrganization) og;
            Customer c=account.getCustomer();
            c.getPharmaproducts().remove(product);
            if(!orgn.getCustomerDirectory().findCustomer(c))
            orgn.getCustomerDirectory().getCustomerList().remove(c);
            
        }
        
        if (og instanceof NutritionSupplierOrganization)
        {
            NutritionSupplierOrganization orgn=(NutritionSupplierOrganization) og;
            Customer c=account.getCustomer();
            c.getNutritionproducts().remove(product);
            if(!orgn.getCustomerDirectory().findCustomer(c))
            orgn.getCustomerDirectory().getCustomerList().remove(c);
            
        }
        
        if (og instanceof SportsBrandSupplierOrganization)
        {
            SportsBrandSupplierOrganization orgn=(SportsBrandSupplierOrganization) og;
            Customer c=account.getCustomer();
            c.getSportsapparel().remove(product);
            if(!orgn.getCustomerDirectory().findCustomer(c))
            orgn.getCustomerDirectory().getCustomerList().remove(c);
            
        }
        populateCartTable(organization);
        populateTable(organization);
    }//GEN-LAST:event_btnRemoveOrderItemActionPerformed

    private void btnCheckOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckOutActionPerformed
        // TODO add your handling code here:
        masterOrderList=new MasterOrderList(account);
        masterOrderList.addNewOrder(currentOrder);
        currentOrder = new Order();
        
        populateTable(organization);
        populateCartTable(organization);

        txtNewQuantity.setText("");
        txtSalesPrice.setText("");
        spnQuantity.setValue(0);
        JOptionPane.showMessageDialog(this, "Thank you for your purchase. Looking forward to see you again!");

    }//GEN-LAST:event_btnCheckOutActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        CustomerWorkAreaJPanel custwork=new CustomerWorkAreaJPanel(splitPane, account, system, system);
        splitPane.setRightComponent(custwork);
    }//GEN-LAST:event_btnBackActionPerformed

    private void cmbNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNetworkActionPerformed
        // TODO add your handling code here:
        
        String network = (String) cmbNetwork.getSelectedItem();
        if (network != null){
            populateEnterpriseComboBox(network);
    }//GEN-LAST:event_cmbNetworkActionPerformed
    }
    private void cmbEntTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEntTypeActionPerformed
        // TODO add your handling code here:
        
        String ent = (String) cmbEntType.getSelectedItem();
        if (ent != null){
            populateOrganizationComboBox(ent);
        
    }//GEN-LAST:event_cmbEntTypeActionPerformed
    }
    private void cmbOrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbOrgActionPerformed
        // TODO add your handling code here:
        String org=(String) cmbOrg.getSelectedItem();
        String ent=(String) cmbEntType.getSelectedItem();
        System.out.println("Inside cmb org action called:"+org);
        populateProductList(org, ent);
        
        
    }//GEN-LAST:event_cmbOrgActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddToCart;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCheckOut;
    private javax.swing.JButton btnModifyQuantity;
    private javax.swing.JButton btnRemoveOrderItem;
    private javax.swing.JComboBox<String> cmbEntType;
    private javax.swing.JComboBox<String> cmbNetwork;
    private javax.swing.JComboBox<String> cmbOrg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblItemsInCart;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JLabel lblSalesPrice;
    private javax.swing.JSpinner spnQuantity;
    private javax.swing.JTable tblCart;
    private javax.swing.JTable tblProductCatalog;
    private javax.swing.JTextField txtNewQuantity;
    private javax.swing.JTextField txtSalesPrice;
    // End of variables declaration//GEN-END:variables
}
