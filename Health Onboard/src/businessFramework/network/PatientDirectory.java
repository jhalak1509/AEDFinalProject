/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businessFramework.network;

//import BusinessModel.BloodBank.Donor;
import businessFramework.commonFunctions.Sponsorship;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author jhalaksurve
 */
public class PatientDirectory {
    
    Patient patient = new Patient();
    
    public void updatepatient(Patient patient){
    
        Connection con=Sponsorship.Connect();
        try{
        
            PreparedStatement st=con.prepareStatement("Update Patient set PatientName = ?, PatientAge = ?, PatientGender = ?, BloodGroup = ?, PatientEmail = ? where patientId='"+patient.getPatientId()+"'");
            
            st.setString(1, patient.getPatientName());
            st.setString(2,Integer.toString(patient.getPatientAge()));
            st.setString(3,Character.toString(patient.getPatientGender()));
            st.setString(4,patient.getPatientBloodGroup());
            st.setString(5,patient.getPatientEmail());
            
            st.executeUpdate();

        }catch(Exception ex){
                JOptionPane.showMessageDialog(null,ex.toString(),"Error",JOptionPane.ERROR_MESSAGE);
        } 
    }
    
}
