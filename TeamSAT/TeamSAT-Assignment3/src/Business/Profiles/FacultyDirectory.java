/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Profiles;

import Business.Person.Person;

import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class FacultyDirectory {


    ArrayList<FacultyProfile> facultylist;
    int ctr;

    public FacultyDirectory() {

     facultylist = new ArrayList();
     ctr=0;

    }

    public ArrayList<FacultyProfile> getFacultylist() {
        return facultylist;
    }

    public void setFacultylist(ArrayList<FacultyProfile> facultylist) {
        this.facultylist = facultylist;
    }

    public FacultyProfile newFacultyProfile(Person p, String id, String expertise, float rating) {

        FacultyProfile sp = new FacultyProfile(p, id , expertise, rating);
        facultylist.add(sp);
        return sp;
    }

    public Profile findFaculty(String id) {

        for (Profile sp : facultylist) {

            if (sp.isMatch(id)) {
                return sp;
            }
        }
            return null; //not found after going through the whole list
         }
    
}
