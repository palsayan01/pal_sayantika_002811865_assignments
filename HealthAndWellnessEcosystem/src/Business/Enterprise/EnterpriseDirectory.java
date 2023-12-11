/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import Business.Network.EnterpriseNetwork;
import java.util.ArrayList;

/**
 *
 * @author palsa
 */
public class EnterpriseDirectory {
    
    private ArrayList<Enterprise> enterpriseList;
   

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public EnterpriseDirectory(){
        enterpriseList=new ArrayList();
    }
    
    //Create enterprise
    public Enterprise createAndAddEnterprise(String name,Enterprise.EnterpriseType type, EnterpriseNetwork network){
        Enterprise enterprise=null;
        if(type==Enterprise.EnterpriseType.FitnessGoodsEnterprise){
            enterprise=new FitnessGoodsEnterprise(name, network);
            enterpriseList.add(enterprise);
        } else if (type==Enterprise.EnterpriseType.HealthTrainingEnterprise){
            enterprise=new HealthTrainingEnterprise(name, network);
            enterpriseList.add(enterprise);
        }else if (type==Enterprise.EnterpriseType.NutritionEnterprise){
            enterprise=new NutritionEnterprise(name, network);
            enterpriseList.add(enterprise);
        }else if (type==Enterprise.EnterpriseType.PharmaceuticalEnterprise){
            enterprise=new PharmaceuticalEnterprise(name, network);
            enterpriseList.add(enterprise);
        }else if (type==Enterprise.EnterpriseType.RecruitmentEnterprise){
            enterprise=new RecruitmentEnterprise(name, network);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }
}
