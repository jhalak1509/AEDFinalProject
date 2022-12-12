package businessFramework;

import businessFramework.commonFunctions.Help;
import businessFramework.enterprises.Enterprises;
import businessFramework.enterprises.UniversityEnterprises;
import businessFramework.network.Network;
import businessFramework.organizations.Organizations;
import businessFramework.person.Person;
import businessFramework.roles.AdministratorRole;
import businessFramework.roles.DoctorRole;
import businessFramework.roles.SponsorRole;
import businessFramework.roles.DriverRole;
import businessFramework.roles.HealthOnboardControllerRole;
import businessFramework.roles.ChiefRole;
import businessFramework.roles.ManagerRole;
import businessFramework.roles.SysAdmin;
import businessFramework.userAccount.User;

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
        person.setFirstName("Sys");
        person.setLastName("Admin");
        person.setName();
        
        User ua = system.getUserDirectory().addUser("sysadmin", "sysadmin", person, new SysAdmin());
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
        Enterprises enterprises = network.getEnterprisesDirectory().addEnterprises("BostonUniversity", Enterprises.EnterprisesType.University);
        person = enterprises.getPersonDirectory().addPerson();
        person.setLastName("Univeristy Admin");
        person.setName();
        User account = enterprises.getUserDirectory().addUser("bsc", "bsc", person, new AdministratorRole());
        account.setEnabled(true);
        account.setNetwork(network);
        enterprises.getOrganizationsDirectory().addOrganizations(Organizations.Type.Helper);
        Organizations organization = enterprises.getOrganizationsDirectory().addOrganizations(Organizations.Type.Transportation);
        person = organization.getPersonDirectory().addPerson();    
          
        person.setFirstName("Driver");
        person.setLastName("Transpport");
        person.setName();
        
        account = organization.getUserDirectory().addUser("dr1", "dr1", person, new DriverRole());
        account.setNetwork(network);
        account.setEnabled(true);
        
      // Heart Help
         enterprises = network.getEnterprisesDirectory().addEnterprises("BostonHeartHelp", Enterprises.EnterprisesType.HealthOnboard);
         person = enterprises.getPersonDirectory().addPerson();
        person.setLastName("Heart Help Admin");
        person.setName();
         account = enterprises.getUserDirectory().addUser("bhh", "bhh", person, new AdministratorRole());
        account.setEnabled(true);
        account.setNetwork(network);
        enterprises.getOrganizationsDirectory().addOrganizations(Organizations.Type.Case);
        organization = enterprises.getOrganizationsDirectory().addOrganizations(Organizations.Type.Manager);
        person = organization.getPersonDirectory().addPerson();    
          
        person.setFirstName("Supervisor");
        person.setLastName("Boston");
        person.setName();
        
        account = organization.getUserDirectory().addUser("bsup", "bsup", person, new ManagerRole());
        account.setNetwork(network);
        account.setEnabled(true);
        
        // Manager
        
        person = organization.getPersonDirectory().addPerson();    
          
        person.setFirstName("Manager");
        person.setLastName("Boston");
        person.setName();
        
        account = organization.getUserDirectory().addUser("bman", "bman", person, new HealthOnboardControllerRole());
        account.setNetwork(network);
        account.setEnabled(true);
        
        
              // Charity
         enterprises = network.getEnterprisesDirectory().addEnterprises("NonProfit", Enterprises.EnterprisesType.Charity);
         person = enterprises.getPersonDirectory().addPerson();
        person.setLastName("charity Admin");
        person.setName();
         account = enterprises.getUserDirectory().addUser("bno", "bno", person, new AdministratorRole());
        account.setEnabled(true);
        account.setNetwork(network);
        organization = enterprises.getOrganizationsDirectory().addOrganizations(Organizations.Type.Sponsor);
        person = organization.getPersonDirectory().addPerson();    
          
        person.setFirstName("Donor");
        person.setLastName("Boston");
        person.setName();
        
        account = organization.getUserDirectory().addUser("bdon", "bdon", person, new SponsorRole());
        account.setNetwork(network);
        account.setEnabled(true);
        
        
                  // Hospital
         enterprises = network.getEnterprisesDirectory().addEnterprises("Hospital", Enterprises.EnterprisesType.Hospital);
         person = enterprises.getPersonDirectory().addPerson();
        person.setLastName("hospital Admin");
        person.setName();
         account = enterprises.getUserDirectory().addUser("bho", "bho", person, new AdministratorRole());
        account.setEnabled(true);
        account.setNetwork(network);
        organization = enterprises.getOrganizationsDirectory().addOrganizations(Organizations.Type.Doctor);
        person = organization.getPersonDirectory().addPerson();    
          
        person.setFirstName("Doctor");
        person.setLastName("Boston");
        person.setName();
        
        account = organization.getUserDirectory().addUser("bdoc", "bdoc", person, new DoctorRole());
        account.setNetwork(network);
        account.setEnabled(true);
        
                // Govt
         enterprises = network.getEnterprisesDirectory().addEnterprises("Govt", Enterprises.EnterprisesType.Ministry);
         person = enterprises.getPersonDirectory().addPerson();
        person.setLastName("Ministry Admin Admin");
        person.setName();
         account = enterprises.getUserDirectory().addUser("bgt", "bgt", person, new AdministratorRole());
        account.setEnabled(true);
        account.setNetwork(network);
        organization = enterprises.getOrganizationsDirectory().addOrganizations(Organizations.Type.Chief);
        person = organization.getPersonDirectory().addPerson();    
          
        person.setFirstName("mayor");
        person.setLastName("Boston");
        person.setName();
        
        account = organization.getUserDirectory().addUser("bmay", "bmay", person, new ChiefRole());
        account.setNetwork(network);
        account.setEnabled(true);
      
    return system;
    }
}
