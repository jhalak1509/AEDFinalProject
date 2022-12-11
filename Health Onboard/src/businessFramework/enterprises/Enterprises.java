/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businessFramework.enterprises;

import businessFramework.organizations.Organizations;
import businessFramework.organizations.OrganizationsDirectory;

/**
 *
 * @author vinaykumargudooru
 */
public abstract class Enterprises extends Organizations{
    
    
    private String enterprisesId;
    private static int order = 1;
    private OrganizationsDirectory organizationsDirectory;
    private EnterprisesType enterprisesType;
    
    public Enterprises(String enterprisesName, EnterprisesType enterprisesType)
    {
        super(enterprisesName);
        this.enterprisesType = enterprisesType;
        organizationsDirectory = new OrganizationsDirectory();
        StringBuffer en = new StringBuffer();
        en.append("ENT");
        en.append(order);
        enterprisesId = en.toString();
        order++;
    }
    
    public enum EnterprisesType{
        
       University("University"),
       HealthOnboard("HealthOnboard"),
       Charity("Charity"),
       Ministry("Ministry"),
       Hospital("Hospital");
    
       
       private String value;
       
       private EnterprisesType(String value)
       {
         this.value = value;  
       }

        public String getValue() {
            return value;
        }
    }

    public OrganizationsDirectory getOrganizationsDirectory() {
        return organizationsDirectory;
    }

    public EnterprisesType getEnterprisesType() {
        return enterprisesType;
    }

    @Override
    public String toString() {
        return this.getName();
    }
    
    
    
}
