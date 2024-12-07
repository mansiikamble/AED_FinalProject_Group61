/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Blood;
import Business.CDC.Disease;
import java.util.ArrayList;

/**
 *
 * @author mitra
 */
public class BloodDirectory {
    private ArrayList<Blood> bloodList;
     
     public BloodDirectory(){
        bloodList= new ArrayList<>();
    }

    public ArrayList<Blood> getBloodList() {
        return bloodList;
    }

    public void setBloodList(ArrayList<Blood> bloodList) {
        this.bloodList = bloodList;
    }
     
        public Blood addBlood() {
        Blood blood = new Blood();
        bloodList.add(blood);
        return blood;
    }
    
    //Removing an Employee from the Directory
    public void removeBlood(Blood blood) {
        bloodList.remove(blood);
    }
}
