/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import Business.Role.CDCManagerRole;
import Business.Role.Role;
import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author mansi kamble
 */
public class CDCEnterprise {
    
    public CDCEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.CDC);
    }

    @Override
    public HashSet<Role> getSupportedRole() {
        roles.add(new CDCManagerRole());
        return roles;
    } 
    
}
