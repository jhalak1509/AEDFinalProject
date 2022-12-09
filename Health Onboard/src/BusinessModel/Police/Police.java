/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusinessModel.Police;

import BusinessModel.Patient.Patient;
import java.util.ArrayList;

/**
 *
 * @author vinaykumargudooru
 */
public class Police {
    private String departmentName;
    private String userName;
    private String address;
    private ArrayList<Patient> policeRecordsList;
    
    public Police() {
        policeRecordsList = new ArrayList<>();
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Patient> getPoliceRecordsList() {
        return policeRecordsList;
    }

    public void setPoliceRecordsList(ArrayList<Patient> policeRecordsList) {
        this.policeRecordsList = policeRecordsList;
    }
    
}
