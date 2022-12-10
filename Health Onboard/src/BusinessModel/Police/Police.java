/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusinessModel.Police;


import java.util.ArrayList;
import java.util.UUID;

/**
 *
 * @author vinaykumargudooru
 */
public class Police {
    private String usertype;
    private String userID;
    private String policeName;
    private String policeGender;
    private String policeAge;
    private String policeEmail;
    private String policeContact;
    private String policeDesignation;
    private String policeUserName;
    private String policePassword;

    public Police(String usertype, String userID, String policeName, String policeGender, String policeAge, String policeEmail, String policeContact, String policeDesignation, String policeUserName) {
        this.usertype = usertype;
        this.userID = userID;
        this.policeName = policeName;
        this.policeGender = policeGender;
        this.policeAge = policeAge;
        this.policeEmail = policeEmail;
        this.policeContact = policeContact;
        this.policeDesignation = policeDesignation;
        this.policeUserName = policeUserName;
    }
    
    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getPoliceName() {
        return policeName;
    }

    public void setPoliceName(String policeName) {
        this.policeName = policeName;
    }

    public String getPoliceGender() {
        return policeGender;
    }

    public void setPoliceGender(String policeGender) {
        this.policeGender = policeGender;
    }

    public String getPoliceAge() {
        return policeAge;
    }

    public void setPoliceAge(String policeAge) {
        this.policeAge = policeAge;
    }

    public String getPoliceEmail() {
        return policeEmail;
    }

    public void setPoliceEmail(String policeEmail) {
        this.policeEmail = policeEmail;
    }

    public String getPoliceContact() {
        return policeContact;
    }

    public void setPoliceContact(String policeContact) {
        this.policeContact = policeContact;
    }

    public String getPoliceDesignation() {
        return policeDesignation;
    }

    public void setPoliceDesignation(String policeDesignation) {
        this.policeDesignation = policeDesignation;
    }

    public String getPoliceUserName() {
        return policeUserName;
    }

    public void setPoliceUserName(String policeUserName) {
        this.policeUserName = policeUserName;
    }

    public String getPolicePassword() {
        return policePassword;
    }

    public void setPolicePassword(String policePassword) {
        this.policePassword = policePassword;
    }




    
}
