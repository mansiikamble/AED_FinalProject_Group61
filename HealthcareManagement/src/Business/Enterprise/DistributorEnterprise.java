/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import Business.Role.ProviderRole;
import Business.Role.Role;
import Business.Role.SupplierRole;
import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author mansi kamble
 */
public class DistributorEnterprise {
    
    public DistributorEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.Distributor);
    }

    @Override
    public HashSet<Role> getSupportedRole() {
        roles.add(new ProviderRole());
        roles.add(new SupplierRole());
        return roles;
    }
    
}
