/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import Business.Role.Role;
import Business.Role.SponsorAdmin;
import java.util.HashSet;

/**
 *
 * @author mansi kamble
 */
public class SponsorEnterprise extends Enterprise {
    
    public SponsorEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.Sponsor);
    }

    @Override
    public HashSet<Role> getSupportedRole() {
        roles.add(new SponsorAdmin());
        return roles;
    }
}