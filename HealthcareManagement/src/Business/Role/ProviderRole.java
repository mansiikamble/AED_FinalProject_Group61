/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.ProviderOrganization;
import Business.Organization.SupplierOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.Distributor.Provider.ProviderAdminWorkAreaJPanel;
import userinterface.Distributor.Supplier.SupplierAdminWorkAreaJPanel;
/**
 *
 * @author mitra
 */
public class ProviderRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
         return new ProviderAdminWorkAreaJPanel(userProcessContainer,  account, (ProviderOrganization) organization,  enterprise,  business);
    }
    
}
