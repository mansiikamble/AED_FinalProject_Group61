/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import Business.Role.ResearchLabAdminRole;
import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author mansi kamble
 */
public class ResearchLabEnterprise extends Enterprise{


    

    public ResearchLabEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.ResearchLab);
    }

    @Override
    public HashSet<Role> getSupportedRole() {
        roles.add(new ResearchLabAdminRole());
        return roles;
    }

    
}