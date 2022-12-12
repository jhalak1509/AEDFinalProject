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
import businessFramework.organizations.DoctorOrganizations;
import businessFramework.organizations.HelperOrganizations;
import businessFramework.organizations.SponsorOrganizations;
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
    
    
    public static HelperOrganizations getHelperOrganizations(Environment environment, User user)
    {
        HelperOrganizations helperOrganizations = null;
        try
        {
        for(Network network : environment.getNetworkList())
        {
         if(network.equals(user.getNetwork()))
         {
          for(Enterprises enterprises : network.getEnterprisesDirectory().getEnterprisesList())
          {
            if(enterprises.getEnterprisesType().equals(Enterprises.EnterprisesType.University))
            {
            for(Organizations organizations : enterprises.getOrganizationsDirectory().getOrganizationsList())
            {
             if(organizations instanceof HelperOrganizations)
             {
              helperOrganizations = (HelperOrganizations)organizations; 
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
    
    public static HelperOrganizations getHelperOrganizationsInNw(Environment environment, Network nw)
    {
        HelperOrganizations helperOrganizations = null;
        try
        {
        for(Network network : environment.getNetworkList())
        {
         if(network.equals(nw))
         {
          for(Enterprises enterprises : network.getEnterprisesDirectory().getEnterprisesList())
          {
            if(enterprises.getEnterprisesType().equals(Enterprises.EnterprisesType.University))
            {
            for(Organizations organizations : enterprises.getOrganizationsDirectory().getOrganizationsList())
            {
             if(organizations instanceof HelperOrganizations)
             {
              helperOrganizations = (HelperOrganizations)organizations; 
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
    
      public static SponsorOrganizations getSponsorOrganizations(Environment environment, User user)
    {
        SponsorOrganizations sponsorOrganizations = null;
        
        for(Network network : environment.getNetworkList())
        {
         if(network.equals(user.getNetwork()))
         {
          for(Enterprises enterprises : network.getEnterprisesDirectory().getEnterprisesList())
          {
            if(enterprises.getEnterprisesType().equals(Enterprises.EnterprisesType.Charity))
            {
            for(Organizations organizations : enterprises.getOrganizationsDirectory().getOrganizationsList())
            {
             if(organizations instanceof SponsorOrganizations)
             {
              sponsorOrganizations = (SponsorOrganizations)organizations; 
             }
            }
            }
          }
         }
        }
        return sponsorOrganizations;
    }
      
       public static TransportationOrganizations getTransportationOrganizations(Environment environment, User user)
    {
        TransportationOrganizations transportationOrganizations = null;
        
        for(Network network : environment.getNetworkList())
        {
         if(network.equals(user.getNetwork()))
         {
          for(Enterprises enterprises : network.getEnterprisesDirectory().getEnterprisesList())
          {
            if(enterprises.getEnterprisesType().equals(Enterprises.EnterprisesType.University))
            {
            for(Organizations organizations : enterprises.getOrganizationsDirectory().getOrganizationsList())
            {
             if(organizations instanceof TransportationOrganizations)
             {
              transportationOrganizations = (TransportationOrganizations)organizations; 
             }
            }
            }
          }
         }
        }
        return transportationOrganizations;
    } 
       
     public static DoctorOrganizations getDoctorOrganizations(Environment environment, User user)
    {
       DoctorOrganizations doctorOrganizations = null;
        try
        {
        for(Network network : environment.getNetworkList())
        {
         if(network.equals(user.getNetwork()))
         {
          for(Enterprises enterprises : network.getEnterprisesDirectory().getEnterprisesList())
          {
            if(enterprises.getEnterprisesType().equals(Enterprises.EnterprisesType.Hospital))
            {
            for(Organizations organizations : enterprises.getOrganizationsDirectory().getOrganizationsList())
            {
             if(organizations instanceof DoctorOrganizations)
             {
              doctorOrganizations = (DoctorOrganizations)organizations; 
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
        return doctorOrganizations;
    }   
     
      public static ManagerOrganizations getManagerOrganizations(Environment environment, User user)
    {
        ManagerOrganizations managerOrganizations = null;
        try
        {
        for(Network network : environment.getNetworkList())
        {
         if(network.equals(user.getNetwork()))
         {
          for(Enterprises enterprises : network.getEnterprisesDirectory().getEnterprisesList())
          {
            if(enterprises.getEnterprisesType().equals(Enterprises.EnterprisesType.HealthOnboard))
            {
            for(Organizations organizations : enterprises.getOrganizationsDirectory().getOrganizationsList())
            {
             if(organizations instanceof ManagerOrganizations)
             {
              managerOrganizations = (ManagerOrganizations)organizations; 
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
