/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.DistributorAdminRole;
import Business.Role.Role;
import Business.Supplier.Provider;
import java.util.ArrayList;
import java.util.HashSet;
/**
 *
 * @author mitra
 */
public class ProviderOrganization extends Organization{
    Provider provider;
      public ProviderOrganization() {
        super(Organization.Type.Provider.getValue());
        provider= new Provider();
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    @Override
    public HashSet<Role> getSupportedRole() {
        
        return null;
    }
     
}