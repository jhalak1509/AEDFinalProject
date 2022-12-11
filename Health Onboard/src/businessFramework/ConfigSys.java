package businessFramework;

import businessFramework.commonFunctions.NeedHelp;
import businessFramework.enterprises.Enterprises;
import businessFramework.network.Network;
import businessFramework.organization.Organizations;
import businessFramework.person.Person;
import businessFramework.roles.AdministrationRole;
import businessFramework.roles.DoctorRole;
import businessFramework.roles.SponsorRole;
import businessFramework.roles.DriverRole;
import businessFramework.roles.HealthOnboardControllerRole;
import businessFramework.roles.ChiefRole;
import businessFramework.roles.ManagerRole;
import businessFramework.roles.SysAdminRole;
import businessFramework.userAccount.UserAccount;

/**
 *
 * @author patil
 */
public class ConfigSys 
{
     public static Environment configuration()
    {
        Environment system = Environment.getInstance();
        Person person = system.getPersonDirectory().addPerson();
        person.setFName("Sys");
        person.setLName("Admin");
        person.setName();
        
        UserAccount ua = system.getUserAccountDirectory().addUserAccount("sysadmin", "sysadmin", person, new SysAdminRole());
        ua.setEnabled(true);
        
        NeedHelp needHelp = system.addNeedHelp();
        needHelp.setHelp("Snow Shovel");
        needHelp.setHelp("Grass Cutting");
        needHelp.setHelp("Gardening");
        needHelp.setHelp("Grocery Shopping");
       
        
        Network network = system.addNetwork();
      
        network.setCountry("United States");
        network.setState("Massachusetts");
        network.setCity("Boston");
        
    // University    
        Enterprises enterprises = network.getEnterprisesDirectory().addEnterprises("BostonUniversity", Enterprises.EnterprisesType.Univeristy);
        person = enterprises.getPersonDirectory().addPerson();
        person.setLName("Univeristy Admin");
        person.setName();
        UserAccount account = enterprises.getUserAccountDirectory().addUserAccount("bsc", "bsc", person, new AdministrationRoles());
        account.setEnabled(true);
        account.setNetwork(network);
        enterprises.getOrganizationDirectory().addOrganization(Organization.Type.Volunteer);
        Organization organization = enterprises.getOrganizationDirectory().addOrganization(Organization.Type.Transportation);
        person = organization.getPersonDirectory().addPerson();    
          
        person.setFName("Driver");
        person.setLName("Transpport");
        person.setName();
        
        account = organization.getUserAccountDirectory().addUserAccount("dr1", "dr1", person, new DriverRoles());
        account.setNetwork(network);
        account.setEnabled(true);
        
      // Heart Help
         enterprises = network.getEnterprisesDirectory().addEnterprises("BostonHeartHelp", Enterprises.EnterprisesType.HealthOnboard);
         person = enterprises.getPersonDirectory().addPerson();
        person.setLName("Heart Help Admin");
        person.setName();
         account = enterprises.getUserAccountDirectory().addUserAccount("bhh", "bhh", person, new AdministrationRoles());
        account.setEnabled(true);
        account.setNetwork(network);
        enterprises.getOrganizationDirectory().addOrganization(Organization.Type.Case);
        organization = enterprises.getOrganizationDirectory().addOrganization(Organization.Type.Manager);
        person = organization.getPersonDirectory().addPerson();    
          
        person.setFName("Supervisor");
        person.setLName("Boston");
        person.setName();
        
        account = organization.getUserAccountDirectory().addUserAccount("bsup", "bsup", person, new ManagerRoles());
        account.setNetwork(network);
        account.setEnabled(true);
        
        // Manager
        
        person = organization.getPersonDirectory().addPerson();    
          
        person.setFName("Manager");
        person.setLName("Boston");
        person.setName();
        
        account = organization.getUserAccountDirectory().addUserAccount("bman", "bman", person, new HealthOnboardControllerRoles());
        account.setNetwork(network);
        account.setEnabled(true);
        
        
              // Charity
         enterprises = network.getEnterprisesDirectory().addEnterprises("NonProfit", Enterprises.EnterprisesType.Charity);
         person = enterprises.getPersonDirectory().addPerson();
        person.setLName("charity Admin");
        person.setName();
         account = enterprises.getUserAccountDirectory().addUserAccount("bno", "bno", person, new AdministrationRoles());
        account.setEnabled(true);
        account.setNetwork(network);
        organization = enterprises.getOrganizationDirectory().addOrganization(Organization.Type.Sponsor);
        person = organization.getPersonDirectory().addPerson();    
          
        person.setFName("Donor");
        person.setLName("Boston");
        person.setName();
        
        account = organization.getUserAccountDirectory().addUserAccount("bdon", "bdon", person, new SponsorRoles());
        account.setNetwork(network);
        account.setEnabled(true);
        
        
                  // Hospital
         enterprises = network.getEnterprisesDirectory().addEnterprises("Hospital", Enterprises.EnterprisesType.Hospital);
         person = enterprises.getPersonDirectory().addPerson();
        person.setLName("hospital Admin");
        person.setName();
         account = enterprises.getUserAccountDirectory().addUserAccount("bho", "bho", person, new AdministrationRoles());
        account.setEnabled(true);
        account.setNetwork(network);
        organization = enterprises.getOrganizationDirectory().addOrganization(Organization.Type.Doctor);
        person = organization.getPersonDirectory().addPerson();    
          
        person.setFName("Doctor");
        person.setLName("Boston");
        person.setName();
        
        account = organization.getUserAccountDirectory().addUserAccount("bdoc", "bdoc", person, new DoctorRole());
        account.setNetwork(network);
        account.setEnabled(true);
        
                // Govt
         enterprises = network.getEnterprisesDirectory().addEnterprises("Govt", Enterprises.EnterprisesType.Ministry);
         person = enterprises.getPersonDirectory().addPerson();
        person.setLName("Ministry Admin Admin");
        person.setName();
         account = enterprises.getUserAccountDirectory().addUserAccount("bgt", "bgt", person, new AdministrationRoles());
        account.setEnabled(true);
        account.setNetwork(network);
        organization = enterprises.getOrganizationDirectory().addOrganization(Organization.Type.Chief);
        person = organization.getPersonDirectory().addPerson();    
          
        person.setFName("mayor");
        person.setLName("Boston");
        person.setName();
        
        account = organization.getUserAccountDirectory().addUserAccount("bmay", "bmay", person, new ChiefRoles());
        account.setNetwork(network);
        account.setEnabled(true);
      
    return system;
    }
}
