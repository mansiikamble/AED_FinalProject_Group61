/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.ClinicOrganization;
import Business.Organization.Organization;

import Business.Organization.SupplierOrganization;
import Business.Supplier.Supplier;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.Distributor.Supplier.SupplierAdminWorkAreaJPanel;
import userinterface.Hospital.Clinic.ClinicAdminWorkAreaJPanel;
/**
 *
 * @author mitra
 */
public class SupplierRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new SupplierAdminWorkAreaJPanel(userProcessContainer,  account, (SupplierOrganization) organization,  enterprise,  business);
    }
    
}
