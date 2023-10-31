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
public class CourseOfferDirectory {

    ArrayList<CourseOffer> courseofferlist;
    int ctr;

    public CourseOfferDirectory() {
        courseofferlist = new ArrayList();
    }

    public ArrayList<CourseOffer> getCourseofferlist() {
        return courseofferlist;
    }

    public CourseOffer newCourseOffer(int crn, FacultyProfile facultyProfile, String term, int year, Course course, String schedule) {
        CourseOffer co = new CourseOffer(crn, facultyProfile, term, year, course, schedule);
        courseofferlist.add(co);

        return co;
    }

    public CourseOffer findCourseOffer(int offerId) {
        for (CourseOffer co : courseofferlist) {
            if (co.isMatch(offerId)) {
                return co;
            }
        }

        return null; //not found after going through the whole list
    }

    public void removeCourseOffer(int offerId) {
        CourseOffer co = findCourseOffer(offerId);
        if (co != null) {
            this.courseofferlist.remove(co);
        }
    }

    public ArrayList<CourseOffer> getCourseOffersByFacultyId(String facultyId) {
        ArrayList<CourseOffer> courseOffers = new ArrayList<>();

        for (CourseOffer courseOffer : this.courseofferlist) {
            if (courseOffer.getFacultyProfile().getPerson().getPersonId()== facultyId) {
                courseOffers.add(courseOffer);
            }
        }

        return courseOffers;
    }

//    public void facultyRating(FacultyProfile facultyprofile) {
//        float sum = 0;
//        int ctr = 0;
//        for (CourseOffer co : courseofferlist) {
//            if (co.getFacultyProfile().getFacultyId() == facultyprofile.getFacultyId()) {
//                ctr++;
//                sum = sum + co.getAvgProfRating();
//            }
//        }
//        facultyprofile.setRating(sum / ctr);
//    }
}
