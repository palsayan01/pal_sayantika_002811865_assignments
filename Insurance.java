/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author palsa
 */
public class Insurance {
    private String c_id;
    private String insAddr;
    private float premium;
    private float deductible;
    private String benefit;

    public String getC_id() {
        return c_id;
    }

    public void setC_id(String c_id) {
        this.c_id = c_id;
    }

    public String getInsAddr() {
        return insAddr;
    }

    public void setInsAddr(String insAddr) {
        this.insAddr = insAddr;
    }

    public float getPremium() {
        return premium;
    }

    public void setPremium(float premium) {
        this.premium = premium;
    }

    public float getDeductible() {
        return deductible;
    }

    public void setDeductible(float deductible) {
        this.deductible = deductible;
    }

    public String getBenefit() {
        return benefit;
    }

    public void setBenefit(String benefit) {
        this.benefit = benefit;
    }

     
    
}
