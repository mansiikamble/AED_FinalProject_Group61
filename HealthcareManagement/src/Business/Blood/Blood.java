/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Blood;

/**
 *
 * @author mitra
 */
public class Blood {
    
    private String bloodGroup;
    private int noOfPackets;
    private static int bCount = 1;
    private String bloodId;
    
     public Blood(){
        bloodId= "Blood"+(++bCount);
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public int getNoOfPackets() {
        return noOfPackets;
    }

    public void setNoOfPackets(int noOfPackets) {
        this.noOfPackets = noOfPackets;
    }

    public static int getbCount() {
        return bCount;
    }

    public static void setbCount(int bCount) {
        Blood.bCount = bCount;
    }

    public String getBloodId() {
        return bloodId;
    }

    public void setBloodId(String bloodId) {
        this.bloodId = bloodId;
    }

    @Override
    public String toString() {
        return bloodGroup;
    }
    
}
