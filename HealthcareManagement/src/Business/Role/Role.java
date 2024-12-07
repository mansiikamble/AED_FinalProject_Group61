/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.UserAccount.UserAccount;


/**
 *
 * @author mitra
 */
public class Role {
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
    
    

    @Override
    public String toString() {
        return this.getClass().toString();
    }
}
