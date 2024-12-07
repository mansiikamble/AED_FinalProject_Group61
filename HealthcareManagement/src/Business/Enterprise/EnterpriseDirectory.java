/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import java.util.ArrayList;
/**
 *
 * @author mansi kamble
 */
public class EnterpriseDirectory {
    
    private ArrayList<Enterprise> enterpriseList;

    public EnterpriseDirectory() {
        enterpriseList = new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }
    
    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type){
        Enterprise enterprise = null;
        if (type == Enterprise.EnterpriseType.Hospital){
            enterprise = new HospitalEnterprise(name);
            enterpriseList.add(enterprise);
        }
        else if (type == Enterprise.EnterpriseType.CDC){
            enterprise = new CDCEnterprise(name);
            enterpriseList.add(enterprise);
        }
        else  if (type == Enterprise.EnterpriseType.Distributor){
            enterprise = new DistributorEnterprise(name);
            enterpriseList.add(enterprise);
        }
        else if(type == Enterprise.EnterpriseType.NGO){
            enterprise = new NGOEnterprise(name);
            enterpriseList.add(enterprise);
        }
        else if(type == Enterprise.EnterpriseType.ResearchLab)
        {
            enterprise = new ResearchLabEnterprise(name);
            enterpriseList.add(enterprise);
        }
        else if(type == Enterprise.EnterpriseType.EndUser)
        {
            enterprise = new EndUserEnterprise(name);
            enterpriseList.add(enterprise);
        }
        else if(type == Enterprise.EnterpriseType.Sponsor){
             enterprise = new SponsorEnterprise(name);
            enterpriseList.add(enterprise);
        }
        else if(type == Enterprise.EnterpriseType.BloodBank){
             enterprise = new BloodBankEnterprise(name);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }
    
}
