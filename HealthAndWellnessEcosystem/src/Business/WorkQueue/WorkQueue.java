/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author palsa
 */
public class WorkQueue {
   
    private ArrayList<WorkRequest> workRequestCSRList;
    private ArrayList<WorkRequest> workRequestNutritionList;
        private ArrayList<WorkRequest> workRequestFitnessList;
    

    public WorkQueue() {
        workRequestCSRList = new ArrayList();
        workRequestNutritionList = new ArrayList();
         workRequestFitnessList= new ArrayList();
    }

    public ArrayList<WorkRequest> getWorkRequestFitnessList() {
        return workRequestFitnessList;
    }


    public ArrayList<WorkRequest> getWorkRequestCSRList() {
        return workRequestCSRList;
    }

    public ArrayList<WorkRequest> getWorkRequestNutritionList() {
        return workRequestNutritionList;
    }
    
    
}
