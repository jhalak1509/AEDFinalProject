package businessFramework;

import businessFramework.commonFunctions.Help;
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
        
        Help help = system.addHelp();
        help.setHelp("Snow Shovel");
        help.setHelp("Grass Cutting");
        help.setHelp("Gardening");
        help.setHelp("Grocery Shopping");
       
        
        Network network = system.addNetwork();
      
        network.setCountry("United States");
        network.setState("Massachusetts");
        network.setCity("Boston");
        
    // University    
        Enterprises enterprises = network.getEnterprisesDirectory().addEnterprises("BostonUniversity", Enterprises.EnterprisesType.Univeristy);
        person = enterprises.getPersonDirectory().addPerson();
        person.setLName("Univeristy Admin");
        person.setName();
        UserAccount account = enterprises.getUserAccountDirectory().addUserAccount("bsc", "bsc", person, new AdministrationRole());
        account.setEnabled(true);
        account.setNetwork(network);
        enterprises.getOrganizationsDirectory().addOrganizations(Organizations.Type.Volunteer);
        Organizations organization = enterprises.getOrganizationsDirectory().addOrganizations(Organizations.Type.Transportation);
        person = organization.getPersonDirectory().addPerson();    
          
        person.setFName("Driver");
        person.setLName("Transpport");
        person.setName();
        
        account = organization.getUserAccountDirectory().addUserAccount("dr1", "dr1", person, new DriverRole());
        account.setNetwork(network);
        account.setEnabled(true);
        
      // Heart Help
         enterprises = network.getEnterprisesDirectory().addEnterprises("BostonHeartHelp", Enterprises.EnterprisesType.HealthOnboard);
         person = enterprises.getPersonDirectory().addPerson();
        person.setLName("Heart Help Admin");
        person.setName();
         account = enterprises.getUserAccountDirectory().addUserAccount("bhh", "bhh", person, new AdministrationRole());
        account.setEnabled(true);
        account.setNetwork(network);
        enterprises.getOrganizationsDirectory().addOrganizations(Organizations.Type.Case);
        organization = enterprises.getOrganizationsDirectory().addOrganizations(Organizations.Type.Manager);
        person = organization.getPersonDirectory().addPerson();    
          
        person.setFName("Supervisor");
        person.setLName("Boston");
        person.setName();
        
        account = organization.getUserAccountDirectory().addUserAccount("bsup", "bsup", person, new ManagerRole());
        account.setNetwork(network);
        account.setEnabled(true);
        
        // Manager
        
        person = organization.getPersonDirectory().addPerson();    
          
        person.setFName("Manager");
        person.setLName("Boston");
        person.setName();
        
        account = organization.getUserAccountDirectory().addUserAccount("bman", "bman", person, new HealthOnboardControllerRole());
        account.setNetwork(network);
        account.setEnabled(true);
        
        
              // Charity
         enterprises = network.getEnterprisesDirectory().addEnterprises("NonProfit", Enterprises.EnterprisesType.Charity);
         person = enterprises.getPersonDirectory().addPerson();
        person.setLName("charity Admin");
        person.setName();
         account = enterprises.getUserAccountDirectory().addUserAccount("bno", "bno", person, new AdministrationRole());
        account.setEnabled(true);
        account.setNetwork(network);
        organization = enterprises.getOrganizationsDirectory().addOrganizations(Organizations.Type.Sponsor);
        person = organization.getPersonDirectory().addPerson();    
          
        person.setFName("Donor");
        person.setLName("Boston");
        person.setName();
        
        account = organization.getUserAccountDirectory().addUserAccount("bdon", "bdon", person, new SponsorRole());
        account.setNetwork(network);
        account.setEnabled(true);
        
        
                  // Hospital
         enterprises = network.getEnterprisesDirectory().addEnterprises("Hospital", Enterprises.EnterprisesType.Hospital);
         person = enterprises.getPersonDirectory().addPerson();
        person.setLName("hospital Admin");
        person.setName();
         account = enterprises.getUserAccountDirectory().addUserAccount("bho", "bho", person, new AdministrationRole());
        account.setEnabled(true);
        account.setNetwork(network);
        organization = enterprises.getOrganizationsDirectory().addOrganizations(Organizations.Type.Doctor);
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
         account = enterprises.getUserAccountDirectory().addUserAccount("bgt", "bgt", person, new AdministrationRole());
        account.setEnabled(true);
        account.setNetwork(network);
        organization = enterprises.getOrganizationsDirectory().addOrganizations(Organizations.Type.Chief);
        person = organization.getPersonDirectory().addPerson();    
          
        person.setFName("mayor");
        person.setLName("Boston");
        person.setName();
        
        account = organization.getUserAccountDirectory().addUserAccount("bmay", "bmay", person, new ChiefRole());
        account.setNetwork(network);
        account.setEnabled(true);
      
    return system;
    }
}
