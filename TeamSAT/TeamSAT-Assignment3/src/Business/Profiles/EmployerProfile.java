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
public class EmployerProfile extends Profile {

    

    public EmployerProfile(Person p) {
        super(p);
        
    }
       
    
    public boolean isMatch(String id) {
        return person.getPersonId()==id;
    }
    
    @Override
    public String getRole() {
        return "Employer";
    }
    
    
    
    
}
