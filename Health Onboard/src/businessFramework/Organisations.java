/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businessFramework;
import businessFramework.enterprises.EmployeeDirectory;
import businessFramework.roles.Roles;
import BusinessModel.UserAccount.UserDirectory;
import java.util.ArrayList;


import java.util.ArrayList;

/**
 *
 * @author patil
 */
public abstract class Organisations {
    private String OrganisationName;
    private EmployeeDirectory empDirectory;
    private UserDirectory userDirectory;
    private int organisationID;
    private static int counter = 0;

    public enum Type {
        SysAdmin("Sysadmin"),
        HospitalAdmin("HospitalAdmin"),
        BloodBankAdmin("BloodBankAdmin"),
        PoliceAdmin("PoliceAdmin"),
        PharmaAdmin("PharmaAdmin");
        
        private final String value;

        private Type(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public Organisations(String name) {
        
        this.OrganisationName = name;
        this.empDirectory = new EmployeeDirectory();
        this.userDirectory = new UserDirectory();
        this.organisationID = counter;
        ++counter;
    }

    public Organisations() {

    }

    public abstract ArrayList<Roles> getSupportedRole();

    public UserDirectory getUserAccountDirectory() {
        return this.userDirectory;
    }

    public int getOrganizationID() {
        return this.organisationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return this.empDirectory;
    }

    public String getOrganisationName() {
        return this.OrganisationName;
    }

    public void setOrganisationName(String name) {
        this.OrganisationName = name;
    }

    @Override
    public String toString() {
        return this.OrganisationName;
    }   
}
