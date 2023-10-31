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
public class FacultyProfile extends Profile {
    
    private String facultyId;       
    private Person person;
    private String expertise;
    private float rating;
	private ArrayList<Float> ratinglist;									
    
    public FacultyProfile(Person p, String facultyId, String expertise, float rating) {
        super(p);
        ratinglist=new ArrayList();
        this.expertise=expertise;
        this.rating=rating;

    }

    @Override
    public String getRole() {
        return "Faculty";
    }

    public boolean isMatch(String id) {
        return person.getPersonId()==id;
    }

    public String getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(String facultyId) {
        this.facultyId = facultyId;
    }

//    public Person getPerson() {
//        return person;
//    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getExpertise() {
        return expertise;
    }

    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }

    public float getRating() {
        
        return calcAvgProfRating();       
    }

    public void setRating(float rating) {
        this.rating = rating;
    }
	
	public ArrayList<Float> getRatinglist() {
							  
        return ratinglist;
	}
	
	public float calcAvgProfRating()
    {
        float sum=0;
        for (float profRate: ratinglist)
        {
            sum=sum+profRate;
            
        }
        setRating(sum/ratinglist.size());
        return rating;
    }
	
    @Override
    public String toString() {
        return getFacultyId();
    }

    
        
        
    
}
