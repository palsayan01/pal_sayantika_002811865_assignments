/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Course;

import java.util.ArrayList;

/**
 *
 * @author palsa
 */
public class CourseDirectory {

    ArrayList<Course> courselist;

    public CourseDirectory() {
        courselist = new ArrayList();
    }

    public Course newCourse(int courseId, String courseName, String description, float credit, String language) {

        Course c = new Course(courseId, courseName, description, credit, language);
        courselist.add(c);
        return c;
    }

    public Course findCourse(int courseid) {
        for (Course c : courselist) {
            if (c.isMatch(courseid)) {
                return c;
            }
        }
        return null; //not found after going through the whole list
    }

    public void removeCourse(int courseid) {
        Course co = findCourse(courseid);
        if (co != null) {
            this.courselist.remove(co);
        }
    }

}
