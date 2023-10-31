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
public class Course {
    private int courseId;
    private String courseName;
    private String description;
    private float credit;
    private String language;
	private float rating;
    private ArrayList<Float> ratinglist;											

    public Course(int courseId, String courseName, String description, float credit, String language) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.description = description;
        this.credit = credit;
        this.language = language;
        ratinglist=new ArrayList();								   
    }
     

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getCredit() {
        return credit;
    }

    public void setCredit(float credit) {
        this.credit = credit;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
    
	public ArrayList<Float> getRatinglist() {
        return ratinglist;
    }										 						
    public boolean isMatch(int courseId) {
        if (getCourseId()==courseId) {
            return true;
        }
        return false;
    }

	public float getRating() {
        return calcAvgCourseRating();
    }

    public void setRating(float rating) {
        this.rating = rating;
    }
    
    
    public float calcAvgCourseRating()
    {
        float sum=0;
        for (float courseRate: ratinglist)
        {
            sum=sum+courseRate;
            
        }
        setRating(sum/ratinglist.size());
        return rating;
    }
}
