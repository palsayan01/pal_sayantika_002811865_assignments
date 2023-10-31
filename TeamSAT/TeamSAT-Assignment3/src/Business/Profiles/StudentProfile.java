/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Profiles;

import Business.Course.CourseLoadDirectory;										   
import Business.Course.Transcript;
import Business.Person.Person;
import java.util.ArrayList;						   
/**
 *
 * @author kal bugrara
 */
public class StudentProfile extends Profile {
    private String studentId;
    private Person person;
    private Transcript transcript;
    private String intakeYear;
    private String status="Not Defined";
    private String feedback="NIL";
    
    //   EmploymentHistroy employmenthistory;

//    public Person getPerson() {
//        return person;
//    }
    
    public StudentProfile(Person p, String studentId, Transcript t, String intakeYear) {
        super(p);
        this.studentId=studentId;
        this.transcript=t;
        this.intakeYear=intakeYear;

//        transcript = new Transcript(CourseLoadDirectory courseLoad, String degreeProg, Date gradDate, String gradStatus);
//        employmenthistory = new EmploymentHistroy();
    }

    @Override
    public String getRole() {
        return "Student";
    }

    public String getStudentId() {
        return studentId;
    }

//    public Person getPerson() {
//        return person;
//    }

    public Transcript getTranscript() {
        return transcript;
    }

    public String getIntakeYear() {
        return intakeYear;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setTranscript(Transcript transcript) {
        this.transcript = transcript;
    }

    public void setIntakeYear(String intakeYear) {
        this.intakeYear = intakeYear;
    }
    
    public boolean isMatch(String id) {
        return person.getPersonId()==id;
    }
    
    
    
    @Override
    public String toString() {
        return getStudentId();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
    
    

}
