/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businessFramework.organizations;

import businessFramework.roles.HealthOnboardControllerRole;
import businessFramework.roles.Roles;
import businessFramework.roles.ManagerRole;
import java.util.ArrayList;

/**
 *
 * @author vinaykumargudooru
 */
public class ManagerOrganizations extends Organizations {
    
    public ManagerOrganizations()
    {
        super(Organizations.Type.Manager.getValue());
    }
    
     @Override
    public ArrayList<Roles> getSupportedRole() {
        ArrayList<Roles> roles = new ArrayList<>();
        roles.add(new ManagerRole());
        roles.add(new HealthOnboardControllerRole());
        return roles;
    }
    
}
