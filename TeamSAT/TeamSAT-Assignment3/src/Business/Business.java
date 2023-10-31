/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Course.CourseDirectory;
import Business.Course.CourseLoadDirectory;
import Business.Course.CourseOfferDirectory;
import Business.Person.PersonDirectory;
import Business.Profiles.EmployeeDirectory;
import Business.Profiles.FacultyDirectory;
import Business.UserAccounts.UserAccountDirectory;

/**
 *
 * @author kal bugrara
 */
public class Business {

    String name;
    PersonDirectory persondirectory; //all people profiles regardless of the role

    EmployeeDirectory employeedirectory;
    UserAccountDirectory useraccountdirectory;
    FacultyDirectory facultyDirectory;
    CourseDirectory courseDirectory;
    CourseOfferDirectory courseOfferDirectory;
    CourseLoadDirectory courseLoadDirectory;

    public Business(String n) {
        name = n;

        persondirectory = new PersonDirectory();
        employeedirectory = new EmployeeDirectory(this);
        useraccountdirectory = new UserAccountDirectory();
        facultyDirectory = new FacultyDirectory();
        courseDirectory = new CourseDirectory();
        courseOfferDirectory = new CourseOfferDirectory();
        courseLoadDirectory= new CourseLoadDirectory();
    }

    public CourseLoadDirectory getCourseLoadDirectory() {
        return courseLoadDirectory;
    }

    public CourseOfferDirectory getCourseOfferDirectory() {
        return courseOfferDirectory;
    }
    

    public CourseDirectory getCourseDirectory() {
        return courseDirectory;
    }

    public PersonDirectory getPersonDirectory() {
        return persondirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return useraccountdirectory;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeedirectory;
    }

    public FacultyDirectory getFacultyDirectory() {
        return facultyDirectory;
    }

}
