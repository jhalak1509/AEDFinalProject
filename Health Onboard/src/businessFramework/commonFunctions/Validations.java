/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businessFramework.commonFunctions;

/**
 *
 * @author patil
 */
import businessFramework.Environment;
import businessFramework.enterprises.Enterprises;
import businessFramework.network.Network;
import businessFramework.organizations.DoctorOrgranizations;
import businessFramework.organizations.HelperOragnizations;
import businessFramework.organizations.Organizations;
import businessFramework.organizations.ManagerOrganizations;
import businessFramework.organizations.TransportationOrganizations;
import businessFramework.userAccount.User;
import java.util.Calendar;
import java.util.Date;

public class Validations {
        public static boolean StringValidation(String name)
    {
        return true;
    }
    
    public static int ageCalculation(Date dateOfBirth)
    {
       try
       {     
        Calendar dob = Calendar.getInstance();
        dob.setTime(dateOfBirth);
        Calendar today = Calendar.getInstance();
        int age = today.get(Calendar.YEAR) - dob.get(Calendar.YEAR);
        if (today.get(Calendar.DAY_OF_YEAR) <= dob.get(Calendar.DAY_OF_YEAR))
        age--;
        return age;
       }
       catch(Exception e)
       {
        return 0;   
       }
    }
    
    
    public static HelperOragnizations getHelperOrganizations(Environment environment, User userAccount)
    {
        HelperOragnizations helperOrganizations = null;
        try
        {
        for(Network network : environment.getNetworkList())
        {
         if(network.equals(userAccount.getNetwork()))
         {
          for(Enterprises enterprise : network.getEnterprisesDirectory().getEnterprisesList())
          {
            if(enterprise.getEnterprisesType().equals(Enterprises.EnterprisesType.University))
            {
            for(Organizations organizations : enterprise.getOrganizationsDirectory().getOrganizationsList())
            {
             if(organizations instanceof HelperOragnizations)
             {
              helperOrganizations = (HelperOragnizations)organizations; 
             }
            }
            }
          }
         }
        }
        }
        catch(NullPointerException npe)
        {
          npe.printStackTrace();
         return null;
        }
        return helperOrganizations;
    }
    
    public static HelperOragnizations getHelperOrganizationsInNw(Environment environment, Network nw)
    {
        HelperOragnizations helperOrganizations = null;
        try
        {
        for(Network network : environment.getNetworkList())
        {
         if(network.equals(nw))
         {
          for(Enterprises enterprise : network.getEnterprisesDirectory().getEnterprisesList())
          {
            if(enterprise.getEnterprisesType().equals(Enterprises.EnterprisesType.University))
            {
            for(Organizations organization : enterprise.getOrganizationsDirectory().getOrganizationsList())
            {
             if(organization instanceof HelperOragnizations)
             {
              HelperOragnizations = (HelperOragnizations)organization; 
             }
            }
            }
          }
         }
        }
        }
        catch(NullPointerException npe)
        {
          npe.printStackTrace();
         return null;
        }
        return helperOrganizations;
    }
    
      public static HelperOragnizations getHelperOrganization(Environment environment, UserAccount userAccount)
    {
        HelperOragnizations helperOrganization = null;
        
        for(Network network : environment.getNetworkList())
        {
         if(network.equals(userAccount.getNetwork()))
         {
          for(Enterprises enterprise : network.getEnterprisesDirectory().getEnterprisesList())
          {
            if(enterprise.getEnterprisesType().equals(Enterprises.EnterprisesType.Charity))
            {
            for(Organizations organization : enterprise.getOrganizationsDirectory().getOrganizationsList())
            {
             if(organization instanceof HelperOragnizations)
             {
              helperOrganization = (HelperOragnizations)organization; 
             }
            }
            }
          }
         }
        }
        return helperOrganization;
    }
      
       public static TransportationOrganizations getTransportationOrganizations(Environment environment, User user)
    {
        TransportationOrganizations transportationOrganizations = null;
        
        for(Network network : environment.getNetworkList())
        {
         if(network.equals(user.getNetwork()))
         {
          for(Enterprises enterprise : network.getEnterprisesDirectory().getEnterprisesList())
          {
            if(enterprise.getEnterprisesType().equals(Enterprises.EnterprisesType.University))
            {
            for(Organizations organization : enterprise.getOrganizationsDirectory().getOrganizationsList())
            {
             if(organization instanceof TransportationOrganizations)
             {
              transportationOrganizations = (TransportationOrganizations)organization; 
             }
            }
            }
          }
         }
        }
        return transportationOrganizations;
    } 
       
     public static DoctorOrgranizations getDoctorOrganization(Environment environment, User user)
    {
        DoctorOrgranizations doctorOrganization = null;
        try
        {
        for(Network network : environment.getNetworkList())
        {
         if(network.equals(user.getNetwork()))
         {
          for(Enterprises enterprise : network.getEnterprisesDirectory().getEnterprisesList())
          {
            if(enterprise.getEnterprisesType().equals(Enterprises.EnterprisesType.Hospital))
            {
            for(Organizations organization : enterprise.getOrganizationsDirectory().getOrganizationsList())
            {
             if(organization instanceof DoctorOrgranizations)
             {
              doctorOrganization = (DoctorOrgranizations)organization; 
             }
            }
            }
          }
         }
        }
        }
        catch(NullPointerException npe)
        {
          npe.printStackTrace();
         return null;
        }
        return doctorOrganization;
    }   
     
      public static ManagerOrganizations getManagerOrganizations(Environment environment, UserAccount userAccount)
    {
        ManagerOrganizations managerOrganizations = null;
        try
        {
        for(Network network : environment.getNetworkList())
        {
         if(network.equals(userAccount.getNetwork()))
         {
          for(Enterprises enterprise : network.getEnterprisesDirectory().getEnterprisesList())
          {
            if(enterprise.getEnterprisesType().equals(Enterprise.EnterprisesType.HealthOnboard))
            {
            for(Organizations organization : enterprise.getOrganizationsDirectory().getOrganizationsList())
            {
             if(organization instanceof ManagerOrganizations)
             {
              managerOrganizations = (ManagerOrganizations)organization; 
             }
            }
            }
          }
         }
        }
        }
        catch(NullPointerException npe)
        {
          npe.printStackTrace();
         return null;
        }
        return managerOrganizations;
    }  
      
    
}
