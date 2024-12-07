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
public class Provider {
     private String providerName;
    private static int pCount;
    private String providerId;
    private VaccineDirectory vaccineList;
    private WorkQueue workQueue;
    
    public Provider(){
        providerId= "PID"+(++pCount);
        vaccineList= new VaccineDirectory();
        workQueue= new WorkQueue();
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }
    
    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public String getProviderId() {
        return providerId;
    }

    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }

    public VaccineDirectory getVaccineList() {
        return vaccineList;
    }

    public void setVaccineList(VaccineDirectory vaccineList) {
        this.vaccineList = vaccineList;
    }
    
    @Override
    public String toString(){
        return providerName;
    }
}
