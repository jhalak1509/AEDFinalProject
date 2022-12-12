/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businessFramework.organizations;

import businessFramework.roles.AdministratorRole;
import businessFramework.roles.CaseRole;
import businessFramework.roles.Roles;
import java.util.ArrayList;

/**
 *
 * @author vinaykumargudooru
 */
public class CaseOrganizations extends Organizations {
    
    public CaseOrganizations()
    {
        super(Organizations.Type.Case.getValue());
    }
    
    @Override
    public ArrayList<Roles> getSupportedRole() {
        ArrayList<Roles> roles = new ArrayList<>();
        roles.add(new CaseRole());
        return roles;
    }
    
}
