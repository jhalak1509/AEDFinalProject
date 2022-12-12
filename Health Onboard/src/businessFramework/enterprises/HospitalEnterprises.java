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
public class HospitalEnterprises extends Enterprises{
 
      
     public HospitalEnterprises(String name) {
        super(name, EnterprisesType.Hospital);
    }

    @Override
    public ArrayList<Roles> getSupportedRole() {
        return null;
    }
    
}
