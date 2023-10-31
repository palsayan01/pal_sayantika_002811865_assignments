/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Course;

import Business.Profiles.StudentProfile;

/**
 *
 * @author palsa
 */
public class CourseLoad {
    
    private int loadId;
    private StudentProfile studentProfile;
    private CourseOffer courseOffer;
    private String grade;
    private String progressStatus;

    public CourseLoad(int loadId, StudentProfile studentProfile, CourseOffer courseOffer, String grade, String progressStatus) {
        this.studentProfile = studentProfile;
        this.courseOffer = courseOffer;
        this.grade = grade;
        this.progressStatus = progressStatus;
        this.loadId=loadId;
    }

    public StudentProfile getStudentProfile() {
        return studentProfile;
    }

    public void setStudentProfile(StudentProfile studentProfile) {
        this.studentProfile = studentProfile;
    }

    public CourseOffer getCourseOffer() {
        return courseOffer;
    }

    public void setCourseOffer(CourseOffer courseOffer) {
        this.courseOffer = courseOffer;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String Grade) {
        this.grade = Grade;
    }

    public String getProgressStatus() {
        return progressStatus;
    }

    public void setProgressStatus(String progressStatus) {
        this.progressStatus = progressStatus;
    }

    public int getLoadId() {
        return loadId;
    }

    public void setLoadId(int loadId) {
        this.loadId = loadId;
    }

    @Override
    public String toString() {
        return progressStatus;
    }
       
}
