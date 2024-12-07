/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;
import Business.Role.DistributorAdminRole;
import Business.Role.Role;
import Business.Supplier.SupplierDirectory;
import java.util.HashSet;
/**
 *
 * @author mitra
 */
public class SupplierOrganization extends Organization{
private SupplierDirectory supplierList;
    public SupplierOrganization() {
        super(Organization.Type.Supplier.getValue());
        supplierList= new SupplierDirectory();
    }

    public SupplierDirectory getSupplierList() {
        return supplierList;
    }

    public void setSupplierList(SupplierDirectory supplierList) {
        this.supplierList = supplierList;
    }

    @Override
    public HashSet<Role> getSupportedRole() {
        return null;
    }
     
   
    
    
}
