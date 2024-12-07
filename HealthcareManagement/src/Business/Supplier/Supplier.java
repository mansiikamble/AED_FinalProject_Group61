/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Supplier;

import Business.Organization.SupplierOrganization;
import Business.WorkQueue.WorkQueue;

/**
 *
 * @author mansi kamble
 */
public class Supplier {
    private String supplierName;
    private static int sCount;
    private String supplierId;
    private VaccineDirectory vaccineList;
    private WorkQueue workQueue;
    
    public Supplier(){
        supplierId= "SID"+(++sCount);
        vaccineList= new VaccineDirectory();
        workQueue= new WorkQueue();
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public VaccineDirectory getVaccineList() {
        return vaccineList;
    }

    public void setVaccineList(VaccineDirectory vaccineList) {
        this.vaccineList = vaccineList;
    }
    
    @Override
    public String toString(){
        return supplierName;
    }
    
}
