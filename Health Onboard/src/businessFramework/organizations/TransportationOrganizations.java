/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businessFramework.organizations;

import businessFramework.roles.DriverRole;
import businessFramework.roles.Roles;
import java.util.ArrayList;

/**
 *
 * @author vinaykumargudooru
 */
public class TransportationOrganizations extends Organizations {
    
    public TransportationOrganizations()
    {
        super(Organizations.Type.Transportation.getValue());
    }
    
     @Override
    public ArrayList<Roles> getSupportedRole() {
        ArrayList<Roles> roles = new ArrayList<>();
        roles.add(new DriverRole());
        return roles;
    }
    
}
