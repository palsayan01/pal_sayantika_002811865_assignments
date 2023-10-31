/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Profiles;

import Business.Person.Person;

/**
 *
 * @author kal bugrara
 */
public class EmployeeProfile extends Profile {
        //private Person person;

    

    public EmployeeProfile(Person p) {
        super(p); 
        
        //this.person=p;

        
        

    }

//    public Person getPerson() {
//        return person;
//    }
//
//    public void setPerson(Person person) {
//        this.person = person;
//    }
    
    @Override
    public String getRole(){
        return  "Admin";
    }

}