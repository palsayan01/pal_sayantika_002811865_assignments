/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Profiles;

import Business.Course.Transcript;
import Business.Person.Person;
import java.util.ArrayList;

/**
 *
 * @author palsa
 */
public class ThirdPartyDirectory {
    
    ArrayList<ThirdPartyProfile> thirdpartylist;
    int ctr;

    public ThirdPartyDirectory() {
        thirdpartylist=new ArrayList();        
    }

    public ArrayList<ThirdPartyProfile> getThirdpartylist() {
        return thirdpartylist;
    }

    public void setThirdpartylist(ArrayList<ThirdPartyProfile> thirdpartylist) {
        this.thirdpartylist = thirdpartylist;
    }
    
    
    
    public ThirdPartyProfile newTPProfile(String id, Person p, String domain,String emailId) {

        ThirdPartyProfile tp = new ThirdPartyProfile(id,p,domain, emailId);
        thirdpartylist.add(tp);
        return tp;
    }
    
    public ThirdPartyProfile findTPProfile(String id) {

        for (ThirdPartyProfile tp : thirdpartylist) {

            if (tp.isMatch(id)) {
                return tp;
            }
        }
            return null; //not found after going through the whole list
         }
    

    
}
