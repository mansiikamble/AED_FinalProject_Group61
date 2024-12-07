/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import Business.Role.NGOAdmin;
import Business.Role.Role;
import java.util.HashSet;
/**
 *
 * @author mansi kamble
 */
public class NGOEnterprise extends Enterprise {

    public NGOEnterprise(String name) {
        super(name, EnterpriseType.NGO);
    }

    @Override
    public HashSet<Role> getSupportedRole() {
        roles.add(new NGOAdmin());
        return roles;
    }
    
}
