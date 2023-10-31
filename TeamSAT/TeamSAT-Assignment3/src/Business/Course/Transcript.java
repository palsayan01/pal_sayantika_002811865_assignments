/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Course;

import java.util.ArrayList;						   
import java.util.Date;

/**
 *
 * @author palsa
 */
public class Transcript {
    
    
    //private CourseLoadDirectory courseLoadDirectory;
	private ArrayList<CourseLoad> studentloadlist;											  
    private String degreeProg;
    private String gradDate;
    private String gradStatus;

    public Transcript() {
        studentloadlist=new ArrayList();
//        this.degreeProg = degreeProg;
//        this.gradDate = gradDate;
//        this.gradStatus = gradStatus;
    }

    public void addtotransscript(CourseLoad cl)
    {
        studentloadlist.add(cl);        
    }
    
    public ArrayList<CourseLoad> gettranscript()
    {
        return studentloadlist;
    }

    public String getDegreeProg() {
        return degreeProg;
    }
	
//	public CourseLoadDirectory getCourseLoad() {
//        return courseLoadDirectory;
//    }
//	public void setCourseLoad(CourseLoadDirectory courseLoad) {
//        this.courseLoadDirectory = courseLoad;
//    }

    public void setDegreeProg(String degreeProg) {
        this.degreeProg = degreeProg;
    }

    public String getGradDate() {
        return gradDate;
    }

    public void setGradDate(String gradDate) {
        this.gradDate = gradDate;
    }

    public String getGradStatus() {
        return gradStatus;
    }

    public void setGradStatus(String gradStatus) {
        this.gradStatus = gradStatus;
    }

//    public CourseLoadDirectory getCourseLoadDirectory() {
//        return courseLoadDirectory;
//    }
    
    
    
}
