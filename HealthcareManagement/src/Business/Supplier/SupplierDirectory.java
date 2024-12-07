/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Supplier;

import Business.CDC.Disease;
import java.util.ArrayList;
/**
 *
 * @author mansi kamble
 */
public class SupplierDirectory {
    private ArrayList<Supplier> supplierList;
    
    public SupplierDirectory(){
        supplierList= new ArrayList<>();
    }

    public ArrayList<Supplier> getSupplierList() {
        return supplierList;
    }

    public void setSupplierList(ArrayList<Supplier> supplierList) {
        this.supplierList = supplierList;
    }
     public Supplier addSupplier() {
        Supplier supplier = new Supplier();
        supplierList.add(supplier);
        return supplier;
    }
    
    //Removing an Employee from the Directory
    public void removeSupplier(Supplier supplier) {
        supplierList.remove(supplier);
    }
    
}
