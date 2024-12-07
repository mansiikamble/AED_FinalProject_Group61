/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Supplier;
import java.util.ArrayList;

/**
 *
 * @author mansi kamble
 */
public class VaccineDirectory {
    private ArrayList<Vaccine> vaccineList;
    
    public VaccineDirectory(){
        vaccineList= new ArrayList<>();
                
    }

    public ArrayList<Vaccine> getVaccineList() {
        return vaccineList;
    }

    public void setVaccineList(ArrayList<Vaccine> vaccineList) {
        this.vaccineList = vaccineList;
    }
    
       public Vaccine addVaccine() {
        Vaccine vaccine = new Vaccine();
        vaccineList.add(vaccine);
        return vaccine;
    }
    
    //Removing an Employee from the Directory
    public void removeVaccine(Vaccine vaccine) {
        vaccineList.remove(vaccine);
    }
    
}
