/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author palsa
 */
public class Patient {
    private String patientId;
    private String lastVisit;//check for date format
    private String nextvisit;//check for date format
    private String docName;
    private String allergy;
    private String onMedication;
    private String insCov; //check if this can be implemented. If N then hide buttons

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getLastVisit() {
        return lastVisit;
    }

    public void setLastVisit(String lastVisit) {
        this.lastVisit = lastVisit;
    }

    public String getNextvisit() {
        return nextvisit;
    }

    public void setNextvisit(String nextvisit) {
        this.nextvisit = nextvisit;
    }

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public String getAllergy() {
        return allergy;
    }

    public void setAllergy(String allergy) {
        this.allergy = allergy;
    }

    public String getOnMedication() {
        return onMedication;
    }

    public void setOnMedication(String onMedication) {
        this.onMedication = onMedication;
    }

    public String getInsCov() {
        return insCov;
    }

    public void setInsCov(String insCov) {
        this.insCov = insCov;
    }
    
    
    
}
