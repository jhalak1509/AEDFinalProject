/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businessFramework.DB4OUtil;

import businessFramework.commonFunctions.SQLConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author jhalaksurve
 */
public class DonorDirectory {
    
    Donor donor = new Donor();
    
    public void updateDonor(Donor donor){
    
        Connection con=SQLConnect.Connect();
        try{
        
            PreparedStatement st=con.prepareStatement("Update Donor set name = ?, fatherName = ?, motherName = ?, DOB = ?, mobileNo = ?, gender = ?, email = ?, bloodGroup = ?, city = ?, address = ? where donorId='"+donor.getDonorId()+"'");
            
            st.setString(1, donor.getName());
            st.setString(2,donor.getFatherName());
            st.setString(3,donor.getMotherName());
            st.setString(4,donor.getDOB());
            st.setString(5,donor.getMobileNo());
            st.setString(6, donor.getGender());
            st.setString(7, donor.getEmail());
            st.setString(8, donor.getBloodGroup());
            st.setString(9, donor.getCity());
            st.setString(10, donor.getAddress());
            st.executeUpdate();

        }catch(Exception ex){
                JOptionPane.showMessageDialog(null,ex.toString(),"Error",JOptionPane.ERROR_MESSAGE);
        } 
    
    }
    
    public void addDonor(String donorId, String name, String fatherName, String motherName, String DOB, String mobileNo, String gender, String email, String bloodGroup, String city, String address){
    
        Connection con=SQLConnect.Connect();
        try{
        
            PreparedStatement st=con.prepareStatement("Insert into donor(donorId, name, fatherName, motherName, DOB, mobileNo, gender, email, bloodGroup, city, address) values(?,?,?,?,?,?,?,?,?,?)");
            
            st.setString(1, donorId);
            st.setString(2, name);
            st.setString(3,fatherName);
            st.setString(4,motherName);
            st.setString(5,DOB);
            st.setString(6,mobileNo);
            st.setString(7, gender);
            st.setString(8, email);
            st.setString(9, bloodGroup);
            st.setString(10, city);
            st.setString(11, address);
            st.executeUpdate();

        }catch(Exception ex){
                JOptionPane.showMessageDialog(null,ex.toString(),"Error",JOptionPane.ERROR_MESSAGE);
        } 
    
    }
    
}
