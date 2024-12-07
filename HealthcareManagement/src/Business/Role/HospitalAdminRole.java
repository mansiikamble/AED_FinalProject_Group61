/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.Clinic.DoctorDirectory;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import userinterface.AdministrativeRole.AdminWorkAreaJPanel;
import javax.swing.JPanel;
import userinterface.Hospital.HospitalAdminWorkAreaJPanel;

/**
 *
 * @author mitra
 */
public class HospitalAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new HospitalAdminWorkAreaJPanel(userProcessContainer, enterprise, business, account);
    }

    
    
}

