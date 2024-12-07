/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.Role;
import java.util.HashSet;
/**
 *
 * @author mitra
 */
public class ResearchLabOrganization extends Organization{

    public ResearchLabOrganization() {
        super(Type.ResearchLabAdmin.getValue());
    }

    @Override
    public HashSet<Role> getSupportedRole() {
        return null;
    }
    
}

