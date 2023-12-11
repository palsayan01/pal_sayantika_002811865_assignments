/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.SuperAdminRole;

import Business.Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.EnterpriseNetwork;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.ListIterator;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author palsa
 */
public class SuperAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SuperAdminWorkAreaJPanel
     */
    JSplitPane splitPanel;
    EcoSystem business;
    public SuperAdminWorkAreaJPanel(JSplitPane splitPanel, EcoSystem business) {
        initComponents();
        this.splitPanel = splitPanel;
        this.business = business;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAdmin = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnNetwork = new javax.swing.JButton();
        btnEnterprise = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setToolTipText("");

        btnAdmin.setBackground(new java.awt.Color(102, 153, 255));
        btnAdmin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAdmin.setForeground(new java.awt.Color(255, 255, 255));
        btnAdmin.setText("Manage Enterprise Admin");
        btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Super Admin Work Area");

        btnNetwork.setBackground(new java.awt.Color(102, 153, 255));
        btnNetwork.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnNetwork.setForeground(new java.awt.Color(255, 255, 255));
        btnNetwork.setText("Manage Network");
        btnNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNetworkActionPerformed(evt);
            }
        });

        btnEnterprise.setBackground(new java.awt.Color(102, 153, 255));
        btnEnterprise.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEnterprise.setForeground(new java.awt.Color(255, 255, 255));
        btnEnterprise.setText("Manage Enterprise");
        btnEnterprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterpriseActionPerformed(evt);
            }
        });

        btnLogout.setBackground(new java.awt.Color(102, 153, 255));
        btnLogout.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/superadmin.png"))); // NOI18N

        jButton1.setBackground(new java.awt.Color(102, 153, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Performance");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1306, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEnterprise)
                .addGap(18, 18, 18)
                .addComponent(btnAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnLogout)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 936, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAdmin, btnEnterprise, btnNetwork, jButton1});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btnLogout)
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addGap(106, 106, 106)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEnterprise)
                    .addComponent(btnAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(54, 54, 54))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnEnterprise, btnNetwork});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAdmin, jButton1});

    }// </editor-fold>//GEN-END:initComponents

    private void btnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminActionPerformed
        // TODO add your handling code here:

        ManageEnterpriseAdminJPanel meajpl = new ManageEnterpriseAdminJPanel(splitPanel, business);
        splitPanel.setRightComponent(meajpl);

    }//GEN-LAST:event_btnAdminActionPerformed

    private void btnNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNetworkActionPerformed
        // TODO add your handling code here:

        Manage1NetworkJPanel m1nj = new Manage1NetworkJPanel(splitPanel, business);
        splitPanel.setRightComponent(m1nj);
    }//GEN-LAST:event_btnNetworkActionPerformed

    private void btnEnterpriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterpriseActionPerformed
        // TODO add your handling code here:
        ManageEnterpriseJPanel mejpl = new ManageEnterpriseJPanel(splitPanel, business);
        splitPanel.setRightComponent(mejpl);

    }//GEN-LAST:event_btnEnterpriseActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        
         UI.Welcome.SignInJPanel sijpl = new UI.Welcome.SignInJPanel (splitPanel, business);
         splitPanel.setRightComponent(sijpl);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        double netcnt=0;
        int entcnt=0;
        for(EnterpriseNetwork network : business.getNetworkList())
        {
            ++netcnt;
            
            for (Enterprise ent: network.getEnterpriseDirectory().getEnterpriseList())
            {
                ++entcnt;
            }
        }
        
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
//        ListIterator<String> iterator = sleeprecord.listIterator(sleeprecord.size());
//        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
//        while (iterator.hasNext()) {
//            String key = iterator.next();
//            //String key=cp.getPerson().getPersonId();
//            Integer value = customer.getSleepHours().get(key);
            dataset.addValue(netcnt, String.valueOf(netcnt), "Network count");
            dataset.addValue(entcnt, String.valueOf(netcnt), "Enterprise count");
        //(netcnt, netcnt, "Network Count");
        
        
        JFreeChart chart = ChartFactory.createBarChart("Bar Chart", "Date","Hours of sleep", dataset, PlotOrientation.VERTICAL, true, true, true);
        ChartPanel chartPanel = new ChartPanel(chart);
        JFrame chartFrame = new JFrame("Bar Chart");
        chartFrame.getContentPane().add(chartPanel);
        chartFrame.setSize(900, 900);
        chartFrame.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdmin;
    private javax.swing.JButton btnEnterprise;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnNetwork;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}