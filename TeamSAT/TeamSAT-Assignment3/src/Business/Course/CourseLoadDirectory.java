/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Course;

import Business.Profiles.FacultyProfile;
import Business.Profiles.StudentProfile;
import java.util.ArrayList;

/**
 *
 * @author palsa
 */
public class CourseLoadDirectory {
    
    ArrayList<CourseLoad> courseloadlist;
    private int ctr;

    public CourseLoadDirectory() {
        
        courseloadlist=new ArrayList();
        ctr=0;
    }
    
    public CourseLoad newCourseLoad(StudentProfile studentProfile, CourseOffer courseOffer, String Grade, String progressStatus) {

        CourseLoad cl = new CourseLoad(++ctr, studentProfile, courseOffer, Grade, progressStatus);
        courseloadlist.add(cl);
        return cl;
    }

    public ArrayList<CourseLoad> getCourseloadlist() {
        return courseloadlist;
    }
    
    
    
    public ArrayList<CourseLoad> getCourseLoadFacultyId(String facultyId) {
        ArrayList<CourseLoad> courseLoads = new ArrayList<>();
        
        for (CourseLoad courseLoad : this.courseloadlist) {
            if (courseLoad.getCourseOffer().getFacultyProfile().getFacultyId() == facultyId) {
                courseLoads.add(courseLoad);
            }
        }
        
        return courseLoads;
    }
    
    
    
}
