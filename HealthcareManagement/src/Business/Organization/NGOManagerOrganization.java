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
public class NGOManagerOrganization extends Organization{

    public NGOManagerOrganization() {
        super(Type.NGOManager.getValue());
    }

    @Override
    public HashSet<Role> getSupportedRole() {
        return null;
    }
    
}
