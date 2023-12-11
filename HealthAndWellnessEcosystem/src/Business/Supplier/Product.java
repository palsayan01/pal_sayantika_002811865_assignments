/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Supplier;

import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author palsa
 */
public class Product {
    
    private String name;
    private int price;
    private int id;
    private String description;
    private int avail;
    private ImageIcon logoImage;

    
    //private ArrayList<Feature> features;  

    private static int count = 0;
    
    public Product() {
        count++;
        id = count;
        
        //features=new ArrayList();
        
    }

    public int getAvail() {
        return avail;
    }

    public void setAvail(int avail) {
        this.avail = avail;
    }
    
    public ImageIcon getLogoImage() {
        return logoImage;
    }

    public void setLogoImage(ImageIcon logoImage) {
        this.logoImage = logoImage;
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

    public void setId(int id) {
        this.id = id;
    }
    
    
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
//    public Feature addNewFeature()
//    {
//    Feature feature=new Feature(this);
//    features.add(feature);
//    return feature;
//    
//    
//        }

//    public ArrayList<Feature> getFeatures() {
//        return features;
//    }

    
    @Override
    public String toString() {
        return name;
    }
    
}
