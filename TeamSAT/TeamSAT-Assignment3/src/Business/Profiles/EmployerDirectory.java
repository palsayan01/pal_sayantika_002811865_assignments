/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Profiles;

import Business.Person.Person;
import java.util.ArrayList;

/**
 *
 * @author palsa
 */
public class EmployerDirectory {
    
    ArrayList<EmployerProfile> employerlist;

    public EmployerDirectory() {
        employerlist=new ArrayList();
    }

    public ArrayList<EmployerProfile> getEmployerlist() {
        return employerlist;
    }
    
    public EmployerProfile newEmployerProfile(Person p) {

        EmployerProfile ep = new EmployerProfile(p);
        employerlist.add(ep);
        return ep;
    }
    
    
    
}
