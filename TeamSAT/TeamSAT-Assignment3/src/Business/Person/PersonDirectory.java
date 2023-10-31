/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class PersonDirectory {
    
      ArrayList<Person> personlist ;
    
      public PersonDirectory (){
          
       personlist = new ArrayList();

    }

    public ArrayList<Person> getPersonlist() {
        return personlist;
    }

    public void setPersonlist(ArrayList<Person> personlist) {
        this.personlist = personlist;
    }
      

    public Person newPerson(String id, String name, String gender, int age, String address, String emailId, String region, String country, String device, String language) {

        Person p = new Person(id, name, gender, age, address, emailId, region, country, device, language);
        personlist.add(p);
        return p;
    }

    
    public void deletePerson(Person p)
    {
        
        personlist.remove(p);
    }
    
    
    
    public Person findPerson(String id) {

        for (Person p : personlist) {

            if (p.isMatch(id)) {
                return p;
            }
        }
            return null; //not found after going through the whole list
         }
    
}