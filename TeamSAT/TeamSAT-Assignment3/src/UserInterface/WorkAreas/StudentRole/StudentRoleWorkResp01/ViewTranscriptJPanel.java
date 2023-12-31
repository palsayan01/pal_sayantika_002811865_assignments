/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.WorkAreas.StudentRole.StudentRoleWorkResp01;

import Business.Business;
import Business.Course.CourseLoad;
import Business.Course.CourseLoadDirectory;
import Business.Course.CourseOfferDirectory;
import Business.Profiles.StudentProfile;
import Business.Profiles.ThirdPartyApproval;
import UserInterface.WorkAreas.StudentRole.StudentWorkAreaJPanel;
import com.lowagie.text.Document;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author palsa
 */
public class ViewTranscriptJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewTranscriptJPanel
     */
    JPanel CardSequencePanel;
    Business business;
    CourseOfferDirectory courseofferdirectory;
    CourseLoadDirectory courseloaddirectory;
    StudentProfile studentprofile;
    JSplitPane jSplitPane;
    ThirdPartyApproval tpa;
    public ViewTranscriptJPanel(Business bz, JPanel jp, CourseOfferDirectory courseofferdirectory, CourseLoadDirectory courseloaddirectory, StudentProfile studentprofile, JSplitPane jSplitPane, ThirdPartyApproval tpa) {
        initComponents();
        CardSequencePanel = jp;
        this.business = bz;
        this.courseofferdirectory=courseofferdirectory;
        this.courseloaddirectory=courseloaddirectory;
        this.studentprofile=studentprofile;
        this.jSplitPane=jSplitPane;
        this.tpa=tpa;
        populateTable();
    }
    public void populateTable()
    {
        System.out.println(studentprofile.getTranscript().gettranscript());
        DefaultTableModel searchModel=(DefaultTableModel)tblTranscript.getModel();
        searchModel.setRowCount(0);
        for (CourseLoad cl: studentprofile.getTranscript().gettranscript())
            {
                if (cl.getStudentProfile().getTranscript().getGradStatus().equals("Graduated"))
                {
                
                Object row[]=new Object[5];
                row[0]=cl;
                row[1]=cl.getCourseOffer().getCrn();
                row[2]=cl.getCourseOffer().getCourse().getCourseName();
                row[3]=cl.getCourseOffer().getCourse().getCredit();
                row[4]=cl.getGrade();

                searchModel.addRow(row); 
                }
                       
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

        jButton10 = new javax.swing.JButton();
        lbViewTrans = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTranscript = new javax.swing.JTable();
        btndownload = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        jButton10.setBackground(new java.awt.Color(102, 153, 255));
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("Graduation Audit");
        jButton10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton10.setMaximumSize(new java.awt.Dimension(200, 40));
        jButton10.setMinimumSize(new java.awt.Dimension(20, 20));
        jButton10.setPreferredSize(new java.awt.Dimension(240, 25));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        lbViewTrans.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbViewTrans.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbViewTrans.setText("View Your Transcript");

        tblTranscript.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Progress", "CRN", "Course Name ", "Credits", "Grade"
            }
        ));
        jScrollPane1.setViewportView(tblTranscript);

        btndownload.setBackground(new java.awt.Color(102, 153, 255));
        btndownload.setForeground(new java.awt.Color(255, 255, 255));
        btndownload.setText("Download Transcript");
        btndownload.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btndownload.setMaximumSize(new java.awt.Dimension(200, 40));
        btndownload.setMinimumSize(new java.awt.Dimension(20, 20));
        btndownload.setPreferredSize(new java.awt.Dimension(240, 25));
        btndownload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndownloadActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(102, 153, 255));
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBack.setMaximumSize(new java.awt.Dimension(200, 40));
        btnBack.setMinimumSize(new java.awt.Dimension(20, 23));
        btnBack.setPreferredSize(new java.awt.Dimension(240, 30));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackIdentifyResourceAssetsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(lbViewTrans, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 789, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btndownload, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 88, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lbViewTrans)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btndownload, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        GradAuditJPanel gradaudit=new GradAuditJPanel(business, CardSequencePanel, courseofferdirectory,courseloaddirectory,studentprofile, jSplitPane, tpa);
        jSplitPane.setRightComponent(gradaudit);

        /*       ManageSalesPersonOrders iet = new ManageSalesPersonOrders(business, CardSequencePanel);

        CardSequencePanel.add("FindResourceAsset", iet);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
        */
    }//GEN-LAST:event_jButton10ActionPerformed

    private void btndownloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndownloadActionPerformed
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

            for(int i=0; i< tblTranscript.getRowCount(); i++){
                String Progress = tblTranscript.getValueAt(i, 0).toString();
                String CRN = tblTranscript.getValueAt(i, 1).toString();
                String CourseName = tblTranscript.getValueAt(i, 2).toString();
                String Credits = tblTranscript.getValueAt(i, 3).toString();
                String Grade = tblTranscript.getValueAt(i, 4).toString();
                

                tbl.addCell(Progress);
                tbl.addCell(CRN);
                tbl.addCell(CourseName);
                tbl.addCell(Credits);
                tbl.addCell(Grade);

            }

            doc.add(tbl);

            JOptionPane.showMessageDialog(null, "PDF generated");

        }

        catch(Exception e){

            JOptionPane.showMessageDialog(null, "something wrong");
        }

        doc.close();
    }//GEN-LAST:event_btndownloadActionPerformed

    private void btnBackIdentifyResourceAssetsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackIdentifyResourceAssetsActionPerformed
        // TODO add your handling code here:

        StudentWorkAreaJPanel studentworkarea = new StudentWorkAreaJPanel(business, studentprofile, this, courseofferdirectory, jSplitPane, courseloaddirectory, tpa);
        jSplitPane.setRightComponent(studentworkarea);
    }//GEN-LAST:event_btnBackIdentifyResourceAssetsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btndownload;
    private javax.swing.JButton jButton10;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbViewTrans;
    private javax.swing.JTable tblTranscript;
    // End of variables declaration//GEN-END:variables
}
