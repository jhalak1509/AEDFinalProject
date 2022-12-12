/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businessFramework.organizations;

import businessFramework.person.PersonDirectory;
import businessFramework.roles.Roles;
import businessFramework.userAccount.UserDirectory;
import businessFramework.requestPipeline.RequestPipeline;
import java.util.ArrayList;

/**
 *
 * @author vinaykumargudooru
 */
public abstract class Organizations {
    
    private String name;
    private UserDirectory userDirectory;
    private PersonDirectory personDirectory;
    private RequestPipeline requestPipeline;
    private int orgId;
    private static int counter = 000;

    public Organizations(String name) {
    this.name = name;
    userDirectory = new UserDirectory();
    personDirectory = new PersonDirectory();
    requestPipeline = new RequestPipeline();
    counter++;
    orgId = counter;
    }
    
    public enum Type
    {
     Admin("Admin"),
     Helper("Helper Organization"),
     Case("Case Organization"),
     Manager("Manager Organization"),
     Sponsor("Sponsor Organization"),
     Transportation("Transportation Organization"),
     Chief("Chief Organization"),
     Doctor("Doctor Organization");
     
     private String value;
     
     private Type(String value)
     {
         this.value = value;
     }

        public String getValue() {
            return value;
        }
    }

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public UserDirectory getUserDirectory() {
        return userDirectory;
    }

    public RequestPipeline getRequestPipeline() {
        return requestPipeline;
    }

    public String getName() {
        return name;
    }
    
     public abstract ArrayList<Roles> getSupportedRole();

    public int getOrgId() {
        return orgId;
    }

    @Override
    public String toString() {
        return this.name;
    }
    
    
}
