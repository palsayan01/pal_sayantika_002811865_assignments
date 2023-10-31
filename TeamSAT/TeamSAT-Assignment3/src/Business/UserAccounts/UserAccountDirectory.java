/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccounts;

import Business.Person.Person;
import Business.Profiles.Profile;

import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class UserAccountDirectory {
    
      ArrayList<UserAccount> useraccountlist ;
    
      public UserAccountDirectory (){
          
       useraccountlist = new ArrayList();

    }

    public UserAccount newUserAccount(Person prsn, Profile p, String un, String pw, String role, String status) {

        UserAccount ua = new UserAccount (prsn, p,  un,  pw, role, status);
        useraccountlist.add(ua);
        return ua;
    }

    public UserAccount findUserAccount(String id) {

        for (UserAccount ua : useraccountlist) {

            if (ua.isMatch(id)) {
                return ua;
            }
        }
            return null; //not found after going through the whole list
         }
    
    
       public void deletePerson(UserAccount ua)
    {
        
        useraccountlist.remove(ua);
    }
    
    
    
     public UserAccount AuthenticateUser(String un, String pw) {
         

        for (UserAccount ua : useraccountlist) {

            if (ua.IsValidUser(un, pw)) {
                                System.out.println(ua);

                return ua;
            }
        }
            return null; //not found after going through the whole list
         }   
     public ArrayList<UserAccount> getUserAccountList()
     {
         return useraccountlist;
     }
}
