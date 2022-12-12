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
        Enterprises enterprises = network.getEnterprisesDirectory().addEnterprises("NortheasternUniversity", Enterprises.EnterprisesType.University);
        person = enterprises.getPersonDirectory().addPerson();
        person.setLastName("Univeristy Admin");
        person.setName();
        User account = enterprises.getUserDirectory().addUser("uniAdmin", "uniAdmin", person, new AdministratorRole());
        account.setEnabled(true);
        account.setNetwork(network);
        enterprises.getOrganizationsDirectory().addOrganizations(Organizations.Type.Helper);
        Organizations organizations = enterprises.getOrganizationsDirectory().addOrganizations(Organizations.Type.Transportation);
        person = organizations.getPersonDirectory().addPerson();    
          
        person.setFirstName("Driver");
        person.setLastName("Transportation");
        person.setName();
        
        account = organizations.getUserDirectory().addUser("driver", "driver", person, new DriverRole());
        account.setNetwork(network);
        account.setEnabled(true);
        
      // Health onboard
         enterprises = network.getEnterprisesDirectory().addEnterprises("BostonHealthOnboard", Enterprises.EnterprisesType.HealthOnboard);
         person = enterprises.getPersonDirectory().addPerson();
        person.setLastName("Healthonboard Admin");
        person.setName();
         account = enterprises.getUserDirectory().addUser("bhh", "bhh", person, new AdministratorRole());
        account.setEnabled(true);
        account.setNetwork(network);
        enterprises.getOrganizationsDirectory().addOrganizations(Organizations.Type.Case);
        organizations = enterprises.getOrganizationsDirectory().addOrganizations(Organizations.Type.Manager);
        person = organizations.getPersonDirectory().addPerson();    
          
        person.setFirstName("Supervisor");
        person.setLastName("Boston");
        person.setName();
        
        account = organizations.getUserDirectory().addUser("bsup", "bsup", person, new ManagerRole());
        account.setNetwork(network);
        account.setEnabled(true);
        
        // Manager
        
        person = organizations.getPersonDirectory().addPerson();    
          
        person.setFirstName("Manager");
        person.setLastName("Boston");
        person.setName();
        
        account = organizations.getUserDirectory().addUser("bman", "bman", person, new HealthOnboardControllerRole());
        account.setNetwork(network);
        account.setEnabled(true);
        
        
              // Charity
         enterprises = network.getEnterprisesDirectory().addEnterprises("Charity", Enterprises.EnterprisesType.Charity);
         person = enterprises.getPersonDirectory().addPerson();
        person.setLastName("charity Admin");
        person.setName();
         account = enterprises.getUserDirectory().addUser("bno", "bno", person, new AdministratorRole());
        account.setEnabled(true);
        account.setNetwork(network);
        organizations = enterprises.getOrganizationsDirectory().addOrganizations(Organizations.Type.Sponsor);
        person = organizations.getPersonDirectory().addPerson();    
          
        person.setFirstName("Donor");
        person.setLastName("Boston");
        person.setName();
        
        account = organizations.getUserDirectory().addUser("bdon", "bdon", person, new SponsorRole());
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
        organizations = enterprises.getOrganizationsDirectory().addOrganizations(Organizations.Type.Doctor);
        person = organizations.getPersonDirectory().addPerson();    
          
        person.setFirstName("Doctor");
        person.setLastName("Boston");
        person.setName();
        
        account = organizations.getUserDirectory().addUser("bdoc", "bdoc", person, new DoctorRole());
        account.setNetwork(network);
        account.setEnabled(true);
        
                // Ministry
         enterprises = network.getEnterprisesDirectory().addEnterprises("Govt", Enterprises.EnterprisesType.Ministry);
         person = enterprises.getPersonDirectory().addPerson();
        person.setLastName("Ministry Admin Admin");
        person.setName();
         account = enterprises.getUserDirectory().addUser("bgt", "bgt", person, new AdministratorRole());
        account.setEnabled(true);
        account.setNetwork(network);
        organizations = enterprises.getOrganizationsDirectory().addOrganizations(Organizations.Type.Chief);
        person = organizations.getPersonDirectory().addPerson();    
          
        person.setFirstName("mayor");
        person.setLastName("Boston");
        person.setName();
        
        account = organizations.getUserDirectory().addUser("bmay", "bmay", person, new ChiefRole());
        account.setNetwork(network);
        account.setEnabled(true);
      
    return system;
    }
}
