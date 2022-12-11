/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businessFramework.enterprises;

import java.util.ArrayList;

/**
 *
 * @author vinaykumargudooru
 */
public class EnterprisesDirectory {
    
    private ArrayList<Enterprises> enterprisesList;
    
    public EnterprisesDirectory()
    {
        enterprisesList = new ArrayList<Enterprises>();
    }
    
    
    public Enterprises addEnterprises(String name, Enterprises.EnterprisesType type)
    {
      Enterprises enterprises = null;
      if(type ==Enterprises.EnterprisesType.HealthOnboard)
      {
       enterprises = new HealthOnboardEnterprises(name);
       enterprisesList.add(enterprises);     
      }
      else if (type == Enterprises.EnterprisesType.Ministry){
            enterprises = new MinistryEnterprises(name);
            enterprisesList.add(enterprises);
        }
       else if (type == Enterprises.EnterprisesType.Charity){
            enterprises = new CharityEnterprises(name);
            enterprisesList.add(enterprises);
        }
        else  if(type ==Enterprises.EnterprisesType.University)
        {
         enterprises = new UniversityEnterprises(name);
         enterprisesList.add(enterprises);     
        }
      else  if(type ==Enterprises.EnterprisesType.Hospital)
        {
         enterprises = new HospitalEnterprises(name);
         enterprisesList.add(enterprises);     
        }

      return enterprises;
    }

    public ArrayList<Enterprises> getEnterprisesList() {
        return enterprisesList;
    }
    
    public void deleteEnterprise(Enterprises enterprises)
    {
        enterprisesList.remove(enterprises);
    }
}
