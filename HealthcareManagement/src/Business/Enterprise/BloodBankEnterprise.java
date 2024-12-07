/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import Business.Role.BloodBankAdminRole;
import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author mansi kamble
 */
public class BloodBankEnterprise {
    
    public BloodBankEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.BloodBank);
    }

    @Override
    public HashSet<Role> getSupportedRole() {
        roles.add(new BloodBankAdminRole());
        return roles;
    }
    
}
