/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.HashSet;


/**
 *
 * @author mansi kamble
 */
public class EndUserEnterprise {
    
    public EndUserEnterprise(String name) {
      super(name, EnterpriseType.EndUser);
    }

    @Override
    public HashSet<Role> getSupportedRole() {
       throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
