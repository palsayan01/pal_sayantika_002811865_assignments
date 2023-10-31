/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Course;

import Business.Profiles.FacultyProfile;
import java.util.ArrayList;

/**
 *
 * @author palsa
 */
public class CourseOffer {
    
    private int crn;
    private FacultyProfile facultyProfile;
    private String term;
    private int year;
    private Course course;
    private String schedule;
    private float avgProfRating=0;
    private float avgCourseRating=0;

    public CourseOffer(int crn, FacultyProfile facultyProfile, String term, int year, Course course, String schedule) {
        this.crn = crn;
        this.facultyProfile = facultyProfile;
        this.term = term;
        this.year = year;
        this.course = course;
        this.schedule=schedule;        
        
    }

    public int getCrn() {
        return crn;
    }

    public void setCrn(int offerId) {
        this.crn = offerId;
    }

    public FacultyProfile getFacultyProfile() {
        return facultyProfile;
    }

    public void setFacultyProfile(FacultyProfile facultyProfile) {
        this.facultyProfile = facultyProfile;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
    
    public boolean isMatch(int crn) {
        if (getCrn()==crn) {
            return true;
        }
        return false;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }


    @Override
    public String toString() {
        return String.valueOf(crn);
    }

    public float getAvgProfRating() {
        return avgProfRating;
    }

    public float getAvgCourseRating() {
        return avgCourseRating;
    }

    public void setAvgProfRating(float avgProfRating) {
        this.avgProfRating = avgProfRating;
    }

    public void setAvgCourseRating(float avgCourseRating) {
        this.avgCourseRating = avgCourseRating;
    }   
    
}
