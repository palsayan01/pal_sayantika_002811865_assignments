/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Network;

import java.util.ArrayList;

/**
 *
 * @author anupb
 */
public class EnterpriseNetworkDirectory {
    
    
    private ArrayList<EnterpriseNetwork> Networkarray;

    public EnterpriseNetworkDirectory() {
        this.Networkarray = new ArrayList<>();
    }

    public ArrayList<EnterpriseNetwork> getNetworkarray() {
        return Networkarray;
    }

    public void setNetworkarray(ArrayList<EnterpriseNetwork> Networkarray) {
        this.Networkarray = Networkarray;
    }
    
    
    public EnterpriseNetwork addNewNetwork()
    {
        
    EnterpriseNetwork en = new EnterpriseNetwork();
    Networkarray.add(en);
    return en;
    
    }
    
    
    
    
}
