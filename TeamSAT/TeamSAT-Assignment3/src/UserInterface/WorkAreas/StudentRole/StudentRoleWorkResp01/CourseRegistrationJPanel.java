/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.WorkAreas.StudentRole.StudentRoleWorkResp01;

import Business.Business;
import Business.Course.CourseLoad;
import Business.Course.CourseLoadDirectory;
import Business.Course.CourseOfferDirectory;
import Business.Course.CourseOffer;
import Business.Course.Transcript;
import Business.Profiles.StudentProfile;
import Business.Profiles.ThirdPartyApproval;
import UserInterface.WorkAreas.StudentRole.StudentWorkAreaJPanel;
import javax.swing.JOptionPane;


import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kal bugrara
 */
public class CourseRegistrationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageSuppliersJPanel
     */
    JPanel CardSequencePanel;
    Business business;
    CourseOfferDirectory courseofferdirectory;
    CourseLoadDirectory courseloaddirectory;
    StudentProfile studentprofile;
    JSplitPane jSplitPane;
    boolean userFound;
    DefaultTableModel searchModel;
    private int selectedRow;
    CourseOffer courseoffer;
    Transcript t;
    ThirdPartyApproval tpa;


    public CourseRegistrationJPanel(Business bz, JPanel jp, CourseOfferDirectory courseofferdirectory, CourseLoadDirectory courseloaddirectory, StudentProfile studentprofile, JSplitPane jSplitPane, ThirdPartyApproval tpa) {
        initComponents();
        CardSequencePanel = jp;
        this.business = bz;
        this.courseofferdirectory=courseofferdirectory;
        this.courseloaddirectory=courseloaddirectory;
        this.studentprofile=studentprofile;
        this.jSplitPane=jSplitPane;
        this.t=studentprofile.getTranscript();
        this.tpa=tpa;
        
        

    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Back = new javax.swing.JButton();
        lbcourseReg = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblcourseReg = new javax.swing.JTable();
        lbSearch = new javax.swing.JLabel();
        comboSearch = new javax.swing.JComboBox<>();
        btnSearch = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();

        setLayout(null);

        Back.setBackground(new java.awt.Color(102, 153, 255));
        Back.setFont(getFont());
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        add(Back);
        Back.setBounds(30, 340, 80, 40);

        lbcourseReg.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbcourseReg.setText("Course Registration");
        add(lbcourseReg);
        lbcourseReg.setBounds(21, 20, 550, 32);

        tblcourseReg.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "CRN", "Course Name", "Description", "Professor", "Language", "Professor Rating", "Course Rating", "Credits", "Term", "Year"
            }
        ));
        jScrollPane1.setViewportView(tblcourseReg);

        add(jScrollPane1);
        jScrollPane1.setBounds(30, 140, 870, 150);

        lbSearch.setText("Search course by keyword");
        add(lbSearch);
        lbSearch.setBounds(20, 80, 160, 16);

        comboSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Professor Name", "Course Name", "Region", "Language" }));
        add(comboSearch);
        comboSearch.setBounds(180, 80, 170, 30);

        btnSearch.setBackground(new java.awt.Color(102, 153, 255));
        btnSearch.setFont(getFont());
        btnSearch.setText("Search");
        btnSearch.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        add(btnSearch);
        btnSearch.setBounds(550, 80, 70, 30);

        btnAdd.setBackground(new java.awt.Color(102, 153, 255));
        btnAdd.setFont(getFont());
        btnAdd.setText("Add");
        btnAdd.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        add(btnAdd);
        btnAdd.setBounds(820, 310, 80, 30);
        add(txtSearch);
        txtSearch.setBounds(370, 80, 150, 30);
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        StudentWorkAreaJPanel studentworkareapanel=new StudentWorkAreaJPanel(business, studentprofile, CardSequencePanel, courseofferdirectory, jSplitPane, courseloaddirectory, tpa);
        jSplitPane.setRightComponent(studentworkareapanel);
//        CardSequencePanel.remove(this);
//        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
 //       ((java.awt.CardLayout)CardSequencePanel.getLayout()).show(CardSequencePanel, "IdentifyEventTypes");

    }//GEN-LAST:event_BackActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        if (txtSearch.getText().equals(""))
        JOptionPane.showMessageDialog(this, "Please enter search criteria", "Warning", JOptionPane.WARNING_MESSAGE);
        else
        {
        String searchCriteria=comboSearch.getSelectedItem().toString();
        String text=txtSearch.getText();
        switch(searchCriteria)
        {
            case "Professor Name":
                
            searchModel=(DefaultTableModel)tblcourseReg.getModel();
            searchModel.setRowCount(0);
            for (CourseOffer co: courseofferdirectory.getCourseofferlist())
            {
                if(co.getFacultyProfile().getPerson().getName().toLowerCase().contains(text.toLowerCase()))
                {
                Object row[]=new Object[10];
                row[0]=co;
                row[1]=co.getCourse().getCourseName();
                row[2]=co.getCourse().getDescription();
                row[3]=co.getFacultyProfile().getPerson().getName();
                row[4]=co.getCourse().getLanguage();
                row[5]=co.getFacultyProfile().getRating();
                row[6]=co.getCourse().getRating();
                row[7]=co.getCourse().getCredit();
                row[8]=co.getTerm();
                row[9]=co.getYear();

                searchModel.addRow(row);
                userFound = true;
                }
            }
                if (!userFound)
                    JOptionPane.showMessageDialog(this, "Course offer not found");

                break;
                
            case "Course Name":
            
            searchModel=(DefaultTableModel)tblcourseReg.getModel();
            searchModel.setRowCount(0);
            for (CourseOffer co: courseofferdirectory.getCourseofferlist())
            {
                if(co.getCourse().getCourseName().toLowerCase().contains(text.toLowerCase()))
                {
                Object row[]=new Object[10];
                row[0]=co;
                row[1]=co.getCourse().getCourseName();
                row[2]=co.getCourse().getDescription();
                row[3]=co.getFacultyProfile().getPerson().getName();
                row[4]=co.getCourse().getLanguage();
                row[5]=co.getFacultyProfile().getRating();
                row[6]=co.getCourse().getRating();
                row[7]=co.getCourse().getCredit();
                row[8]=co.getTerm();
                row[9]=co.getYear();

                searchModel.addRow(row);
                userFound = true;
                }

                if (!userFound)
                    JOptionPane.showMessageDialog(this, "Course offer not found");
            }
                break;               
                
            case "Region":
                
            searchModel=(DefaultTableModel)tblcourseReg.getModel();
            searchModel.setRowCount(0);
            for (CourseOffer co: courseofferdirectory.getCourseofferlist())
            {
                if(co.getFacultyProfile().getPerson().getRegion().toLowerCase().contains(text.toLowerCase()))
                {
                Object row[]=new Object[10];
                row[0]=co;
                row[1]=co.getCourse().getCourseName();
                row[2]=co.getCourse().getDescription();
                row[3]=co.getFacultyProfile().getPerson().getName();
                row[4]=co.getCourse().getLanguage();
                row[5]=co.getFacultyProfile().getRating();
                row[6]=co.getCourse().getRating();
                row[7]=co.getCourse().getCredit();
                row[8]=co.getTerm();
                row[9]=co.getYear();

                searchModel.addRow(row);
                userFound = true;
                }

                if (!userFound)
                    JOptionPane.showMessageDialog(this, "Course offer not found");
            }
                break;                
                
            case "Language":
                searchModel=(DefaultTableModel)tblcourseReg.getModel();
            searchModel.setRowCount(0);
            for (CourseOffer co: courseofferdirectory.getCourseofferlist())
            {
                if(co.getCourse().getLanguage().toLowerCase().contains(text.toLowerCase()))
                {
                Object row[]=new Object[10];
                row[0]=co;
                row[1]=co.getCourse().getCourseName();
                row[2]=co.getCourse().getDescription();
                row[3]=co.getFacultyProfile().getPerson().getName();
                row[4]=co.getCourse().getLanguage();
                row[5]=co.getFacultyProfile().getRating();
                row[6]=co.getCourse().getRating();
                row[7]=co.getCourse().getCredit();
                row[8]=co.getTerm();
                row[9]=co.getYear();

                searchModel.addRow(row);
                userFound = true;
                }

                if (!userFound)
                    JOptionPane.showMessageDialog(this, "Course offer not found");
            }
                break;            
        }}
        
        //populateTable();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        selectedRow=tblcourseReg.getSelectedRow();
        if (selectedRow<0)
        JOptionPane.showMessageDialog(this, "Select a row to proceed", "Warning", JOptionPane.WARNING_MESSAGE);
        DefaultTableModel searchModel=(DefaultTableModel)tblcourseReg.getModel();
        CourseOffer courseoffer=(CourseOffer) searchModel.getValueAt(selectedRow, 0);
        CourseLoad cl=courseloaddirectory.newCourseLoad(studentprofile, courseoffer, "NIL", "Not Started"); 
        t.addtotransscript(cl);
        t.setGradStatus("Not Graduated");
        t.setGradDate("Not Defined");
        t.setDegreeProg("MSIS");
        System.out.println("Course add:"+ studentprofile.getTranscript().gettranscript());
        JOptionPane.showMessageDialog(this, "Course added successfully and transcript updated", "Information", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnAddActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> comboSearch;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbSearch;
    private javax.swing.JLabel lbcourseReg;
    private javax.swing.JTable tblcourseReg;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

}
