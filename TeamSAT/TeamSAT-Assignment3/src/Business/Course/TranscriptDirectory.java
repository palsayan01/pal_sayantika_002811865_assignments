/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Course;

import Business.Profiles.StudentProfile;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author palsa
 */
public class TranscriptDirectory {
    
    ArrayList<Transcript> transcriptlist;

    public TranscriptDirectory() {
        transcriptlist=new ArrayList();
    }
    
    public Transcript transcript(CourseLoadDirectory courseLoadDirectory, String degreeProg, String gradDate, String gradStatus) {

        Transcript t = new Transcript();
        transcriptlist.add(t);
        return t;
    }

    public ArrayList<Transcript> getTranscriptlist() {
        return transcriptlist;
    }
    
    
    
    
    
}
