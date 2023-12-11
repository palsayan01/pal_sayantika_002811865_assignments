/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.WorkAreas.AdminRole.AdministerUserAccountsWorkResp;

import Business.Business;
import Business.Course.CourseLoad;
import Business.Person.Person;
import Business.Person.PersonDirectory;
import Business.Profiles.EmployerDirectory;
import Business.Profiles.FacultyDirectory;
import Business.Profiles.FacultyProfile;
import Business.Profiles.StudentDirectory;
import Business.Profiles.ThirdPartyDirectory;
import Business.Profiles.StudentProfile;
import Business.UserAccounts.UserAccount;
import Business.UserAccounts.UserAccountDirectory;
import UserInterface.WorkAreas.AdminRole.AdminRoleWorkAreaJPanel;
import com.lowagie.text.Document;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author anupb
 */
public class ManageStudentJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageStudentJPanel
     */
    
    JSplitPane splitPane;    
    PersonDirectory personDirectory;
    UserAccountDirectory useraccountdirectory;
    StudentDirectory studentdirectory;
    FacultyDirectory facultydirectory;
    Person prsn;
    UserAccount userAcc;
    javax.swing.JPanel CardSequencePanel;
    Business business;
    ThirdPartyDirectory thirdpartydirectory;
    EmployerDirectory employerdirectory;
    StudentProfile studentprofile;
    public ManageStudentJPanel(JSplitPane splitPane, PersonDirectory personDirectory,Person prsn , UserAccountDirectory useraccountdirectory, FacultyDirectory facultydirectory, StudentDirectory studentdirectory, UserAccount userAcc, ThirdPartyDirectory thirdpartydirectory, EmployerDirectory employerdirectory) {
        initComponents();
        
        this.splitPane = splitPane;
        this.personDirectory = personDirectory;
        this.useraccountdirectory=useraccountdirectory;
        this.facultydirectory=facultydirectory;
        this.studentdirectory=studentdirectory;
        this.prsn=prsn;
        this.userAcc = userAcc; 
        this.thirdpartydirectory=thirdpartydirectory;
        this.employerdirectory=employerdirectory;
        
        displaydata();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblView = new javax.swing.JTable();
        btnSAnalytics = new javax.swing.JButton();
        btnGenPdf = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        lbIntakeyr = new javax.swing.JLabel();
        txtIntakeYr = new javax.swing.JTextField();
        lbDegProg = new javax.swing.JLabel();
        txtDegProg = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();

        tblView.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Student Id", "Name", "Intake Year", "Degree Program", "Grad Date", "Grad Status"
            }
        ));
        jScrollPane1.setViewportView(tblView);

        btnSAnalytics.setText("Show Analytics");
        btnSAnalytics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSAnalyticsActionPerformed(evt);
            }
        });

        btnGenPdf.setText("Generate PDF");
        btnGenPdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenPdfActionPerformed(evt);
            }
        });

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update Details");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        lbIntakeyr.setText("Intake Year:");

        txtIntakeYr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIntakeYrActionPerformed(evt);
            }
        });

        lbDegProg.setText("Degree Program:");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(49, 49, 49)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnUpdate)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lbIntakeyr)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtIntakeYr, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btnSAnalytics)
                                            .addGap(18, 18, 18)
                                            .addComponent(btnGenPdf, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jButton1))))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(332, 332, 332)
                                    .addComponent(lbDegProg)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtDegProg)
                                    .addGap(152, 152, 152)))
                            .addGap(15, 15, 15)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(413, 413, 413)
                        .addComponent(btnSave)))
                .addContainerGap(162, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnGenPdf, btnSAnalytics, jButton1});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSAnalytics)
                    .addComponent(btnGenPdf)
                    .addComponent(jButton1)
                    .addComponent(btnUpdate))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbIntakeyr)
                    .addComponent(txtIntakeYr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDegProg)
                    .addComponent(txtDegProg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(btnSave)
                .addContainerGap(199, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenPdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenPdfActionPerformed
        // TODO add your handling code here:
        
        String path="";
        JFileChooser j = new JFileChooser();
        j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int x = j.showSaveDialog(this);
        if(x==JFileChooser.APPROVE_OPTION){
        
        path=j.getSelectedFile().getPath();
        
        }
        Document doc = new Document();
        
        try
        {
            PdfWriter.getInstance(doc, new FileOutputStream(path+"/abc.pdf"));
            doc.open();
            PdfPTable tbl=new PdfPTable(6);
            tbl.addCell("Student ID");
            tbl.addCell("Name");
            tbl.addCell("Intake Year");
            tbl.addCell("Degree Program");
            tbl.addCell("Grad Date");
            tbl.addCell("Grad Status");
            
             for(int i=0; i< tblView.getRowCount(); i++){
             
             String stuid = tblView.getValueAt(i, 0).toString();
             String name = tblView.getValueAt(i, 1).toString();
             String inyr = tblView.getValueAt(i, 2).toString();
             String dp = tblView.getValueAt(i, 3).toString();
             String gdt = tblView.getValueAt(i, 4).toString();
             String gds = tblView.getValueAt(i, 5).toString();
             
             tbl.addCell(stuid);
             tbl.addCell(name);
             tbl.addCell(inyr);
             tbl.addCell(dp);
             tbl.addCell(gdt);
             tbl.addCell(gds);
             
             
             }
             
             doc.add(tbl);
            
             JOptionPane.showMessageDialog(null, "PDF generated");
        
        }
        
        catch(Exception e){
        
        
        JOptionPane.showMessageDialog(null, "something wrong");
        }
        
        doc.close(); 
        
     
        
        
        
    }//GEN-LAST:event_btnGenPdfActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        AdminRoleWorkAreaJPanel arjpl = new AdminRoleWorkAreaJPanel( business, CardSequencePanel, splitPane, personDirectory, useraccountdirectory, facultydirectory, studentdirectory, thirdpartydirectory, employerdirectory);
        splitPane.setRightComponent(arjpl);
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtIntakeYrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIntakeYrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIntakeYrActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        txtDegProg.setEditable(true);
        txtIntakeYr.setEditable(true);
        JOptionPane.showMessageDialog(this, "Update the detais now!");
        
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSAnalyticsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSAnalyticsActionPerformed
        // TODO add your handling code here:
        DefaultPieDataset pieDataset = new DefaultPieDataset();
        
        for (StudentProfile sp:studentdirectory.getStudentlist() )
        {
            pieDataset.setValue(sp.getPerson().getName(),sp.getTranscript().gettranscript().size());
        }
       
//        pieDataset.setValue("One",10);
//        pieDataset.setValue("two",20);
//        pieDataset.setValue("three",30);
//        
        JFreeChart chart = ChartFactory.createPieChart("Pie Chart", pieDataset, true, true, true);
        PiePlot P = (PiePlot)chart.getPlot();
        //
        P.setForegroundAlpha(CENTER_ALIGNMENT);
        
         ChartPanel chartPanel = new ChartPanel(chart);
          JFrame chartFrame = new JFrame("Pie Chart");
             //chartFrame.add(chartPanel);
             
             chartFrame.getContentPane().add(chartPanel);
             chartFrame.setSize(900, 900);
             chartFrame.setVisible(true);
         
         
        //ChartFrame frame = new ChartFrame("Pie Chart", chart);
        //frame.setVisible(true);
       // frame.setSize(900,900);
    }//GEN-LAST:event_btnSAnalyticsActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        
        int selectedRowIndex = tblView.getSelectedRow();

        if (selectedRowIndex < 0) {

            JOptionPane.showMessageDialog(this, "Please select a row to view.");
            return;
        }
        else
        {
        DefaultTableModel model = (DefaultTableModel) tblView.getModel();
        studentprofile = (StudentProfile) model.getValueAt(selectedRowIndex, 0);
        studentprofile.setIntakeYear(txtIntakeYr.getText());
        studentprofile.getTranscript().setDegreeProg(txtDegProg.getText());
        
        JOptionPane.showMessageDialog(this, "Details saved successfully");
        displaydata();
        }
    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenPdf;
    private javax.swing.JButton btnSAnalytics;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbDegProg;
    private javax.swing.JLabel lbIntakeyr;
    private javax.swing.JTable tblView;
    private javax.swing.JTextField txtDegProg;
    private javax.swing.JTextField txtIntakeYr;
    // End of variables declaration//GEN-END:variables

    private void displaydata() {

        DefaultTableModel model = (DefaultTableModel) tblView.getModel();
        model.setRowCount(0);
        
        for(StudentProfile std: studentdirectory.getStudentlist()){
            
            Object[] info = new Object[6];
            info[0] = std;
            info[1] = std.getPerson().getName();
            info[2] = std.getIntakeYear();
            info[3] = std.getTranscript().getDegreeProg();
            info[4] = std.getTranscript().getGradDate();
            info[5] = std.getTranscript().getGradStatus();
            
            
            
            model.addRow(info);
            
        }
        


    }
}