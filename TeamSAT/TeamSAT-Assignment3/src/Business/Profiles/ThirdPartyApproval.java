/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Profiles;

import Business.Course.Transcript;
import java.util.ArrayList;

/**
 *
 * @author palsa
 */
public class ThirdPartyApproval {
    
    ArrayList<StudentProfile> approvallist;

    public ThirdPartyApproval() {
        approvallist=new ArrayList();
    }
    
    public void pendingApproval(StudentProfile sp) {

        
        approvallist.add(sp);
    }

    public ArrayList<StudentProfile> getApprovallist() {
        return approvallist;
    }
    
    
    
    
    
}
