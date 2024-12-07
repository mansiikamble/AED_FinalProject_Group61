/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.Clinic.Pharmacy;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.ClinicOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.Hospital.Clinic.ClinicAdminWorkAreaJPanel;
import userinterface.Hospital.Clinic.Pharmacy.PharmacyAdminWorkAreaJPanel;

/**
 *
 * @author mitra
 */
public class PharmaManagerRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
      return new PharmacyAdminWorkAreaJPanel(userProcessContainer,  account, (ClinicOrganization) organization,  enterprise,  business);
    }
    
}
