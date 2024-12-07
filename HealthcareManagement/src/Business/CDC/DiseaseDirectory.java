/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.CDC;
import Business.Supplier.Vaccine;
import java.util.ArrayList;
/**
 *
 * @author mitra
 */
public class DiseaseDirectory {
    private ArrayList<Disease> diseaseList;
    
    public DiseaseDirectory(){
        diseaseList= new ArrayList<>();
    }

    public ArrayList<Disease> getDiseaseList() {
        return diseaseList;
    }

    public void setDiseaseList(ArrayList<Disease> diseaseList) {
        this.diseaseList = diseaseList;
    }
       public Disease addDisease() {
        Disease vaccine = new Disease();
        diseaseList.add(vaccine);
        return vaccine;
    }
    
    //Removing an Employee from the Directory
    public void removeDisease(Disease vaccine) {
        diseaseList.remove(vaccine);
    }
}
