/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.ResearchLabOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.ResearchLab.ResearchLabAdminWorkAreaJPanel;

/**
 *
 * @author mitra
 */
public class ResearchLabAdminRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new ResearchLabAdminWorkAreaJPanel(userProcessContainer, enterprise, business, account,(ResearchLabOrganization)organization);
    }
    
}
