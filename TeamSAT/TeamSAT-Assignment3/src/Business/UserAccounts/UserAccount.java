/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccounts;

import Business.Person.Person;
import Business.Profiles.Profile;



/**
 *
 * @author kal bugrara
 */
public class UserAccount {
    
    Person prsn;
    Profile profile;
    String id;
    String username;
    String password;
    String role;
    String status;
    
    public UserAccount (Person prsn, Profile profile, String un, String pw, String role, String status){
        username = un;
         password = pw;
         this.profile = profile;
         this.role=role;
         this.status=status;
         this.prsn=prsn;
    }

    public Person getPrsn() {
        return prsn;
    }

    public void setPrsn(Person prsn) {
        this.prsn = prsn;
    }

    
    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPersonId(){
        return profile.getPerson().getPersonId();
    }
    public String getUserLoginName(){
        return username;
    }

        public boolean isMatch(String id){
        if(getPersonId().equals(id)) return true;
        return false;
    }
        public boolean IsValidUser(String un, String pw){
        
            if (username.equalsIgnoreCase(un) && password.equals(pw)) 
                return true;
            else return false;
        
        }
        public String getRole(){
            return this.role;
        }

    public void setRole(String role) {
        this.role = role;
    }
        
        
        
        public Profile getAssociatedPersonProfile(){
            return profile;
        }
        
//    @Override
//        public String toString(){
//            
//            return getUserLoginName();
//        }

    @Override
    public String toString() {
        return prsn.getPersonId();
    }

    
        
        
        
        
}

