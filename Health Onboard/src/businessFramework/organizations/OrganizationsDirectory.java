/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businessFramework.organizations;

import businessFramework.organizations.Organizations.Type;
import java.util.ArrayList;

/**
 *
 * @author vinaykumargudooru
 */
public class OrganizationsDirectory {
    
    private ArrayList<Organizations> organizationsList;
    
    public OrganizationsDirectory()
    {
      organizationsList = new ArrayList<>();
    }
    
    public Organizations addOrganizations(Type type)
    {
       Organizations organizations = null;
        if (type.getValue().equals(Type.Helper.getValue())){
            organizations = new HelperOrganizations();
            organizationsList.add(organizations);
        }
        else if (type.getValue().equals(Type.Case.getValue())){
            organizations = new CaseOrganizations();
            organizationsList.add(organizations);
        }
        else if (type.getValue().equals(Type.Manager.getValue())){
            organizations = new ManagerOrganizations();
            organizationsList.add(organizations);
        }
         else if (type.getValue().equals(Type.Sponsor.getValue())){
            organizations = new SponsorOrganizations();
            organizationsList.add(organizations);
        }
         else if (type.getValue().equals(Type.Transportation.getValue())){
            organizations = new TransportationOrganizations();
            organizationsList.add(organizations);
        }
          else if (type.getValue().equals(Type.Chief.getValue())){
            organizations = new ChiefOrganizations();
            organizationsList.add(organizations);
        }
           else if (type.getValue().equals(Type.Doctor.getValue())){
            organizations = new DoctorOrganizations();
            organizationsList.add(organizations);
        }
        return organizations;
    }

    public ArrayList<Organizations> getOrganizationsList() {
        return organizationsList;
    }
    
    public void deleteOrganizations(Organizations organizations)
    {
      organizationsList.remove(organizations);
    }
    
}
