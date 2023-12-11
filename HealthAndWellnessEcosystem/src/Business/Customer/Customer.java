/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Customer;

import Business.Organization.Organization;
import Business.Supplier.Product;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;

/**
 *
 * @author palsa
 */
public class Customer {
     private String name;
    private int id;
    private int age;
    private String email;
    private ImageIcon logoImage;
    private static int count = 0;
    ArrayList<Product> pharmaproducts=new ArrayList();
    //HashMap<Organization, ArrayList<Product>> orgProdCombo=new HashMap();
    ArrayList<Product> sportsapparel=new ArrayList();
    ArrayList<Product> nutritionproducts=new ArrayList();
    
    private Map<String, Integer> sleepHours; // Map to store sleep hours for each day
    private Map<String, Integer> calorieIntake; // Map to store calorie intake for each day
    private Map<String, Integer> weight; // Map to store weight for each day
    
    public Customer(String Name, int age, String email) {
        count++;
        id = count;
        this.name = Name;
        this.age=age;
        this.email=email;
        this.sleepHours = new HashMap<>();
        this.calorieIntake = new HashMap<>();
        this.weight = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }


    public ArrayList<Product> getNutritionproducts() {
        return nutritionproducts;
    }

    public void setNutritionproducts(ArrayList<Product> nutritionproducts) {
        this.nutritionproducts = nutritionproducts;
    }

    public ArrayList<Product> getPharmaproducts() {
        return pharmaproducts;
    }

    public void setPharmaproducts(ArrayList<Product> pharmaproducts) {
        this.pharmaproducts = pharmaproducts;
    }

    public ArrayList<Product> getSportsapparel() {
        return sportsapparel;
    }

    public void setSportsapparel(ArrayList<Product> sportsapparel) {
        this.sportsapparel = sportsapparel;
    }
    
    public void recordSleepHours(String date, int hours) {
        sleepHours.put(date, hours);
    }

    public void recordCalorieIntake(String date, int calories) {
        calorieIntake.put(date, calories);
    }

    public void recordWeight(String date, int weight) {
        this.weight.put(date, weight);
    }

    public Integer getSleepHours(String date) {
        return sleepHours.get(date);
    }

    public Integer getCalorieIntake(String date) {
        return calorieIntake.get(date);
    }

    public Integer getWeight(String date) {
        return weight.get(date);
    }

    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Map<String, Integer> getSleepHours() {
        return sleepHours;
    }

    public void setSleepHours(Map<String, Integer> sleepHours) {
        this.sleepHours = sleepHours;
    }

    public Map<String, Integer> getCalorieIntake() {
        return calorieIntake;
    }

    public void setCalorieIntake(Map<String, Integer> calorieIntake) {
        this.calorieIntake = calorieIntake;
    }

    public Map<String, Integer> getWeight() {
        return weight;
    }

    public void setWeight(Map<String, Integer> weight) {
        this.weight = weight;
    }

    public ImageIcon getLogoImage() {
        return logoImage;
    }

    public void setLogoImage(ImageIcon logoImage) {
        this.logoImage = logoImage;
    }

    @Override
    public String toString() {
        return name;
    }

//    public HashMap<Organization, ArrayList<Product>> getOrgProdCombo() {
//        return orgProdCombo;
//    }
//
//    public void setOrgProdCombo(HashMap<Organization, ArrayList<Product>> orgProdCombo) {
//        this.orgProdCombo = orgProdCombo;
//    }
    
    
    
    
    
}
