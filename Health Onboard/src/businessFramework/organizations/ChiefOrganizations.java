/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businessFramework.organizations;

import businessFramework.roles.ChiefRole;
import businessFramework.roles.Roles;
import java.util.ArrayList;
/**
 *
 * @author vinaykumargudooru
 */
public class ChiefOrganizations extends Organizations {
    
    public ChiefOrganizations()
    {
        super(Organizations.Type.Chief.getValue());
    }
    
     @Override
    public ArrayList<Roles> getSupportedRole() {
        ArrayList<Roles> roles = new ArrayList<>();
        roles.add(new ChiefRole());
        return roles;
    }
    
}
