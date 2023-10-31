/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Profiles;

import Business.Person.Person;

/**
 *
 * @author palsa
 */
public class ThirdPartyProfile extends Profile {
    
    private String profileId;
    private Person prsn;
    private String domain;
    private String emailId;

    public ThirdPartyProfile(String profileId, Person p, String domain, String emailId) {
        super(p);
        this.profileId = profileId;
        this.domain = domain;
        this.emailId = emailId;
    }
    

    public String gettProfileId() {
        return profileId;
    }

    public void settProfileId(String profileId) {
        this.profileId = profileId;
    }


    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    @Override
    public String getRole() {
        return "Authorizer";
    }
    
    public boolean isMatch(String id) {
        return person.getPersonId()==id;
    }

    @Override
    public String toString() {
        return gettProfileId();
    }
    
    
    
    
}
