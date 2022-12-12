/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businessFramework.organizations;

import businessFramework.roles.DoctorRole;
import businessFramework.roles.SponsorRole;
import businessFramework.roles.Roles;
import java.util.ArrayList;

/**
 *
 * @author vinaykumargudooru
 */
<<<<<<< HEAD:Health Onboard/src/businessFramework/organizations/DoctorOrganizations.java
public class DoctorOrganizations {
=======
public class DoctorOrgranizations extends Organizations {
>>>>>>> db16654a7078c5b68de431dd68e0463ab2e55617:Health Onboard/src/businessFramework/organizations/DoctorOrgranizations.java
    
    public DoctorOrganizations()
    {
        super(Organizations.Type.Doctor.getValue());
    }
    
      @Override
        public ArrayList<Roles> getSupportedRole() {
        ArrayList<Roles> roles = new ArrayList<>();
        roles.add(new DoctorRole());
        return roles;
    }
    
}
