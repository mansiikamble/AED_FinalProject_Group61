/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;


/**
 *
 * @author mitra
 */
public abstract class Role {
        
    public enum RoleType{
        
        
        SystemAdmin("SystemAdmin"),
        HospitalAdmin("HospitalAdmin"),
        DistributorAdmin("DistributorAdmin"),
        CDCAdmin("CDCAdmin"),
        ClinicAdmin("ClinicAdmin"),
        Doctor("Doctor"),
        PharmaManager("PharmaManager"),
        CDCManager("CDCManager"),
        Provider("Provider"),
        Supplier("Supplier"),
        NGOAdmin("NGOAdmin"),
        SponsorAdmin("SponsorAdmin"),
        ResearchLabAdmin("ResearchLabAdmin"),
        EndUser("EndUser"),
        BloodBank("BloodBankAdmin");
;
        
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem business);

    @Override
    public String toString() {
        //return this.getClass().toString();
        String className = this.getClass().getSimpleName(); // Get the simple name of the class
        if (className.endsWith("Role")) {
            className = className.substring(0, className.length() - 4); // Remove "Role" suffix if present
        }
        return className;
    }
    
    
}