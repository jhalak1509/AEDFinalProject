/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businessFramework.requestPipeline;

import businessFramework.sensors.VitalSign;
import java.util.ArrayList;

/**
 *
 * @author jhalaksurve
 */
public class SendDataToDoctorRequest extends Request{
    
    private String sendDataReqId;
    private static int count = 000;
    private ArrayList<VitalSign> vitalSigns;
    private String medication;
    private String newMedication;
    private String reqOutcome;
   
    
     public SendDataToDoctorRequest()
    {
        StringBuffer sb = new StringBuffer();
        sb.append("00");
        sb.append(count);
        sendDataReqId = sb.toString();
        count++;
        vitalSigns = new ArrayList<>();
    }
    

    @Override
    public String toString() {
        
        return this.sendDataReqId;       
    }

    public ArrayList<VitalSign> getVitalSignList() {
        return vitalSigns;
    }

    public String getMedication() {
        return medication;
    }

    public void setMedication(String medication) {
        this.medication = medication;
    }

    public void setNewMedication(String newMedication) {
        this.newMedication = newMedication;
    }

    public String getNewMedication() {
        return newMedication;
    }

    public void setReqOutcome(String reqOutcome) {
        this.reqOutcome = reqOutcome;
    }

    public String getReqResult() {
        return reqOutcome;
    }

    
}
