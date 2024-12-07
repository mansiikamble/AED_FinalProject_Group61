/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;
import Business.Supplier.Supplier;
/**
 *
 * @author mansi kamble
 */
public class SupplierWorkRequest extends WorkRequest{
    private int requestQuantity;
    private boolean add;
    private Supplier supplier;

     public SupplierWorkRequest(){
        add = false;
    }
     
    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public boolean isAdd() {
        return add;
    }

    public void setAdd(boolean add) {
        this.add = add;
    }
    
    
    public int getQuantity() {
        return requestQuantity;
    }

    public void setQuantity(int quantity) {
        this.requestQuantity = quantity;
    }

   
}

