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
import businessFramework.organizations.DoctorOrganization;
import businessFramework.organizations.HelperOrganization;
import businessFramework.organizations.Organizations;
import businessFramework.organizations.ManagerOrganization;
import businessFramework.organizations.TransportationOrganization;
import businessFramework.userAccount.UserAccount;
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
    
    
    public static HelperOrganization getHelperOrganization(Environment environment, UserAccount userAccount)
    {
        HelperOrganization helperOrganization = null;
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
            for(Organizations organization : enterprise.getOrganizationsDirectory().getOrganizationsList())
            {
             if(organization instanceof HelperOrganization)
             {
              helperOrganization = (HelperOrganization)organization; 
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
        return helperOrganization;
    }
    
    public static HelperOrganization getHelperOrganizationInNw(Environment environment, Network nw)
    {
        HelperOrganization helperOrganization = null;
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
             if(organization instanceof HelperOrganization)
             {
              HelperOrganization = (HelperOrganization)organization; 
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
        return helperOrganization;
    }
    
      public static HelperOrganization getHelperOrganization(Environment environment, UserAccount userAccount)
    {
        HelperOrganization helperOrganization = null;
        
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
             if(organization instanceof HelperOrganization)
             {
              helperOrganization = (HelperOrganization)organization; 
             }
            }
            }
          }
         }
        }
        return helperOrganization;
    }
      
       public static TransportationOrganizations getTransportationOrganizations(Environment environment, UserAccount userAccount)
    {
        TransportationOrganizations transportationOrganizations = null;
        
        for(Network network : environment.getNetworkList())
        {
         if(network.equals(userAccount.getNetwork()))
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
       
     public static DoctorOrganization getDoctorOrganization(Environment environment, UserAccount userAccount)
    {
        DoctorOrganization doctorOrganization = null;
        try
        {
        for(Network network : environment.getNetworkList())
        {
         if(network.equals(userAccount.getNetwork()))
         {
          for(Enterprises enterprise : network.getEnterprisesDirectory().getEnterprisesList())
          {
            if(enterprise.getEnterprisesType().equals(Enterprises.EnterprisesType.Hospital))
            {
            for(Organizations organization : enterprise.getOrganizationsDirectory().getOrganizationsList())
            {
             if(organization instanceof DoctorOrganization)
             {
              doctorOrganization = (DoctorOrganization)organization; 
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
