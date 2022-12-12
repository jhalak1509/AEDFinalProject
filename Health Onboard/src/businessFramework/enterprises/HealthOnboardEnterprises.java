/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businessFramework.enterprises;

import businessFramework.roles.Roles;
import java.util.ArrayList;

/**
 *
 * @author vinaykumargudooru
 */
public class HealthOnboardEnterprises extends Enterprises {
    
    @Override
    public ArrayList<Roles> getSupportedRole() {
    return null;
    }
    
    public HealthOnboardEnterprises(String name)
    {
     super(name, Enterprises.EnterprisesType.HealthOnboard);  
    }
    
}
