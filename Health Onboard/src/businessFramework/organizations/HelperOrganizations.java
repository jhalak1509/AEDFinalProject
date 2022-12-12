/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businessFramework.organizations;

import businessFramework.roles.Roles;
import businessFramework.roles.HelperRole;
import java.util.ArrayList;

/**
 *
 * @author vinaykumargudooru
 */
public class HelperOrganizations extends Organizations {
    
    public HelperOrganizations()
    {
        super(Organizations.Type.Helper.getValue());
    }
    
      @Override
    public ArrayList<Roles> getSupportedRole() {
        ArrayList<Roles> roles = new ArrayList<>();
        roles.add(new HelperRole());
        return roles;
    }
}
